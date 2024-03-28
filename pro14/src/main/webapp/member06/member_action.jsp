<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="sec01.ex01.*, java.util.*"%>
    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<jsp:useBean id="member" class="sec01.ex01.MemberBean"></jsp:useBean>
<jsp:setProperty property="*" name="member"/>

<%

MemberDAO dao=new MemberDAO();

dao.addMember(member);

List<MemberBean> membersList=dao.listMembers();

request.setAttribute("membersList", membersList);




%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:forward page="memberList.jsp"></jsp:forward>
</body>
</html>