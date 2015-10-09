package br.com.treinar.agenda;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet({ "/PrimeiroServlet", "/olamundo", "*.treinar" })
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PrimeiroServlet() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String data = request.getParameter("data");
		
		System.out.println(nome);
		

		DateFormat df = new SimpleDateFormat("dd/MM/yyy");
		
		try {
			
			Date da = df.parse(data);
			System.out.println(df.format(data));
			
		} catch (Exception e) {
			
			System.err.println("Não foi possível converter a data informada.");

		}


	}

}
