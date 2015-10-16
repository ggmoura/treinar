package br.com.treinar.agenda.mb;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.treinar.modelo.Sexo;

@ManagedBean(name="applicationAgenda")
@ApplicationScoped
public class AgendaApplicationScopeMB {

	private List<Sexo> sexos;

	public AgendaApplicationScopeMB() {
		init();
	}

	private void init() {
		sexos = Arrays.asList(Sexo.values());
	}

	public List<Sexo> getSexos() {
		return sexos;
	}

	public void setSexos(List<Sexo> sexos) {
		this.sexos = sexos;
	}

}
