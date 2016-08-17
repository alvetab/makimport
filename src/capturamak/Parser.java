package capturamak;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Parser {
	 private static ArrayList<String> listafinal = new ArrayList<String>();
	
	public static ArrayList<String> parseoelementos(String urlmakita) {
		//ArrayList<String> urlsnews;
		//urlsnews = new ArrayList<>();
		Document doc2;
		try {
			// obtener todas las rutas a las novedades
			doc2 = Jsoup.connect(urlmakita).timeout(0).get();
			Elements urlscapturadas = doc2.getElementsByClass("product_item_title");
			if (urlscapturadas.isEmpty()){
				Elements urlscapturadasaccesorio = doc2.getElementsByClass("accessory_zoom_holder");
				for (Element novedad : urlscapturadasaccesorio) {
					// System.out.println(novedad);
			   Element link = novedad.select("a").first();
			   String url = link.attr("abs:href");
			   listafinal.add(url); 
			
				}
			}
			else {
			//System.out.println(doc2);
			for (Element novedad : urlscapturadas) {
				// System.out.println(novedad);
		   Element link = novedad.select("a").first();
		   String url = link.attr("abs:href");
		   listafinal.add(url); 
		   System.out.println(listafinal.toString());
				}
			}
			}
		 catch (IOException e) {
			e.printStackTrace();
		 }
		System.out.println(listafinal.toString());
		return listafinal;
		
	}	

	public static ArrayList<String> Rutasmaquinaria(String urlmakita) {
		Document doc2;
		try {
			
			// obtener todas las rutas a las novedades
			doc2 = Jsoup.connect(urlmakita).timeout(0).get();
			
			Elements urlscapturadas = doc2.getElementsByClass("product_group_link_all");
			
			if (!urlscapturadas.isEmpty()){				
				//Parser.Rutasmaquinaria(url);)
			for (Element elemento : urlscapturadas) {
				// System.out.println(elemento);
				 Element link = elemento.select("a").first();
				 String url = link.attr("abs:href");			 
				 Rutasmaquinaria(url); 
				 //System.out.println(url);
			}
			//for (String url : urlsmaquinas) {
				 
				 
		
			}
			else { parseoelementos(urlmakita);							
			}
		}

		 catch (IOException e) {
			e.printStackTrace();
		 }
		//System.out.println(urlsnews.toString());
		return listafinal;
	}	
}
