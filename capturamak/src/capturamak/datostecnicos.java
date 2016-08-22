package capturamak;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class datostecnicos {
	private String[][] datostecnicos;
	
	public datostecnicos() {
	}

	public datostecnicos(Document html_capturado) throws ExcepcionIntervalo {
		super();
		modelo modelo =new modelo();
		String nombremodelo=modelo.getmodelo(html_capturado);
		Elements datosenbruto = html_capturado.select("div#tab_content_techspecs");
		if (!datosenbruto.isEmpty()){ // si hay pestaña especificaciones
			Elements caracteristica = datosenbruto.get(0).getElementsByClass("techspec_titel");
			Elements dato = datosenbruto.get(0).getElementsByClass("techspec_value");
			if (!caracteristica.isEmpty()) { // captura los elementos basicos si los hay
				datostecnicos = new String[caracteristica.size()][3];
				for (int i = 0; i <= (caracteristica.size() - 1); i++) {
					datostecnicos[i][0] = caracteristica.get(i).text();
					if (!dato.isEmpty()) {
						datostecnicos[i][1] = dato.get(i).text();
					} else {
						datostecnicos[i][1] = "";
					}
					datostecnicos[i][2] = nombremodelo;
				}
			} else {
				datostecnicos = new String[1][3];
				datostecnicos[0][0] = "";
				datostecnicos[0][1] = "";
				datostecnicos[0][2] = nombremodelo;
				System.out.println("no hay datos tecnicos");
			}
		}
		else {
			datostecnicos = new String[1][3];
			datostecnicos[0][0] = "";
			datostecnicos[0][1] = "";
			datostecnicos[0][2] = nombremodelo;
			System.out.println("no hay datos tecnicos");
			
		}
	}

	public String[][] getdatostecnicos() {
		return this.datostecnicos;
	}

	public void setdescripcion(Document html_capturado) throws ExcepcionIntervalo {
		equipoyacceso descripcion = new equipoyacceso(html_capturado);
	}

}