package br.com.biblioteca.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MembroId implements Serializable {

	private static final long serialVersionUID = 7364381179534142028L;

	@Column(name = "idprojeto")
	private Long projeto;
	
	@Column(name = "idpessoa")
	private Long pessoa;
	
	public MembroId() {
		
	}

	public Long getProjeto() {
		return projeto;
	}

	public void setProjeto(Long projeto) {
		this.projeto = projeto;
	}

	public Long getPessoa() {
		return pessoa;
	}

	public void setPessoa(Long pessoa) {
		this.pessoa = pessoa;
	}
	
}
