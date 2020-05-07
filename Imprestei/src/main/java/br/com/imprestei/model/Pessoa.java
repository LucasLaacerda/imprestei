package br.com.imprestei.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.id.UUIDGenerationStrategy;


@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericDomain{

	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 100)
	private String endereco;
	
	@Column(length = 15)
	private String contato1;
	
	@Column(length = 15)
	private String contato2;
	
	@Column(length = 100)
	private String redeSocial;

	@Column(length = 100)
	private String email;
	
	@Column(length = 100)
	private String foto;
	
	@Column(nullable = false)
	private Boolean usu;
	
	@OneToMany(mappedBy="login")
	private List<Usuario> usuarioAmigo = new ArrayList<Usuario>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContato1() {
		return contato1;
	}

	public void setContato1(String contato1) {
		this.contato1 = contato1;
	}

	public String getContato2() {
		return contato2;
	}

	public void setContato2(String contato2) {
		this.contato2 = contato2;
	}

	public String getRedeSocial() {
		return redeSocial;
	}

	public void setRedeSocial(String redeSocial) {
		this.redeSocial = redeSocial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Boolean getUsu() {
		return usu;
	}

	public void setUsu(Boolean usu) {
		this.usu = usu;
	}

	public List<Usuario> getUsuarioAmigo() {
		return usuarioAmigo;
	}

	public void setUsuarioAmigo(List<Usuario> usuarioAmigo) {
		this.usuarioAmigo = usuarioAmigo;
	}

	
	
}
