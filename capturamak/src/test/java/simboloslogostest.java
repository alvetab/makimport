package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import capturamak.ExcepcionIntervalo;
import capturamak.capturahtml;
import capturamak.Descripcion;
import capturamak.Simboloslogos;

public class simboloslogostest {
	String web1= new String("http://www.makita.es/parts.html?model=1050DWD&filter=");
	String web2= new String("http://www.dolmar.com.es/tool/22825/EV3213.html");
	String web3= new String("http://www.makita.es/tool/22138/5143R.html");
	String web4= new String("http://www.makita.es/accessory/19593/B-12681.html");
	
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void simbolosylogostest() throws ExcepcionIntervalo {
	try {
	 capturahtml html= new capturahtml(web4);	
	 Simboloslogos descripcion = new Simboloslogos(html.getDatosCapturados());
	 String[] actual = descripcion.getsimbolos();
	 
	 for (int i=0;i<actual.length;i++){
	 
	 System.out.println(actual[i]); 
	 }
	 
	 assertEquals("1050DWD", "3"); 
	 
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("No hay descripcion ni modelo que capturar en esta pagina" + e);
	}
	 
	 
	 
	}

}
