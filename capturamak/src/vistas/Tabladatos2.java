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
	 * Obtiene el n�mero de columnas del modelo
	 */
	@Override
	public int getColumnCount() {
		//El n�mero de columnas se corresponde con el tama�o del array con el nombre de las mismas.
		return this.ventanaPrincipal.getNombreColumnas().length;
	}

	/**
	 * Recupera el nombre de una columna
	 */
	@Override
	public String getColumnName(int column) {
		//El nombre de la columna se corresponde con la posici�n 'column' dentro del array que guarda el
		//nombre de las columnas.
		return this.ventanaPrincipal.getNombreColumnas()[column];
	}

	/**
	 * Obtiene el n�mero de filas del modelo
	 */
	@Override
	public int getRowCount() {
		int rowCount = 0;
		
		//El n�mero de filas se corresponde con el n�mero de elementos que tiene la lista de ventas de un cliente.
		if (this.ventanaPrincipal!=null){
			//Primero se obtiene el id del cliente seleccionado y este se pasa como par�metro en el m�todo que recupera
			//el listado de ventas de dicho cliente.
			List<Venta> listadoVentasCliente = this.ventanaPrincipal.getVentasCliente(this.ventanaPrincipal.getIdCliente());
			
			//El n�mero de filas ser� el tama�o del listado de ventas.
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
			//se encuentra en la posici�n 'row'
			Venta venta = (Venta) this.ventanaPrincipal.getVentas().get(row);
			
			//Una vez que se tiene la venta se devuelve el valor del atributo que se corresponde con 'column'.
			//La forma m�s sencilla ha sido utilizar un switch que dependiendo de la columna invoque un m�todo
			//u otro de la clase Venta.
			//Esto es mejorable ya que si el listado de nombre de columnas cambia en VentanaPrincipal
			//este c�digo sigue devolviendo el id en la posici�n 0, el nombre en la posici�n 1, etc.
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
