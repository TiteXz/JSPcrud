<%@ page import= "Modelo.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver Usuarios</title>
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
color:white;
}

.modificar{
color:white;
}
.Ver{
color:white;
}

.eliminar:hover{
color:red;
}

.modificar:hover{
color:mediumpurple;
}

.Ver:hover{
color: #DAF7A6 ;
}

#menu a{
color:white;
border-radius:15px;
}

#menu a:hover{
color:cyan;
border-radius:15px;
}


</style>

<body>

<nav id="menu">
	<a href="AñadirUsuario">AñadirUsuario &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
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
      <th scope="col">Empleo</th>
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${usuarios}" var="usuario">
    <tr>
      <th scope="row">${usuario.id}</th>
      <td>${usuario.nombre}</td>
      <td>${usuario.password}</td>
      <td>${usuario.fecha_login}</td>
       <c:forEach items="${roles}" var="rol">
      <td>${usuario.rol.nombre}</td>
      </c:forEach>
      <td><a class= "eliminar" href="EliminarUsuario?id=${usuario.id}">eliminar </a> </td>
      <td><a class= "modificar" href="FormModificarUsuario?id=${usuario.id}">Modificar </a> </td>
      <td><a class= "Ver" href="VerUsuario?id=${usuario.id}">VerUsuario </a> </td>
    </tr>
</c:forEach>
  </tbody>
</table>





</body>
</html>