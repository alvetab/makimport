package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Maquinacompleta.findAll", query = "SELECT u FROM Maquinacompleta u")
public class Maquinacompleta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
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
	
