<%@ page import= "Modelo.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver Usuario</title>
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

.eliminar{
color:cyan;
}

.modificar{
color:mediumpurple;
}

.eliminar:hover{
color:red;
}

.modificar:hover{
color:red;
}

a:hover{
color:red;
}

</style>
<body>



<nav>
	<a href="AņadirUsuario">AņadirUsuario &nbsp;&nbsp;&nbsp;</a>
	<a href="VerUsuarios">VerUsuarios &nbsp;&nbsp;&nbsp;</a>
</nav>

<br><br><br>

<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Nombre</th>
      <th scope="col">Password</th>
      <th scope="col">Date</th>
    </tr>
  </thead>

  <tbody>
    <tr>
      <th scope="row">${usuario.id}</th>
      <td>${usuario.nombre}</td>
      <td>${usuario.password}</td>
      <td>${usuario.fecha_login}</td>
      <td><a class= "eliminar" href="EliminarUsuario?id=${usuario.id}">eliminar </a> </td>
      <td><a class= "modificar" href="FormModificarUsuario?id=${usuario.id}">Modificar </a> </td>
    </tr>
  </tbody>

</table>

</body>
</html>