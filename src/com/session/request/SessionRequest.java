package com.session.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet(description = "/SessionRequest", urlPatterns = { "/SessionRequestPath" })
public class SessionRequest extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String UserName = request.getParameter("name");
		HttpSession session = request.getSession();
		if (UserName != "" && UserName != null) {
			session.setAttribute("SavedUserName", UserName);
		}

		writer.println("Session parameter has Username as " + (String) session.getAttribute("SavedUserName"));

	}
}