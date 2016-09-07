package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Maquinacompleta.findAll", query = "SELECT u FROM Maquinacompleta u")
public class Maquinacompleta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(unique=true)
	private String modelo;
	
	private String categoria;
	private String categoriapadre;
	private String descripcion;
	@Lob
	private String descripcioncorta;
	@Lob
	private String descripciondetalle;
	@Lob
	private String prestaciones;
	@Lob
	private String datostecnicos;
	@Lob
	private String urlfotos;
	@Lob
	private String despiecepormaquina;
	@Lob
	private String manualydespiece;
	@Lob
	private String equipoyaccesorios;
	@Lob
	private String simboloslogos;
	
	public String getCategoriapadre() {
		return categoriapadre;
	}
	public void setCategoriapadre(String categoriapadre) {
		this.categoriapadre = categoriapadre;
	}
	public String getDescripciondetalle() {
		return descripciondetalle;
	}
	public void setDescripciondetalle(String descripciondetalle) {
		this.descripciondetalle = descripciondetalle;
	}
	public String getDatostecnicos() {
		return datostecnicos;
	}
	public void setDatostecnicos(String datostecnicos) {
		this.datostecnicos = datostecnicos;
	}
	public String getUrlfotos() {
		return urlfotos;
	}
	public void setUrlfotos(String urlfotos) {
		this.urlfotos = urlfotos;
	}
	public String getDespiecepormaquina() {
		return despiecepormaquina;
	}
	public void setDespiecepormaquina(String despiecepormaquina) {
		this.despiecepormaquina = despiecepormaquina;
	}
	public String getManualydespiece() {
		return manualydespiece;
	}
	public void setManualydespiece(String manualydespiece) {
		this.manualydespiece = manualydespiece;
	}
	public String getEquipoyaccesorios() {
		return equipoyaccesorios;
	}
	public void setEquipoyaccesorios(String equipoyaccesorios) {
		this.equipoyaccesorios = equipoyaccesorios;
	}
	public String getSimboloslogos() {
		return simboloslogos;
	}
	public void setSimboloslogos(String simboloslogos) {
		this.simboloslogos = simboloslogos;
	}
	
	public Maquinacompleta() {
	}
	public String getCategoria() {
		return this.categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public String getDescripcioncorta() {
		return this.descripcioncorta;
	}

	public void setDescripcioncorta(String descripcioncorta) {
		this.descripcioncorta = descripcioncorta;
	}
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPrestaciones() {
		return this.prestaciones;
	}

	public void setPrestaciones(String prestaciones) {
		this.prestaciones = prestaciones;
	}
	@Override
	public String toString() {
		return "maquinacompleta [modelo=" + modelo + ", categoria=" + categoria + ", categoriapadre=" + categoriapadre
				+ ", descripcion=" + descripcion + ", descripcioncorta=" + descripcioncorta + ", descripciondetalle="
				+ descripciondetalle + ", prestaciones=" + prestaciones + ", datostecnicos=" + datostecnicos
				+ ", urlfotos=" + urlfotos + ", despiecepormaquina=" + despiecepormaquina + ", manualydespiece="
				+ manualydespiece + ", equipoyaccesorios=" + equipoyaccesorios + ", simboloslogos=" + simboloslogos
				+ "]";
	}
	
}
	
