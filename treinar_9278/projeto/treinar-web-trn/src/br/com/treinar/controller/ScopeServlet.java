package br.com.treinar.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeServlet
 */
@WebServlet("/ScopeServlet")
public class ScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		config.getServletContext().setAttribute("users", 0);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer i = 10;
		Integer cont = 1;
		if (request.getSession().getAttribute("contador") == null) {
			request.getSession().setAttribute("contador", cont);			
		} else {
			cont = (Integer) request.getSession().getAttribute("contador");
			request.getSession().setAttribute("contador", ++cont);
		}
		request.setAttribute("teste", 10);
		response.getWriter().append("Session Scope: " + cont + "\n");
		response.getWriter().append("Request Scope: " + i);
		Integer users = (Integer) request.getServletContext().getAttribute("users");
		request.getServletContext().setAttribute("users", ++users);
		response.getWriter().append("\nApplication Scope: " + users);
		i++;
	}
	
}
