<%--
  Created by IntelliJ IDEA.
  User: Xue Song
  Date: 2020/6/5
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloWorld</title>
</head>
<body>
<%--HelloWorld!
<a href="hello">click this!</a>
<br/>
Test RequestMapping
<a href="testRequestMapping">click this!</a>--%>

<%--Test Param
<a href="param/testParam?username=xuesong&password=123456">click this!</a>--%>

<%--<h3>Test JavaBean Param</h3>
<br>
<form action="param/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br>
    密码：<input type="password" name="password"/><br>
    金额：<input type="text" name="money"/><br>
    uname：<input type="text" name="user.uname"/><br>
    uage：<input type="text" name="user.uage"/><br>
    <input type="submit" value="submit">
</form>--%>

<%--
<h3>Test Collection Param</h3>
<br>
<form action="param/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br>
    密码：<input type="password" name="password"/><br>
    金额：<input type="text" name="money"/><br>

    uname：<input type="text" name="userList[0].uname"/><br>
    uage：<input type="text" name="userList[0].uage"/><br>

    uname：<input type="text" name="userMap['one'].uname"/><br>
    uage：<input type="text" name="userMap['one'].uage"/><br>
    <input type="submit" value="submit">
</form>
--%>

<%--
<h3>Test Date Param</h3>
<form method="post" action="param/testDateParam">
    uname:<input type="text" name="uname"><br>
    uage:<input type="text" name="uage"><br>
    date:<input type="text" name="date"><br>
    <input type="submit" value="submit">
</form>
--%>

<h3>Test ServletApi</h3>
<a href="param/testServlet">click this</a>

</body>
</html>
