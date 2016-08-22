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


public class urlfotos {//captura url de las fotos para su posterior descarga
	String[] urlfotos;
	
	
		public urlfotos(Document html_capturado) throws ExcepcionIntervalo {
		super();
		urlfotos= new String[2];
		urlfotos[0] ="";
		urlfotos[1] ="";
		modelo modelo =new modelo();
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
}


