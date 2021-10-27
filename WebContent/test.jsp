<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!public int add(int a, int b) {
		return a + b;
	}%>

	<%
		for (int i = 1; i <= 5; i++) {
	%>
<br> the value of i is  <%=i %>
	<%
		}
	%>


	<h3>Testing the jsp</h3>

	<%
		int i = 10;
		int j = 20;
		int k;
		k = i + j;
	%>
	the valve of k
	<%=k%>!!
	<br>
	<%
		k = add(12, 12);
	%>
	the value of second k is
	<%=k%>
</body>
</html>