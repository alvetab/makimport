package test.java;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import JPA.UrlscapturaJpaDAO;
import capturamak.Capturamaquinacompleta;
import capturamak.Parsertipo;
import entities.Urlscaptura;
import junit.framework.Assert;

public class Capturamakcompletatest {
	Urlscaptura url1;	
	public String web3= new String("http://www.makita.es/tool/22096/JN3201J.html");
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
	
	Parsertipo capturaprimero= new Parsertipo();
	Capturamaquinacompleta actual = null;
	capturaprimero.setrecuperasurls(3);
	
	for (int i = 1; i<=capturaprimero.tamanolista(); i++) {
	url1=capturaprimero.getrecuperaporId(i);
	if (url1.getActivo()&&!url1.getCapturado()){
	String url=url1.getUrl().toString();
	
	
	try {
		actual = new Capturamaquinacompleta(url);
		
		url1.setCapturado(true);
		UrlscapturaJpaDAO emurls = new UrlscapturaJpaDAO();
		emurls.update(url1);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(actual.pestanasdsg());
	}
	else {System.out.println(url1.getUrl().toString()+ " ya capturada o producto no activo");
	//url1.setCapturado(false);
	//url1.setActivo(false);
	//UrlscapturaJpaDAO emurls = new UrlscapturaJpaDAO();
	//emurls.update(url1);
	
	}
	}
	
		
	}
	
	//assertEquals("!","1");	
		
	
	}

