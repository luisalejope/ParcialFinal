<html>
<body>
<h2>JSP (Java Server Page)</h2>

<%
String dato = request.getParameter("usuario");
out.print ("El usuario que se ingreso es "  + dato);
	
%>
</body>
</html>
