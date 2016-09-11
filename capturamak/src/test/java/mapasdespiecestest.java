package test.java;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;
import org.jsoup.nodes.Document;


import capturamak.arbolcategoria;
import capturamak.capturahtml;
import capturamak.Capturajsonmapas;
import capturamak.Fotosdespiece;
import entities.mapadespiece;
import capturamak.Mapasdespieces;
import capturamak.Modelo;

public class mapasdespiecestest {
	Mapasdespieces mapasarray;

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
	public void mapasdespiecetest() throws Exception {
	 Modelo recibido = new Modelo();
	 capturahtml html_capturado = new capturahtml(web3);
	 String nommodelo=recibido.getmodelo(html_capturado.getDatosCapturados());
	 mapasarray=new Mapasdespieces(html_capturado.getDatosCapturados());
	 int i=0;
	 for (String urlmapa : mapasarray.urlmapas()) {
		
		 System.out.println(urlmapa);
		Capturajsonmapas mapacapturado= new Capturajsonmapas(urlmapa);
		String datosenbruto = mapacapturado.getDatosCapturados();
		System.out.println(datosenbruto);
		 mapadespiece mapa= new mapadespiece();
		 String xml=mapa.tomapxml(datosenbruto,nommodelo);
		 
		 try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nommodelo+"_"+i+".txt"), "utf-8"))) {
	   writer.write(xml);
	   	}
		 i++;
		 
		}
	
	 
	 String actual= mapasarray.toString();
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
		
		
		
		
		

