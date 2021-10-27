<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	to get the default from the web.xml <br>
	we have writtern the servlet class, name ,and url 
	in the web.xml for init jsp <br>
	<%=getServletConfig().getInitParameter("defaultUser")%>

<%!public void jspInit(){
	String defaultuser = getServletConfig().getInitParameter("defaultUser");
	ServletContext context = getServletContext();
	context.setAttribute("defaultUser", defaultuser);
} 

%>
<br>


The value in the Servlet context is <%=getServletContext().getAttribute("defaultUser") %>





</body>
</html>