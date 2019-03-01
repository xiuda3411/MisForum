<%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 2019/2/16
  Time: 7:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Mis论坛</title>
</head>
<body>
    <div style="margin-top: 100px;">
        <h2 align="center">${outputMessage}</h2>
        <h3 align="center">
            <span id="totalSecond">5</span>秒后跳转至首页</h3>
        <script language="javascript" type="text/javascript">
            var second = totalSecond.innerText;
            setInterval("redirect()", 1000);
            function redirect(){
                totalSecond.innerText=--second;
                if(second==0) location.href='homepage.jsp';
            }
        </script>
    </div>


</body>
</html>
