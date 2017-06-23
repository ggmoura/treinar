package br.com.treinar.agenda.tld;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class HelloTag extends SimpleTagSupport {
	
	private String message;

	public void setMessage(String msg) {
		this.message = msg;
	}

	StringWriter sw = new StringWriter();

	public void doTag() throws JspException, IOException {
		if (message != null) {
			JspWriter out = getJspContext().getOut();
			out.println("<h1>" + message + "</h1>");
		} else {
			getJspBody().invoke(sw);
			getJspContext().getOut().println("<h1>" + sw.toString() + "</h1>");
		}
	}
}