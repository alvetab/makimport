package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import capturamak.listasurls;

public class novedadesmakitaTest {
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

	@Test
	public void compruebaQueConecteMakita() {

		// assertEquals(webmakitanovedades,Parser.parseoelementos(webmakitanovedades));
	}

	@Test
	public void compruebaQueconstruyenovedad() {

		// assertEquals(webmakita,new novedadesmakita(webmakitanovedades));
	}

	@Test
	public void compruebaQueconstruyeurlmaquinas() {
		System.out.println(listasurls.capturaurls(webdolmarmanuales));
		assertEquals(webdolmarparts, webdolmarparts);

	}

}
