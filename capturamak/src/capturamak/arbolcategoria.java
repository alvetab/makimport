package capturamak;

import java.util.ArrayList;

import org.hamcrest.core.IsNull;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import sun.security.util.Length;

public class arbolcategoria {
		private ArrayList<String> arbolcategorias;
		
		public arbolcategoria(Document html_capturado){
		super();	
		arbolcategorias = new ArrayList<String>();	
		Elements arbolcapturado = html_capturado.getElementsByClass("breadcrumb_link");	
			for (Element categoria : arbolcapturado){		
				arbolcategorias.add(categoria.text());
			}
		}
		
				
		public ArrayList<String> getarbolcompleto() {
			return arbolcategorias;
		}
		
		public String getcategoria(Document html_capturado) {
			String categoria = new String();
			Element arbolcapturado = html_capturado.getElementsByClass("breadcrumb_link").last();
			categoria=(arbolcapturado.text());
			return categoria;
		}


		public String getcategoria() {
			String categoria = new String("");
			for(String desglose : arbolcategorias ){
			categoria = desglose;
			}
			return categoria;
		}
		
		public String getpadre() {
			 String padre = arbolcategorias.get(arbolcategorias.size()-2);
			 return padre;
		}
		
		public String getpadre(ArrayList<String> arbol) {
			String padre = new String(); 
			if (arbol.size()>1)
			{
				 padre = arbol.get(arbol.size()-2);
			}
			else if(arbol.size()==1){
				 padre = "";
			}
			else if(arbol.isEmpty()){
				 padre = "";
			}
			
			return padre;
		}
}