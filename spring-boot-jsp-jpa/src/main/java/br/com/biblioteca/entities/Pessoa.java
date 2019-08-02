package br.com.biblioteca.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="pessoa", schema="projectmanagement")
public class Pessoa {

	@Id
	@Column(name = "id")
	@SequenceGenerator(name="pessoa_id_seq_new", sequenceName="pessoa_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pessoa_id_seq_new")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "datanascimento")
	private Date dataNascimento;

	@Column(name="cpf")
	private String cpf;
	
	@Column(name="funcionario")
	private Boolean funcionario;
	
	public Pessoa() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Boolean getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Boolean funcionario) {
		this.funcionario = funcionario;
	}
	
}
