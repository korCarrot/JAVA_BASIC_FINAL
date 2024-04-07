<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />


<!DOCTYPE html >
<html>
<head>
<meta "charset=utf-8">

<title>파일업로드 하기</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>

<script>
var cnt=1;	/* file번호를 위한 cnt */
function fn_addFile(){
	//id가 #d_file인 div태그에 append를 통해 input태그를 계속해서 추가. (append를 사용하기에 중복 추가가 가능.)
	$("#d_file").append("<br>"+"<input  type='file' name='file"+cnt+"' />");
	cnt++;
}

</script>
</head>

<body>

<h1>파일 업로드 하기</h1>
<!-- enctype="multipart/form-data"는 HTML 폼을 통해 파일을 업로드할 때 사용되는 속성입니다.
이 속성은 폼 데이터를 서버로 전송할 때 데이터를 인코딩하는 방법을 지정합니다. -->
<form method="post" action="${contextPath}/upload" enctype="multipart/form-data">
	<label>아이디:</label>
    <input type="text" name="id"><br>
	<label>이름:</label>
    <input type="text" name="name"><br>
	<input type="button"  value="파일추가" onClick="fn_addFile()"/><br>
	<div id="d_file">  </div>
	<input type="submit"  value="업로드"/>
</form>
</body>
</html>