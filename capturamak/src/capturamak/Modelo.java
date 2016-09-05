package capturamak;

import org.jsoup.examples.HtmlToPlainText;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;


public class Modelo {
		String modelo;
	
		public String getmodelo(Document html_capturado) {
	 	Element modelohmlt= html_capturado.getElementsByClass("breadcrumb_link_current").get(0);
	 	modelo= new HtmlToPlainText().getPlainText(html_capturado.getElementsByClass("breadcrumb_link_current").get(0));
	 	return modelo;
		}
	
		
	

//private String datosconseguidos;
//private String result;


/*

categoria
descripcion 
descripcion corta
descripcion General
prestaciones
tecnicas
otros
equipo y Accesorios

fotos
*/

}

