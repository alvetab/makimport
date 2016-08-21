package capturamak;

import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.validator.PublicClassValidator;
import org.w3c.dom.stylesheets.LinkStyle;

public class despiecesotros {
	public ArrayList<String> nombremodelo;
	public ArrayList<String> urlsafotos;
	public ArrayList<String> urlsadespieces;
	public ArrayList<String> urlsamanuales;
		
	public despiecesotros (Document html_capturado){
		modelo capturamodelo=new modelo();
		String capturadomodelo = capturamodelo.getmodelo(html_capturado); 
		nombremodelo= new ArrayList<String>();			
		urlsafotos= new ArrayList<String>();
		urlsadespieces = new ArrayList<String>();
		 
	}
	
	public ArrayList<String> paginas(Document html_capturado){
		ArrayList<String> linksapag;
		Elements datosenbruto = html_capturado.getElementsByClass("shop_categorybar_items");
		if (!datosenbruto.isEmpty()) {
			for (Element datosenbruto1 : datosenbruto) {
				Elements datosenbruto2 = datosenbruto1.getElementsByTag("tr");
			}
		}
		else
		{
		}
		
		
		return linksapag;
	}	
		
		
		
		
		
		
		
		
		Elements datosenbruto = html_capturado.getElementsByClass("parts_items_table");
		if (!datosenbruto.isEmpty()) {
			for (Element datosenbruto1 : datosenbruto) {
				Elements datosenbruto2 = datosenbruto1.getElementsByTag("tr");
				for (Element datosenbruto3 : datosenbruto2) {
					Elements datosenbruto4 = datosenbruto3.getElementsByTag("td");
						//for (Element datosenbruto5 : datosenbruto4) {
							if (!datosenbruto4.isEmpty()){
							nombremodelo.add(capturadomodelo);
							posicion.add(datosenbruto4.get(0).text());
							codigo.add(datosenbruto4.get(1).text());
							nombre.add(datosenbruto4.get(2).text());
							}
							else {System.out.println("No contiene datos a extraer");}
							}
					}
		} 
		else
		{
			System.out.println("La pagina no contiene tablas");
		}
	}
	
	
	
	
	
	
	

}
