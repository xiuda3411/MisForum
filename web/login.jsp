<%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 2019/2/13
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mis论坛_登录</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
</head>
<body>

<form action="LoginServlet" method="post">
    <center>用户登录</center>
    账号：<input type="text" name="userName"><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="登录">
</form>

<a href="register.jsp">立即注册</a>


</body>
</html>
