<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
<head>
<meta "charset=UTF-8">
<title>결과창</title>
</head>
<body>
	<h1>업로드가 완료되었습니다.</h1>
	<label>아이디:</label>
	 <input type="text" name="id" value="${map.id }" readonly><br>
	<label>이름:</label>
	 <input type="text" name="name" value="${map.name }" readonly><br>
	<div class="result-images">
	<!-- forEach문으로 imageFileName을 전송하는 이유는 FileDownloadController에서 이미지를 하나씩 출력하기 위해서이다.
	그래서 FileDownloadController의 매개변수를 보면 @RequestParam("imageFileName") String imageFileName으로
	배열이 아니라 String으로 imageFileName을 받고 있다는 사실을 알 수 있다. -->
	  <c:forEach var="imageFileName" items="${ map.fileList}"  >
	         <%-- <img src="${pageContext.request.contextPath }/download?imageFileName=${imageFileName }" style="width:150px"> --%>
	         <img src="${pageContext.request.contextPath }/download?imageFileName=${imageFileName }">
	         <br><br><br>
	  </c:forEach>         
	</div><p> 
	
	<a href='${pageContext.request.contextPath }/form'> 다시 업로드 하기 </a> </p>
</body>
</html>