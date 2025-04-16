<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: fbsgl
  Date: 25. 4. 16.
  Time: 오후 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>include 예제</title>
</head>
<body>
<%
  LocalDate today = LocalDate.now(); // 오늘 날짜
  LocalDateTime tomorrow = LocalDateTime.now().plusDays(1);
%>


</body>
</html>
