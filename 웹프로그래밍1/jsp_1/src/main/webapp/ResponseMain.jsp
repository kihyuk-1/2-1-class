<%--
  Created by IntelliJ IDEA.
  User: fbsgl
  Date: 25. 4. 16.
  Time: 오후 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>내장 객체 - response </title>
</head>
<body>
<h2> 1. 로그인 폼 </h2>

<%
    String loginErr = request.getParameter("LoginErr");
    if (loginErr != null) {
%>
        <%= "로그인 실패!" %>
<%
}
%>

<form action="ResponseLogin.jsp" method="post">
    아이디 : <input type="text" name="user_id"/> <br>
    패스워드 : <input type="text" name="user_pwd"/> <br>
    <input type="submit" value="로그인" />
</form>


<h2> 2. Http 응답 헤더 설정하기
<form action="ResponseHeader.jsp" method="get">
    날짜 형식 : <input type="text" name="add_date" value="2021-10-25"/> <br>
    숫자 형식 : <input type="text" name="add_int" value="8282"/> <br>
    문자 형식 : <input type="text" name="add_str" value="홍길동"/> <br>
    <input type="submit" value="응답 헤더 설정 & 출력" />



</form>


</body>
</html>
