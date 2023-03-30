<%--
  Created by IntelliJ IDEA.
  User: davlk
  Date: 30.03.2023
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Getting info from class</title>
</head>
<body>
<p>
    <%@ page import="davlks.logic.TestClass" %>

    <% TestClass testClass = new TestClass(); %>
    <%= testClass.getInfo() %>
</p>

</body>
</html>
