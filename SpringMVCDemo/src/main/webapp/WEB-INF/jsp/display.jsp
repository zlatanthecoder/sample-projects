<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 Sum is: <%= request.getAttribute("result") %>
 <br>
 Sum is(using EL): ${result}  <!-- to make EL supported to your servlet or jsp use isELIgnored="false" in the page attribute -->

</body>
</html>