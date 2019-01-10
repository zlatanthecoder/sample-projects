<html>
<body>
<h2>Hello World!</h2>
<!-- run this aplication http://localhost:8080/SpringMVCDemo/index.jsp -->

<!-- Mapping JSP page to Controller -->
<form action="add"> <!-- action will append in the url as \add -->
	Number1: <input type="text" name="t1"> <br>
	Number2: <input type="text" name="t2"> <br>
	<input type="submit">
</form>

<!-- Check Servlet version
Servlet Version: <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %> 
-->

</body>
</html>
