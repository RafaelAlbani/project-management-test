package br.com.biblioteca.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="projeto", schema="projectmanagement")
public class Projeto {

	@Id
	@Column(name = "id")
	@SequenceGenerator(name="projeto_id_seq_new", sequenceName="projeto_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="projeto_id_seq_new")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "data_inicio")
	private Date dataInicio;
	
	@Column(name = "data_previsao_fim")
	private Date dataPrevisaoFim;
	
	@Column(name = "data_fim")
	private Date dataFim;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "orcamento")
	private Float orcamento;
	
	@Column(name = "risco")
	private String risco;
	
	@JoinColumn(name = "idgerente", referencedColumnName = "id")
	@ManyToOne()
	private Pessoa gerente;
	
	public Projeto() {
		
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

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataPrevisaoFim() {
		return dataPrevisaoFim;
	}

	public void setDataPrevisaoFim(Date dataPrevisaoFim) {
		this.dataPrevisaoFim = dataPrevisaoFim;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Float getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Float orcamento) {
		this.orcamento = orcamento;
	}

	public String getRisco() {
		return risco;
	}

	public void setRisco(String risco) {
		this.risco = risco;
	}

	public Pessoa getGerente() {
		return gerente;
	}

	public void setGerente(Pessoa gerente) {
		this.gerente = gerente;
	}
	
}
