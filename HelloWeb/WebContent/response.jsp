<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Obtiene datos</title>
</head>
<body>
	
	<jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.datosEstudiante" />
	<jsp:setProperty name="mybean" property="nombre" />
	<jsp:setProperty name="mybean" property="fecha" />
	<jsp:setProperty name="mybean" property="agno" />
	<jsp:setProperty name="mybean" property="semestre" />
	
	
 	<h1>Hola, <jsp:getProperty name="mybean" property="nombre" />!</h1>
 	<p>Edad, <jsp:getProperty name="mybean" property="fecha" /></p>
 	<p>Año, <jsp:getProperty name="mybean" property="agno" /></p>
 	<p>Semestre, <jsp:getProperty name="mybean" property="semestre" /></p>
 	
	
</body>
</html>