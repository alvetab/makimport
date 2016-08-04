package test;

import java.util.List;

import DAO.AccesorioDAO;
import JPA.AccesorioJpaDAO;
import JPA.Accesoriolist;
import capturamak.capturaweb;
import capturamak.extraerdatos;
import entities.Accesorio;


public class Capturarmakita {


	//public static void main(String[] args) throws IOException{
		
		public Capturarmakita(){
		String urlmodelo=new String("http://www.makita.es/tool/22131/BO6050J.html");
		//String urlmodelo=new String("http://www.makita.es/accessory/19471/B-11623.html");
		//String urlmodelo=new String("http://www.dolmar.com.es/tool/22776/111_45.html");
		//Array_separadores listasepar= new Array_separadores();
		datosextraidos="";		
		/*System.out.println();
		String urlmodelo=JOptionPane.showInputDialog("ingrese url del modelo a actualizar"); 
		*/		
		String html_Capturado = capturaweb.url_web(urlmodelo);
		
		
		
		
		/*datosextraidos=extraerdatos.modelomaquina(html_Capturado);
		System.out.println(datosextraidos);		
		
		datosextraidos=datosextraidos + extraerdatos.familia(html_Capturado);
		System.out.println(datosextraidos);
		
		datosextraidos=datosextraidos + extraerdatos.fotos1(html_Capturado);
		System.out.println(datosextraidos);
		
		datosextraidos=extraerdatos.tabgeneral(html_Capturado);
		System.out.println(datosextraidos);		
		
		datosextraidos=datosextraidos + extraerdatos.tabprestaciones(html_Capturado);
		System.out.println(datosextraidos);
		
		datosextraidos=datosextraidos + extraerdatos.tabespecificaciones(html_Capturado);
		System.out.println(datosextraidos);
		
		datosextraidos=datosextraidos + extraerdatos.tabotros(html_Capturado);
		System.out.println(datosextraidos);
		
		datosextraidos=datosextraidos + extraerdatos.tabequipo(html_Capturado);
		System.out.println(datosextraidos);
		
		datosextraidos=datosextraidos + extraerdatos.especificacionesaccesorios(html_Capturado);
		System.out.println(datosextraidos); */
		/*
		AccesorioDAO accesoriolist = new AccesorioJpaDAO();
		Accesorio accesorio = new Accesorio();
		accesorio.setAccesorios(extraerdatos.modelomaquina(html_Capturado));
		accesorio.setCategoria(extraerdatos.modelomaquina(html_Capturado));
		accesorio.setDescripcioncat(extraerdatos.familia(html_Capturado));
		accesorio.setFoto1(extraerdatos.fotos1(html_Capturado));
		accesorio.setDescripcioncorta(extraerdatos.tabprestaciones(html_Capturado));
		accesorio.setDescripcion(extraerdatos.tabespecificaciones(html_Capturado));
		accesorio.setOtros(extraerdatos.tabotros(html_Capturado));
		accesorio.setInformacionproducto(extraerdatos.tabequipo(html_Capturado));
		accesorio.setManualinstrucciones(extraerdatos.especificacionesaccesorios(html_Capturado));
		accesoriolist.crear(accesorio); */
		
		
		
		
		AccesorioDAO accesoriolist = new AccesorioJpaDAO();
		Accesoriolist listado=new Accesoriolist();
		List<Accesorio> listas= listado.listaruno();
		for (Accesorio lista : listas){
		System.out.println(lista);
		}		
		
		/* AddressDAO  addressDAOlist = new AddressJpaDAO();
		 Address address = new Address();
		 address.setCity("Dhaka");
		 address.setCountry("Bangladesh");
		 address.setPostcode("2000");
		 address.setStreet("Poribagh");
		 
		 addressDAOlist.crear(address);*/
		 
		
		
		
		//System.exit(0);
	}
	private static String datosextraidos;
	
	
}
