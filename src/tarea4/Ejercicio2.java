package tarea4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import javax.swing.JEditorPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;
	private JComboBox cboTPS;

	public Ejercicio2() {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 25, 301, 204);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNota = new JLabel("Nota 1:");
		lblNota.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota.setBounds(20, 40, 46, 14);
		panel.add(lblNota);
		
		JLabel lblNota_1 = new JLabel("Nota 2:");
		lblNota_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota_1.setBounds(20, 80, 46, 14);
		panel.add(lblNota_1);
		
		JLabel lblNota_2 = new JLabel("Nota 3:");
		lblNota_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota_2.setBounds(20, 120, 46, 14);
		panel.add(lblNota_2);
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTps.setBounds(20, 160, 46, 14);
		panel.add(lblTps);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(104, 37, 145, 20);
		panel.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(104, 77, 145, 20);
		panel.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(104, 117, 145, 20);
		panel.add(txtNota3);
		txtNota3.setColumns(10);
		
		JComboBox cboTPS = new JComboBox();
		cboTPS.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		cboTPS.setBounds(104, 154, 145, 20);
		panel.add(cboTPS);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 248, 301, 137);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPromedio.setBounds(20, 44, 71, 14);
		panel_1.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condici\u00F3n:");
		lblCondicion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCondicion.setBounds(20, 86, 71, 14);
		panel_1.add(lblCondicion);
		
		txtPromedio = new JTextField();
		txtPromedio.setEditable(false);
		txtPromedio.setBounds(104, 41, 142, 20);
		panel_1.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		txtCondicion = new JTextField();
		txtCondicion.setEditable(false);
		txtCondicion.setBounds(104, 83, 142, 20);
		panel_1.add(txtCondicion);
		txtCondicion.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
			
			if ((txtNota1.getText().isEmpty() || !(txtNota1.getText().matches("^[0-9]+([,][0-9]+)?$"))) || (txtNota2.getText().isEmpty() || !(txtNota2.getText().matches("^[0-9]+([,][0-9]+)?$"))) || (txtNota3.getText().isEmpty() || !(txtNota3.getText().matches("^[0-9]+([,][0-9]+)?$"))) ) {
				
				if(txtNota1.getText().isEmpty() || !(txtNota1.getText().matches("^[0-9]+([,][0-9]+)?$")))	
					txtNota1.setBackground(Color.RED);
				
				if(txtNota2.getText().isEmpty() || !(txtNota2.getText().matches("^[0-9]+([,][0-9]+)?$")))	
					txtNota2.setBackground(Color.RED);
				
				if(txtNota3.getText().isEmpty() || !(txtNota3.getText().matches("^[0-9]+([,][0-9]+)?$")))	
					txtNota3.setBackground(Color.RED);
			}
			else {
				double nota1 = Double.parseDouble(txtNota1.getText());
				double nota2 = Double.parseDouble(txtNota2.getText());
				double nota3 = Double.parseDouble(txtNota3.getText());
				
				txtNota1.setBackground(Color.WHITE);
				txtNota2.setBackground(Color.WHITE);
				txtNota3.setBackground(Color.WHITE);
				
				if (nota1 >10 || nota2 > 10 || nota3 > 10) {
					JOptionPane.showMessageDialog(null, "Solo números menores a 10");
				}
				else {
				if (nota1 < 6 || nota2 < 6 || nota3 < 6 || cboTPS.getSelectedItem().toString().matches("Desaprobado")) {
					txtCondicion.setText("Libre");
				}
				else if ((nota1 >= 6 && nota1 <8) || (nota2 >= 6 && nota2 <8) || (nota3>= 6 && nota3 <8) && cboTPS.getSelectedItem().toString().matches("Aprobado")) {
					txtCondicion.setText("Regular");
				}
				else 
					txtCondicion.setText("Promocionado");			
				
				//Calculamos promedio
				double promedio = (nota1 + nota2 + nota3)/3;
				txtPromedio.setText(Double.toString(promedio));
			}
			}
		}
	});
		btnCalcular.setBounds(321, 139, 103, 39);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNota1.setText("");
				txtNota2.setText("");
				txtNota3.setText("");
				txtPromedio.setText("");
				txtCondicion.setText("");
				txtNota1.setBackground(Color.WHITE);
				txtNota2.setBackground(Color.WHITE);
				txtNota3.setBackground(Color.WHITE);
			}
		});
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevo.setBounds(321, 189, 103, 39);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalir.setBounds(321, 239, 103, 39);
		contentPane.add(btnSalir);
	}
}
