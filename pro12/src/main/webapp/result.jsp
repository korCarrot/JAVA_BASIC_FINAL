<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    
<%

String user_id=request.getParameter("user_id");

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=user_id %>
<hr>

<!-- JSP 페이지의 작업 및 템플릿 데이터는 PageContext 개체의 메서드를 
사용하여 자동으로 초기화되는 암시적 변수 out에 의해 참조되는 
JspWriter 개체를 사용하여 작성됩니다. -->

<% out.print(user_id);  %>

<% %>
<hr>

${1}

${3.4}

${ true }

${ false }++${ null }++

<hr>
------------------<hr>
${empty ""}
${empty null}
<br>--------진리표1-------<hr><hr>
${true and true}
${true and false}
${false and true}
${false and false}
<br>-------진리표2------<hr><hr>
${true or true}
${true or false}
${false or true}
${false or false}

<hr>


<hr>
${"hello"}
<hr>
${"안녕"}



</body>
</html>