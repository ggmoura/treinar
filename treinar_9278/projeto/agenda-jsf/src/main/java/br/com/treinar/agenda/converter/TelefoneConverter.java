package br.com.treinar.agenda.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.treinar.agenda.modelo.Telefone;

@FacesConverter(value="br.com.treinar.agenda.converter.TelefoneConverter")
public class TelefoneConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Integer ddd = Integer.valueOf(value.substring(0, 2));
		Integer numero = Integer.valueOf(value.substring(3, value.length()));
		return new Telefone(ddd, numero);
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String telefone = "";
		if (value != null) {
			Telefone t = (Telefone) value;
			telefone = t.getDdd() + " " + t.getNumero();
		}
		return telefone;
	}

}
