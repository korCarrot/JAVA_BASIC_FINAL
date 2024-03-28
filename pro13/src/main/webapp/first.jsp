<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


여기는 퍼스트 페이지
<!-- <a href="second.jsp?name=홍길동">두번째 페이지로 가라</a> -->


<%-- <%

RequestDispatcher requestDispatcher=request.getRequestDispatcher("second.jsp");
requestDispatcher.forward(request, response);
%> --%>

<jsp:forward page="second.jsp"></jsp:forward>

</body>
</html>