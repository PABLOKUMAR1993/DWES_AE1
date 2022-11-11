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


	<!-- Variables -->

	
	<%List<Evento> listado = (List<Evento>)request.getAttribute("eventos"); %>


	<!-- HTML -->

	<a href="inicio">Volver a Inicio</a>
	<a href="eventos?opcion=activos">Ver Eventos Activos</a>

	<h3>Listado de Eventos Activos</h3>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NOMBRE</th>
			<th>PRECIO</th>
			<th>ESTADO</th>
			<th>OPCIÓN</th>
		</tr>

		<% for (Evento evento: listado) { %>
			<tr>
				<td><%= evento.getIdEvento() %></td>
				<td><%= evento.getNombre() %></td>
				<td><%= evento.getPrecioDecimal() %></td>
				<td><%= evento.getEstado() %></td>
				<td><a href="eventos?opcion=editar&id=<%= evento.getIdEvento() %>">Editar</a></td>
				<td><a href="eventos?opcion=eliminar&id=<%= evento.getIdEvento() %>">Eliminar</a></td>
				<td><a href="eventos?opcion=activar&id=<%= evento.getIdEvento() %>">Activar</a></td>
				<td><a href="eventos?opcion=cancelar&id=<%= evento.getIdEvento() %>">Cancelar</a></td>
			</tr>
		<%} %>
	</table>


</body>
</html>