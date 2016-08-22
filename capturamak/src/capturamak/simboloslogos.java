package capturamak;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class simboloslogos {//captura url de las fotos para su posterior descarga
	String[] urlsimboloslogos;
	
	
		public simboloslogos(Document html_capturado) throws ExcepcionIntervalo {
		super();
		
		modelo modelo =new modelo();
		String nombremodelo=modelo.getmodelo(html_capturado);
		
		Elements datosenbruto = html_capturado.select("div.general_holder img");
			if (!datosenbruto.isEmpty()){ // si hay una foto la pagina
				urlsimboloslogos= new String[datosenbruto.size()];
				System.out.println(datosenbruto.toString());
				int i=0;
				for (Element simbolos : datosenbruto){
					if(simbolos.toString().indexOf("border")==-1){
						urlsimboloslogos[i] = simbolos.attr("src");
						i++;
					}
					else {
						urlsimboloslogos[i] = "";
						i++;
					}	
				}
			}
			else {
				System.out.println("No hay logos ni simbolos para extraer");
				urlsimboloslogos= new String[1];
				urlsimboloslogos[0] ="";
			}
	}	
	

	public String[] getsimbolos() {
		return this.urlsimboloslogos;
	}
}


