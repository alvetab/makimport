package capturamak.temp;

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

import capturamak.ExcepcionIntervalo;
import capturamak.modelo;


public class descargarfotos {//captura url de las fotos para su posterior descarga
	String[] urlfotos;
	
	
		public descargarfotos(Document html_capturado) throws ExcepcionIntervalo {
		super();
		urlfotos= new String[2];
		modelo modelo =new modelo();
		String nombremodelo=modelo.getmodelo(html_capturado);
		
		Elements datosenbruto = html_capturado.select("a[rel]");
		
			if (!datosenbruto.isEmpty()){ // si hay una foto la pagina
				urlfotos[1] = datosenbruto.attr("href");
		
			}
			else {
				urlfotos[1] ="";
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			
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
			
		*/}
	}

	public String[] getfotos() {
		return this.fotos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static String urlmodelo;
	static String cat_completa = "Makita";
	private static final String folderPath = "c:/images";
	public static String captura_foto(String datosweb) throws IOException {
		Document doc;
		String src = null;
		doc = Jsoup.parse(datosweb);
		Elements img = doc.getElementsByTag("img");
		for (Element foto : img) {
			// for each element get the srs url
			src = foto.attr("src");
			System.out.println("Image Found!");
			System.out.println("src attribute is : " + src);
			
			getImages(src);

        } return src;
}
	private static void getImages(String src) throws IOException {

        String folder = null;

        //Exctract the name of the image from the src attribute
        int indexname = src.lastIndexOf("/");

        if (indexname == src.length()) {
            src =src.substring(1, indexname);
        }
        src="http://makita.es" + src;
        indexname = src.lastIndexOf("/");
        String name = src.substring(indexname, src.length());

        System.out.println(name);

        //Open a URL Stream
        URL url = new URL(src);
        InputStream in = url.openStream();

        OutputStream out = new BufferedOutputStream(new FileOutputStream( folderPath+ name));

        for (int b; (b = in.read()) != -1;) {
            out.write(b);
        }
        out.close();
        in.close();

    }


}


