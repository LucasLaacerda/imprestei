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
public class Usuario extends GenericDomain{
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
	
	
	@JoinColumn(name="login",nullable = false)
	private String login;
	
	@Column(length = 32, nullable = false)
	private String senha;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date ultmAcesso;
	
	@Column(length = 5,nullable = false)
	private String codDevolucao;
	
	
	@OneToMany(mappedBy="objeto")
	private List<Emprestar> adevolver = new ArrayList<Emprestar>();
	
	@OneToMany(mappedBy="objeto")
	private List<Emprestar> areceber = new ArrayList<Emprestar>();

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getUltmAcesso() {
		return ultmAcesso;
	}

	public void setUltmAcesso(Date ultmAcesso) {
		this.ultmAcesso = ultmAcesso;
	}

	public String getCodDevolucao() {
		return codDevolucao;
	}

	public void setCodDevolucao(String codDevolucao) {
		this.codDevolucao = codDevolucao;
	}

	public List<Emprestar> getAdevolver() {
		return adevolver;
	}

	public void setAdevolver(List<Emprestar> adevolver) {
		this.adevolver = adevolver;
	}

	public List<Emprestar> getAreceber() {
		return areceber;
	}

	public void setAreceber(List<Emprestar> areceber) {
		this.areceber = areceber;
	}

	
	
	
}
