<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%-- ${ membersList} --%>

<table align="center" border=”1” align="center">
	<tr align="center" bgcolor="lightgreen">
		<td width="7%"><b>아이디</b></td>
		<td width="7%"><b>비밀번호</b></td>
		<td width="7%"><b>이름</b></td>
		<td width="7%"><b>이메일</b></td>
		<td width="7%"><b>가입일</b></td>
		<td width="7%"><b>삭제</b></td>
	</tr>

	<c:choose>
		<c:when test="${membersList == null}">
	회원 없다.
	</c:when>
		<c:otherwise>

			<c:forEach var="member" items="${membersList}">
				<tr align="center">
					<td>${member.id }</td>
					<td>${member.pwd}</td>
					<td>${member.name}</td>
					<td>${member.email}</td>
					<td>${member.joinDate}</td>
					<!-- <td><a href='http://localhost:8090/pro14/member?command=delMember&id="+ id+ "'>삭제</a></td> -->
					<td><a href='http://localhost:8090/pro14/member06/member_action.jsp?command=delMember&id="+ id+ "'>삭제</a></td>
				</tr>
			</c:forEach>


		</c:otherwise>

	</c:choose>


</table> 
</body>
</html>