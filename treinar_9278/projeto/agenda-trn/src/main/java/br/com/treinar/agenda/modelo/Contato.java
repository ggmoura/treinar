package br.com.treinar.agenda.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@NamedQueries(value={
		@NamedQuery(name="Contato.selecionarTodosOsNomes", query="select new br.com.treinar.agenda.modelo.Contato(c.nome) from Contato c")
		
})
@Entity
public class Contato {

	
	public Contato(String nome) {
		this.nome = nome;
	}
	
	public Contato() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	// @ManyToOne(fetch=FetchType.LAZY , cascade={CascadeType.PERSIST,
	// CascadeType.MERGE})
	// @JoinColumn(name="id_telefone")
	// private Telefone telefone;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="contato", fetch=FetchType.EAGER)
	private List<Telefone> telefones;

	private Date dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// public Telefone getTelefone() {
	// return telefone;
	// }
	//
	// public void setTelefone(Telefone telefone) {
	// this.telefone = telefone;
	// }

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

}
