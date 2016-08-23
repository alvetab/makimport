package test.java;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import JPA.DespiecepormaquinaJpaDAO;
import JPA.UrlsdocsdolJpaDAO;
import JPA.UrlsmaqmakJpaDAO;
import capturamak.ExcepcionIntervalo;
import capturamak.capturahtml;
import capturamak.descripcion;
import capturamak.Capturadespiecepormaquina;

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

	//@Test
	public void compruebadescripciontest() //throws ExcepcionIntervalo
	{
	 capturahtml html= new capturahtml(web1);	
	 Capturadespiecepormaquina despiecepormodelo = new Capturadespiecepormaquina(html.getDatosCapturados());
	 
	 
	 ArrayList<String> actual3 = despiecepormodelo.getnombremodelo();
	 System.out.println(actual3.toString());
	 ArrayList<String> actual = despiecepormodelo.getposicion();
	 System.out.println(actual.toString()); 
	 ArrayList<String> actual1 = despiecepormodelo.getcodigo();
	 System.out.println(actual1.toString()); 
	 ArrayList<String> actual2 = despiecepormodelo.getdescripcion();
	 System.out.println(actual2.toString()); 
	 assertEquals("1050DWD", actual); 
	  
	}
	
	@Test
	public void compruebaCapturaDespiecesPorMaquinatest() throws SQLException //throws ExcepcionIntervalo
	{
	try{ capturahtml html= new capturahtml(web1);	
	 Capturadespiecepormaquina despiecepormodelo = new Capturadespiecepormaquina(html.getDatosCapturados());
	 
	 for (int i=0;i<despiecepormodelo.getdescripcion().size();i++){
	DespiecepormaquinaJpaDAO emurls = new DespiecepormaquinaJpaDAO();
	emurls.crear(despiecepormodelo.getnombremodelo(i), despiecepormodelo.getposicion(i), despiecepormodelo.getcodigo(i), despiecepormodelo.getdescripcion(i));
	 
	 }
	 }
	catch(Exception e){
		 
	 }
	
	 assertEquals("1050DWD", ""); 
	  
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

