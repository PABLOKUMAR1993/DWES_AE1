<%@page import="model.beans.Evento"%>
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
	
	
	<% Evento evento = (Evento)request.getAttribute("editarEvento"); %>


	<!-- CONTENIDO -->
	
	
	<a href="inicio">Volver a Inicio</a>

	<h1>Estamos en Editar Evento</h1>
	
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NOMBRE</th>
			<th>DESCRIPCIÓN</th>
			<th>FECHA INICIO</th>
			<th>DURACIÓN</th>
			<th>DIRECCIÓN</th>
			<th>ESTADO</th>
			<th>DESTACADO</th>
			<th>AFORO MÁXIMO</th>
			<th>MÍNIMO ASISTENCÍA</th>			
			<th>PRECIO</th>	
			<th>TIPO</th>	
		</tr>
		<tr>
			<td><%= evento.getIdEvento() %></td>
			<td><%= evento.getNombre() %></td>
			<td><%= evento.getDescripcion() %></td>
			<td><%= evento.getFechaInicio() %></td>
			<td><%= evento.getDuracion() %></td>
			<td><%= evento.getDireccion() %></td>
			<td><%= evento.getEstado() %></td>
			<td><%= evento.getDestacado() %></td>
			<td><%= evento.getAforoMaximo() %></td>
			<td><%= evento.getMinimoAsistencia() %></td>
			<td><%= evento.getPrecioDecimal() %></td>
			<td><%= evento.getTipo().getNombre() %></td>
		</tr>
	</table>

</body>
</html>