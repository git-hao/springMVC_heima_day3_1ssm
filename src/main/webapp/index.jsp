<%--
  Created by IntelliJ IDEA.
  User: sakura
  Date: 2019/8/26
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm整合</title>
</head>
<body>

    <a href="/account/findAll">喵内查看所有账户</a>
    <hr>
    <form action="/account/saveAccount" method="post">
        姓名：<input type="text" name="name"/><br>
        金额：<input type="text" name="money"/><br>
        <input type="submit" value="提交惹"/>
    </form>
</body>
</html>
