package capturamak;

import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Capturadespiecepormaquina {
	ArrayList<String> modelo,posicion,codigopieza,descripcion;

	public Capturadespiecepormaquina(Document html_capturado) {
		modelo capturamodelo=new modelo();
		String capturadomodelo = capturamodelo.getmodelo(html_capturado); 
		
		modelo= new ArrayList<String>();			
		posicion= new ArrayList<String>();
		codigopieza = new ArrayList<String>();
		descripcion = new ArrayList<String>(); 

		Elements datosenbruto = html_capturado.getElementsByClass("parts_items_table");
		if (!datosenbruto.isEmpty()) {
			for (Element datosenbruto1 : datosenbruto) {
				Elements datosenbruto2 = datosenbruto1.getElementsByTag("tr");
				for (Element datosenbruto3 : datosenbruto2) {
					Elements datosenbruto4 = datosenbruto3.getElementsByTag("td");
						//for (Element datosenbruto5 : datosenbruto4) {
							if (!datosenbruto4.isEmpty()){
							modelo.add(capturadomodelo);
							posicion.add(datosenbruto4.get(0).text());
							codigopieza.add(datosenbruto4.get(1).text());
							descripcion.add(datosenbruto4.get(2).text());
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
	
	public ArrayList<String> getnombremodelo() {
		return modelo;
	}
	
	public String getnombremodelo(int i) {
		return modelo.get(i);
	}
	public ArrayList<String> getposicion() {
		return posicion;
	}
	public String getposicion(int i) {
		return posicion.get(i);
	}
	
	public ArrayList<String> getcodigo() {
		return codigopieza;
	}
	
	public String getcodigo(int i) {
		return codigopieza.get(i);
	}
	
	public ArrayList<String> getdescripcion() {
		return descripcion;
	}
	
	public String getdescripcion(int i) {
		return descripcion.get(i);
	}
	
	
}
