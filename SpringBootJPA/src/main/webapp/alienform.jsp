<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="add">
!!!!!....ADD ALIEN...!!!!! <br>
ID: <input type="text" name="id"><br>
Name: <input type="text" name="name"><br>
Planet: <input type="text" name="planet"><br>
<input type="submit" value="Add Alien">
</form>

<br>

<form action="get">
GETTING ALIEN BY ID<br>
Alien ID: <input type="text" name="id"> 
<input type="submit" value="Fetch Alien">
</form>

<br>

<form action="delete">
Alien ID: <input type="text" name="id">
<input type="submit" value="Delete Alien">
</form>

<br>

<form action="update">
!!!!!....UPDATE ALIEN...!!!!! ,br.
ID: <input type="text" name="id"><br>
Name: <input type="text" name="name"><br>
Planet: <input type="text" name="planet">
<input type="submit" value="Update Alien">
</form>
<br>

<form action="getbyplanet">
GETTING ALIEN by Planet...
Planet: <input type="text" name="pname">
<input type="submit" value="Get Alien by Planet">
</form>

</body>
</html>