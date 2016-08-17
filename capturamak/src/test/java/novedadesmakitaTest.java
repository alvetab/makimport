package test.java;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.swing.internal.plaf.metal.resources.metal;

import capturamak.Parser;
import capturamak.novedadesmakita;


public class novedadesmakitaTest {
String webmakitanovedades = new String("http://www.makita.es/novedades.html");
String webmakitamaquinas = new String("http://www.makita.es/tool-groups/18895/mquinas.html");
String webmakita1 = new String("http://www.makita.es/novedades.html");	
String webmakita2 = new String("http://www.makita.es/novedades.html");





@Test
	public void compruebaQueConecteMakita(){
			
		//assertEquals(webmakitanovedades,Parser.parseoelementos(webmakitanovedades));		
	}
	
	@Test
	public void compruebaQueconstruyenovedad(){
			
		//assertEquals(webmakita,new novedadesmakita(webmakitanovedades));		
	}
	@Test
	public void compruebaQueconstruyeurlmaquinas(){
		System.out.println(Parser.Rutasmaquinaria(webmakitamaquinas));	
		assertEquals(webmakitamaquinas,Parser.Rutasmaquinaria(webmakitamaquinas));	
		
	}
	
	
}

