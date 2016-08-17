package capturamak;

import java.util.ArrayList;

public class novedadesmakita {
		ArrayList<String> listadoUrlsnovedades;			
			
		
	public novedadesmakita(String webmakita){
		listadoUrlsnovedades = Parser.RutasNovedades(webmakita);
		
		//for (ArrayList<String> novedad: listadoUrlsnovedades){
			System.out.println(listadoUrlsnovedades.toString());			
		}
			//}



	public Object geturl() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
}