package capturamak;

import java.io.IOException;

import capturamak.capturaweb;
import capturamak.extraerdatosfestool;


public class Provafestool {


	public static void main(String[] args) throws IOException{}
		
		public Provafestool(){
		String urlmodelo=new String("https://www.festool.es/Productos/Pages/Product-Detail.aspx?pid=561551&name=Sierra-de-incisi-n-TS-55-R-EBQ-Plus");
		//String urlmodelo=new String("http://www.makita.es/tool/22131/BO6050J.html");
		//String urlmodelo=new String("http://www.makita.es/accessory/19471/B-11623.html");
		//String urlmodelo=new String("http://www.dolmar.com.es/tool/22776/111_45.html");
		//Array_separadores listasepar= new Array_separadores();
		datosextraidos="";		
		/*System.out.println();
		String urlmodelo=JOptionPane.showInputDialog("ingrese url del modelo a actualizar"); 
		*/		
		String html_Capturado = capturaweb.url_web(urlmodelo);
		
		datosextraidos=extraerdatosfestool.modelomaquina(html_Capturado);
		System.out.println(datosextraidos);		
		
		datosextraidos=datosextraidos + extraerdatosfestool.familia(html_Capturado);
		System.out.println(datosextraidos);
		
		datosextraidos=datosextraidos + extraerdatosfestool.fotos1(html_Capturado);
		System.out.println(datosextraidos);
		
		datosextraidos=extraerdatosfestool.tabgeneral(html_Capturado);
		System.out.println(datosextraidos);		
		
		datosextraidos=datosextraidos + extraerdatosfestool.tabprestaciones(html_Capturado);
		System.out.println(datosextraidos);
		
		datosextraidos=datosextraidos + extraerdatosfestool.tabespecificaciones(html_Capturado);
		System.out.println(datosextraidos);
		
		datosextraidos=datosextraidos + extraerdatosfestool.tabotros(html_Capturado);
		System.out.println(datosextraidos);
		
		datosextraidos=datosextraidos + extraerdatosfestool.tabequipo(html_Capturado);
		System.out.println(datosextraidos);
		
		datosextraidos=datosextraidos + extraerdatosfestool.especificacionesaccesorios(html_Capturado);
		System.out.println(datosextraidos);
		
				
		
		
		
		/*
		Accesoriolist listado=new Accesoriolist();
		List<Accesorio> listas= listado.listarTodos();
		for (Accesorio lista : listas){
		System.out.println(lista);
		}		
		*/
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

