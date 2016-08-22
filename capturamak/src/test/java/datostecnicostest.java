package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import capturamak.ExcepcionIntervalo;
import capturamak.capturahtml;
import capturamak.datostecnicos;

public class datostecnicostest {

String web1= new String("http://www.makita.es/parts.html?model=1050DWD&filter=");
String web2= new String("http://www.dolmar.com.es/tool/22825/EV3213.html");
String web3= new String("http://www.makita.es/tool/21962/DS4012.html");
String web4= new String("http://www.makita.es/tool/21962/DS4012.html");
String web5= new String("http://www.makita.es/accessory/23177/D-45749.html");

	
@Before
public void setUp() throws Exception {
}

@After
public void tearDown() throws Exception {
}

@Test
public void compruebaequipoyaccesoriostest() throws ExcepcionIntervalo {
try { capturahtml html= new capturahtml(web1);	
 datostecnicos equipoyacces = new datostecnicos(html.getDatosCapturados());
 String[][] equipo = equipoyacces.getdatostecnicos();

 
 if( equipo.length>0){
 for (int i=0;i<=equipo.length-1;i++)
 //System.out.println(equipo.length); 
 System.out.println(equipo[i][0] +"   "+ equipo[i][1]+"   "+ equipo[i][2]); 
 }
 
 assertEquals("1050DWD", "3");
 
 
 
 
 
 
} catch (Exception e) {
	System.out.println("No hay descripcion ni modelo que capturar en esta pagina" ); 
		e.printStackTrace();
	}
	



}
}