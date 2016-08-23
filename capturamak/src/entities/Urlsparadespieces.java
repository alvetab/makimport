package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the urlsaccmak database table.
 * 
 */

@Entity
@NamedQuery(name = "Urlsparadespieces.findAll", query = "SELECT u FROM Urlsparadespieces u")
public class Urlsparadespieces implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private boolean activo;

	private boolean capturado;

	@Column(unique = true, nullable = false)
	private String modelo;

	private String url;

	public Urlsparadespieces() {
		super();
	}

	public Urlsparadespieces(String modelo, String url, boolean capturado, boolean activo) {
		setModelo(modelo);
		setUrl(url);
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
