package capturamak;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sun.webkit.Pasteboard;

import org.jsoup.examples.HtmlToPlainText;

public class Parser {

	
	public static ArrayList<String> parseoelementos(String urlmakita) {
		ArrayList<String> urlsnews;
		urlsnews = new ArrayList<>();
		Document doc2;
		try {
			
			// obtener todas las rutas a las novedades
			doc2 = Jsoup.connect(urlmakita).timeout(0).get();
			Elements urlscapturadas = doc2.getElementsByClass("product_item_title");
			//System.out.println(doc2);
			for (Element novedad : urlscapturadas) {
				// System.out.println(novedad);
		   Element link = novedad.select("a").first();
		   String url = link.attr("abs:href");
		   urlsnews.add(url); 
		   //System.out.println(url);
				
				}
			}

		 catch (IOException e) {
			e.printStackTrace();
		 }
		//System.out.println(urlsnews.toString());
		return urlsnews;
	}	
	public static ArrayList<String> Rutasmaquinaria(String urlmakita) {
		ArrayList<String> urlsmaquinas;
		urlsmaquinas = new ArrayList<>();
		Document doc2;
		try {
			
			// obtener todas las rutas a las novedades
			doc2 = Jsoup.connect(urlmakita).timeout(0).get();
			
			Elements urlscapturadas = doc2.getElementsByClass("product_group_link_all");
			for (Element elemento : urlscapturadas) {
				 System.out.println(elemento);
				 Element link = elemento.select("a").first();
				 String url = link.attr("abs:href");			 
				 urlsmaquinas.add(url); 
				 Parser.Rutasmaquinaria(url);
				 
				 //System.out.println(url);
			}
			//for (String url : urlsmaquinas) {
				 
				 
		}

		 catch (IOException e) {
			e.printStackTrace();
		 }
		//System.out.println(urlsnews.toString());
		return urlsmaquinas;
	}	
}
