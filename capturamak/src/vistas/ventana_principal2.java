package vistas;


import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.mysql.fabric.xmlrpc.base.Array;
import com.sun.glass.ui.View;
import com.sun.xml.internal.fastinfoset.util.ValueArray;

import capturamak.TextAreaOutputStream;
import capturamak.temp.Capturarmakita;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Console;
import java.io.PrintStream;
import java.util.Properties;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana_principal2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField maqmak;
	private JTextField maqdolmar;
	private JTextField novmak;
	private JTextField novdol;
	private JLabel lblNovedadDolmar;
	private JLabel lblAccesorioMak;
	private JTextField accmak;
	private JTextField accdol;
	private JLabel lblAccesorioDolmar;
	private JLabel lblEnlacesALas;
	private JTextField desmak;
	private JTextField desdol;
	private JTextArea productossueltos;
	private JCheckBox cwm,cwd,cnm,cnd,cam,cad,cops,copssn,cdmsn,cddsn,cdd,cdm,camsn,cadsn,cnmsn,cndsn,cmdsn,cmmsn;
	private Properties ini;
	/**
	 * @wbp.nonvisual location=70,-1
	 */
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana_principal2 frame = new ventana_principal2();
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
	public ventana_principal2() {
		ini = new Properties();
		ini = consola.getIni();
		
		JPanel panel = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 579);
		
		JLabel U_makita = new JLabel("WEB MAKITA");
		maqmak = new JTextField();
		maqmak.setColumns(10);
		maqmak.setText(ini.getProperty("WEB_MAKITA"));
		
		
		JLabel lblWebDolmar = new JLabel("WEB DOLMAR");
		maqdolmar = new JTextField();
		maqdolmar.setColumns(10);
		maqdolmar.setText(ini.getProperty("WEB_DOLMAR"));
		
		JLabel lblNovedadMakita = new JLabel("NOVEDAD MAKITA");
		novmak = new JTextField();
		novmak.setColumns(10);
		novmak.setText(ini.getProperty("NOVEDAD_MAKITA"));
		
		lblNovedadDolmar = new JLabel("NOVEDAD DOLMAR");
		novdol = new JTextField();
		novdol.setColumns(10);
		novdol.setText(ini.getProperty("NOVEDAD_DOLMAR"));
		
		
		lblAccesorioMak = new JLabel("ACCESORIO MAKITA");
		accmak = new JTextField();
		accmak.setColumns(10);
		accmak.setText(ini.getProperty("ACCESORIO_MAKITA"));
		
		lblAccesorioDolmar = new JLabel("ACCESORIO DOLMAR");
		accdol = new JTextField();
		accdol.setColumns(10);
		accdol.setText(ini.getProperty("ACCESORIO_DOLMAR"));
		
		
		lblEnlacesALas = new JLabel("ENLACES A LAS WEBS PARA CAPTURAR");
		
		
		
		JLabel lblCapturarsino = new JLabel("CAPTURAR");
		
		JLabel lblProductoSulto = new JLabel("OTROS PRODUCTOS ");
		
		JLabel lblDespiecesMakita = new JLabel("DESPIECES MAKITA");
		desmak = new JTextField();
		desmak.setColumns(10);
		desmak.setText(ini.getProperty("DESPIECES_MAKITA"));
		
		JLabel lblDespiecesDolmar = new JLabel("DESPIECES DOLMAR");
		desdol = new JTextField();
		desdol.setColumns(10);
		desdol.setText(ini.getProperty("DESPIECES_DOLMAR"));
		
		cwm = new JCheckBox("");
		cwm.setSelected((ini.getProperty("CWM").contains("1")));
		cwd = new JCheckBox("");
		cwd.setSelected((ini.getProperty("CWD").contains("1")));
		cnm = new JCheckBox("");
		cnm.setSelected((ini.getProperty("CNM").contains("1")));
		cnd = new JCheckBox("");
		cnd.setSelected((ini.getProperty("CND").contains("1")));
		cam = new JCheckBox("");
		cam.setSelected((ini.getProperty("CAM").contains("1")));
		cad = new JCheckBox("");
		cad.setSelected((ini.getProperty("CAD").contains("1")));
		copssn = new JCheckBox("");
		copssn.setSelected((ini.getProperty("COPSSN").contains("1")));
		cdmsn = new JCheckBox("");
		cdmsn.setSelected((ini.getProperty("CDMSN").contains("1")));
		cddsn = new JCheckBox("");
		cddsn.setSelected((ini.getProperty("CDDSN").contains("1")));
		cdd = new JCheckBox("");
		cdd.setSelected((ini.getProperty("CDD").contains("1")));
		cdm = new JCheckBox("");
		cdm.setSelected((ini.getProperty("CDM").contains("1")));
		cops = new JCheckBox("");;
		cops.setSelected((ini.getProperty("COPS").contains("1")));
		cadsn = new JCheckBox("");
		cadsn.setSelected((ini.getProperty("CADSN").contains("1")));
		camsn = new JCheckBox("");
		camsn.setSelected((ini.getProperty("CAMSN").contains("1")));
		cndsn = new JCheckBox("");
		cndsn.setSelected((ini.getProperty("CNDSN").contains("1")));
		cnmsn = new JCheckBox("");
		cnmsn.setSelected((ini.getProperty("CNMSN").contains("1")));
		cmdsn = new JCheckBox("");
		cmdsn.setSelected((ini.getProperty("CMDSN").contains("1")));
		cmmsn = new JCheckBox("");
		cmmsn.setSelected((ini.getProperty("CMMSN").contains("1")));
		
		
		
		
		
		JLabel lblSoloNuevos = new JLabel("SOLO NUEVOS");
		
		JToolBar toolBar = new JToolBar();
		
		JButton btnCapturar = new JButton("CAPTURAR");
		btnCapturar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("DATOS GUARDADOS");
				getnowproperties();
				consola.saveini(ini);
				//new Capturarmakita();
				
				
			}
		});
		btnCapturar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
							}
		});
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JTextArea consola = new JTextArea();
		
		TextAreaOutputStream taos = new TextAreaOutputStream( consola, 60 );
        PrintStream ps = new PrintStream( taos );
        System.setOut( ps );
        System.setErr( ps );
        JScrollPane scroll = new JScrollPane(consola);
		
		
		
		
		
		
		JLabel lblResultado = new JLabel("RESULTADO");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(toolBar, GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(lblDespiecesMakita, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblDespiecesDolmar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblWebDolmar, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblAccesorioMak, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(lblNovedadMakita, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblNovedadDolmar, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblAccesorioDolmar)
										.addComponent(U_makita, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(3)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(maqdolmar, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
												.addComponent(novmak, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
												.addComponent(novdol, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
												.addComponent(accmak, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createSequentialGroup()
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
																.addComponent(maqmak, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
																.addComponent(accdol, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
																.addComponent(scrollPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE))
															.addGroup(groupLayout.createSequentialGroup()
																.addComponent(desmak, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
																.addPreferredGap(ComponentPlacement.RELATED)))
														.addGroup(groupLayout.createSequentialGroup()
															.addComponent(desdol, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)))
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(lblCapturarsino)
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addComponent(lblSoloNuevos, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
														.addGroup(groupLayout.createSequentialGroup()
															.addGap(40)
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(cnm, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(cnd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(cam, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(cad, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(cops, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(cwm)
																.addComponent(cwd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(cdm, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(cdd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
															.addGap(36)
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(cddsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(cdmsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(cmdsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(cmmsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(copssn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(cnmsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(cndsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(camsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(cadsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))))))
										.addComponent(lblEnlacesALas))
									.addPreferredGap(ComponentPlacement.RELATED, 121, Short.MAX_VALUE))
								.addComponent(lblProductoSulto, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(43)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblResultado, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnCapturar)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnCancelar)))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEnlacesALas)
								.addComponent(lblCapturarsino)
								.addComponent(lblSoloNuevos)))
						.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(cmmsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(cmdsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(cnmsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(cndsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(camsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(cadsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(maqmak, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(U_makita, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
										.addComponent(cwm))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(maqdolmar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(cwd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(novmak, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(cnm, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(novdol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(cnd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
									.addGap(6)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(accmak, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(cam, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
									.addGap(6)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(accdol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(cad, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(cops, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(copssn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
							.addGap(84))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblWebDolmar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(lblNovedadMakita, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(lblNovedadDolmar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(lblAccesorioMak, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(lblAccesorioDolmar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
							.addComponent(lblProductoSulto, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(93)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDespiecesMakita, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
										.addComponent(desmak, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(6)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDespiecesDolmar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
										.addComponent(desdol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addComponent(cdmsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(cddsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
									.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addComponent(cdm, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(cdd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))
							.addGap(21)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(17)
							.addComponent(lblResultado)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(54)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCapturar)
								.addComponent(btnCancelar))))
					.addContainerGap())
		);
		
		productossueltos = new JTextArea();
		productossueltos.setText(ini.getProperty("PRODUCTOS_SUELTOS"));
		scrollPane.setViewportView(productossueltos);
		getContentPane().setLayout(groupLayout);
	}
		public void getnowproperties(){
		ini.setProperty("WEB_MAKITA",maqmak.getText());
		ini.setProperty("WEB_DOLMAR",maqdolmar.getText());
		ini.setProperty("NOVEDAD_MAKITA",novmak.getText());
		ini.setProperty("NOVEDAD_DOLMAR",novdol.getText());
		ini.setProperty("ACCESORIO_MAKITA",accmak.getText());
		ini.setProperty("ACCESORIO_DOLMAR",accdol.getText());
		ini.setProperty("PRODUCTOS_SUELTOS",productossueltos.getText());
		ini.setProperty("DESPIECES_MAKITA",desmak.getText());
		ini.setProperty("DESPIECES_DOLMAR",desdol.getText());
		
		System.out.println(valueOf(cwm.isSelected() ? 1:0));
		ini.setProperty("CWM",cwm.getText());
		ini.setProperty("CWD",cwd.getText());
		ini.setProperty("CNM",cnm.getText());
		ini.setProperty("CND",cnd.getText());
		ini.setProperty("CAM",cam.getText());
		ini.setProperty("CAD",cad.getText());
		ini.setProperty("COPS",cops.getText());
		ini.setProperty("CDD",cdd.getText());
		
		ini.setProperty("CMMSN",cmmsn.getText());
		ini.setProperty("CMDSN",cmdsn.getText());
		ini.setProperty("CNMSN",cnmsn.getText());
		ini.setProperty("CNDSN",cndsn.getText());
		ini.setProperty("CAMSN",camsn.getText());
		ini.setProperty("CADSN",cadsn.getText());
		ini.setProperty("COPSSN",copssn.getText());
		ini.setProperty("CDMSN",cdmsn.getText());
		ini.setProperty("CDDSN",cddsn.getText());
		//return ini;
	}
	
	
}
