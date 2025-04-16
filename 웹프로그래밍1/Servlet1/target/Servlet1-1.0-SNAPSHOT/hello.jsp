<%--
  Created by IntelliJ IDEA.
  User: fbsgl
  Date: 25. 4. 17.
  Time: 오전 12:20
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" %>


<%
    LocalDateTime now = LocalDateTime.now();
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>JSP 문서</h1>

<h1>학번 : 20241490  , 이름 : 김기혁</h1>

<p style="color:red;">현재 시간 : <%= now %></p>

</body>
</html>
