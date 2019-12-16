<%--
  Created by IntelliJ IDEA.
  User: huangyongcheng
  Date: 2019-12-12
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>用户信息列表</title>
</head>
<body>
<h1>${strMsg}</h1>
<table width="600" border="1" cellpadding="0">
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>密码</th>
        <th>性别</th>
    </tr>
    <c:forEach var="U" items="${userAll}">
        <form action="update" method="post">
            <tr>
                <td><input type="text" value="${U.id}" name="id"></td>
                <td><input type="text" value="${U.name}" name="name"></td>
                <td><input type="text" value="${U.pwd}" name="pwd"></td>
                <td><input type="text" value="${U.sex}" name="sex"></td>
                <td><a href="delete?id=${U.id}">删除</a><input type="submit" value="更新">
            </tr>
        </form>>
    </c:forEach>
</table>
</body>
</html>
