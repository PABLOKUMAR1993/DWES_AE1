<%@page import="model.beans.Evento"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<!-- VARIABLE -->

	
	<%List<Evento> listado = (List<Evento>)request.getAttribute("eventos"); %>


	<!-- CONTENIDO -->

	
	<ul style="display: flex">
		<li style="list-style: none">Tipos</li>
		<li style="margin-left: 40px; list-style: none">Eventos</li>
		<li style="margin-left: 40px; list-style: none">Usuarios</li>
		<li style="margin-left: 40px; list-style: none"><a href="inicio">Eventos/tipo</a></li>
		<li style="margin-left: 40px; list-style: none">Login</li>
		<li style="margin-left: 40px; list-style: none">Registro</li>
		<li style="margin-left: 40px; list-style: none">Salir</li>
	</ul>

	<a href="eventos?opcion=alta"><h4>Crear Nuevo Evento</h4></a>
	<a href="eventos?opcion=todos"><h4>Ver Todos los Eventos</h4></a>
	<a href="eventos?opcion=activos"><h4>Ver los Eventos Activos</h4></a>
	

</body>
</html>