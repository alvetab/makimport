package capturamak.temp;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the accesorios database table.
 * 
 */
@Entity
@Table(name="accesorios")
@NamedQuery(name="Accesorio.findAll", query="SELECT a FROM Accesorio a")
public class Accesorio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	private String accesorios;

	private BigDecimal cargobat;

	@Lob
	private String categoria;

	private String codprod;

	private String descripcion;

	private String descripcioncat;

	@Lob
	private String descripcioncorta;

	@Lob
	private String especificaciones;

	@Lob
	private String foto1;

	@Lob
	private String foto2;

	@Lob
	private String fotocar;

	private int idcategoria;

	@Id
	
	private int idprod;

	@Lob
	private String informaciongeneral;

	@Lob
	private String informacionproducto;

	@Lob
	private String manualdespiece;

	@Lob
	private String manualinstrucciones;

	private String modelo;

	@Lob
	private String otros;

	@Lob
	private String parentcat;

	@Lob
	private String prestaciones;

	private BigDecimal pvp;

	@Lob
	private String simbolos;

	private BigDecimal total;

	public Accesorio() {
	}

	public String getAccesorios() {
		return this.accesorios;
	}

	public void setAccesorios(String accesorios) {
		this.accesorios = accesorios;
	}

	public BigDecimal getCargobat() {
		return this.cargobat;
	}

	public void setCargobat(BigDecimal cargobat) {
		this.cargobat = cargobat;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodprod() {
		return this.codprod;
	}

	public void setCodprod(String codprod) {
		this.codprod = codprod;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcioncat() {
		return this.descripcioncat;
	}

	public void setDescripcioncat(String descripcioncat) {
		this.descripcioncat = descripcioncat;
	}

	public String getDescripcioncorta() {
		return this.descripcioncorta;
	}

	public void setDescripcioncorta(String descripcioncorta) {
		this.descripcioncorta = descripcioncorta;
	}

	public String getEspecificaciones() {
		return this.especificaciones;
	}

	public void setEspecificaciones(String especificaciones) {
		this.especificaciones = especificaciones;
	}

	public String getFoto1() {
		return this.foto1;
	}

	public void setFoto1(String foto1) {
		this.foto1 = foto1;
	}

	public String getFoto2() {
		return this.foto2;
	}

	public void setFoto2(String foto2) {
		this.foto2 = foto2;
	}

	public String getFotocar() {
		return this.fotocar;
	}

	public void setFotocar(String fotocar) {
		this.fotocar = fotocar;
	}

	public int getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public int getIdprod() {
		return this.idprod;
	}

	public void setIdprod(int idprod) {
		this.idprod = idprod;
	}

	public String getInformaciongeneral() {
		return this.informaciongeneral;
	}

	public void setInformaciongeneral(String informaciongeneral) {
		this.informaciongeneral = informaciongeneral;
	}

	public String getInformacionproducto() {
		return this.informacionproducto;
	}

	public void setInformacionproducto(String informacionproducto) {
		//captura(informacionproducto);
		
		
		this.informacionproducto = informacionproducto;
	}

	public String getManualdespiece() {
		return this.manualdespiece;
	}

	public void setManualdespiece(String manualdespiece) {
		this.manualdespiece = manualdespiece;
	}

	public String getManualinstrucciones() {
		return this.manualinstrucciones;
	}

	public void setManualinstrucciones(String manualinstrucciones) {
		this.manualinstrucciones = manualinstrucciones;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getOtros() {
		return this.otros;
	}

	public void setOtros(String otros) {
		this.otros = otros;
	}

	public String getParentcat() {
		return this.parentcat;
	}

	public void setParentcat(String parentcat) {
		this.parentcat = parentcat;
	}

	public String getPrestaciones() {
		return this.prestaciones;
	}

	public void setPrestaciones(String prestaciones) {
		this.prestaciones = prestaciones;
	}

	public BigDecimal getPvp() {
		return this.pvp;
	}

	public void setPvp(BigDecimal pvp) {
		this.pvp = pvp;
	}

	public String getSimbolos() {
		return this.simbolos;
	}

	public void setSimbolos(String simbolos) {
		this.simbolos = simbolos;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	public String[] creaarray() {
		ArrayList<String> paratabla = new ArrayList<String>();
		try {
	    
		Class<?> objClase = getClass();
	    Field[] arCampos;
	    String sTipo;

	    while (null != objClase
	           && !Object.class.getSimpleName().equals(objClase.getSimpleName())) {
	      arCampos = objClase.getDeclaredFields();
	      if (null != arCampos) {
	        // Recorre los campos del objeto. Si es una constante omite su lectura.
	        for (Field objCampo : arCampos) {
	          sTipo = objCampo.getType().toString();
	          if (!Modifier.isFinal(objCampo.getModifiers())
	              || (sTipo.startsWith("class")
	              && !sTipo.endsWith(String.class.getCanonicalName()))) {
	            objCampo.setAccessible(true);
	            paratabla.add(objCampo.getName().toString());
	            paratabla.add((String.valueOf(objCampo.get(this)))) ;
	           }
	        }
	      }
	 
	      // Pasa a la siguiente clase padre.
	      objClase = objClase.getSuperclass();
	    }
	  } catch (final IllegalArgumentException e) {
	  } catch (IllegalAccessException e) {
	  }
	  String[] arraystringdatos = paratabla.toArray(new String[paratabla.size()]);
	  return arraystringdatos;
	  
	}

	@Override
	public String toString() {
		return "Accesorio [accesorios=" + accesorios + ", cargobat=" + cargobat + ", categoria=" + categoria
				+ ", codprod=" + codprod + ", descripcion=" + descripcion + ", descripcioncat=" + descripcioncat
				+ ", descripcioncorta=" + descripcioncorta + ", especificaciones=" + especificaciones + ", foto1="
				+ foto1 + ", foto2=" + foto2 + ", fotocar=" + fotocar + ", idcategoria=" + idcategoria + ", idprod="
				+ idprod + ", informaciongeneral=" + informaciongeneral + ", informacionproducto=" + informacionproducto
				+ ", manualdespiece=" + manualdespiece + ", manualinstrucciones=" + manualinstrucciones + ", modelo="
				+ modelo + ", otros=" + otros + ", parentcat=" + parentcat + ", prestaciones=" + prestaciones + ", pvp="
				+ pvp + ", simbolos=" + simbolos + ", total=" + total + "]";
	}
	
}