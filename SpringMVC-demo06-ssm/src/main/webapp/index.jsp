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
    <title>SSM-TEST</title>
</head>
<body>
<h3>SSM-findAll-TEST</h3>
<a href="account/findAll">测试查询</a>
<br>
<br>
<h3>SSM-saveAccount-TEST</h3>
<form action="account/saveAccount" method="post">
    姓名：<input type="text" name="name"/><br>
    金额：<input type="text" name="money"/><br>
    <input type="submit" value="保存">
</form>
</body>
</html>
