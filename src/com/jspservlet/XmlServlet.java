package com.jspservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(description = "/XmlServlet", urlPatterns = { "/XmlServletPath" })
public class XmlServlet extends HttpServlet {
// when get method is issued to the doGet method is called
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// writer.println("<h3>Hello from the class XmlServlet in html <h3>");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String UserName = request.getParameter("name");
		String FullName = request.getParameter("fullname");
		writer.println("UserName  = " + UserName);
		writer.println("FullName  = " + FullName);
		System.out.println("hello doGet from the XmlServlet");


		// response.getWriter().println("hello from the XmlServlet response writer");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("hello doPost from the XmlServlet");
		//A postMethod is called when post method is issued to the servlet

		// writer.println("<h3>Hello from the class XmlServlet in html <h3>");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String UserName = request.getParameter("UserName");
		writer.println("UserName   =" + UserName);
		String FullName = request.getParameter("FullName");
		writer.println("FullName   = " + FullName);
		String Prof = request.getParameter("Prof");
		writer.println("u are a " + Prof);
		writer.println("hello " + Prof);
		// String location = request.getParameter("location");
		String[] location = request.getParameterValues("location");
		writer.println("you are in " + location.length + "  places");
		for (int i = 0; i < location.length; i++) {
			writer.println(location[i]);
		}

	}
}
