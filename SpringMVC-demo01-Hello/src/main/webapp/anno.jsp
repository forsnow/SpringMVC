<%--
  Created by IntelliJ IDEA.
  User: Xue Song
  Date: 2020/6/7
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Annotation Test</title>
</head>
<body>
<h3>Test RequestParam</h3>
<a href="anno/testRequestParam?name=xuesong">click this</a>
<br>
<h3>Test testRequestBody</h3>
<form action="anno/testRequestBody" method="post">
    name:<input type="text" name="username"><br>
    password:<input type="password" name="password"><br>
    <input type="submit" value="submit">
</form>

<br>
<h3>Test testPathVariable</h3>
<a href="anno/testPathVariable/100">click this</a>



</body>
</html>
