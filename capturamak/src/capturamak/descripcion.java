package capturamak;

import static org.hamcrest.CoreMatchers.notNullValue;

import java.util.ArrayList;

import org.hamcrest.core.IsNull;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import sun.security.util.Length;

public class descripcion{
		private String descripcion;
		
		public descripcion(){}
		public descripcion(Document html_capturado) throws ExcepcionIntervalo{
		super();	
			Elements descripcioncapturada = html_capturado.getElementsByClass("product_item_info_content_title");	
			if (!descripcioncapturada.isEmpty())
				{
			
				for (Element descripcion : descripcioncapturada)
					{		
					this.descripcion = (descripcion.text());
				}
			}
			else{				
				Elements descripcioncapturada1 = html_capturado.getElementsByClass("onderdeel_search_title");
				if (!descripcioncapturada1.isEmpty()){
					for (Element descripcion : descripcioncapturada1)
						{		
						this.descripcion = (descripcion.text());
						}
				}
				else {
					throw new ExcepcionIntervalo("No hay descripcion ni modelo que capturar en esta pagina");
					}
			}
		}
		
				
		public String getdescripcion() {
			return this.descripcion;
		}
		
		public void setdescripcion(Document html_capturado) throws ExcepcionIntervalo {
			descripcion descripcion= new descripcion(html_capturado);
			}
		
		
}