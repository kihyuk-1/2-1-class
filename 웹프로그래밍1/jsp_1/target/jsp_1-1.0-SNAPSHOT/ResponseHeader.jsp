<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Collection" %><%--
  Created by IntelliJ IDEA.
  User: fbsgl
  Date: 25. 4. 16.
  Time: 오후 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- 응답 헤더에 추가할 값 준비 -->
<%
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
    long add_date = s.parse(request.getParameter("add_date")).getTime();
    int add_int = Integer.parseInt(request.getParameter("add_int"));
    String add_str = request.getParameter("add_str");

%>

<!-- 응답 헤더에 값 추가 -->

<%
    response.addDateHeader("myBirthday" , add_date);
    response.addIntHeader("myNumber" , add_int);
    response.addIntHeader("myNumber" , 1004);
    response.addHeader("myName" , add_str);
    response.addHeader("myName" , "안중근");
%>



<html>
<head>
    <title>내장 객체 - response</title>
</head>
<body>

<h2>응답 헤더 정보 출력하기 </h2>
<%
    Collection<String> headerNames = response.getHeaderNames();

    for (String hName : headerNames) {
        String hValue = response.getHeader(hName);
%>
    <li><%= hName %> : <%= hValue %></li>
<%
    }
%>



<h2>myNumber만 출력하기 </h2>
<%
    Collection<String> myNumber = response.getHeaders("myNumber");
    for (String myNum : myNumber) {
 %>

    <li>myNumber :  <%= myNum%></li>

<%
    }

%>


</body>
</html>
