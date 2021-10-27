package com.contextservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "/ContextServlet", urlPatterns = { "/ContextServletPath" })
public class ContextServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String UserName = request.getParameter("name");
		ServletContext context = request.getServletContext();

		if (UserName != "" && UserName != null) {
			context.setAttribute("UserName", UserName);
		}
		writer.println("Context parameter has UserName as " + (String) context.getAttribute("UserName"));
	}
}