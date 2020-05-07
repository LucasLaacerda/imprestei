package br.com.imprestei.util;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import br.com.imprestei.model.Pessoa;
import br.com.imprestei.model.Usuario;
import br.ocm.imprestei.dao.PessoaDAO;
import br.ocm.imprestei.dao.UsuarioDAO;

public class ModalidadeDAOTest {
	
	
	@Ignore
	public void salvar() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Lucas");
		pessoa.setEndereco("Rua Grafita,299");
		pessoa.setContato1("33973591");
		pessoa.setContato2("995002214");
		pessoa.setRedeSocial("twitter.com/lukinnhas_g");
		pessoa.setEmail("l@gmail.com");
		pessoa.setFoto("url/url/url/caminho");
		pessoa.setUsu(true);
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Ana");
		pessoa1.setEndereco("Rua Teste,1234");
		pessoa1.setContato1("444444444");
		pessoa1.setContato2("");
		pessoa1.setRedeSocial("twitter.com/ana");
		pessoa1.setEmail("a@gmail.com");
		pessoa1.setFoto("");
		pessoa1.setUsu(false);
		pessoaDAO.salvar(pessoa1);
		
		
		Usuario usu = new Usuario();
		usu.setPessoa(pessoa);
		usu.setLogin("lukinhaName");
		usu.setSenha("senhaTeste");
		usu.setUltmAcesso(new Date());
		usu.setCodDevolucao("QWER4");
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.salvar(usu);
		
	}
	@Test
	public void listar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> resultado = pessoaDAO.listar();
		
		
		for(Pessoa p : resultado){
			System.out.println("-------- Pessoa ---------");
			System.out.println("Nome:        "+p.getNome());
			System.out.println("Endereço:    "+p.getEndereco());
			System.out.println("Contato 1:   "+p.getContato1());
			System.out.println("Contao  2:   "+p.getContato2());
			System.out.println("Rede Social: "+p.getRedeSocial());
			System.out.println("Email:       "+p.getEmail());
			System.out.println("Foto:        "+p.getFoto());
			System.out.println("Possui usuario: "+p.getUsu());
//			System.out.println("Login:        "+modal.getCodigo());
//			System.out.println("Ultim.Aacesso:        "+modal.getCodigo());

		}
	}

}
