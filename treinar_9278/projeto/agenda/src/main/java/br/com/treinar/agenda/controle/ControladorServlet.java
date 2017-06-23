package br.com.treinar.agenda.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.comando.IComando;

@WebServlet("*.agenda")
public class ControladorServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = null;
		if (request.getParameter("comando") != null) {
			try {
				IComando c = (IComando) Class.forName(request.getParameter("comando").toString()).newInstance();
				forward = c.executar(request);
			} catch (Exception e) {
				forward = "/erro.jsp";
			}
		} else {
			forward = "/pages/menu.jsp";
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(forward);
		requestDispatcher.forward(request, response);
		
		
		//IComando c = ????
		
	}

}
