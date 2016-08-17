package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.PrivateKey;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import org.hibernate.dialect.ColumnAliasExtractor;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.javafx.collections.ElementObservableListDecorator;
import com.sun.org.apache.xml.internal.dtm.ref.dom2dtm.DOM2DTMdefaultNamespaceDeclarationNode;

import DAO.AccesorioDAO;
import JPA.AccesorioJpaDAO;
import JPA.Accesoriolist;
import entities.Accesorio;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;

public class Tabladatos extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable tablacondatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabladatos frame = new Tabladatos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tabladatos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		tablacondatos = new JTable();
		scrollPane.setViewportView(tablacondatos);
		sacadatos();
		
		
		
		
		
	}

	public void sacadatos(){
	AccesorioDAO conexionaaccesorios = new AccesorioJpaDAO();
	Accesoriolist listaaccesorios = new Accesoriolist();
		List<Accesorio> listado = conexionaaccesorios.listarTodos(); 
	int cantidadfilas=listado.size();
	int cantidadcolumnas;
	System.out.println("cantidad filas= "+cantidadfilas+" filas");
	Field[] columnas = Accesorio.class.getDeclaredFields();
	
	cantidadcolumnas= columnas.length/2;
	String[] nomcolumna=new String[cantidadcolumnas];
	String[][] filas = new String[cantidadfilas][cantidadcolumnas];
	
	
	for (int i=0,z=0;i<cantidadcolumnas-1;i++){
		z=z+2;
		nomcolumna[i] = columnas[z].getName().toString();
		System.out.println(nomcolumna[i]);
	}
	
	for(int z=0;z<cantidadfilas-1;z++){	
		filas[z]=listado.get(z).creaarray();
		}
	
	
	
	
	
	DefaultTableModel modelo= new DefaultTableModel(filas,nomcolumna);
	tablacondatos.setModel(modelo);
	tablacondatos.updateUI();
	
		
	}
			
	}
	
	

