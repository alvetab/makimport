package capturamak;

import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Despiecepormaquina {
	public ArrayList<String> modelo,posicion,codigopieza,descripcion;

	public Despiecepormaquina(Document html_capturado) {
		Modelo capturamodelo=new Modelo();
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
							else {}
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
	public String getTabladespiece(){
			String stringdatos="";
		if (posicion.size()>0){
			stringdatos="<table><tbody>";
			for (int i = 0; i < posicion.size(); i++) {
			
				String datoposicion = posicion.get(i);
				stringdatos=stringdatos+"<tr><td>";
				stringdatos=stringdatos+datoposicion;
			
				String datocodigopieza=codigopieza.get(i);
				stringdatos=stringdatos+"</td><td>";
				stringdatos=stringdatos+"[L]"+datocodigopieza+"|"+datocodigopieza+"[/L]";
			
			
				String datodescripcion=descripcion.get(i);
				stringdatos=stringdatos+"</td><td>";
				stringdatos=stringdatos+datodescripcion;
			
				stringdatos=stringdatos+"</td></tr>";	
			}
				
			stringdatos=stringdatos+"</tbody></table>";
			}
				
		else {System.out.println("No contiene despieces a extraer1");
		}
	return stringdatos;
	}
	
}
