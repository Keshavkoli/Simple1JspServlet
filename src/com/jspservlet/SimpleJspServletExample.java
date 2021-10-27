package com.jspservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleJspServletExample
 */
//@WebServlet(description = "/SimpleJspServletExample", urlPatterns = { "/SimpleJspServlet" })
public class SimpleJspServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("hello from the Get method servlet");
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Hello from html</h3>");
		response.getWriter().print("Hello from the GetMethod -  on the web page!");

	}

}
