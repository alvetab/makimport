package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the urlsdocsdol database table.
 * 
 */
@Entity
@NamedQuery(name = "Urlsdocsdol.findAll", query = "SELECT u FROM Urlsdocsdol u")
public class Urlsdocsdol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private boolean activo;

	private boolean capturado;

	@Column(unique = true, nullable = false)
	private String modelo;

	private int tipo;

	private String url;

	public Urlsdocsdol() {
		super();
	}

	public Urlsdocsdol(String modelo, String url, int tipo, boolean capturado, boolean activo) {
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
