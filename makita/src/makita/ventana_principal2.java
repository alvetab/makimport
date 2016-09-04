
package makita;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;



import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.PrintStream;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana_principal2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNovedadDolmar;
	private JLabel lblAccesorioMak;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblAccesorioDolmar;
	private JLabel lblEnlacesALas;
	private JTextField textField_7;
	private JTextField textField_8;
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
		JPanel panel = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 579);
		
		JLabel U_makita = new JLabel("WEB MAKITA");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblWebDolmar = new JLabel("WEB DOLMAR");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNovedadMakita = new JLabel("NOVEDAD MAKITA");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		lblNovedadDolmar = new JLabel("NOVEDAD DOLMAR");
		
		lblAccesorioMak = new JLabel("ACCESORIO MAKITA");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		lblAccesorioDolmar = new JLabel("ACCESORIO DOLMAR");
		
		lblEnlacesALas = new JLabel("ENLACES A LAS WEBS PARA CAPTURAR");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		
		JLabel lblCapturarsino = new JLabel("CAPTURAR");
		
		JCheckBox checkBox = new JCheckBox("");
		
		JCheckBox checkBox_1 = new JCheckBox("");
		
		JCheckBox checkBox_2 = new JCheckBox("");
		
		JCheckBox checkBox_3 = new JCheckBox("");
		
		JCheckBox checkBox_4 = new JCheckBox("");
		
		JCheckBox checkBox_5 = new JCheckBox("");
		
		JCheckBox checkBox_6 = new JCheckBox("");
		
		JCheckBox checkBox_7 = new JCheckBox("");
		
		JLabel lblProductoSulto = new JLabel("OTROS PRODUCTOS ");
		
		JLabel lblDespiecesMakita = new JLabel("DESPIECES MAKITA");
		
		JLabel lblDespiecesDolmar = new JLabel("DESPIECES DOLMAR");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JCheckBox checkBox_14 = new JCheckBox("");
		
		JCheckBox checkBox_15 = new JCheckBox("");
		
		JCheckBox checkBox_16 = new JCheckBox("");
		
		JCheckBox checkBox_17 = new JCheckBox("");
		
		JCheckBox checkBox_18 = new JCheckBox("");
		
		JCheckBox checkBox_19 = new JCheckBox("");
		
		JCheckBox checkBox_20 = new JCheckBox("");
		
		JCheckBox checkBox_21 = new JCheckBox("");
		
		JCheckBox checkBox_22 = new JCheckBox("");
		
		JLabel lblSoloNuevos = new JLabel("SOLO NUEVOS");
		
		JToolBar toolBar = new JToolBar();
		
		JButton btnCapturar = new JButton("CAPTURAR");
		btnCapturar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("!apretado?");
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
		
		JTextArea textArea_1 = new JTextArea();
		TextAreaOutputStream taos = new TextAreaOutputStream( textArea_1, 60 );
        PrintStream ps = new PrintStream( taos );
        System.setOut( ps );
        System.setErr( ps );
        JScrollPane scroll = new JScrollPane(textArea_1);
		
		
		
		
		
		
		JLabel lblResultado = new JLabel("RESULTADO");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(toolBar, GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
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
										.addComponent(U_makita, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(3)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createSequentialGroup()
													.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addComponent(textField, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_5, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
														.addComponent(scrollPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE))
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(lblCapturarsino)
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addComponent(lblSoloNuevos, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
														.addGroup(groupLayout.createSequentialGroup()
															.addGap(40)
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(checkBox_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_16, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(chckbxNewCheckBox)
																.addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_15, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_14, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
															.addGap(36)
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(checkBox_21, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_22, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_20, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_19, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_18, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_17, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_6, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
																.addComponent(checkBox_7, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))
													.addPreferredGap(ComponentPlacement.RELATED, 116, Short.MAX_VALUE))))
										.addComponent(lblEnlacesALas)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(3)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
												.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE))
											.addGap(159))))
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
									.addComponent(checkBox_22, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(checkBox_21, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(checkBox_20, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(checkBox_19, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(checkBox_18, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(checkBox_17, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(U_makita, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
										.addComponent(chckbxNewCheckBox))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
									.addGap(6)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
									.addGap(6)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox_4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(checkBox_16, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(checkBox_5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
							.addGap(36)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(1)
									.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(checkBox_6, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(checkBox_7, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(checkBox_15, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(checkBox_14, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))
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
							.addComponent(lblAccesorioDolmar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
							.addComponent(lblProductoSulto, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(93)
							.addComponent(lblDespiecesMakita, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lblDespiecesDolmar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
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
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		getContentPane().setLayout(groupLayout);
	}
}
