package capturamak;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class extraerdatosfestool { // capturar pestaña informacion general

	public static String modelomaquina(String datosweb) {

		Document doc2;
		doc2 = Jsoup.parse(datosweb);
		Elements elemento = doc2.select("div[class=breadcrumb_link_current]");
		for (Element link : elemento) {

			result = link.text();

		}
		return result;
	}

	public static String familia(String datosweb) {
		Document doc2;
		doc2 = Jsoup.parse(datosweb);

		Elements articulos1 = doc2.select("div[class=breadcrumb]");
		Elements articulos2 = articulos1.select("div[class=breadcrumb_link]");
		for (Element link : articulos2) {

			String cat = link.text();
			System.out.println("titulo : " + link.attr("title"));
			System.out.println("titulo : " + cat);
			result = result + "|" + cat;

		}

		return result;
	}

	public static String fotos1(String datosweb) {
		Document doc;
		// result = null;
		doc = Jsoup.parse(datosweb);
		Elements img = doc.getElementsByTag("img");
		for (Element foto : img) {
			// for each element get the srs url
			result = foto.attr("src");
			System.out.println("Image Found!");
			System.out.println("src attribute is : " + result);
			result = result + " ; ";

		}
		return result;
	}

	public static String tabgeneral(String datosweb) {
		Document doc2;
		doc2 = Jsoup.parse(datosweb);
		Elements elemento = doc2.select("div[class=product-detail-txt]");
		for (Element link : elemento) {

			result = link.text();

		}
		return result;
	}

	public static String tabprestaciones(String datosweb) {
		Document doc2;
		doc2 = Jsoup.parse(datosweb);
		Elements elemento = doc2.select("ul[class=userbenefits]");
		for (Element link : elemento) {

			result = link.html();

		}
		return result;
	}

	public static String tabespecificaciones(String datosweb) {
		Document doc2;
		doc2 = Jsoup.parse(datosweb);
		Elements elemento = doc2.select("div[class=general_holder]");
		for (Element link : elemento) {

			result = link.html();

		}
		return result;
	}

	public static String tabotros(String datosweb) {

		Document doc2;
		doc2 = Jsoup.parse(datosweb);
		Elements elemento = doc2.select("div[id=tab_content_parts_diagram]");
		for (Element link : elemento) {

			result = link.html();

		}
		return result;
	}

	public static String tabequipo(String datosweb) {

		Document doc2;
		doc2 = Jsoup.parse(datosweb);
		Elements elemento = doc2.select("div[id=tab_content_standard_equipment]");
		for (Element link : elemento) {

			result = link.html();

		}
		return result;
	}
	
	public static String especificacionesaccesorios(String datosweb) {

		Document doc2;
		doc2 = Jsoup.parse(datosweb);
		Elements elemento = doc2.select("div[id=tab_content_techspecs]");
		for (Element link : elemento) {

			result = link.html();

		}
		return result;
	}

	public static String result;
}
