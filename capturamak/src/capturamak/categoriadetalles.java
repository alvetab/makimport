package capturamak;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class categoriadetalles {
	private String categoriasdetalle;

	public categoriadetalles(Document html_capturado) {
		super();
		categoriasdetalle = new String();
		Elements arbolcapturado = html_capturado.getElementsByClass("content_holder_main_content_description");
		if (!arbolcapturado.isEmpty()) {

			for (Element categoria : arbolcapturado) {
				categoriasdetalle= categoria.text();
			}
		}
		else
		{
			System.out.println("No hay detalles en esta categoría");
			categoriasdetalle=("");
		}
	}

	public String getcategoriadetalle() {
		return this.categoriasdetalle;
	}
}