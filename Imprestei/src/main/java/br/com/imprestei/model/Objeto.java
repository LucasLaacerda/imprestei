package br.com.imprestei.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
public class Objeto extends GenericDomain{

	
	@ManyToOne
	private Usuario dono;
	
	@Column(length = 100, nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private Short quantidade;
	
	@Column(nullable = false)
	private Boolean emDia;
	
	@Column(length = 100)
	private String foto;

	public Usuario getDono() {
		return dono;
	}

	public void setDono(Usuario dono) {
		this.dono = dono;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Short getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}

	public Boolean getEmDia() {
		return emDia;
	}

	public void setEmDia(Boolean emDia) {
		this.emDia = emDia;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
}
