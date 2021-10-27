<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String UserName = request.getParameter("name");

		if (UserName != "" && UserName != null) {
			session.setAttribute("sessionUserName", UserName);
			//application.setAttribute("applicationUserName", UserName);
			pageContext.setAttribute("pageContextUserName", UserName);
			pageContext.setAttribute("applicationUserName", UserName, pageContext.APPLICATION_SCOPE);
			pageContext.findAttribute("name");//it finds the scope where value is set attribute

		}
	%>

	<br> The UserName is the request Object :
	<%=UserName%>
	<br> The UserName is the Session Object :
	<%=session.getAttribute("sessionUserName")%>
	<br> The UserName is the application context object :
	<%=application.getAttribute("applicationUserName")%>
	<br> The UserName is the pageContext context object :
	<%=pageContext.getAttribute("pageContextUserName")%>
</body>
</html>