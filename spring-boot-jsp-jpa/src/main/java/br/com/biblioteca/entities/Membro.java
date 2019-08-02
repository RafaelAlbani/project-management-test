package br.com.biblioteca.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="membros", schema="projectmanagement")
@IdClass(MembroId.class)
public class Membro {

	@Id
	@ManyToOne
	@JoinColumn(name="idprojeto", referencedColumnName="id")
	private Projeto projeto;
	
	@Id
	@ManyToOne
	@JoinColumn(name="idpessoa", referencedColumnName="id")
	private Pessoa pessoa;
	
	public Membro() {
	
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
