<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>工具列表</title>
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui/themes/icon.css">
    <script type="text/javascript" src="../../plugins/jquery-easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../../plugins/jquery-easyui/jquery.easyui.min.js"></script>
    <style type="text/css">
        #div_main{
            height: 100%;
            width: 100%;
        }
        .btn_modify {
            margin-left: 10px;
        }

    </style>
</head>
<body>
    <div id="div_main">
        <table id="dg"></table>
        <div id="div_tool">
            <a class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="addButtonHandler()" style="width: 200px">绘制草图</a><br/>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="deployButtonHandler()" style="width: 200px">部署图</a>
        </div>
    </div>
    <input type='file' id='input_file' style='display: none' onchange='fileChangeHandler()' />

    <script type="text/javascript">
        $(function () {
            $('#dg').datagrid({
                url:'/supply/getAllSupply',
                title:'工具列表',
                toolbar:'#div_tool',
                singleSelect:true,
                fit:true,
                fitColumns: true,
                striped:true,
                method: 'get',
                columns:[[
                    {field:'supplyId',title:'supplyId',hidden:true},
                    {field: 'parentId', title: 'parentId',hidden:true},
                    {field:'categoryId',title:'categoryId',hidden:true},
                    {field:'level',title:'level',hidden:true},
                    {field:'isSelected',title:'isSelected',hidden:true},
                    {field:'isSmart',title:'isSmart',hidden:true},
                    {field:'isEssential',title:'isEssential',hidden:true},
                    {field:'name',title:'名称',width:150,align:'center'},
                    {field:'modelNumber',title:'型号',width:200,align:'center'},
                    {field:'spec',title:'规格',width:150,align:'center'},
                    {field:'hasChild',title:'是否为分类',width: 120,align:'center',formatter:function (value,row,index) {
                           if(value==false) {
                               return '否';
                           } else if(value==true) {
                               return '是';
                           }
                        }},
                    {field:'unit',title:'单位',width:80,align:'center'},
                    {field:'code',title:'编号',width:200,align:'center'},
                    {field:'num',title:'数量',width:60,align:'center'},
                    {field:'brand',title:'品牌',width:120,align:'center'},
                    {field:'origin',title:'产地',width:120,align:'center'},
                    {field:'description',title:'描述',width:200,align:'center'},
                    {field:'picture',title:'示意图',width:150,align:'center',formatter:function (value,row,index) {
                            if(value==null||value=="") {
                                return "<button type='button' onclick='pictureUpload("+row.supplyId+")'>上传</button>";
                            } else {
                                return "<button onclick=pictureCheck('"+ value + "')>查看</button>" +
                                    "<button type='button' class='btn_modify' onclick='pictureUpload("+row.supplyId+")'>修改</button>" ;
                            }
                        }}
                ]],
                queryParams:{

                }
            });
        })
        function pictureCheck(value) {
            console.log(value);
            let row = $('#dg').datagrid('getSelected');
            if(row==null) {
                $.messager.alert('提示','请选择一条记录','warning');
            } else {
                if(value==null) {

                } else {
                    window.location.href = 'toPage?url=dwgDraw&supplyId=' + row.supplyId;
                }
            }
        }
        function pictureUpload(supplyId) {
            $('#input_file').click();
        }
        function fileTypeCheck(fileName) {
            let suffix = fileName.substring(fileName.lastIndexOf(".")+1).toLowerCase();
            if(suffix == "dwg") {
                return true;
            } else {
                return false;
            }
        }
        function fileChangeHandler() {
            let path = $('#input_file').val();
            if(!fileTypeCheck(path)) {
                $.messager.alert('提示','请选择dwg格式的文件','warning');
                return ;
            }
            if(path!=null) {
                let file = $('#input_file')[0].files[0];
                let formData = new FormData();
                formData.append('file',file);
                console.log(file);
                $.ajax({
                    //请求方式
                    type: "post",
                    //请求地址
                    url: "/upload",
                    //数据，json字符串
                    data: formData,
                    processData: false,
                    contentType:false,
                    //请求成功
                    success: function (res) {
                        console.log(res);
                        if(res=="error") {
                            $.messager.alert('提示','文件上传失败','warning');
                        } else {
                            let row = $('#dg').datagrid('getSelected');
                            console.log(row);
                            row.picture = res;
                            $.ajax({
                                url:'/supply/updateSupply',
                                type:'post',
                                data: row,
                                success: function (res) {
                                    $('#dg').datagrid('load');
                                },
                                error: function (err) {
                                    $.messager.alert('提示','网络出错','warning');

                                }
                            });
                        }
                    }
                });
            }
        }
        function addButtonHandler() {
            window.location.href = 'toPage?url=dwgDraw';
        }
        function deployButtonHandler() {
            window.location.href='toPage?url=supplyDeploy';
        }
    </script>
</body>
</html>