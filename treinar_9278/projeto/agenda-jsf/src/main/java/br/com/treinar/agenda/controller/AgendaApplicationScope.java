package br.com.treinar.agenda.controller;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.treinar.agenda.modelo.TipoTelefone;

@ApplicationScoped
@ManagedBean(name="agendaRoot")
public class AgendaApplicationScope {

	private TipoTelefone[] tipos;

	public AgendaApplicationScope() {
		tipos = TipoTelefone.values();
	}

	public TipoTelefone[] getTipos() {
		return tipos;
	}

	public void setTipos(TipoTelefone[] tipos) {
		this.tipos = tipos;
	}

}
