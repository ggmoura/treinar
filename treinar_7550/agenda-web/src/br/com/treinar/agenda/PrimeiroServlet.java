package br.com.treinar.agenda;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet(urlPatterns={ "/olamundo", "/PrimeiroServlet", "*.treinar" }, loadOnStartup=1)
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
		/*PrintWriter out = response.getWriter();
		String[] opcoes = request.getParameterValues("materia");
		String nome = request.getParameter("nome");
		out.print("<h1>Olá ");
		out.print(nome);
		out.append("\n ");
		if (opcoes != null) {
			for (String materia : opcoes) {
				out.print(materia);
			}			
		}
		
		out.print("...</h1>");*/
		
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setTelefone(telefone);
		
		request.setAttribute("pessoa", pessoa);
		
		Logger.getLogger("PrimeiroServlet").info(nome + " " + telefone);
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/paginas/primeira-jsp.jsp");
		
		requestDispatcher.forward(request, response);
		
		
	}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	PrintWriter out = resp.getWriter();
		out.print("doGet");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	PrintWriter out = resp.getWriter();
    	out.print("doPost");
    	
    }
    
    @Override
    public void init() throws ServletException {
    	Logger.getLogger("PrimeiroServlet").info("Inicializando servlet PrimeiroServlet.java");
    }
    
    @Override
    public void destroy() {
    	Logger.getLogger("PrimeiroServlet").info("Finalizando servlet PrimeiroServlet.java");
    }
	
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.doPut(req, resp);
    }
    
}
