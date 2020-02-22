function LoadMxDrawX(id,dwgfile,cabpath,msipath) {
    var s, classid, Sys = {}, ua = navigator.userAgent.toLowerCase();
    (s = ua.match(/msie ([\d.]+)/)) ? Sys.ie = s[1] : (s = ua.match(/trident\/([\d.]+)/)) ? Sys.ie9 = s[1] : (s = ua.match(/firefox\/([\d.]+)/)) ? Sys.firefox = s[1] : (s = ua.match(/chrome\/([\d.]+)/)) ? Sys.chrome = s[1] : (s = ua.match(/opera.([\d.]+)/)) ? Sys.opera = s[1] : (s = ua.match(/version\/([\d.]+).*safari/)) ? Sys.safari = s[1] : 0,
        classid = "74A777F8-7A8F-4e7c-AF47-7074828086E2",
        Sys.ie || Sys.ie9 ? (document.write("<!-- 用来产生编辑状态的ActiveX控件的JS脚本-->   "),
                document.write("<!-- 因为微软的ActiveX新机制，需要一个外部引入的js-->   "),
                document.write('<object id="'+ id + '" classid="clsid:' + classid + '" '),
                //document.write('width="85%" height="85%" align="left">   '),
                document.write('codebase=" ' + cabpath + 'width="100%" height="85%" align="left">   '),
                document.write('<param name="_Version" value="65536">  '),
                document.write('<param name="_ExtentX" value="24262">  '),
                document.write('<param name="_ExtentY" value="16219">  '),
                document.write('<param name="_StockProps" value="0">'),
                document.write('<param name="DwgFilePath" value="' + dwgfile + '" > '),
                document.write('<param name="IsRuningAtIE" value="1">'),
                document.write('<param name="EnablePrintCmd" value="1">  '),
                document.write('<param name="ShowCommandWindow" value="1">   '),
                document.write('<param name="ShowToolBars" value="1">  '),
                document.write('<param name="ShowModelBar" value="1">'),
                document.write('<param name="Iniset" value="">  '),
                document.write('<param name="ToolBarFiles" value="">'),
                document.write('<param name="ShowMenuBar" value="1">'),
                document.write('<param name="EnableUndo" value="1">'),
                document.write('<param name="ShowPropertyWindow" value="1">'),
                document.write('<SPAN STYLE="color:red">不能装载文档控件。请在检查浏览器的选项中检查浏览器的安全设置。请点击<a href=' + msipath + '>安装控件</a></SPAN>'),
                document.write('</object>')) :
            Sys.chrome ? (document.write('<object id="' + id + '" clsid="{' + classid + '}" '),
                    document.write('type="application/mxdraw-activex" width="100%" height="100%" align="left"> '),
                    document.write('<param name="_Version" value="65536">  '),
                    document.write('<param name="_ExtentX" value="24262">  '),
                    document.write('<param name="_ExtentY" value="16219">  '),
                    document.write('<param name="_StockProps" value="0">'),
                    document.write('<param name="DwgFilePath" value="' + dwgfile + '" > '),
                    document.write('<param name="IsRuningAtIE" value="1">'),
                    document.write('<param name="EnablePrintCmd" value="1">  '),
                    document.write('<param name="ShowCommandWindow" value="1">   '),
                    document.write('<param name="ShowToolBars" value="1">  '),
                    document.write('<param name="ShowModelBar" value="1">'),
                    document.write('<param name="Iniset" value="">  '),
                    document.write('<param name="ToolBarFiles" value="">'),
                    document.write('<param name="ShowMenuBar" value="1">'),
                    document.write('<param name="EnableUndo" value="1">'),
                    document.write('<param name="ShowPropertyWindow" value="1">'),
                    document.write('<param name="Event_ImplementCommandEvent" value="DoCommandEventFunc">'),
                    document.write('<SPAN STYLE="color:red">不能装载文档控件,谷歌浏览器使用,下载MxChrome安装包到本地，安装后点击桌面 Chrome企业版 快捷方式启动。请点击<a href=' + msipath + '>安装控件</a></SPAN>'),
                    document.write('</object>')) :
                Sys.firefox ? (document.write("<!-- 需要安装ieTab插件才能使用-->   "),
                            document.write("<!-- 右键弹出菜单，点击使用ieTab浏览> -->  "),
                            document.write('<div class="no_title">  不能装载文档控件。1.请在安装ieTab插件，2.然后请点击<a href=' + msipath + '>安装控件</a>, 3.然后右键弹出菜单，点击使用ieTab浏览 </div> ')

                    ) :
                    Sys.opera ? alert("sorry,ntko 暂时不支持opera!") :
                        Sys.safari && alert("sorry,ntko 暂时不支持safari!");
}
function isFireFox() {
    var s, classid, Sys = {}, ua = navigator.userAgent.toLowerCase();
    (s = ua.match(/msie ([\d.]+)/)) ? Sys.ie = s[1] : (s = ua.match(/trident\/([\d.]+)/)) ? Sys.ie9 = s[1] : (s = ua.match(/firefox\/([\d.]+)/)) ? Sys.firefox = s[1] : (s = ua.match(/chrome\/([\d.]+)/)) ? Sys.chrome = s[1] : (s = ua.match(/opera.([\d.]+)/)) ? Sys.opera = s[1] : (s = ua.match(/version\/([\d.]+).*safari/)) ? Sys.safari = s[1] : 0;
    return  Sys.firefox;
}
var mxTime;
function loadDwgFile(comId,filePath) {
    mxTime = setInterval(InitMxDrawX, 100,comId,filePath);
}
function InitMxDrawX(comId,filePath) {
    let mxOcx = document.getElementById(comId);
    if (mxOcx) {
        if (!mxOcx.IsIniting())
        {
            clearInterval(mxTime);
            // 控件初始化完成，需要在启动做的事，在这里做
            // 启动时打开文件
            mxOcx.OpenDwgFile(filePath);
        }
    }
}
function DrawInsert(domId,filePath,blockName) {
    let mxOcx = document.getElementById(domId);
    mxOcx.DrawColor = 0;
    //创建一个图层,名为"BlockLayer"
    mxOcx.AddLayer ("BlockLayer");
    //设置当前图层为"BlockLayer"
    mxOcx.LayerName = "BlockLayer";
    var sBlkName = blockName;
    //用户需要出入图块的路径   控件程序在磁盘的文件路径
    var sBlkFile = mxOcx.GetOcxAppPath() + "\\Blk\\attribblock.dwg";
    //向控件数据库中插入一个图块,不用它插入匿名块
    mxOcx.InsertBlock(sBlkFile, blockName);
    //绘制块引用对象
    //参数一插入点的X坐标 ，参数二插入点的Y坐标
    //参数三图块名，参数四图块缩放比例，参数五图块的旋转角度
    mxOcx.DrawBlockReference(0, 3600, blockName, 1, 0) ;
    mxOcx.ZoomAll();
    mxOcx.UpdateDisplay();
}


