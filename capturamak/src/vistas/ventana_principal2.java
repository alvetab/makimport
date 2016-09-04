package vistas;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;
import com.sun.xml.internal.fastinfoset.util.ValueArray;

import capturamak.CapturaAction;
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
import javax.swing.JProgressBar;

public class ventana_principal2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTextField maqmak;
	private static JTextField maqdolmar;
	private static JTextField novmak;
	private static JTextField novdol;
	private static JLabel lblNovedadDolmar;
	private static JLabel lblAccesorioMak;
	private static JTextField accmak;
	private static JTextField accdol;
	private static JLabel lblAccesorioDolmar;
	private static JLabel lblEnlacesALas;
	private static JTextField desmak;
	private static JTextField desdol;
	private static Properties ini;
	private static JTextArea productossueltos;
	private static JCheckBox cwm,cwd,cnm,cnd,cam,cad,copsn,cdmsn,cddsn,cdd,cdm,cwmsn,cwdsn,cop,cadsn,camsn,cndsn,cnmsn;
	private JCheckBox cmm;
	private JTextField manmak;
	private JLabel lblManualesmakita;
	private JLabel lblManualesdolmar;
	private JTextField mandol;
	private JCheckBox cmd;
	private JCheckBox cmdsn;
	private JCheckBox cmmsn;
	
	/**
	 * @wbp.nonvisual location=70,-1
	 */
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the frame.
	 */
	public ventana_principal2() {
		super("Multitarea Swing");
		ini = consola.getIni();
		
		JPanel panel = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 885);
		
		
		maqmak = new JTextField();
		maqmak.setColumns(10);
		maqmak.setText(ini.getProperty("WEB_MAKITA"));
		
		
		maqdolmar = new JTextField();
		maqdolmar.setColumns(10);
		maqdolmar.setText(ini.getProperty("WEB_DOLMAR"));
		
		
		novmak = new JTextField();
		novmak.setColumns(10);
		novmak.setText(ini.getProperty("NOVEDAD_MAKITA"));
		
		
		novdol = new JTextField();
		novdol.setColumns(10);
		novdol.setText(ini.getProperty("NOVEDAD_DOLMAR"));
		
		
		accmak = new JTextField();
		accmak.setColumns(10);
		accmak.setText(ini.getProperty("ACCESORIO_MAKITA"));
		
		
		accdol = new JTextField();
		accdol.setColumns(10);
		accdol.setText(ini.getProperty("ACCESORIO_DOLMAR"));
		
		desmak = new JTextField();
		desmak.setColumns(10);
		desmak.setText(ini.getProperty("DESPIECES_MAKITA"));
		
		desdol = new JTextField();
		desdol.setColumns(10);
		desdol.setText(ini.getProperty("DESPIECES_DOLMAR"));
		
		manmak = new JTextField();
		manmak.setText(ini.getProperty("MANUALES_MAKITA"));
		manmak.setColumns(10);
		
		mandol = new JTextField();
		mandol.setText(ini.getProperty("MANUALES_DOLMAR"));
		mandol.setColumns(10);
		
		
		
		
		
		
		lblEnlacesALas = new JLabel("ENLACES A LAS WEBS PARA CAPTURAR");
		JLabel lblCapturarsino = new JLabel("CAPTURAR");
		JLabel lblProductoSulto = new JLabel("OTROS PRODUCTOS ");
		JLabel lblDespiecesMakita = new JLabel("DESPIECES MAKITA");
		JLabel lblDespiecesDolmar = new JLabel("DESPIECES DOLMAR");
		JLabel lblSoloNuevos = new JLabel("SOLO NUEVOS");
		JLabel lblResultado = new JLabel("RESULTADO");
		lblManualesmakita = new JLabel("MANUALES MAKITA");
		lblManualesdolmar = new JLabel("MANUALES DOLMAR");
		JLabel U_makita = new JLabel("WEB MAKITA");
		JLabel lblWebDolmar = new JLabel("WEB DOLMAR");
		JLabel lblNovedadMakita = new JLabel("NOVEDAD MAKITA");
		lblAccesorioDolmar = new JLabel("ACCESORIO DOLMAR");
		lblAccesorioMak = new JLabel("ACCESORIO MAKITA");
		lblNovedadDolmar = new JLabel("NOVEDAD DOLMAR");
		
		
		
		
		
		
		
		cwm = new JCheckBox("");
		cwm.setSelected((ini.getProperty("CWM").contains("true")));
		cwd = new JCheckBox("");
		cwd.setSelected((ini.getProperty("CWD").contains("true")));
		cnm = new JCheckBox("");
		cnm.setSelected((ini.getProperty("CNM").contains("true")));
		cnd = new JCheckBox("");
		cnd.setSelected((ini.getProperty("CND").contains("true")));
		cam = new JCheckBox("");
		cam.setSelected((ini.getProperty("CAM").contains("true")));
		cad = new JCheckBox("");
		cad.setSelected((ini.getProperty("CAD").contains("true")));
		copsn = new JCheckBox("");
		copsn.setSelected((ini.getProperty("COPSN").contains("true")));
		cdmsn = new JCheckBox("");
		cdmsn.setSelected((ini.getProperty("CDMSN").contains("true")));
		cddsn = new JCheckBox("");
		cddsn.setSelected((ini.getProperty("CDDSN").contains("true")));
		cdd = new JCheckBox("");
		cdd.setSelected((ini.getProperty("CDD").contains("true")));
		cdm = new JCheckBox("");
		cdm.setSelected((ini.getProperty("CDM").contains("true")));
		cop = new JCheckBox("");;
		cop.setSelected((ini.getProperty("COP").contains("true")));
		cadsn = new JCheckBox("");
		cadsn.setSelected((ini.getProperty("CADSN").contains("true")));
		camsn = new JCheckBox("");
		camsn.setSelected((ini.getProperty("CAMSN").contains("true")));
		cndsn = new JCheckBox("");
		cndsn.setSelected((ini.getProperty("CNDSN").contains("true")));
		cnmsn = new JCheckBox("");
		cnmsn.setSelected((ini.getProperty("CNMSN").contains("true")));
		cwdsn = new JCheckBox("");
		cwdsn.setSelected((ini.getProperty("CWDSN").contains("true")));
		cwmsn = new JCheckBox("");
		cwmsn.setSelected((ini.getProperty("CWMSN").contains("true")));
		cmm = new JCheckBox("");
		cmm.setSelected((ini.getProperty("CMM").contains("true")));
		cmd = new JCheckBox("");
		cmd.setSelected((ini.getProperty("CMD").contains("true")));
		cmdsn = new JCheckBox("");
		cmdsn.setSelected((ini.getProperty("CMDSN").contains("true")));
		cmmsn = new JCheckBox("");
		cmmsn.setSelected((ini.getProperty("CMMSN").contains("true")));
		
		
		
		
		
		JToolBar toolBar = new JToolBar();
		
		JButton btnCapturar = new JButton("CAPTURAR");
		btnCapturar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			System.out.println("capturando");
			CapturaAction iniciarcapturas = CapturaAction.getSingletonInstance("CAPTURAR DATOS", getproperties());
			try {
				
				iniciarcapturas.captura();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//iniciarcapturas.Grabarlista(listafinal);
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
		
		TextAreaOutputStream taos = new TextAreaOutputStream( consola, 30000 );
        PrintStream ps = new PrintStream( taos );
        System.setOut( ps );
        System.setErr( ps );
        JScrollPane scroll = new JScrollPane(consola);
		
		
		JButton btnNewButton = new JButton("Guardar config");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ini = getproperties();
					tosaveproperties(ini);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Configuración guardada");
				}
		});
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(toolBar, GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblWebDolmar, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAccesorioMak, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblNovedadMakita, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNovedadDolmar, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblAccesorioDolmar)
								.addComponent(U_makita, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
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
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(maqmak, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
												.addComponent(accdol, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
												.addComponent(scrollPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblCapturarsino)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(lblSoloNuevos, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(cnm, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
														.addComponent(cnd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
														.addComponent(cam, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
														.addComponent(cad, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
														.addComponent(cwm)
														.addComponent(cwd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
														.addComponent(cop, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
														.addComponent(cdm, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
														.addComponent(cmm, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
														.addComponent(cdd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
														.addComponent(cmd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
													.addGap(57)
													.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addComponent(cddsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
															.addComponent(cdmsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
															.addComponent(copsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
															.addComponent(cwdsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
															.addComponent(cwmsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
															.addComponent(cnmsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
															.addComponent(cndsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
															.addComponent(camsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
															.addComponent(cadsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
														.addComponent(cmdsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
														.addComponent(cmmsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))))))
								.addComponent(lblEnlacesALas))
							.addPreferredGap(ComponentPlacement.RELATED, 119, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblProductoSulto, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblResultado, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnNewButton)
								.addComponent(btnCapturar))
							.addGap(18)
							.addComponent(btnCancelar))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblDespiecesMakita, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblDespiecesDolmar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblManualesmakita, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(desmak, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
								.addComponent(desdol)
								.addComponent(manmak))))
					.addGap(74))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblManualesdolmar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(mandol, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(263, Short.MAX_VALUE))
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
							.addComponent(cwmsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cwdsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
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
								.addComponent(cad, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblWebDolmar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(lblNovedadMakita, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(lblNovedadDolmar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(lblAccesorioMak, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(lblAccesorioDolmar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(lblProductoSulto, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(copsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(cop, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(cdm, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
							.addComponent(cdd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cmm, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDespiecesMakita, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(desmak, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDespiecesDolmar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(desdol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(manmak, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblManualesmakita, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(cdmsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
							.addComponent(cddsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cmmsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblManualesdolmar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addComponent(mandol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(cmd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addComponent(cmdsn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblResultado)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addGap(67)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCapturar)
								.addComponent(btnCancelar))
							.addGap(21)))
					.addGap(86))
		);
		
		productossueltos = new JTextArea();
		productossueltos.setText(ini.getProperty("PRODUCTOS_SUELTOS"));
		scrollPane.setViewportView(productossueltos);
		getContentPane().setLayout(groupLayout);
		this.setVisible(true);
	}
	
		public Properties getproperties(){
				Properties properties = new Properties();

				properties.setProperty("CWM", String.valueOf(cwm.isSelected()));
				properties.setProperty("CWD",String.valueOf(cwd.isSelected()));
				properties.setProperty("CNM",String.valueOf(cnm.isSelected()));
				properties.setProperty("CND",String.valueOf(cnd.isSelected()));
				properties.setProperty("CAM",String.valueOf(cam.isSelected()));
				properties.setProperty("CAD",String.valueOf(cad.isSelected()));
				properties.setProperty("COPSN",String.valueOf(copsn.isSelected()));
				properties.setProperty("CDMSN",String.valueOf(cdmsn.isSelected()));
				properties.setProperty("CDDSN",String.valueOf(cddsn.isSelected()));
				properties.setProperty("CDM",String.valueOf(cdm.isSelected()));
				properties.setProperty("CDD",String.valueOf(cdd.isSelected()));
				properties.setProperty("CMM",String.valueOf(cmm.isSelected()));
				properties.setProperty("CMD",String.valueOf(cmd.isSelected()));
				properties.setProperty("CWDSN",String.valueOf(cwdsn.isSelected()));
				properties.setProperty("CWMSN",String.valueOf(cwmsn.isSelected()));
				properties.setProperty("COP",String.valueOf(cop.isSelected()));
				properties.setProperty("CADSN",String.valueOf(cadsn.isSelected()));
				properties.setProperty("CAMSN",String.valueOf(camsn.isSelected()));
				properties.setProperty("CNDSN",String.valueOf(cndsn.isSelected()));
				properties.setProperty("CNMSN",String.valueOf(cnmsn.isSelected()));
				properties.setProperty("CMDSN",String.valueOf(cmdsn.isSelected()));
				properties.setProperty("CMMSN",String.valueOf(cmmsn.isSelected()));
                
				properties.setProperty("WEB_MAKITA", maqmak.getText());
				properties.setProperty("WEB_DOLMAR",maqdolmar.getText());
				properties.setProperty("NOVEDAD_MAKITA",novmak.getText());
				properties.setProperty("NOVEDAD_DOLMAR",novdol.getText());
				properties.setProperty("ACCESORIO_MAKITA",accmak.getText());
				properties.setProperty("ACCESORIO_DOLMAR",accdol.getText());
				properties.setProperty("DESPIECES_MAKITA",desmak.getText());
				properties.setProperty("DESPIECES_DOLMAR",desdol.getText());
				properties.setProperty("MANUALES_MAKITA",manmak.getText());
				properties.setProperty("MANUALES_DOLMAR",mandol.getText());
				properties.setProperty("PRODUCTOS_SUELTOS",productossueltos.getText());
				return properties;
		}
	
	public static void tosaveproperties(Properties ini) throws Exception{
				consola.saveIni(ini);
		}
}
