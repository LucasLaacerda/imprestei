package br.com.imprestei.util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.junit.Test;

import br.com.imprestei.util.HibernateUtil;

public class HibernateUtilTest {

	
	@Test
	public void conectar(){
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}
	
	
	
	
}