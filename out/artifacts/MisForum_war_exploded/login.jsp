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

    <div style="align-content: center;margin-top: 150px;">
        <form action="LoginServlet" method="post" name="form2" >
            <center><h3>用户登录</h3>
                账号：<input type="text" name="userName" id="user-name-label" align="center"><br>
                密码：<input type="password" name="password" align="center"><br>
                <input type="submit" value="登录" align="center">
                <a href="register.jsp" align="center">立即注册</a>
            </center>
        </form>
    </div>

</body>
</html>
