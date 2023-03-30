<%--
  Created by IntelliJ IDEA.
  User: davlk
  Date: 30.03.2023
  Time: 19:38
  To change this template use File | Settings | File Templates.
  request example: http://localhost:8080/params.jsp?name=Tom&surname=Ford
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Getting params from request</title>
</head>
<body>
<p>
    <%
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
    %>

    <%= "Hello, " + name + " " + surname %>
</p>

</body>
</html>
