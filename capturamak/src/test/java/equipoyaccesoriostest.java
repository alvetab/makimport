package test.java;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mysql.fabric.xmlrpc.base.Array;
import com.sun.org.apache.bcel.internal.generic.NEW;

import capturamak.ExcepcionIntervalo;
import capturamak.arbolcategoria;
import capturamak.capturahtml;
import capturamak.descripcion;
import capturamak.equipoyacceso;
import capturamak.modelo;
import jdk.nashorn.internal.runtime.ECMAErrors;

public class equipoyaccesoriostest {

String web1= new String("http://www.makita.es/parts.html?model=1050DWD&filter=");
String web2= new String("http://www.dolmar.com.es/tool/22825/EV3213.html");
String web3= new String("http://www.makita.es/tool/21962/DS4012.html");
String web4= new String("http://www.makita.es/tool/21962/DS4012.html");
	
@Before
public void setUp() throws Exception {
}

@After
public void tearDown() throws Exception {
}

@Test
public void compruebaequipoyaccesoriostest() throws ExcepcionIntervalo {
try {
 capturahtml html= new capturahtml(web4);	
 equipoyacceso equipoyacces = new equipoyacceso(html.getDatosCapturados());
 String[][] equipo = equipoyacces.getequipobasico();
 String[][] accesorios = equipoyacces.getaccesorios();
 
 if( equipo.length>0){
 System.out.println(equipo.length); 
 System.out.println(equipo[0][0]); 
 System.out.println(equipo[0][1]); 
 System.out.println(equipo[0][2]); 
 System.out.println(equipo[equipo.length-1][0]); 
 System.out.println(equipo[equipo.length-1][1]);
 System.out.println(equipo[equipo.length-1][2]); 
 }
 
 
 if( accesorios.length>0){
 System.out.println(accesorios.length); 
 System.out.println(accesorios[0][0]); 
 System.out.println(accesorios[0][1]); 
 System.out.println(accesorios[0][2]); 
 System.out.println(accesorios[accesorios.length-1][0]); 
 System.out.println(accesorios[accesorios.length-1][1]); 
 System.out.println(accesorios[accesorios.length-1][2]); 
 }
 assertEquals("1050DWD", "3");
 
 
 
 
 
 
} catch (Exception e) {
	System.out.println("No hay descripcion ni modelo que capturar en esta pagina" ); 
		e.printStackTrace();
	}
	



}
}