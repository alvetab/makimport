package capturamak;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.examples.HtmlToPlainText;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class capturafotos {//comentario
	static String urlmodelo;
	static String cat_completa = "Makita";
	private static final String folderPath = "c:/images";
	public static String captura_foto(String datosweb) throws IOException {
		Document doc;
		String src = null;
		doc = Jsoup.parse(datosweb);
		Elements img = doc.getElementsByTag("img");
		for (Element foto : img) {
			// for each element get the srs url
			src = foto.attr("src");
			System.out.println("Image Found!");
			System.out.println("src attribute is : " + src);
			
			getImages(src);

        } return src;
}
	private static void getImages(String src) throws IOException {

        String folder = null;

        //Exctract the name of the image from the src attribute
        int indexname = src.lastIndexOf("/");

        if (indexname == src.length()) {
            src =src.substring(1, indexname);
        }
        src="http://makita.es" + src;
        indexname = src.lastIndexOf("/");
        String name = src.substring(indexname, src.length());

        System.out.println(name);

        //Open a URL Stream
        URL url = new URL(src);
        InputStream in = url.openStream();

        OutputStream out = new BufferedOutputStream(new FileOutputStream( folderPath+ name));

        for (int b; (b = in.read()) != -1;) {
            out.write(b);
        }
        out.close();
        in.close();

    }


}


