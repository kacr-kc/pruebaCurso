<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Obtiene datos</title>
</head>

<style>
	
	h2{
		text-align: center;
		background-color: #F96;
		width: 25%;
		margin: auto;
	} 
	section{
		text-align: center;
		background-color: #F96;
		width: 25%;
		margin: auto;
		border: 2px #F30 dashed;
	}
</style>
<body>
	
	<jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.datosEstudiante" />
	<jsp:setProperty name="mybean" property="nombre" />
	<jsp:setProperty name="mybean" property="fecha" />
	<jsp:setProperty name="mybean" property="agno" />
	<jsp:setProperty name="mybean" property="semestre" />
	
	<h2>Hola, <jsp:getProperty name="mybean" property="nombre" />!</h2>
	<section>
	
 	<p>Edad, <jsp:getProperty name="mybean" property="fecha" /></p>
 	<p>Año, <jsp:getProperty name="mybean" property="agno" /></p>
 	<p>Semestre, <jsp:getProperty name="mybean" property="semestre" /></p>
	
	</section>
 	
 	
	
</body>
</html>