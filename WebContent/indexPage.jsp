<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" href="resources/css/style.css">
	<script type="text/javascript" src="resources/js/indexFuntions.js"></script>
</head>
<body>
	<form action="servlet" method="post">
		<span> Seleccione una Opcion</span>
		<br>
		<br>
		<select id="frutas" onclick="cambiar_estilo(value)">
			<%
    		Vector listaDatos = (Vector) request.getAttribute("listaDatos");
			%>
			<% for(Object fruta : listaDatos) { %>
			<option id="fruta">
				<%= fruta %>
			</option>
			<% } %>
		</select> 
		<input type="submit" value="Enviar seleccion">
	</form>
</body>
</html>