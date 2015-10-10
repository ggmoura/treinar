package br.com.treinar.agenda;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SevletSessao
 */
@WebServlet("/sessao")
public class SevletSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SevletSessao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = request.getSession().getServletContext();
		Integer contadorUsuarios = (Integer)context.getAttribute("contadorUsuario");
		context.setAttribute("contadorUsuario", ++contadorUsuarios);
		
		
		HttpSession session = request.getSession();
		Object objSessao = request.getSession().getAttribute("contador");
		
		Integer contador = objSessao != null ? (Integer) objSessao : 0;
//		mesmo codigo da linha acima
//		if (objSessao != null) {
//			contador = (Integer) objSessao;
//		} else {
//			contador = 0;
//		}
		
		
		session.setAttribute("contador", ++contador);
		//session.setMaxInactiveInterval(20*60);
		
		response.getWriter().write("<h1>Sessão:&nbsp;" + contador + "</h1>");
		response.getWriter().write("<h1>Aplicação:&#160;" + contadorUsuarios + "</h1>");
		
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		config.getServletContext().setAttribute("contadorUsuario", 0);
		super.init(config);
	}

}
