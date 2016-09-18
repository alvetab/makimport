package entities;
import java.util.List;

import com.google.gson.Gson;

public class mapadespiece{

static class Item {
    String id;
    String partnumber;
    String model;
    String title;
    String zIndex;
    String x;
    String y;
    String w;
    String h;
    String price;
    String modification;
}

static class Page {
	String image_zoom_min;
	String image_zoom_max;
	String image_zoom_step;
    String image_width;
    String image_height;
    String image_filename_prefix;
    String tek_Index;
    List<Item> parts;
}
public mapadespiece() throws Exception {
	
}

public mapadespiece(String json) throws Exception {

    Gson gson = new Gson();        
    Page page = gson.fromJson(json, Page.class);

    System.out.println(page.tek_Index);
    for (Item item : page.parts)
        System.out.println("    " + item.model);
}

public String tomapxml(String json,String nommodelo){
	Gson gson = new Gson();
	Page page = gson.fromJson(json, Page.class);
	//String imgsrc="<img src =\"http://www.construmak.com/images/imagenes/"+nommodelo + "_"+ page.tek_Index+".png\" usemap=\"#"+ nommodelo +"_"+ page.tek_Index+"\">";
	String area="<area shape=\"rect\" coords=";
	String mapxml="<map name=\""+nommodelo + "_"+ page.tek_Index+"\">";
	for (Item item : page.parts){
	        System.out.println("    " + item.model);
	       mapxml = mapxml + area + "\""+ item.x + "," + item.y + "," + String.valueOf(Integer.parseInt(item.x)+
	        Integer.parseInt(item.w)) + "," +String.valueOf(Integer.parseInt(item.y)+Integer.parseInt(item.h))+"\" href=\"#" + item.model+
	    	"\" alt=\""+ item.model +": " + item.title + "\" title=\"" + item.model + ": " + item.title + "\" />" ;
	       	}
	mapxml = mapxml + "</map>";
	System.out.println(mapxml);
	return mapxml;
}
	
		
}
