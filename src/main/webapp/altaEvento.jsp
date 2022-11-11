<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<!-- EL FORMULARIO NO FUNCIONA -->
	<!-- Según he estudiado en el temario no encontrado referencias de cómo recoger valores de un formulario. -->
	<!-- Por otro lado el enunciado no lo indica y según he preguntado a varios compañeros ellos tampoco lo han hecho. -->
	<!-- Siendo la hora que es y el día que es no me da tiempo a consultarle al profesor. -->
	
	
	<a href="inicio">Volver a Inicio</a>
	
	<h3>CREAR NUEVO EVENTO</h3>
	
	<form action="eventos?opcion=alta" method="post">
	
		<!-- La ID se asignaria de manera ascendente según la última -->
		
		<label>NOMBRE: </label>
		<br>
		<input placeholder="nombre.."/>
		<br>
		<br>
		
		<label>DESCRIPCIÓN:</label>
		<br>
		<textarea placeholder="descripción.."></textarea>
		<br>
		<br>
		
		<label>FEHCA:</label>
		<br>
		<input type="date"/>
		<br>
		<br>
		
		<label>DURACIÓN:</label>
		<br>
		<input placeholder="duración.."/>
		<br>
		<br>
		
		<label>DIRECCIÓN:</label>
		<br>
		<input placeholder="Dirección.."/>
		<br>
		<br>
		
		<label>ESTADO:</label>
		<br>
		<select>
			<option value="activo">Activo</option>
			<option value="inactivo">Inactivo</option>
		</select>
		<br>
		<br>
		
		<label>DESTACADO:</label>
		<br>
		<select>
			<option value='s'>Si</option>
			<option value='n'>No</option>
		</select>
		<br>
		<br>
		
		<label>AFORO:</label>
		<br>
		<input placeholder="aforo máximo.."/>
		<br>
		<br>
		
		<label>MÍNIMO DE ASISTENCIA:</label>
		<br>
		<input placeholder="asistentes minimos.."/>
		<br>
		<br>
		
		<label>PRECIO:</label>
		<br>
		<input placeholder="precio.."/>
		<br>
		<br>
		
		<label>TIPO</label>
		<br>
		<select>
			<option value=01>Concierto</option>
			<option value=02>Despedida</option>
			<option value=03>Cumpleaños</option>
			<option value=04>Boda</option>
		</select>
		<br>
		<br>
		
		<input type="submit" value="Crear Evento"/>
		
	</form>
	

</body>
</html>