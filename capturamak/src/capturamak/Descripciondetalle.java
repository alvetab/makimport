package capturamak;

import static org.hamcrest.CoreMatchers.notNullValue;

import java.util.ArrayList;

import org.hamcrest.core.IsNull;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import sun.security.util.Length;

public class Descripciondetalle{
		private String masdescripcion;
		
		public Descripciondetalle(){}
		public Descripciondetalle(Document html_capturado) throws ExcepcionIntervalo{
		super();	
			Elements descripcioncapturada = html_capturado.getElementsByClass("product_item_info_description");	
			if (!descripcioncapturada.isEmpty())
				{
			
				for (Element descripcion : descripcioncapturada)
					{		
					masdescripcion = (descripcion.text());
				}
			}
			else{	
					masdescripcion=new String("");
					throw new ExcepcionIntervalo("No hay descripcion ampliada que capturar en esta pagina");
					}
			}
		
		
				
		public String getdescripcion() {
			return masdescripcion;
		}
		
		public void setdescripcion(Document html_capturado) throws ExcepcionIntervalo {
			Descripciondetalle masdescripcion= new Descripciondetalle(html_capturado);
			}
}