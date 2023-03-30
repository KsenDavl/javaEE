<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: davlk
  Date: 30.03.2023
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>My first JSP</title>
</head>
<body>
<p><% java.util.Date now = new Date(); %>
    <%= "Current time is " + now %>
</p>


</body>
</html>
