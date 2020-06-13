<%--
  Created by IntelliJ IDEA.
  User: Xue Song
  Date: 2020/6/5
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>FileUpload Test</title>

    <script src="js/jquery-3.4.1.min.js"></script>

</head>
<h3>传统方式文件上传</h3>
<form method="post" action="file/fileUpload1" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br>
    上传提交：<input type="submit" value="上传">
</form>

<br>

<h3>SpringMVC文件上传</h3>
<form method="post" action="file/fileUpload2" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br>
    上传提交：<input type="submit" value="上传">
</form>

<br>

<h3>SpringMVC 跨服务器文件上传</h3>
<form method="post" action="file/fileUpload3" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br>
    上传提交：<input type="submit" value="上传">
</form>
</body>
</html>
