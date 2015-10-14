package br.com.treinar.util;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletControle
 */
@WebServlet("*.agenda")
public class ServletControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String comandoStr = request.getParameter("comando");
		
		try {
			IComando comando = (IComando) Class.forName(comandoStr).newInstance();
			String navegacao = comando.executar(request, response);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(navegacao);
			requestDispatcher.forward(request, response);
			
		} catch (AgendaException e) {
			//
		} catch (Exception e) {
			
		}
	}

}
