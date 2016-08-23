package entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@NamedQuery(name="Despiecepormaquina.findAll", query="SELECT d FROM Despiecepormaquina d")
public class Despiecepormaquina implements Serializable {
	private static final long serialVersionUID = 1L;
	

	@Id
	private int id;

	private String codigopieza;

	private String descripcion;

	private String modelo;

	private String posicion;

	public Despiecepormaquina() {
	}
	
	public Despiecepormaquina(String modelo, String posicion, String codigopieza, String descripcion) {
		setModelo(modelo);
		setPosicion(posicion);
		setCodigopieza(codigopieza);
		setDescripcion(descripcion);
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigopieza() {
		return this.codigopieza;
	}

	public void setCodigopieza(String codigopieza) {
		this.codigopieza = codigopieza;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPosicion() {
		return this.posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Despiecepormaquina [codigopieza=" + codigopieza + ", descripcion=" + descripcion + ", modelo=" + modelo
				+ ", posicion=" + posicion + "]";
	}

}