package br.com.treinar.listener;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.treinar.modelo.TipoTelefone;

/**
 * Application Lifecycle Listener implementation class AgendaListener
 *
 */
@WebListener
public class AgendaListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public AgendaListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		Logger.getLogger(getClass().getSimpleName()).log(Level.INFO,
				"Parando o projeto agenda...");
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		Logger.getLogger(getClass().getSimpleName()).log(Level.INFO,
				"Inicializando o projeto agenda...");
		TipoTelefone[] tipos = TipoTelefone.values();

		List<TipoTelefone> tiposTelefone = Arrays.asList(tipos);

		Collections.sort(tiposTelefone, new Comparator<TipoTelefone>() {

			@Override
			public int compare(TipoTelefone o1, TipoTelefone o2) {
				return o1.getDescricao().compareTo(o2.getDescricao());
			}

		});

		sce.getServletContext().setAttribute("tiposTelefone", tiposTelefone);

	}

}
