<%@ page import= "Modelo.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

</style>
<body>



<nav>
	<a href="AñadirUsuario">AñadirUsuario &nbsp;&nbsp;&nbsp;</a>
	<a href="VerUsuarios">VerUsuarios &nbsp;&nbsp;&nbsp;</a>
	<a href="VerUsuario">VerUsuario</a>
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
  
 <% Usuario usuario = (Usuario) request.getAttribute("usuario");%>

  <tbody>
    <tr>
      <th scope="row"><%out.println(usuario.getId()); %></th>
      <td><%out.println(usuario.getNombre()); %></td>
      <td><a class= "eliminar" href="EliminarUsuario?id=<%= usuario.getId() %>">eliminar </a> </td>
      <td><a class= "modificar" href="FormModificarUsuario?id=<%= usuario.getId()%>">Modificar </a> </td>
    </tr>
  </tbody>

</table>

</body>
</html>