<%--
  Created by IntelliJ IDEA.
  User: qcl
  Date: 2021/2/11
  Time: 下午 04:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fileUpload</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/quick05" method="post" enctype="multipart/form-data">
    <label>个人信息：<input type="text" name="pInform"></label>
    <label>文件：<input type="file" name="upLoadFile"></label>
    <label><input type="submit" value="提 交"></label>
</form>
</body>
</html>
