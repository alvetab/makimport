package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import capturamak.ExcepcionIntervalo;
import capturamak.capturahtml;
import capturamak.Descripcion;
import capturamak.Prestaciones;

public class prestacionestest {
	String web1= new String("http://www.makita.es/parts.html?model=1050DWD&filter=");
	String web2= new String("http://www.dolmar.com.es/tool/22825/EV3213.html");
	String web3= new String("http://www.makita.es/accessory/19767/B-08143.html");
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
	 capturahtml html= new capturahtml(web2);	
	 Prestaciones prestaciones = new Prestaciones(html.getDatosCapturados());
	 String actual = prestaciones.getprestaciones();
	 String actual1 = prestaciones.getprestacioneshtml();
	 System.out.println(actual); 
	 System.out.println(actual1); 
	 assertEquals("1050DWD", actual); 
	
	} catch (Exception e) {
		System.out.println("No hay prestaciones que capturar en esta pagina" + e);
	}
	}
}
