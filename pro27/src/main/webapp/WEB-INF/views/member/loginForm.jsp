<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>




</head>
<body>
<%-- ${ param.result} --%>

<c:choose>

<c:when test="${param.result =='loginFailed' }">

<script>

window.onload=function(){
    alert("아이디나 비밀번호가 틀립니다.다시 로그인 하세요!");
  }
</script>

</c:when>



</c:choose>


<form name="frmLogin" method="post"  action="${contextPath}/member/login.do">
   <table border="1"  width="80%" align="center" >
      <tr align="center">
         <td>아이디</td>
         <td>비밀번호</td>
      </tr>
      <tr align="center">
         <td>
	    <input type="text" name="id" value="" size="20">
	 </td>
         <td>
	    <input type="password" name="pwd" value="" size="20">
	 </td>
      </tr>
      <tr align="center">
         <td colspan="2">
            <input type="submit" value="로그인" > 
            <input type="reset"  value="다시입력" > 
         </td>
      </tr>
   </table>
</form>

 <a  href="${contextPath}/member/memberForm.do"><h1 style="text-align:center">회원가입</h1></a> -
</body>
</html>