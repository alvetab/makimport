package vistas;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	/** CLASES DE LA GUI **/
	
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JComboBox jComboBox = null;
	private JScrollPane jScrollPane = null;
	private JTable jTable = null;
	private Tabladatos2 modeloTabla = null;
	//Listado de columnas de la tabla
	private String [] nombreColumnas = {"ID","Articulo","Cantidad","Precio Unitario","y otra"};
	
	/** CLASES DEL DOMINIO **/
	
	//Listado de clientes de la aplicación, se muestran en el JComboBox
	private Hashtable<String, Cliente> listadoClientes = null;
	
	//Listado de ventas de los clientes, para cada cliente hay un array con sus ventas.
	private Hashtable<String, ArrayList<Venta>> listadoVentasCliente = null;
	
	//Listado de ventas del cliente seleccionado.
	private List<Venta> ventas = null;
	
	public VentanaPrincipal() {
		super();
		//Se inicializa la interfaz
		initialize();
	}

	private void initialize() {
		//Se establece el panel principal que contiene el JComboBox y la JTable
		this.setContentPane(getJContentPane());
		
		this.setTitle("Ventana Principal");
		this.setResizable(false);
		this.setBounds(new Rectangle(0, 0, 502, 220));
		
		//Se centra la ventana con respecto a la pantalla.
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}

	/**
	 * Crea el panel principal de la aplicación. Este contiene:
	 * 	Una etiqueta con el texto "Cliente" que será colocada delante del JComboBox
	 * 	Un JComboBox con el listado de clientes
	 * 	Un JScrollPane que contiene la tabla con las ventas. El scrollpane muestra una barra de desplazamiento vertical cuando se introducen más filas de las que se pueden visualizar.
	 * @return
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(5, 5, 56, 20));
			jLabel.setText("Clientes");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJComboBox(), null);
			jContentPane.add(getJScrollPane(), null);
		}
		return jContentPane;
	}

	/**
	 * Crea el JComboBox y lo inicializa con el listado de clientes de la aplicación.
	 * Por defecto son 10 clientes generados de manera automática con un bucle. Añadiendo el número de iteración a un texto fijo.
	 * @return
	 */
	private JComboBox getJComboBox() {
		if (jComboBox == null) {
			jComboBox = new JComboBox();
			
			//Se inicializa el JComboBox con el listado de clientes. Dicho listado se encuentra en una tabla hash.
			//Hay distintas formas de recuperar los valores de una tabla hash. Una de ellas es obteniendo primeramente el listado
			//de claves para posteriormente ir recuperando elemento a elemento.
			for (Enumeration<String> enumeration = this.getListadoClientes().keys();
					enumeration.hasMoreElements();){
				String clave = (String)enumeration.nextElement();
				jComboBox.addItem(this.getListadoClientes().get(clave));
				
			}
			
			jComboBox.setBounds(new Rectangle(68, 4, 215, 20));
			
			//Añadimos un listener al combo para que cada vez que se selecciona un cliente se actualize el listado de ventas activo.
			jComboBox.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					//Este método se ejecuta cuando se producen ciertos eventos. Nos interesa que el código
					//sólo se ejecute cuando se ha seleccionado un elemento.
					if (e.getStateChange() == ItemEvent.SELECTED){
						//Recuperamos el cliente seleccionado.
						Cliente cliente = (Cliente) getJComboBox().getSelectedItem();
						
						//Establecemos las ventas activas con las que se corresponden con el cliente.
						setVentas(getVentasClientes().get(cliente.getDni()));
						
						//Actualizamos la interfaz gráfica para que se muestren los datos.
						getJScrollPane().updateUI();
					}					
				}
			});
		}
		return jComboBox;
	}

	/**
	 * Inicializa el ScrollPane que contiene la tabla.
	 * @return
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(7, 30, 483, 171));
			jScrollPane.setViewportView(getJTable());
		}
		return jScrollPane;
	}

	/**
	 * Inicializa la tabla que muestra los datos.
	 * @return
	 */
	private JTable getJTable() {
		if (jTable == null) {
			jTable = new JTable();
			//Se establece el modelo de la tabla, dicho modelo está representado
			//por un objeto de la clase MiTableModel.
			jTable.setModel(this.getModeloTabla());
		}
		
		return jTable;
	}
	
	/**
	 * Inicializa el modelo de la tabla. En este caso es un objeto de la clase MiTableModel.
	 * 
	 * @return
	 */
	private Tabladatos2 getModeloTabla(){
		if (modeloTabla == null)
			//Se le pasa como parámetro la instancia actual para que el modelo pueda recuperar el listado
			//de ventas activo y así devolver los datos correctos.
			modeloTabla = new Tabladatos2(this);
		return modeloTabla;
	}

	/**
	 * Inicializa el listado de clientes de la aplicación.
	 * @return
	 */
	private Hashtable<String, Cliente> getListadoClientes() {
		if (listadoClientes == null){
			listadoClientes = new Hashtable<String, Cliente>();
			
			//El valor de los atributos de cada objeto Cliente se genera de forma automática mediante
			//la unión de un texto fijo y el número de iteración.
			for (int i = 1; i <= 10 ; i++){
				Cliente cliente = new Cliente(""+i,"Nombre_"+i,"Apellidos_"+i,"Direccion_"+i);
				listadoClientes.put(i+"", cliente);
			}
		}
		return listadoClientes;
	}

	/**
	 * Inicializa el listado de ventas de los clientes. Para cada cliente se crea un listado de objetos Venta.
	 * @return
	 */
	public Hashtable<String, ArrayList<Venta>> getVentasClientes() {
		if (listadoVentasCliente == null){
			listadoVentasCliente = new Hashtable<String, ArrayList<Venta>>();
			
			//Para cada cliente guardamos una serie de ventas.
			for (Enumeration<String> enumeration = this.getListadoClientes().keys();
					enumeration.hasMoreElements();){
				String clave = (String)enumeration.nextElement();
				String idCliente = ((Cliente)this.getListadoClientes().get(clave)).getDni();
				
				//El valor de los atributos de cada objeto Venta se genera de forma automática mediante
				//la unión de un texto fijo y el número de iteración.
				ArrayList<Venta>listadoVentas = new ArrayList<Venta>();
				for (int i = 1; i <= 9; i++){
					Venta venta = new Venta(""+idCliente+"_"+i,"Articulo_"+idCliente+"_"+i,"Cantidad_"+idCliente+"_"+i, "Precio_"+idCliente+"_"+i);
					listadoVentas.add(venta);
				}
				listadoVentasCliente.put(idCliente+"", listadoVentas);
			}
		}
		return listadoVentasCliente;
	}
	
	/**
	 * Recupera el listado de ventas de un cliente.
	 * @param idCliente Identificador del cliente cuyas ventas se desea recuperar.
	 * @return
	 */
	public List<Venta> getVentasCliente(String idCliente){
		return this.getVentasClientes().get(idCliente);
	}	
	
	/**
	 * Obtiene el listado de ventas activo. Es decir, el listado de ventas del cliente seleccionado.
	 * @return
	 */
	public List<Venta> getVentas(){
		if (ventas == null)
			ventas = new ArrayList<Venta>();
		return ventas;
	}
	
	/**
	 * Establece el listado de ventas del cliente seleccionado.
	 * @param ventas Listado de ventas de un cliente.
	 */
	public void setVentas(List<Venta> ventas){
		this.getVentas().clear();
		this.getVentas().addAll(ventas);
	}
	
	/**
	 * Obtiene un listado con el nombre de las columnas de la tabla.
	 * @return
	 */
	public String[] getNombreColumnas(){
		return nombreColumnas;
	}
	
	/**
	 * Obtiene el identificador del cliente seleccionado.
	 * @return
	 */
	public String getIdCliente(){
		return ((Cliente)getJComboBox().getSelectedItem()).getDni();
	}
} 
