package test.java;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import capturamak.ExcepcionIntervalo;
import capturamak.capturahtml;
import capturamak.descripcion;
import capturamak.despiecepormaquina;

public class despiecepormaquinatest {
	String web1= new String("http://www.makita.es/parts.html?model=1050DWD&filter=");
	String web2= new String("http://www.dolmar.com.es/tool/22825/EV3213.html");
	String web3= new String("http://www.makita.es/tool/22096/JN3201J.html");
	String web4= new String("http://www.makita.es/servicios-tecnicos.html");
	
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void compruebadescripciontest() //throws ExcepcionIntervalo
	{
	 
	
	 capturahtml html= new capturahtml(web1);	
	 despiecepormaquina despiecepormodelo = new despiecepormaquina(html.getDatosCapturados());
	 ArrayList<String> actual = despiecepormodelo.getposicion();
	 System.out.println(actual.toString()); 
	 ArrayList<String> actual1 = despiecepormodelo.getcodigo();
	 System.out.println(actual1.toString()); 
	 ArrayList<String> actual2 = despiecepormodelo.getnombre();
	 System.out.println(actual2.toString()); 
	 ArrayList<String> actual3 = despiecepormodelo.getnombremodelo();
	 System.out.println(actual3.toString()); 
	 assertEquals("1050DWD", actual); 
	 
	
	 
	 
	 
	}

}
