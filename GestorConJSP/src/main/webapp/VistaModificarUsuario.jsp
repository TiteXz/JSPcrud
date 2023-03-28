<%@ page import="Modelo.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>

<style>
body{
background-color:rgb(34, 36, 37);
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
	
	<form  action="ModificarUsuario">
		<label>Nombre: <input type="text" id="" name="nombre" value="${usuario.nombre}"/></label>
		<br>
		<br>
		<label>Password: <input type="text" id="" name="password" value="${usuario.password}"/></label>
		<br>
		<br>
		<label>Fecha_login: <input type="date" id="" name="fecha_login" value="${usuario.fecha_login}"/></label>
		<br>
		<br>
		<label>Id: <input type="text" id="" name="id" value="${usuario.id}"/></label>
		<br>
		<br>
		<input type="submit" value="GUARDAR" />
	</form>

</body>
</html>