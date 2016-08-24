package vistas;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class consola{
	public static void main(String[] args) {
			ventana_principal2 frame = new ventana_principal2();
		
			
			
			frame.setVisible(true);
		}
	
	
	public static Properties getIni(){
	    Properties ini = new Properties();
	    InputStream is = null;
	     
	    try {
	      is=new FileInputStream("Ini.properties");
	      ini.load(is);
	       } catch(IOException ioe) {}
	    return ini;
	}
	
		
	public static void saveini(Properties ini){
		//ini = new Properties();
		FileOutputStream os= null;
		
			try {
				os=new FileOutputStream("Ini.properties");
				
				
				ini.store(os, "Fichero de Propiedades");
			}
			catch(IOException ioe) {
				ioe.printStackTrace(
						);
			}
		}
}
	
	
