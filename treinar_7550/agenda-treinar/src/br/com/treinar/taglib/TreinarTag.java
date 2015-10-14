package br.com.treinar.taglib;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TreinarTag extends SimpleTagSupport {

	private String id;
	private String nome;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	StringWriter sw = new StringWriter();

	public void doTag() throws JspException, IOException {
		if (id != null && nome != null) {
			/* Use message from attribute */
			JspWriter out = getJspContext().getOut();
			out.println("<div class=\"ui-field-contain\">");
			out.println("<label for=\"nome\">Sexo:</label>");
			out.println("<fieldset id=\"radio-1\">");
			out.println("<input name=\"" + nome + "\" id=\"sexoFeminino\" value=\"0\" type=\"radio\"/>");
			out.println("<label for=\"sexoFeminino\">Feminino</label>");
			out.println("<input name=\"" + nome + "\" id=\"sexoMasculino\" value=\"1\" type=\"radio\"/>");
			out.println("<label for=\"sexoMasculino\">Masculino</label>");
			out.println("</fieldset>");
			out.println("</div>");
			
		} else {
			/* use message from the body */
			getJspBody().invoke(sw);
			getJspContext().getOut().println(sw.toString());
		}
	}
}
