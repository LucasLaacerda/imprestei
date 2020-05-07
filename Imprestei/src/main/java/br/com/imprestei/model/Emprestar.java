package br.com.imprestei.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Emprestar extends GenericDomain{
	
	@ManyToOne
	@JoinColumn(name="objeto",nullable = false)
	private Objeto objeto;
	
	@JoinColumn(name="aemprestar",nullable = false)
	private Usuario aemprestar;

	@JoinColumn(name="pessoaReceber",nullable = false)
	private Pessoa pessoaReceber;
	
	@JoinColumn(name="areceber",nullable = false)
	private Usuario areceber;
	
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataIni;
	
	@Column()
	@Temporal(TemporalType.DATE)
	private Date dataFim;
	
	@Column(nullable = false)
	private Short quantidade;
	
	@Column(length = 100,nullable = false)
	private String observacao;
	
	@Column(length = 20,nullable = false)
	private String status;

	public Objeto getObjeto() {
		return objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}

	public Usuario getAemprestar() {
		return aemprestar;
	}

	public void setAemprestar(Usuario aemprestar) {
		this.aemprestar = aemprestar;
	}

	public Pessoa getPessoaReceber() {
		return pessoaReceber;
	}

	public void setPessoaReceber(Pessoa pessoaReceber) {
		this.pessoaReceber = pessoaReceber;
	}

	public Usuario getAreceber() {
		return areceber;
	}

	public void setAreceber(Usuario areceber) {
		this.areceber = areceber;
	}

	public Date getDataIni() {
		return dataIni;
	}

	public void setDataIni(Date dataIni) {
		this.dataIni = dataIni;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Short getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
	
}

