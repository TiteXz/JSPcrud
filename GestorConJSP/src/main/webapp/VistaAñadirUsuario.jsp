<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<style>

body{
background-color: rgb(37, 37, 37);
color:white;
}

nav{
text-align:center;
}

a{
    text-decoration:none;
    color: white;
}
</style>

<body>

<nav>
	<a href="AñadirUsuario">AñadirUsuario &nbsp;&nbsp;&nbsp;</a>
	<a href="VerUsuarios">VerUsuarios &nbsp;&nbsp;&nbsp;</a>
</nav>

<br><br><br>

<form method="POST" action="AñadirUsuario">
<label>Nombre: <input type="text" id="nombre" name="nombre" /></label>
<br>
<br>
<label>Password: <input type="text" id="password" name="password" /></label>
<br>
<br>
<label>Date: <input type="date" id="fecha_login" name="fecha_login" /></label>
<br>
<br>
<input type="submit" value="GUARDAR" />
</form>



</body>
</html>