package vistas;

public class Venta {

	private String id;
	private String articulo;
	private String cantidad;
	private String precioUnitario;
	
	public Venta(String id, String articulo, String cantidad, String precioUnitario) {
		super();
		this.id = id;
		this.articulo = articulo;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(String precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
