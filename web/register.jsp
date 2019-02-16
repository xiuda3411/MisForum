<%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 2019/2/14
  Time: 3:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mis论坛_注册</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <script language="JavaScript" src="js/register.js"></script>
</head>
<body>
<form action="RegisterServlet" method="post">
    <table border="0" align="center" width="600">
        <tr><td colspan="3" align="center" height="40">填写注册信息</td></tr>
        <tr><td align="right">用户名:*</td>
            <td><input type="text" name="userName"></td>
            <td>用户名由字母开头，后跟字母、数字或下划线组成</td>
        </tr>
        <tr><td align="right">密码:*</td>
            <td><input type="password" name="password"></td>
            <td>请再输入一次你的密码</td>
        </tr>
        <tr><td align="right">性别:*</td>
            <td><input type="radio" name="userSex" value="男"checked>男
                <input type="radio" name="userSex" value="女">女
            </td>
            <td>请选择你的性别</td>
        </tr>
        <tr><td align="right">邮箱地址:*</td>
            <td><input type="text" name="userEmail" ></td>
            <td>请填写您的常用邮箱，可以用此邮箱找回密码</td>
        </tr>
        <tr><td colspan="3" align="center" height="40">
            <input type="checkbox" name="accept" value="yes">
            我已经自行阅读并同意接受用户使用协议</td>
        </tr>
        <tr><td colspan="3" align="center" height="40">
            <input type="submit" value="确认" onclick="check()">
            <input type="reset" value="取消">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
