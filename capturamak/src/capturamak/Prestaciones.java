package capturamak;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Prestaciones{
		private String prestaciones;
		private String prestacioneshtml;
		
		
		public Prestaciones(){}
		public Prestaciones(Document html_capturado) throws ExcepcionIntervalo{
		super();	
			Elements descripcioncapturada = html_capturado.getElementsByClass("userbenefits");	
			if (!descripcioncapturada.isEmpty())
				{
			
				for (Element descripcion : descripcioncapturada)
					{		
					prestaciones = (descripcion.text());
					prestacioneshtml = (descripcion.html());
				}
			}
			else{	
					prestaciones=new String("");
					throw new ExcepcionIntervalo("No hay prestaciones que capturar en esta pagina");
					}
			}
				
		public String getprestaciones() {
			return prestaciones;
		}
		
		public String getprestacioneshtml() {
			return prestacioneshtml;
		}
		
		public void setdescripcion(Document html_capturado) throws ExcepcionIntervalo {
			Prestaciones prestaciones= new Prestaciones(html_capturado);
			}
		
		
}