package com.example.mavenform;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException,IOException {
		response.getWriter().println("This is a Get request.Use POST method to submit data.");
	}
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		response.getWriter().println("Recieved data:Name="+name+",Email=" + email);
	
		
	}

}
