package br.com.treinar.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "*.trn")
public class HelloWorld extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public HelloWorld() {
		System.out.println("iniciou...");
	}
	
	private String message;

	public void init() throws ServletException {
		// Do required initialization
		message = "Hello World [${nome}]";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		String nome = request.getParameter ("nome");
		out.println("<h1>" + message.replace("${nome}", nome) + "</h1>");
	}

	public void destroy() {
		// do nothing.
	}
}