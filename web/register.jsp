<%--
  Created by IntelliJ IDEA.
  User: huangyongcheng
  Date: 2019-12-12
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="register" method="post" style="padding-top: -700px;">
    输入用户名：<input name="name" type="text"><br><br>
    输入密码：<input name="pwd" type="password"><br><br>
    选择性别：<input name="sex" type="radio" value="男" checked>男<input name="sex" type="radio" value="女">女<br><br>
    <input type="reset" value="重置">
    <input type="submit" value="注册">
</form>
</body>
</html>
