package capturamak;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

import com.mysql.fabric.xmlrpc.base.Array;

import JPA.UrlscapturaJpaDAO;
import entities.Urlscaptura;
import vistas.ventana_principal2;

public class Parsertipo {
	static List<Urlscaptura> listasurls; 
	
	//public void Parsertipo() {
	public static void main(String[] args) {
		UrlscapturaJpaDAO emurls = new UrlscapturaJpaDAO();
		List<Urlscaptura> listadourls = emurls.listarTipo(9);
		int i=0;
		for (Urlscaptura urls : listadourls){
			System.out.println(i);
			System.out.println(urls.getUrl().toString());
			listasurls=listadourls;
		i++;
	}
}
	/*public static void main(String[] args) {
		 new Parsertipo();
	}*/

}