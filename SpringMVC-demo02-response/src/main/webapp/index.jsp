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
    <title>Response Test</title>

    <script src="js/jquery-3.4.1.min.js"></script>

    <script>
        //页面加载 绑定单击事件
        $(function () {
            $("#btn").click(function () {
                //alert("hello btn")
                $.ajax({
                    //编写json格式 设置属性和值
                    type: "POST",
                    url: "user/testAjax",
                    data: '{"username":"xuesong","password":"123456","age":24}',
                    dataType:"json",
                    contentType: "application/json;charset=UTF-8",
                    success: function(msg){
                        //msg是服务器响应给客户端的信息
                    alert(msg);
                    alert(msg.username)
                    alert(msg.password)
                    alert(msg.age)
                    }
                })
            })
        });
    </script>
</head>
<body>
<a href="user/testString">testString</a>
<br>
<a href="user/testVoid">testVoid</a>
<br>
<a href="user/testModelAndView">testModelAndView</a>
<br>
<a href="user/testForwardAndRedirect">testForwardAndRedirect</a>
<br>
<button id="btn">发送ajax请求</button>
</body>
</html>
