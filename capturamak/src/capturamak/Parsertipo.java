package capturamak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.SwingUtilities;

import com.mysql.fabric.xmlrpc.base.Array;
import com.sun.webkit.network.URLs;

import JPA.UrlscapturaJpaDAO;
import entities.Urlscaptura;
import vistas.ventana_principal2;

public class Parsertipo {
	private  static List<Urlscaptura> listasurls; 
	
	//public void Parsertipo() {
	public static void main(String[] args) {
		 String entradaTeclado = "";

	        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
	        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
	        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
	        setrecuperasurls(Integer.valueOf(entradaTeclado));
	        parseardatos();
	        System.exit(1);
		
	}
	
	private static void parseardatos(){
		for(Urlscaptura urlstipo : listasurls){
			if (!compruebadatos(urlstipo)){
			
			System.out.println("No ha de importar");
			}
			else {
			System.out.println("a ver que hemos hm");
			}
		}
	}
	public static Urlscaptura getrecuperaporId(int i){
		Urlscaptura url;
		url=listasurls.get(i);
		return url;
	}
	public static Urlscaptura getrecuperaprimero(){
		Urlscaptura primer;
		primer=listasurls.get(0);
		return primer;
	}

	public static void setrecuperasurls(int z){
		UrlscapturaJpaDAO emurls = new UrlscapturaJpaDAO();
		List<Urlscaptura> listadourls = emurls.listarTipo(z);
		listasurls=listadourls;
	}
	
	private static boolean compruebadatos(Urlscaptura urlacomprobar){
	boolean comprobado=false;
		if(urlacomprobar.getActivo()==true && !urlacomprobar.getCapturado()==false){
		comprobado=true;	
		}
		else {System.out.println("maquina no vendible, o ya capturada");
		}
		return comprobado;	
	}
	
	
	
}