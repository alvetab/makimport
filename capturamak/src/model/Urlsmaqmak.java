package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the urlsmaqmak database table.
 * 
 */
@Entity
@NamedQuery(name="Urlsmaqmak.findAll", query="SELECT u FROM Urlsmaqmak u")
public class Urlsmaqmak implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private boolean activo;

	private boolean capturado;
	
	@Column(unique=true, nullable=false)
	private String modelo;

	private int tipo;

	private String url;

	public Urlsmaqmak() {
	super();
	}
	
	public Urlsmaqmak(String modelo,String url, int tipo, boolean capturado, boolean activo) {
		setModelo(modelo);
		setUrl(url);
		setTipo(tipo);
		setCapturado(capturado);
		setActivo(activo);
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public boolean getCapturado() {
		return this.capturado;
	}

	public void setCapturado(boolean capturado) {
		this.capturado = capturado;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}