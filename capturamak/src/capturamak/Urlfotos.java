package capturamak;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Urlfotos {//captura url de las fotos para su posterior descarga
	String[] urlfotos;
	
	
		public Urlfotos(Document html_capturado) throws ExcepcionIntervalo {
		super();
		urlfotos= new String[2];
		urlfotos[0] ="";
		urlfotos[1] ="";
		Modelo modelo =new Modelo();
		String nombremodelo=modelo.getmodelo(html_capturado);
		
		Elements datosenbruto = html_capturado.select("a[rel]");
		//System.out.println(datosenbruto.toString());
			if (!datosenbruto.isEmpty()){ // si hay una foto la pagina
				int i=0;
				for (Element urls : datosenbruto){
					if(urls.toString().indexOf("aumenta")==-1){
						urlfotos[i] = urls.attr("href");
						i++;
					}
					else {
					}	
				}
			}
			else {
				urlfotos[0] ="";
				urlfotos[1] ="";
			}
	}	
	

	public String[] getfotos() {
		return this.urlfotos;
	}


	@Override
	public String toString() {
		return "urlfotos [urlfotos=" + Arrays.toString(urlfotos) + "]";
	}
	
}


