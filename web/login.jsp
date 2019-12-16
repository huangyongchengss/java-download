<%--
  Created by IntelliJ IDEA.
  User: huangyongcheng
  Date: 2019-12-12
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="./ViewType/buttons.css">
    <link rel="stylesheet" href="./ViewType/loginStyle.css" type="text/css">
</head>
<body>
<form action="login" method="post" style="padding-top: -700px;">
    <div class="container" style="font-size: 17px">
        <div align="center">
            <h2>用户登录</h2>
            <div>
                <p>用户名：<input class="labelText" type="text" name="name" placeholder="请输入用户名称" value=""></p>
            </div>
            <div>
                <p>密&#12288码：<input class="labelText" type="password" name="pwd" placeholder="请输入密码" value=""></p>
            </div>
            <button type="submit" id="login" class="button button-raised button-primary">
                <span>登录</span>
            </button>
            <button type="reset" class="button button-raised button-highlight">
                <span>重置</span>
            </button><br><br>
            <a class="registered" href="register.jsp">新用户注册</a>
        </div>
    </div>
</form>
</body>
</html>
