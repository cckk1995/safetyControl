<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String supplyId = request.getParameter("supplyId");
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>cad图形查看</title>
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui/themes/icon.css">
    <script type="text/javascript" src="../../plugins/jquery-easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../../plugins/jquery-easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../../js/MxDrawX.js"></script>
    <style type="text/css">

    </style>
    <script type="text/javascript">
        $(function () {
            document.oncontextmenu = new Function('event.returnValue=false;');
            LoadMxDrawX("mxOcx", "", "http://www.mxdraw.com/MxDrawX52.CAB#version=8.0.0.1", "http://www.mxcad.net:2080/MxChromex86Setup.exe")
            //HideToolbar();
            initWindow();
        })

        function HideToolbar() {
            mxOcx.ShowToolBar("常用工具",false);
            mxOcx.ShowToolBar("编辑工具",false);
            mxOcx.ShowToolBar("特性",false);
            mxOcx.ShowToolBar("ET工具",false);
        }
        function initWindow() {
            let requestPath = '<%=basepath%>';
            let supplyId = '<%=supplyId%>';
            console.log(supplyId);
            if(supplyId==undefined|| supplyId==""||supplyId=='null') {
                return ;
            }
            $.ajax({
                type:'get',
                url:'/supply/getSupplyById',
                data: {
                    supplyId: supplyId
                },
                success: function (res) {
                    console.log(res);
                    let picture = res.picture;
                    let filePath = picture;
                    console.log(filePath);
                    loadDwgFile("mxOcx",filePath);
                },
                error: function(err) {
                    $.messager.alert('提示','网络错误','warning');
                }
            });
        }
    </script>
</head>
<body>
</body>
</html>