package vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Tabladatos2 extends DefaultTableModel {
	private static final long serialVersionUID = 1L;
	
	private VentanaPrincipal ventanaPrincipal = null;
	
	public Tabladatos2(VentanaPrincipal ventanaPrincipal){
		this.ventanaPrincipal = ventanaPrincipal;
	}
	
	/**
	 * Obtiene el número de columnas del modelo
	 */
	@Override
	public int getColumnCount() {
		//El número de columnas se corresponde con el tamaño del array con el nombre de las mismas.
		return this.ventanaPrincipal.getNombreColumnas().length;
	}

	/**
	 * Recupera el nombre de una columna
	 */
	@Override
	public String getColumnName(int column) {
		//El nombre de la columna se corresponde con la posición 'column' dentro del array que guarda el
		//nombre de las columnas.
		return this.ventanaPrincipal.getNombreColumnas()[column];
	}

	/**
	 * Obtiene el número de filas del modelo
	 */
	@Override
	public int getRowCount() {
		int rowCount = 0;
		
		//El número de filas se corresponde con el número de elementos que tiene la lista de ventas de un cliente.
		if (this.ventanaPrincipal!=null){
			//Primero se obtiene el id del cliente seleccionado y este se pasa como parámetro en el método que recupera
			//el listado de ventas de dicho cliente.
			List<Venta> listadoVentasCliente = this.ventanaPrincipal.getVentasCliente(this.ventanaPrincipal.getIdCliente());
			
			//El número de filas será el tamaño del listado de ventas.
			rowCount = listadoVentasCliente.size();
		}
		return rowCount;
	}

	/**
	 * Obtiene el valor para una celda del modelo en concreto
	 */
	@Override
	public Object getValueAt(int row, int column) {
		Object returnValue = null;
		
		if (this.ventanaPrincipal.getVentas().size()>0){
			//Lo primero es recuperar la fila. Que en este caso se corresponde con una venta del cliente.
			//Por tanto, del listado de ventas activo (es decir, del cliente seleccionado) obtenemos la que
			//se encuentra en la posición 'row'
			Venta venta = (Venta) this.ventanaPrincipal.getVentas().get(row);
			
			//Una vez que se tiene la venta se devuelve el valor del atributo que se corresponde con 'column'.
			//La forma más sencilla ha sido utilizar un switch que dependiendo de la columna invoque un método
			//u otro de la clase Venta.
			//Esto es mejorable ya que si el listado de nombre de columnas cambia en VentanaPrincipal
			//este código sigue devolviendo el id en la posición 0, el nombre en la posición 1, etc.
			switch(column){
			case 0:
				returnValue = venta.getId();
				break;
			case 1:
				returnValue = venta.getArticulo();
				break;
			case 2:
				returnValue = venta.getCantidad();
				break;
			case 3:
				returnValue = venta.getPrecioUnitario();
				break;
			default:
				returnValue = "";
				break;
			}
		}
		return returnValue;
	}

	/**
	 * Establece si una celda es editable. Por defecto no.
	 */
	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}

}
