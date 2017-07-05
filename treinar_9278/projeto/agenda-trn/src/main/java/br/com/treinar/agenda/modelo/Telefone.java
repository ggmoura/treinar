package br.com.treinar.agenda.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "tb_telefone", uniqueConstraints = { @UniqueConstraint(columnNames = { "numero", "cp_ddd" }) })
public class Telefone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "cp_ddd")
	private Integer ddd;
	private Integer numero;

	@ManyToOne(cascade = CascadeType.ALL)
	private Contato contato;

	@ManyToOne(cascade = CascadeType.ALL)
	private Contato recado;

	@Enumerated(EnumType.STRING)
	private TipoTelefone tipo;

	public Telefone() {
		super();
	}

	public Telefone(Integer ddd, Integer numero) {
		super();
		this.ddd = ddd;
		this.numero = numero;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
