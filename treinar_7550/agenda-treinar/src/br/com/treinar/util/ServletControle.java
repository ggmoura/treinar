package br.com.treinar.util;

import java.io.IOException;

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
		
		//br.com.treinar.comando.CriaContato
		
		String comandoStr = request.getParameter("comando");
		
		try {
			IComando comando = (IComando) Class.forName(comandoStr).newInstance();
			comando.executar(request, response);
		
		} catch (Exception e) {
			//TODO - implementar regra de Exception
		}
	}

}
