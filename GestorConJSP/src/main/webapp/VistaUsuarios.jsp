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

<%
ArrayList<Usuario> usuarios = (ArrayList<Usuario>) request.getAttribute("Usuario");
%>
<nav id="menu">
	<a href="AņadirUsuario">AņadirUsuario &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
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
  
  <%for(Usuario usuario : usuarios){ %>
  <tbody>
    <tr>
      <th scope="row"><%out.println(usuario.getId()); %></th>
      <td><%out.println(usuario.getNombre()); %></td>
      <td><%out.println(usuario.getPassword()); %></td>
      <td><%= usuario.getFecha_login() %></td>
      <td><a class= "eliminar" href="EliminarUsuario?id=<%= usuario.getId() %>">eliminar </a> </td>
      <td><a class= "modificar" href="FormModificarUsuario?id=<%= usuario.getId()%>">Modificar </a> </td>
      <td><a class= "Ver" href="VerUsuario?id=<%= usuario.getId()%>">VerUsuario </a> </td>
    </tr>
  </tbody>
  <%}%>
</table>





</body>
</html>