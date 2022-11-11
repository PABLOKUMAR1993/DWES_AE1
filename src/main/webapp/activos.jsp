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


	<a href="inicio">Volver a Inicio</a>
	<a href="eventos?opcion=todos">Para Eliminar Eventos</a>

	<h3>Listado de Eventos Activos</h3>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NOMBRE</th>
			<th>PRECIO</th>
			<th>OPCIÓN</th>
		</tr>

		<% for (Evento evento: listado) { %>
		
			<% if (evento.getEstado() == "activo") { %>
			
				<tr>
					<td><%= evento.getIdEvento() %></td>
					<td><%= evento.getNombre() %></td>
					<td><%= evento.getPrecioDecimal() %></td>
					<td><a href="eventos?opcion=cancelar&id=<%= evento.getIdEvento() %>">Cancelar</a></td>
				</tr>
				
			<% } %>
			
		<% } %>
	</table>


</body>
</html>