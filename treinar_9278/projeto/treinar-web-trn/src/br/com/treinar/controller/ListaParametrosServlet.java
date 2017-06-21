package br.com.treinar.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaParametros")
public class ListaParametrosServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		String parametro = null;
		Enumeration<String> parans = request.getParameterNames();
		while (parans.hasMoreElements()) {
			parametro = parans.nextElement();
			out.println("<h1>" + parametro + ":" + request.getParameter(parametro) + "</h1><br />");			
		}
		
	}

}