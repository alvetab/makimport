package capturamak;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import sun.launcher.resources.launcher;

public class listasurls {
	 private static ArrayList<String> listafinal = new ArrayList<String>();
	
	public static ArrayList<String> buscamejorlaurl(String urlmakita) {
		Document doc2;
		try {
			// obtener todas las rutas a las novedades
			doc2 = Jsoup.connect(urlmakita).timeout(0).get();
			Elements urlsproductos = doc2.getElementsByClass("product_item_title");
			if (urlsproductos.isEmpty())
			{
				Elements urlscapturadasaccesorio = doc2.getElementsByClass("accessory_zoom_holder");
				if (urlscapturadasaccesorio.isEmpty())
				{
					Elements urlscapturadaspartes = doc2.getElementsByClass("part_model_list");
					if (urlscapturadaspartes.isEmpty())
					{
						Elements urlscapturadasmanuales = doc2.getElementsByClass("user_manual_list");
						if (urlscapturadasmanuales.isEmpty())
						{
							listafinal.add("Desde esta url no se puede obtener ningún dato de productos. Compruebe que está correctamente escrita y apunte a los datos que quiere obtener");  	
						}
						else
						{ int i=0;
							for (Element listamodelos : urlscapturadasmanuales) 
							{
								Elements modelos = listamodelos.getElementsByTag("a");
									for (Element modelo : modelos)
									{
									i++;
									String url = modelo.attr("abs:href");
									listafinal.add(url); 
									System.out.println(i);
								}
							}
						}
					}
					else
					{ int i=0;
						for (Element listamodelos : urlscapturadaspartes) 
						{
							Elements modelos = listamodelos.getElementsByTag("a");
								for (Element modelo : modelos)
								{
								i++;
								String url = modelo.attr("abs:href");
								listafinal.add(url); 
								System.out.println(i);
							}
						}
					}		
				}
				
				else{
					for (Element accesorio : urlscapturadasaccesorio) {
					Element link = accesorio.select("a").first();
					String url = link.attr("abs:href");
					listafinal.add(url); 
					}
				}
				
			}	
			else {
				for (Element producto : urlsproductos) {
				Element link = producto.select("a").first();
				String url = link.attr("abs:href");
				listafinal.add(url); 
				}
			}
			}
		 catch (IOException e) {
			e.printStackTrace();
		 }
		return listafinal;
	}	

	public static ArrayList<String> capturaurls(String urlmakita) {
		Document doc2;
		try {
			// obtener todas las rutas a las novedades o las ruta finales
			doc2 = Jsoup.connect(urlmakita).timeout(0).get();
			Elements urlscapturadas = doc2.getElementsByClass("product_group_link_all");
			if (!urlscapturadas.isEmpty()){				
				for (Element elemento : urlscapturadas) {
				Element link = elemento.select("a").first();
				String url = link.attr("abs:href");			 
				capturaurls(url); 
				}
			}
			else { buscamejorlaurl(urlmakita);	// Si no es pagina final vuelve a parsear 						
			}
		}
		 catch (IOException e) {
			System.out.println("Se ha producido un error " + e + " Posiblemente la url de makita esta mal escrita o no existe");
		 }
		return listafinal;
	}	
}
