package br.com.treinar.agenda;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet("/Ola..." )
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeiroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	/*	out.print("<h1>  Ola...</h1>");
	
		String[] opcao = request.getParameterValues("Materia"); 
		String nome = request.getParameter("Nome");
		out.print(nome);
		
		for (String Materia : opcao) {
			out.print(Materia);
		
		}*/
	
		String[] nome = request.getParameter(nome);
		String[] data = request.getParameterValues(data);
		out.print(nome);
		out.print(data);
		
	
		
	}

}
