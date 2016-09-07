package capturamak;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.hibernate.exception.ConstraintViolationException;
import org.jsoup.nodes.Document;
import org.junit.Test;

import com.mysql.jdbc.exceptions.MySQLDataException;

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

	public Capturamaquinacompleta(String url) throws Exception {
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

	public  String grabarmaquinacompleta() {
		
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
		try {
		MaquinacompletaJpaDAO em = new MaquinacompletaJpaDAO();
		em.crear(maquina);
		}
		catch (Exception e){
			System.out.println(e);
		}
		
		return "grabada";
		}
		

	public void capturaModelo() throws ExcepcionIntervalo {
		Modelo nommodelo = new Modelo();
		modelo = nommodelo.getmodelo(html_capturado);
	}

	public void capturaDescripcion() throws ExcepcionIntervalo {
		Descripcion capdescripcion = new Descripcion(html_capturado);
		descripcion = capdescripcion.getdescripcion();
	}

	public void capturaCategoria() throws ExcepcionIntervalo {
		arbolcategoria arbolcategoria = new arbolcategoria(html_capturado);
		categoria = arbolcategoria.getcategoria();
	}

	public void capturaCategoriapadre() throws ExcepcionIntervalo {
		arbolcategoria arbolcategoria = new arbolcategoria(html_capturado);
		categoriapadre = arbolcategoria.getpadre();
	}

	public void capturaDescripciondetalle() throws ExcepcionIntervalo {
		try {
			Descripciondetalle detalle = new Descripciondetalle(html_capturado);
			descripciondetalle = detalle.getdescripcion();
		} catch (Exception e) {
			descripciondetalle = new String("");
			// TODO: handle exception
		}
	}

	public void capturaDescripcioncorta() throws ExcepcionIntervalo {
		try {
			Descripcioncorta detalle = new Descripcioncorta(html_capturado);
			if (detalle != null) {

				descripcioncorta = detalle.getdescripcion();
			} else
				descripcioncorta = "";
		} catch (Exception e) {
			descripcioncorta = new String("");
			// TODO: handle exception
		}
	}

	public void capturaPrestaciones() throws ExcepcionIntervalo {
		try {
			Prestaciones prestacionescap = new Prestaciones(html_capturado);
			prestaciones = prestacionescap.getprestacioneshtml();
		} catch (Exception e) {
			prestaciones = new String("");
			// TODO: handle exception
		}
	}

	public void capturaDatostecnicos() throws ExcepcionIntervalo {
		try {
			Datostecnicos datostec = new Datostecnicos(html_capturado);
			datostecnicos = datostec.toString();
		} catch (Exception e) {
			datostecnicos = new String("");
			// TODO: handle exception
		}
	}

	public void capturaUrlfotos() throws ExcepcionIntervalo {
		try {
			Urlfotos capfotos = new Urlfotos(html_capturado);
			urlfotos = capfotos.toString();
		} catch (Exception e) {
			urlfotos = new String("");
			// TODO: handle exception
		}
	}

	public void capturaDespiecepormaquina() throws ExcepcionIntervalo {
		try {
			Despiecepormaquina despieces = new Despiecepormaquina(html_capturado);
			despiecepormaquina = despieces.getTabladespiece();
		} catch (Exception e) {
			despiecepormaquina = new String("");
			// TODO: handle exception
		}
	}

	public void capturaManualydespiece() throws ExcepcionIntervalo {
		try {
			Manualesydespiecesurls manudespi = new Manualesydespiecesurls(html_capturado);
			manualydespiece = manudespi.toString();
		} catch (Exception e) {
			manualydespiece = new String("");
			// TODO: handle exception
		}
	}

	public void capturaEquipoyaccesorios() throws ExcepcionIntervalo {
		try {
			Equipoyacceso capequaccess = new Equipoyacceso(html_capturado);
			equipoyaccesorios = capequaccess.toString();
		} catch (Exception e) {
			equipoyaccesorios = new String("");
			// TODO: handle exception
		}
	}

	public void capturaSimboloslogos() throws ExcepcionIntervalo {
		try {
			Simboloslogos simboloscap = new Simboloslogos(html_capturado);
			simboloslogos = simboloscap.toString();
		} catch (Exception e) {
			simboloslogos = new String("");
			// TODO: handle exception
		}
	}

	public void capturadocument(String url) throws ExcepcionIntervalo {
		try {
			html_capturado = new capturahtml(url).getDatosCapturados();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No hay manuales ni despieces que capturar en esta pagina" + e);
		}
	}

	@Override
	public String toString() {
		return "Capturamaquinacompleta [modelo=" + modelo + ", categoria=" + categoria + ", categoriapadre="
				+ categoriapadre + ", descripcion=" + descripcion + ", descripcioncorta=" + descripcioncorta
				+ ", descripciondetalle=" + descripciondetalle + ", prestaciones=" + prestaciones + ", datostecnicos="
				+ datostecnicos + ", urlfotos=" + urlfotos + ", despiecepormaquina=" + despiecepormaquina
				+ ", manualydespiece=" + manualydespiece + ", equipoyaccesorios=" + equipoyaccesorios
				+ ", simboloslogos=" + simboloslogos + "]";
	}

}
