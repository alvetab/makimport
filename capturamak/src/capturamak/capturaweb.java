package capturamak;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class capturaweb {
static String htmlString;
	public static String url_web(String urlmodelo) {
		 Document doc2;
		try {

			// capturar datos tecnicos
			doc2 = Jsoup.connect(urlmodelo).timeout(0).get();
			htmlString = doc2.toString();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return htmlString;
	}
}