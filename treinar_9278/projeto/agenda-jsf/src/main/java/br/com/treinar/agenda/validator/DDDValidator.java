package br.com.treinar.agenda.validator;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.com.treinar.agenda.modelo.Telefone;


@FacesValidator(value="br.com.treinar.agenda.validator.DDDValidator")
public class DDDValidator  implements Validator {

	public void validate(FacesContext context, UIComponent component, Object value) 
			throws ValidatorException {
		Telefone t = (Telefone) value;
		Integer ddd = t.getDdd();
		List<Integer> permitidos = Arrays.asList(11, 21, 31);
		
		if (!permitidos.contains(ddd)) {
			FacesMessage msg = new FacesMessage("DDD Invalido", 
							"Validos 11, 21 ,31");
				msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
	}

	
	
}
