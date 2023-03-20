<%@ page import= "Modelo.Usuario" %>
<%@ page import= "java.util.ArrayList"%>
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

#eliminar{
color:cyan;
}

#modificar{
color:mediumpurple;
;
}

</style>

<body>

<%
ArrayList<Usuario> usuarios = (ArrayList<Usuario>) request.getAttribute("Usuario");
%>
<nav>
	<a href="AñadirUsuario">AñadirUsuario &nbsp;&nbsp;&nbsp;</a>
	<a href="VerUsuarios">VerUsuarios &nbsp;&nbsp;&nbsp;</a>
	<a href="ModificarUsuario">ModificarUsuario</a>
</nav>

<br><br><br>

<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Nombre</th>
      <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
  
  <%for(Usuario usuario : usuarios){ %>
  <tbody>
    <tr>
      <th scope="row"><%out.println(usuario.getId()); %></th>
      <td><%out.println(usuario.getNombre()); %></td>
      <td><a id= "eliminar" href="EliminarUsuario?id=<% out.println(usuario.getId()); %>">eliminar </a> </td>
      <td><a id= "modificar" href="ModificarUsuario?id=<% out.println(usuario.getId()); %>">Modificar </a> </td>
    </tr>
  </tbody>
  <%}%>
</table>





</body>
</html>