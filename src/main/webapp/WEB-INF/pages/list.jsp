<%--
  Created by IntelliJ IDEA.
  User: sakura
  Date: 2019/8/26
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h5>喵内查到了所有的账户信息</h5>
    <c:forEach items="${list}" var="account">
        ${account.name}
    </c:forEach>
</body>
</html>
