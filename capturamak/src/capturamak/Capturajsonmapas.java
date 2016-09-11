package capturamak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import jdk.nashorn.internal.ir.Node;
import jdk.nashorn.internal.objects.Global;
import jdk.nashorn.internal.parser.JSONParser;


public class Capturajsonmapas {
	 String  datosCapturados;
	 public  Capturajsonmapas(String urlmodelo) throws Exception {
		try {
			datosCapturados=readUrl(urlmodelo);
			/*//System.out.println(urlmodelo);
			// capturar web 
			//Document datosCapturadosbruto = Jsoup.connect(urlmodelo).ignoreContentType(true).timeout(0).get();
			Global global = null;
			boolean dualFields = false;
			JSONParser json= new JSONParser(parajson, global, dualFields);
			//htmlString = doc2.toString();
			System.out.println(node.toString());
		*/
		} catch (IOException e) {
			System.out.println( "1Algo ha fallado, Tal vez la web a importar no es correcta. Recuerde incluir el http://"+ e);
		}  catch (IllegalArgumentException e) {
			System.out.println( "2Algo ha fallado, Tal vez la web a importar no es correcta.Recuerde incluir el http:// "+ e);
		}
		}
	
	 public String getDatosCapturados() {
			return datosCapturados;
		}
	
	 private static String readUrl(String urlmodelo) throws Exception {
		    BufferedReader reader = null;
		    try {
		        URL url = new URL(urlmodelo);
		        reader = new BufferedReader(new InputStreamReader(url.openStream()));
		        StringBuffer buffer = new StringBuffer();
		        int read;
		        char[] chars = new char[1024];
		        while ((read = reader.read(chars)) != -1)
		            buffer.append(chars, 0, read); 

		        return buffer.toString();
		    } finally {
		        if (reader != null)
		            reader.close();
		    }
		}		 	 
}