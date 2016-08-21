package capturamak;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.examples.HtmlToPlainText;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.sun.media.sound.ModelOscillator;

import entities.Accesorio;
import entities.Accesoriosbak;


public class capturadatos {

	public String captura(Accesorio accesorio,String datoaconseguir, String html_capturado){
	 
	 accesorio.setCategoria(datoaconseguir);
	 System.out.println(accesorio.getCategoria());
	 System.out.println(html_capturado);
	 datosconseguidos=datoaconseguir + Capturartecnicos(html_capturado)  ;
	 return datosconseguidos;
	 }	
	
	public String Capturartecnicos(String urlmakita) {
		Document doc2;
		try {
		// capturar datos tecnicos
		doc2 = Jsoup.connect(urlmakita).timeout(0).get();
		Elements articulos1 = doc2.select("div[class=techspec]");
		Elements articulos2 = articulos1.select("div[class=techspec_holder]");
		Elements articulos3 = articulos2.select("div[class=techspec_titel]");
		for (Element link : articulos3) {
			// imprimirlos
			result = new HtmlToPlainText().getPlainText(link);
			System.out.println("titulo : " + link.attr("title"));
			System.out.println("titulo : " + result);
		}
		
		} catch (IOException e) {
			e.printStackTrace();
			}	
			return result;
	}
 
	

private String datosconseguidos;
private String result;



/*ModelO --ya
categoria --ya
descripcion --ya
descripcion corta
descripcion General
prestaciones
tecnicas
otros
equipo y Accesorios

fotos
*/

}

