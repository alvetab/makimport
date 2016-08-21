package capturamak;

import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class despiecepormaquina {
	ArrayList<String> nombremodelo,posicion,codigo,nombre;

	public despiecepormaquina(Document html_capturado) {
		modelo capturamodelo=new modelo();
		String capturadomodelo = capturamodelo.getmodelo(html_capturado); 
		
		nombremodelo= new ArrayList<String>();			
		posicion= new ArrayList<String>();
		codigo = new ArrayList<String>();
		nombre = new ArrayList<String>(); 

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
	
	public ArrayList<String> getposicion() {
		return posicion;
	}
	
	public ArrayList<String> getcodigo() {
		return codigo;
	}
	
	public ArrayList<String> getnombre() {
		return nombre;
	}
	
	public ArrayList<String> getnombremodelo() {
		return nombremodelo;
	}
}
