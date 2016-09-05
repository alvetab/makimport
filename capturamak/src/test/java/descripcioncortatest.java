package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import capturamak.ExcepcionIntervalo;
import capturamak.capturahtml;
import capturamak.Descripcion;

public class descripcioncortatest {
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
	public void compruebadescripciontest() throws ExcepcionIntervalo {
	try {
	 capturahtml html= new capturahtml(web3);	
	 Descripcion descripcion = new Descripcion(html.getDatosCapturados());
	 String actual = descripcion.getdescripcion();
	 System.out.println(actual); 
	 assertEquals("1050DWD", actual); 
	
	} catch (Exception e) {
		System.out.println("No hay descripcion ni modelo que capturar en esta pagina" + e);
	}
	 
	 
	 
	}

}
