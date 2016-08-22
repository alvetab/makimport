package capturamak.temp;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.examples.HtmlToPlainText;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class capturanovedad {
	public static void main(String[] args) {

		Document doc;
		try {

			// necesitará protocolo http
			doc = Jsoup.connect("http://www.makita.es/novedades.html").timeout(0).get();

			// traer y mostrar el título, descripcion y keyword
			String title = doc.title();
			String desc = doc.select("meta[name=description]").first().attr("content");
			String keyword = doc.select("meta[name=keywords]").first().attr("content");
			System.out.println("title : " + title);
			System.out.println("Descripción del sitio: " + desc);
			System.out.println("Keywords: " + keyword);

			// capturar los links a las novedades
			Elements links = doc.select("a[href]");
			for (Element link : links) {
				// imprimirlos
				if (link.attr("href").indexOf("/tool/") != -1) {
					String urlnovedad = "http://www.makita.es" + link.attr("href");
					System.out.println(urlnovedad);
					System.out.println("\nlink : " + link.attr("href"));
					System.out.println("texto : " + link.text());
					Capturartecnicos(urlnovedad);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void capturafoto(String urlmakita) {

		Document doc2;
		try {

			// obtener todas las imágenes
			doc2 = Jsoup.connect(urlmakita).timeout(0).get();
			Elements images = doc2.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
			System.out.println(doc2);
			for (Element image : images) {
				// System.out.println(image.attr("src"));
				if ((image.attr("src").endsWith("new.png")) == false) {
					System.out.println("\nsrc : " + image.attr("src"));
					// Capturar(image.attr("src"));

				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void Capturartecnicos(String urlmakita) {

		Document doc2;
		try {

			// capturar datos tecnicos
			doc2 = Jsoup.connect(urlmakita).timeout(0).get();

			Elements articulos1 = doc2.select("div[class=techspec]");
			Elements articulos2 = articulos1.select("div[class=techspec_holder]");
			Elements articulos3 = articulos2.select("div[class=techspec_titel]");
			for (Element link : articulos3) {
				// imprimirlos
				String result = new HtmlToPlainText().getPlainText(link);

				System.out.println("titulo : " + link.attr("title"));
				System.out.println("titulo : " + result);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void Capturarruta(String urlmakita) {

		Document doc2;
		try {

			// obtener todas las imágenes
			doc2 = Jsoup.connect(urlmakita).timeout(0).get();
			Elements images = doc2.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
			System.out.println(doc2);
			for (Element image : images) {
				// System.out.println(image.attr("src"));
				if ((image.attr("src").endsWith("new.png")) == false) {
					System.out.println("\nsrc : " + image.attr("src"));

				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}