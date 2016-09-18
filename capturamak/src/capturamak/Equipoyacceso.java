package capturamak;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Equipoyacceso {
	private String[][] equipobasico, accesorios;

	public Equipoyacceso() {
	}

	public Equipoyacceso(Document html_capturado) throws ExcepcionIntervalo {
		super();
		Modelo capturamodelo=new Modelo();
		String capturadomodelo = capturamodelo.getmodelo(html_capturado); 
		Elements basiconombre = html_capturado.getElementsByClass("standard_equipment_titel");
		Elements basicomodelo = html_capturado.getElementsByClass("standard_equipment_value");
		Elements accesorionombre = html_capturado.getElementsByClass("optional_accessories_titel");
		Elements accesoriomodelo = html_capturado.getElementsByClass("optional_accessories_value");
		
		if (!basiconombre.isEmpty()) { //captura los elementos basicos si los hay
			equipobasico = new String[basiconombre.size()][3]; 
			for (int i =0; i<=(basiconombre.size()-1); i++) {
				equipobasico[i][0] = basiconombre.get(i).text();
				equipobasico[i][2] = capturadomodelo;
				if (!basicomodelo.isEmpty()) {
					equipobasico[i][1] = basicomodelo.get(i).text();
				}
				else {
					equipobasico[i][1] = "";
				}
			}
		} else {
			equipobasico = new String[1][2];
			equipobasico[0][0] = "";
			equipobasico[0][1] = "";
			equipobasico[0][2] = capturadomodelo;
			
			System.out.println("no hay equipamiento basico");
		}
		if (!accesorionombre.isEmpty()) { //captura los accesorios si los hay
			accesorios = new String[accesorionombre.size()][3];
			for (int i =0; i<=(accesorionombre.size()-1); i++) {
				accesorios[i][0] = accesorionombre.get(i).text();
				accesorios[i][2] = capturadomodelo;
				if (!accesoriomodelo.isEmpty()) {
					accesorios[i][1] = accesoriomodelo.get(i).text();;
				} else {
					accesorios[i][1] = "";
				}
			}
		} else {
			accesorios = new String[1][2];
			accesorios[0][0] = "";
			accesorios[0][1] = "";
			accesorios[0][2] = capturadomodelo;
			System.out.println("no hay accesorios");
		}
	}
	

	public String[][] getequipobasico() {
			return this.equipobasico;
		}

	public String[][] getaccesorios() {
		return this.accesorios;
	}
	
	@Override
	public String toString() {
		String stringdatos = "";
		if (equipobasico.length>0){
			stringdatos="<h1>Equipo básico</h1><table><tbody>";
			for (int i = 0; i < equipobasico.length; i++) {
				stringdatos=stringdatos+"<tr>";
				stringdatos=stringdatos+"<td>";
				stringdatos=stringdatos + equipobasico[i][0];
				stringdatos=stringdatos+"</td><td>";
				stringdatos=stringdatos +"[L]"+ equipobasico[i][1]+"|"+ equipobasico[i][1]+"[/L]";
				stringdatos=stringdatos+"</td>";	
				stringdatos=stringdatos+"</tr>";	
			}
			stringdatos=stringdatos+"</tbody></table>";
		}
		if (accesorios.length>0){
			stringdatos=stringdatos+"<h1>Accesorios opcionales</h1><table><tbody>";
			for (int i = 0; i < accesorios.length; i++) {
				stringdatos=stringdatos+"<tr>";
				stringdatos=stringdatos+"<td>";
				stringdatos=stringdatos + accesorios[i][0];
				stringdatos=stringdatos+"</td><td>";
				stringdatos=stringdatos +"[L]"+ accesorios[i][1]+"|"+accesorios[i][1]+"[/L]";
				stringdatos=stringdatos+"</td>";	
				stringdatos=stringdatos+"</tr>";	
			}
			stringdatos=stringdatos+"</tbody></table>";
		}
		
		else {
			
		}
			return stringdatos;
	}
	
	
	public void setdescripcion(Document html_capturado) throws ExcepcionIntervalo {
		Equipoyacceso descripcion = new Equipoyacceso(html_capturado);
	}

}