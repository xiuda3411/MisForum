<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 2019/2/13
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mis论坛</title>
    <link rel="stylesheet" type="text/css" href="css/homepage.css">
</head>
<body>
<form action="HomepageServlet">
    <div id="header">
        <table>
            <tbody>
            <tr>
                <div class="top-A">
                    <a href="homepage.jsp">首页</a>
                </div>
                <div class="top-B" id="check">
                    <%
                        String user_name = "";
                        if (session != null){
                            user_name = (String) session.getAttribute("user_name");
                            if (user_name != null){
                                    out.println("<a href='personalPage.jsp'>"+user_name+"</a>");
                                }else {
                                    out.print("<a href='login.jsp'>登录</a>");
                                    out.print("<a href='register.jsp'>注册</a>");
                            }

                        }
                    %>
                </div>
            </tr>
            </tbody>
        </table>
    </div>
</form>
<div class="forum-left-nav" id="forum-left-nav">
    <form>
        <li><a class="expand" href="">全部</a></li>
        <li><a class="expand" href="">聊天</a></li>
        <li><a class="expand" href="">旅游</a></li>
        <li><a class="expand" href="">体育</a></li>
        <li><a class="expand" href="">运动</a></li>
        <li><a class="expand" href="">校园</a></li>
        <li><a class="expand" href="">职场</a></li>
        <li><a class="expand" href="">情感</a></li>
        <li><a class="expand" href="">文学</a></li>
        <li><a class="expand" href="">科技</a></li>
    </form>
</div>
<div style="background-color: blue;" id="question">
    <span>问答</span>
    <div style="background-color: green;" id="question-bottom">
        <form>
            <li><a href="">1</a></li>
            <li><a href="">2</a></li>
            <li><a href="">3</a></li>
            <li><a href="">4</a></li>
            <li><a href="">5</a></li>
            <li><a href="">6</a></li>
        </form>
    </div>
</div>
</body>
</html>
