package capturamak;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class capturaweb {
	 Document datosCapturados;
	 
	 public  capturaweb(String urlmodelo) {
		try {
			// capturar web 
			datosCapturados = Jsoup.connect(urlmodelo).timeout(0).get();
			//htmlString = doc2.toString();
		
		} catch (IOException e) {
			System.out.println( "Algo ha fallado, Tal vez la web a importar no es correcta. Recuerde incluir el http://"+ e);
		
		}  catch (IllegalArgumentException e) {
			System.out.println( "Algo ha fallado, Tal vez la web a importar no es correcta.Recuerde incluir el http:// "+ e);
			
		}
		}
	
	 public Document getDatosCapturados() {
			return datosCapturados;
		}
			 	 
}