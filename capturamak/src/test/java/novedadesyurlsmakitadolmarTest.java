package test.java;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.util.ArrayList;

import org.junit.Test;

import JPA.UrlsdocsdolJpaDAO;
import JPA.UrlsdocsmakJpaDAO;
import JPA.UrlsmaqdolJpaDAO;
import JPA.UrlsmaqmakJpaDAO;
import capturamak.listasurls;

public class novedadesyurlsmakitadolmarTest {
	String webmakitanovedades = new String("http://www.makita.es/novedades.html");
	String webmakitamaquinas = new String("http://www.makita.es/tool-groups/18895/mquinas.html");
	String webmakitaaccesorios = new String("http://www.makita.es/accessory-groups/18897/accesorios.html");
	String webmakitaparts = new String("http://www.makita.es/parts.html");
	String webmakitamanuales = new String("http://www.makita.es/manuales.html");
	
	String webdolmarnovedades = new String("http://www.dolmar.com.es/novedades.html");
	String webdolmarmaquinas = new String("http://www.dolmar.com.es/tool-groups/18896/1maquinas.html");
	String webdolmaraccesorios = new String("http://www.dolmar.com.es/accessory-groups/26269/accesorios.html");
	String webdolmarparts = new String("http://www.dolmar.com.es/parts.html");
	String webdolmarmanuales = new String("http://www.dolmar.com.es/manuales.html");
	// String webmakitaparts = new String("http://www.makita.es/partwes.html");

	//@Test
	public void compruebaQueConecteMakita() {

		// assertEquals(webmakitanovedades,Parser.parseoelementos(webmakitanovedades));
	}

	//@Test
	public void compruebaQueconstruyenovedad() {

		// assertEquals(webmakita,new novedadesmakita(webmakitanovedades));
	}

	//@Test
	public void compruebaQueconstruyeurlmaquinas() {
		//System.out.println(listasurls.capturaurls(webdolmarmanuales));
		assertEquals(webdolmarparts, webdolmarparts);
		
	}


	//@Test
	public void compruebaQuegrabalaurlmaquinas() throws Exception{
		ArrayList<String> listadourls = listasurls.capturaurls(webdolmarmanuales);
		//UrlsmaqmakJpaDAO emurls = new UrlsmaqmakJpaDAO();
		String modelo = new String();
		int valuemodelo = 1000221;
		for (String urls : listadourls){
			UrlsmaqmakJpaDAO emurls = new UrlsmaqmakJpaDAO();
			//System.out.println(urls);
			emurls.crear(modelo.valueOf(valuemodelo),urls,3,true,true);	
			valuemodelo++;
			}
		assertEquals(webdolmarparts, webdolmarparts);
		}
	
	//@Test
	public void compruebarecuperaurlmaquinas() throws Exception{
		int Id = 21;
			UrlsmaqmakJpaDAO emurls = new UrlsmaqmakJpaDAO();
			//System.out.println(emurls.geturl(1));	
			for(int i=1;i<10;i++){
			System.out.println(emurls.geturl(i));	
			}
			
			assertEquals("1", webdolmarparts);
		}
	//@Test
		public void compruebaQuegrabalaurlmaquinasdol() throws Exception{
			ArrayList<String> listadourls = listasurls.capturaurls(webdolmaraccesorios);
			//UrlsmaqmakJpaDAO emurls = new UrlsmaqmakJpaDAO();
			String modelo = new String();
			int valuemodelo = 1000221;
			for (String urls : listadourls){
				UrlsmaqdolJpaDAO emurls = new UrlsmaqdolJpaDAO();
				//System.out.println(urls);
				emurls.crear(modelo.valueOf(valuemodelo),urls,3,true,true);	
				valuemodelo++;
				}
			assertEquals(webdolmarparts, webdolmarparts);
			}
	
	//@Test
	public void compruebarecuperaurlmaquinasdolmar() throws Exception{
		int Id = 21;
			UrlsmaqdolJpaDAO emurls = new UrlsmaqdolJpaDAO();
			//System.out.println(emurls.geturl(1));	
			for(int i=1;i<10;i++){
			System.out.println(emurls.geturl(i));	
			}
			
			assertEquals("1", webdolmarparts);
		}
	
	@Test
	public void compruebaQuegrabalaurlaccdol() throws Exception{
		ArrayList<String> listadourls = listasurls.capturaurls(webdolmarnovedades);
		//UrlsmaqmakJpaDAO emurls = new UrlsmaqmakJpaDAO();
		String modelo = new String();
		int valuemodelo = 1000221;
		for (String urls : listadourls){
			UrlsdocsdolJpaDAO emurls = new UrlsdocsdolJpaDAO();
			//System.out.println(urls);
			emurls.crear(modelo.valueOf(valuemodelo),urls,1,true,true);	
			valuemodelo++;
			}
		assertEquals(webdolmarparts, webdolmarparts);
		}
}
