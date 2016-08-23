package capturamak;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	 
public class Inicializar {	
	    Properties properties = null;
	    
	    /** Configuration file name */
	    public final static String CONFIG_FILE_NAME = "Ini.properties";
	    public final static String WEB_MAKITA = "WEB MAKITA";
	    public final static String WEB_DOLMAR = "WEB DOLMAR";
	    public final static String NOVEDAD_MAKITA = "NOVEDAD MAKITA";
	    public final static String NOVEDAD_DOLMAR = "NOVEDAD DOLMAR";
	    public final static String ACCESORIO_MAKITA = "ACCESORIO MAKITA";
	    public final static String ACCESORIO_DOLMAR = "ACCESORIO DOLMAR";
  	    
	    public final static String DESPIECES_MAKITA = "DESPIECES MAKITA";
	    public final static String DESPIECES_DOLMAR = "DESPIECES DOLMAR";
	    
	    public final static String MANUALES_MAKITA = "MANUALES MAKITA";
	    public final static String MANUALES_DOLMAR = "MANUALES DOLMAR";

	    public final static String PRODUCTOS_SUELTOS = "PRODUCTOS SUELTOS";
	    	    
	    private Inicializar() {
	        this.properties = new Properties();
	        try {
	            properties.load(Inicializar.class.getClassLoader().getResourceAsStream(CONFIG_FILE_NAME));
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }//Configuration
	 
	    /**
	     * Implementando Singleton
	     *
	     * @return
	     */
	    public static Inicializar getInstance() {
	        return InicializarHolder.INSTANCE;
	    }
	 
	    private static class InicializarHolder {
	 
	        private static final Inicializar INSTANCE = new Inicializar();
	    }
	 
	    /**
	     * Retorna la propiedad de configuración solicitada
	     *
	     * @param key
	     * @return
	     */
	    public String getProperty(String key) {
	        return this.properties.getProperty(key);
	    }//getProperty
}
