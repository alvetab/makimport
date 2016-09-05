package test.java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	Capturamaquinacompleta actual;
	capturaprimero.setrecuperasurls(1);
//	url1=capturaprimero.getrecuperaprimero();
	url1=capturaprimero.getrecuperaporId(30);
	String url=url1.getUrl().toString();
	System.out.println(web3);
	actual = new Capturamaquinacompleta(web3);
	System.out.println(actual.toString());
	assertEquals("!","1");	
		
	
	}

}
