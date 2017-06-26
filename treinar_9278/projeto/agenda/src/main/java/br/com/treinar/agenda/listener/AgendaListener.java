package br.com.treinar.agenda.listener;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

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
    public void contextDestroyed(ServletContextEvent sce)  {
//    	System.out.println("minha app esta sendo inicializada");
    	Logger.getLogger("AgendaListener").log(Level.INFO, "Finalizando contexto...");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
//    	System.out.println("minha app esta sendo inicializada");
    	Logger.getLogger("AgendaListener").log(Level.SEVERE, "Inicializando contexto...");
    }
	
}
