<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
//변수 선언
int num=5;
String str="nice";


//함수 선언

String hi(){
	
	return "hihihi";
}



int hi2(){
	
	return 7;
}


String hi3(){
	
	return "7";
}

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String id=request.getParameter("id");


%>

여기는 longinResult.jsp
<br>
<%= id %>님 방가방가
<%= num %>
<%= str %>
<hr>
<%= hi() %>
<%= hi2() + 3 %>
<%=  Integer.parseInt(hi3()) + 7 %>
</body>
</html>