package com.initconfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(description = "/InitConfig", urlPatterns = { "/InitConfigPath" },
//initParams = {@WebInitParam(name = "defaultUser", value = "keshav") }) //we can in write it in web.xml also
public class InitConfig extends HttpServlet {

	/**
	 * )
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		//this.getServletConfig().getInitParameter("defaultUser");
		writer.println("Init parameter has the default UserName as " + getServletConfig().getInitParameter("defaultUser"));

	}

}