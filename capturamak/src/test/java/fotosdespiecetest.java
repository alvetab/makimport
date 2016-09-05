package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import capturamak.arbolcategoria;
import capturamak.capturafotos;
import capturamak.capturahtml;
import capturamak.fotosdespiece;
import capturamak.Modelo;

public class fotosdespiecetest {
	fotosdespiece fotosarray;

	String web1= new String("http://www.makita.es/tool/22141/2704.html");
	String web2= new String("http://www.dolmar.com.es/tool/22825/EV3213.html");
	String web3= new String("http://www.makita.es/tool/22141/2704.html#");
	


	@Test
	public void test() {}
		

		
		
		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
		}	
		
		
	
	@Test
	public void fotostest() {
	 Modelo recibido = new Modelo();
	 capturahtml html = new capturahtml(web3);
	 fotosarray=new fotosdespiece(html.getDatosCapturados());
	 
	 String actual= fotosarray.toString();
	assertEquals("1050DWD", actual); 
	}
	

	public void arbolcategoriatest() {
	capturahtml html = new capturahtml(web2);
	arbolcategoria arbol = new arbolcategoria(html.getDatosCapturados());
	
	ArrayList<String> recibido =arbol.getarbolcompleto();
	String recibido1 =arbol.getcategoria();
	 System.out.println(recibido.toString());
	 System.out.println(recibido1);
	 assertEquals("despiece", recibido.toString()); 
	}
	
	
	public void getpadretest() {
	 capturahtml html = new capturahtml(web2);
	 arbolcategoria arbol = new arbolcategoria(html.getDatosCapturados());
	 System.out.println(arbol.getpadre());
	 assertEquals("despiece", arbol.getpadre()); 
	}
	
	
	public void getrecursivatest() {
	 capturahtml html = new capturahtml(web3);
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
	
	
	public void getpadrerecursivatest() {
		 capturahtml html = new capturahtml(web3);
		 arbolcategoria arbol = new arbolcategoria(html.getDatosCapturados());
		 ArrayList<String> recibidos = arbol.getarbolcompleto();
		 String padre = arbol.getpadre(recibidos);
		 System.out.println(padre + " "+ recibidos.toString());
		 assertEquals("despiece", "array");
	}
	
			
}		
		
		
		
		
		

