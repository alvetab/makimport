package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the accesoriosjardin database table.
 * 
 */
@Entity
@NamedQuery(name="Accesoriosjardin.findAll", query="SELECT a FROM Accesoriosjardin a")
public class Accesoriosjardin implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descripcion;
	
	@Id
	private String producto;

	private BigDecimal pvp;

	public Accesoriosjardin() {
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getProducto() {
		return this.producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public BigDecimal getPvp() {
		return this.pvp;
	}

	public void setPvp(BigDecimal pvp) {
		this.pvp = pvp;
	}

}