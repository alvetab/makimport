package capturamak;

import static org.hamcrest.CoreMatchers.notNullValue;

import java.util.ArrayList;

import org.hamcrest.core.IsNull;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import sun.security.util.Length;

public class descripcioncorta{
		private String descripcioncorta;
		
		public descripcioncorta(){}
		public descripcioncorta(Document html_capturado) throws ExcepcionIntervalo{
		super();	
			Elements descripcioncapturada = html_capturado.getElementsByClass("product_item_info_tab_content");	
			if (!descripcioncapturada.isEmpty())
				{
			
				for (Element descripcion : descripcioncapturada)
					{		
					this.descripcioncorta = (descripcion.text());
				}
			}
			else{				
				Elements descripcioncapturada1 = html_capturado.getElementsByClass("onderdeel_search_title");
				if (!descripcioncapturada1.isEmpty()){
					for (Element descripcion : descripcioncapturada1)
						{		
						this.descripcioncorta = (descripcion.text());
						}
				}
				else {
					throw new ExcepcionIntervalo("No hay descripcion ni modelo que capturar en esta pagina");
					}
			}
		}
		
				
		public String getdescripcion() {
			return this.descripcioncorta;
		}
		
		public void setdescripcion(Document html_capturado) throws ExcepcionIntervalo {
			descripcioncorta descripcion= new descripcioncorta(html_capturado);
			}
		
		
}