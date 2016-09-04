package vistas;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import javax.swing.SwingUtilities;


public class consola{
	public static void main(String[] args) {
        	SwingUtilities.invokeLater(new Runnable() { 
            public void run() { 
			new ventana_principal2();
			//frame.setVisible(true);
		}
       });
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
	
	public static void saveIni(Properties ini) throws Exception
    {
	      File f = new File("Ini.properties");  
	      OutputStream out = new FileOutputStream( f );
	      ini.store(out, "This is an optional header comment string");
	      out.close();
	    	}
	
	
}