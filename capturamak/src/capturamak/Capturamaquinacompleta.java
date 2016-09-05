package capturamak;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Document;
import org.junit.Test;

import JPA.MaquinacompletaJpaDAO;
import entities.Maquinacompleta;

public class Capturamaquinacompleta {
	private String modelo;
	private String categoria;
	private String categoriapadre;
	private String descripcion;
	private String descripcioncorta;
	private String descripciondetalle;
	private String prestaciones;
	private String datostecnicos;
	private String urlfotos;
	private String despiecepormaquina;
	private String manualydespiece;
	private String equipoyaccesorios;
	private String simboloslogos;
	private Document html_capturado;
	
	public Capturamaquinacompleta(String url) throws Exception{
		super();
		capturadocument(url);
		capturaModelo();
		capturaDescripcion();
		capturaDescripcioncorta();
		capturaCategoria();
		capturaCategoriapadre();
		capturaDescripciondetalle();
		capturaDespiecepormaquina();
		capturaPrestaciones();
		capturaDatostecnicos();
		capturaEquipoyaccesorios();
		capturaUrlfotos();
		capturaSimboloslogos();
		capturaManualydespiece();
		grabarmaquinacompleta();		
	}
	
		
	public void grabarmaquinacompleta(){
		Maquinacompleta maquina = new Maquinacompleta();
		maquina.setModelo(modelo);
		maquina.setCategoria(categoria);
		maquina.setCategoriapadre(categoriapadre);
		maquina.setDescripcion(descripcion);
		maquina.setDescripcioncorta(descripcioncorta);
		maquina.setDescripciondetalle(descripciondetalle);
		maquina.setPrestaciones(prestaciones);
		maquina.setDatostecnicos(datostecnicos);
		maquina.setUrlfotos(urlfotos);
		maquina.setDespiecepormaquina(despiecepormaquina);
		maquina.setManualydespiece(manualydespiece);
		maquina.setEquipoyaccesorios(equipoyaccesorios);
		maquina.setSimboloslogos(simboloslogos);
		MaquinacompletaJpaDAO em = new MaquinacompletaJpaDAO();
		em.crear(maquina);
		}
		
		public void capturaModelo() {
		Modelo nommodelo= new Modelo();
		modelo=nommodelo.getmodelo(html_capturado);
		}
		public void capturaDescripcion() throws ExcepcionIntervalo{
			Descripcion capdescripcion= new Descripcion(html_capturado);
			descripcion=capdescripcion.getdescripcion();
		}
		public void capturaCategoria() {
			arbolcategoria arbolcategoria= new arbolcategoria(html_capturado);
			categoria=arbolcategoria.getcategoria();
		}
		public void capturaCategoriapadre() {
			arbolcategoria arbolcategoria= new arbolcategoria(html_capturado);
			categoriapadre=arbolcategoria.getpadre();
		}
		
		public void capturaDescripciondetalle() throws ExcepcionIntervalo{
			Descripciondetalle detalle= new Descripciondetalle(html_capturado);
			descripciondetalle=detalle.getdescripcion();
			}
		public void capturaDescripcioncorta() throws ExcepcionIntervalo{
			Descripcioncorta detalle= new Descripcioncorta(html_capturado);
			if (detalle!=null){
			
			descripcioncorta=detalle.getdescripcion();
			}
			else descripcioncorta="";
			}
		
		public void capturaPrestaciones() throws ExcepcionIntervalo{
			Prestaciones prestacionescap= new Prestaciones(html_capturado);
			prestaciones=prestacionescap.getprestacioneshtml();
			}
		
		public void capturaDatostecnicos() throws ExcepcionIntervalo{
			Datostecnicos datostec= new Datostecnicos(html_capturado);
			datostecnicos=datostec.toString();
		}
		
		public void capturaUrlfotos() throws ExcepcionIntervalo{
			Urlfotos capfotos= new Urlfotos(html_capturado);
			urlfotos=capfotos.toString();
		}
		public void capturaDespiecepormaquina() {
			Despiecepormaquina despieces= new Despiecepormaquina(html_capturado);
			despiecepormaquina=despieces.getTabladespiece();
		}
		public void capturaManualydespiece() throws ExcepcionIntervalo {
			Manualesydespiecesurls manudespi= new Manualesydespiecesurls(html_capturado);
			manualydespiece=manudespi.toString();
		}
		public void capturaEquipoyaccesorios() throws ExcepcionIntervalo {
			Equipoyacceso capequaccess= new Equipoyacceso(html_capturado);
			equipoyaccesorios=capequaccess.toString();
		}
		public void capturaSimboloslogos() throws ExcepcionIntervalo {
			Simboloslogos simboloscap= new Simboloslogos(html_capturado);
			simboloslogos=simboloscap.toString();
		}
		
		
		
		public void capturadocument(String url) throws ExcepcionIntervalo {
			try {
				html_capturado= new capturahtml(url).getDatosCapturados();	
		 
			} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No hay manuales ni despieces que capturar en esta pagina" + e);
			}
		}



		@Override
		public String toString() {
			return "Capturamaquinacompleta [modelo=" + modelo + ", categoria=" + categoria + ", categoriapadre="
					+ categoriapadre + ", descripcion=" + descripcion + ", descripcioncorta=" + descripcioncorta
					+ ", descripciondetalle=" + descripciondetalle + ", prestaciones=" + prestaciones
					+ ", datostecnicos=" + datostecnicos + ", urlfotos=" + urlfotos + ", despiecepormaquina="
					+ despiecepormaquina + ", manualydespiece=" + manualydespiece + ", equipoyaccesorios="
					+ equipoyaccesorios + ", simboloslogos=" + simboloslogos + "]";
		}
		
}
