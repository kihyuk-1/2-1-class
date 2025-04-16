<%--
  Created by IntelliJ IDEA.
  User: fbsgl
  Date: 25. 4. 16.
  Time: 오후 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>내장 객체 - response</title>
</head>
<body>

<%
   String id = request.getParameter("user_id");
   String pwd = request.getParameter("user_pwd");

   if (id.equalsIgnoreCase("must") && pwd.equalsIgnoreCase("1234")) {
       response.sendRedirect("ResponseWelcome.jsp");
   }
    else {
        request.getRequestDispatcher("ResponseMain.jsp?LoginErr=1").forward(request , response);
   }

%>



</body>
</html>
