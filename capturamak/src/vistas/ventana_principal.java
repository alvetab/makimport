package vistas;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;


import test.Capturarmakita;
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
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import capturamak.TextAreaOutputStream;

public class ventana_principal extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
					ventana_principal frame = new ventana_principal();
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
	public ventana_principal() {
		JPanel panel = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 579);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{396, 4, 162, 87, 56, 85, 0};
		gridBagLayout.rowHeights = new int[]{233, 22, 258, 23, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		
		
		
		
		JButton btnCapturar = new JButton("CAPTURAR");
		btnCapturar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("!apretado?");
				new Capturarmakita();
				
				
			}
		});
		btnCapturar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
							}
		});
		
		JTextArea textArea = new JTextArea();
		TextAreaOutputStream taos = new TextAreaOutputStream( textArea, 1300 );
		PrintStream ps = new PrintStream( taos );
        System.setOut( ps );
        System.setErr( ps );
        JScrollPane Scroll=new JScrollPane(textArea);
        
		
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
		getContentPane().add(Scroll, gbc_textArea);
		
		
		
		
		
		
		
		
		
		
		
		GridBagConstraints gbc_btnCapturar = new GridBagConstraints();
		gbc_btnCapturar.anchor = GridBagConstraints.WEST;
		gbc_btnCapturar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCapturar.gridx = 3;
		gbc_btnCapturar.gridy = 3;
		getContentPane().add(btnCapturar, gbc_btnCapturar);
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.anchor = GridBagConstraints.WEST;
		gbc_btnCancelar.gridx = 5;
		gbc_btnCancelar.gridy = 3;
		getContentPane().add(btnCancelar, gbc_btnCancelar);
	}
}
