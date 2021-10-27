package com.requestmethod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "/RequestMethod", urlPatterns = { "/RequestMethodPath" })
public class RequestMethod extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		String UserName = request.getParameter("name");
		if (UserName != "" && UserName != null) {
			request.setAttribute("UserName", UserName);
		}
		writer.println("Request parameter has UserName as " + UserName);

	}

}