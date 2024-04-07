<%@ page contentType="text/html; charset=UTF-8" %>
<!-- <%@ page contentType="text/html; charset=UTF-8" %>가 적혀있지 않아 한글이 깨짐. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
	<%request.setCharacterEncoding("utf-8");%>
<html>
<head>
	<title>Home</title>
	<meta charset="UTF-8">
	
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
한글이 안나오는건가?
</body>
</html>
