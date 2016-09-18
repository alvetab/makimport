package capturamak;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

import org.jsoup.nodes.Document;

import entities.mapadespiece;

public class filesdespiecesxmljpg{
	Fotosdespiece fotosarray;
	Mapasdespieces mapasarray;

	
	public void savefotosdespiece(Document html_capturado) throws IOException {
	 Modelo recibido = new Modelo();
	 //capturahtml html = new capturahtml(url);
	 fotosarray=new Fotosdespiece(html_capturado);
	 ArrayList<String> urlfotos=fotosarray.getfotos();
	 fotosarray.savefotos();
	}
	
	public void savemapasdespieces(Document html_capturado) throws Exception {
		 Modelo recibido = new Modelo();
		// capturahtml html_capturado = new capturahtml(url);
		 String nommodelo=recibido.getmodelo(html_capturado);
		 mapasarray=new Mapasdespieces(html_capturado);
		 String xml="";
		 for (String urlmapa : mapasarray.urlmapas()) {
			 
			 System.out.println(urlmapa);
			Capturajsonmapas mapacapturado= new Capturajsonmapas(urlmapa);
			String datosenbruto = mapacapturado.getDatosCapturados();
			System.out.println(datosenbruto);
			 mapadespiece mapa= new mapadespiece();
			 xml=xml+mapa.tomapxml(datosenbruto,nommodelo);
		 } 	
			 try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nommodelo+".xml"), "utf-8"))) {
		   writer.write(xml);
		   	}
	}
	
	
}