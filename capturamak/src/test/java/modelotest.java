package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mysql.fabric.xmlrpc.base.Array;
import com.sun.org.apache.bcel.internal.generic.NEW;

import capturamak.arbolcategoria;
import capturamak.capturaweb;
import capturamak.modelo;

public class modelotest {

String web1= new String("http://www.makita.es/parts.html?model=1050DWD&filter=");
String web2= new String("http://www.dolmar.com.es/tool/22825/EV3213.html");
String web3= new String("htt://www.dolmar.com.es/accessory/28907/794530-8.html");
	
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void modelotest() {
	 modelo recibido = new modelo();
	 capturaweb html = new capturaweb(web1);
	 String actual=recibido.getmodelo( html.getDatosCapturados());
	assertEquals("1050DWD", actual); 
	}
	
	@Test
	public void arbolcategoriatest() {
	capturaweb html = new capturaweb(web2);
	arbolcategoria arbol = new arbolcategoria(html.getDatosCapturados());
	
	ArrayList<String> recibido =arbol.getarbolcompleto();
	String recibido1 =arbol.getcategoria();
	 System.out.println(recibido.toString());
	 System.out.println(recibido1);
	 assertEquals("despiece", recibido.toString()); 
	}
	
	@Test
	public void getpadretest() {
	 capturaweb html = new capturaweb(web2);
	 arbolcategoria arbol = new arbolcategoria(html.getDatosCapturados());
	 System.out.println(arbol.getpadre());
	 assertEquals("despiece", arbol.getpadre()); 
	}
	
	@Test
	public void getrecursivatest() {
	 capturaweb html = new capturaweb(web3);
	 arbolcategoria arbol = new arbolcategoria(html.getDatosCapturados());
	 ArrayList<String> recibido =arbol.getarbolcompleto();
	 
	 int i= recibido.size()-1;
	 	do {	 
	 		System.out.println(recibido.get(i)+ " " + i);
	 		 i--;	
	 	}
	 	while (i>-1);
	
	 	assertEquals("despiece", i);
	}
	
	@Test
	public void getpadrerecursivatest() {
		 capturaweb html = new capturaweb(web3);
		 arbolcategoria arbol = new arbolcategoria(html.getDatosCapturados());
		 ArrayList<String> recibidos = arbol.getarbolcompleto();
		 String padre = arbol.getpadre(recibidos);
		 System.out.println(padre + " "+ recibidos.toString());
		 assertEquals("despiece", "array");
	}
	
	
	
	
	
	
	
}
