package capturamak;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.awt.Image;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.validator.PublicClassValidator;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.sun.xml.internal.bind.v2.model.core.ID;

import sun.security.util.Length;

public class Fotosdespiece {
	final String fotosweb="http://icmsmakita.eu/CMS/custom/es/partsdrawings/sized_for_web/tekeningid_";
	final String post="_100x.png";	
	final String ajaxweb="http://www.makita.es/intcms/tools/objecten/ajax_partlist.asp?tekeningid=";
	final String ajaxindex="&tek_Index=";
	ArrayList<String> nombremodelo, fotos,urlparamapas;
	String[][] tekensvalues;
	
	
	public Fotosdespiece(Document html_capturado) {  //captura las direcciones http para descargar las fotos y mapas del despiece (posteriormente ha de montar todos los maps para construmak)
		Modelo capturamodelo=new Modelo();
		String capturadomodelo = capturamodelo.getmodelo(html_capturado); 
		nombremodelo= new ArrayList<String>();
		fotos = new ArrayList<String>();
		urlparamapas = new ArrayList<String>();
		tekensvalues = parseotekenvalues(html_capturado); 
		if (tekensvalues.length>0){		
			for (int i=0;i<tekensvalues.length;i++){
				fotos.add(fotosweb + tekensvalues[i][1]+ post);
				urlparamapas.add(ajaxweb + tekensvalues[i][1] + ajaxindex + i );
				//System.out.println(capturadomodelo);
				nombremodelo.add(capturadomodelo);
				}	
			}
		else
		{
			System.out.println("no hay imagenes para capturar");			
		}
	}
		
	public ArrayList<String> getfotos(){
			return this.fotos;			
		}
	
	public void savefotos() throws IOException {
		int i=1;
		for (String stringurl : fotos) {
			Image image = null;
			 //image = ImageIO.read(url);
		    try(InputStream in = new URL(stringurl).openStream()){
			    Files.copy(in, Paths.get("C:/images/"+(nombremodelo.get(1)+"_"+i+".jpg")));
			    
			  }
		    /*
		    try {
		    	OutputStream writer = new BufferedOutputStream(new FileOutputStream(nombremodelo.get(1)+"_"+i+".jpg")); 
		        writer.write(image);
		        writer.close();
			    
			}*/
		    catch (IOException e){ System.out.println(e);}
		    i++;
		}
		/*
		catch (IOException e) {
		}
		
		}*/
					
	}
	
	
	
	
	private String[][] parseotekenvalues(Document html_capturado) { //captura los id y valores para acceder a las fotos si hay mas de una pagina
		String[][] idvalues = null;
		Elements datosenbruto = html_capturado.select("input[name~=(tekening_)[0-9]+]");
		if (!datosenbruto.isEmpty()) {
			 idvalues = new String[datosenbruto.size()][datosenbruto.size()];
			int i = 0;
			for (Element datosenbruto1 : datosenbruto) {
				String id = datosenbruto1.attr("id");
				String value = datosenbruto1.attr("value");
				idvalues[i][0] = id;
				idvalues[i][1] = value;
				i++;
				}
		}
		else 
		{
			System.out.println("no hay datos ni fotos a extraer en esta página");
		}
		return idvalues;
		}
	}
