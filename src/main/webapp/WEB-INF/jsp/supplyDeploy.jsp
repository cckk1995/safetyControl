<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String packageId = request.getParameter("packageId");
    String procedureId = request.getParameter("procedureId");
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>工具列表</title>
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui/themes/icon.css">
    <script type="text/javascript" src="../../plugins/jquery-easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../../plugins/jquery-easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../../js/MxDrawX.js"></script>
    <style type="text/css">
        #div_left {
            float: left;;
            width: 25%;
            height: 100%;
            padding-right: 3px;
        }
        #div_right {
            float: right;
            width: 75%;
            height: 100%;
        }
        #div_table {
            height: 93%;
        }
        #div_menu {
            height: 7%;
            border: 1px solid deepskyblue;
            border-top: 0px;
        }
        .easyui-linkbutton{
            height: fit-content;
            margin-top: 13px;
            float: right;
        }
    </style>
</head>
<body>
    <div id="div_left">
        <div id="div_table">
            <table id="dg"></table>
        </div>
        <div id="div_menu">
            <a class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="saveHandler()">保存</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-save'" style="margin-left: 10px; margin-right: 10px" onclick="saveAndUploadHandler()">保存并上传</a>
        </div>
    </div>
    <div id="div_right">
        <script type="text/javascript">
            document.oncontextmenu = new Function('event.returnValue=false;');
            LoadMxDrawX("mxOcx", "", "http://www.mxdraw.com/MxDrawX52.CAB#version=8.0.0.1", "http://www.mxcad.net:2080/MxChromex86Setup.exe")
        </script>
    </div>
    <input type='file' id='input_file' style='display: none' onchange='fileChangeHandler()' />
    <input type='file' id='upload_file' style='display: none' onchange='uploadFileChangeHandler()' />
<script type="text/javascript">
    $(function () {
        $('#dg').datagrid({
            url:'/procNeed/getProcNeedByCondition',
            method:'get',
            title:'工具列表',
            singleSelect:true,
            fit:true,
            fitColumns: true,
            striped:true,
            columns:[[
                {field:'supplyProcedureId',title:'id',hidden:true},
                {field:'supplyId',title:'supplyId',hidden:true},
                {field:'picture',title:'picture',hidden:true},
                {field:'name',title:'类型',width:100,align:'center'},
                {field:'spec',title:'规格',width:150,align:'center'},
                {field:'usedNum',title:'数量',width:80,align:'center',formatter: function (value,row,index) {
                        let supplyId = row.supplyId.toString();
                        let picture = row.picture;
                        if(picture=="" || picture==undefined || picture==null) {
                            return '<button onclick="uploadHandler(\''+ supplyId +'\')">上传</button>';
                        } else {
                            return '<input type=\"number\" disabled style=\"width: 50px; text-align: center\" id=\"number' + supplyId + '\" value=\"' + value + '\"/>' +
                                '<button onclick=\"btnChooseHandler(\'' + supplyId + '\',\'' + picture + '\')\" style=\"margin-left: 10px\">选择</button>';
                        }
                    }}
            ]],
            queryParams:{
                packageId: 1001,
                procedureId: 1234
            }
        });
    })
    function insertDwg() {
        console.log('hello')
    }
    function btnChooseHandler(supplyId, picture) {
        let dom = '#number' + supplyId;
        let filePath = picture;
        let value = parseInt($(dom).val());
        $(dom).val(value+1);
        let blockName = supplyId.toString() + (value+1).toString();
        console.log(filePath);
        console.log(blockName);
        DrawInsert("mxOcx",filePath,blockName);
    }
    function uploadHandler(supplyId) {
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
                        let picture = res;
                        $.ajax({
                            url:'/supply/updateSupplyPicture',
                            type:'post',
                            data: {
                                supplyId: row.supplyId,
                                picture: picture
                            },
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
    function saveHandler() {

    }
    function saveAndUploadHandler() {

    }
    function uploadFileChangeHandler() {

    }
    function fileSave(comId,filePath) {
        let mxOcx = document.getElementById(comId);
        
    }
</script>

</body>

</html>