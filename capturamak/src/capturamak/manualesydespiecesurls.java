package capturamak;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class manualesydespiecesurls {// captura url de las fotos para su
										// posterior descarga
	String[] urlsmanualesydespieces;

	public manualesydespiecesurls(Document html_capturado) throws ExcepcionIntervalo {
		super();
		modelo modelo = new modelo();
		String nombremodelo = modelo.getmodelo(html_capturado);
		Elements urlsmanual = html_capturado.select("[href*=_manual]").not(".pdf_link");
		Elements urlsdespiece = html_capturado.select("[href*=print_partdra]").not("[href*='type=1']").not("[href*='type=3']");
		if (!urlsmanual.isEmpty() || !urlsdespiece.isEmpty()) { // si hay enlaces a manuales o despieces
			urlsmanualesydespieces = new String[2];
			if (!urlsdespiece.isEmpty()) { // si hay despieces
				 urlsmanualesydespieces[1] = urlsdespiece.attr("abs:href");
			}
			else {
				System.out.println("no hay despieces a capturar");
				urlsmanualesydespieces[1] = "";
			}
			if (!urlsmanual.isEmpty()) { // si hay una foto la pagina
				urlsmanualesydespieces[0] = urlsmanual.attr("abs:href");
			}
			else {
				System.out.println("no hay manuales a capturar");
				urlsmanualesydespieces[0] = "";
			}
		}	
		else {
			System.out.println("No hay pdfs de manuales ni de despieces para extraer");
			urlsmanualesydespieces = new String[2];
			urlsmanualesydespieces[0] = "";
			urlsmanualesydespieces[1] = "";
		}
	 }

	public String[] geturlsmanualesdespi() {
		return this.urlsmanualesydespieces;
	}
}
