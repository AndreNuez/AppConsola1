package tarea4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoras;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String SO;
	private String Esp;
	private String hs;
	
	public Ejercicio3() {
		setTitle("Selecci\u00F3n M\u00FAltiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 414, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblElijeUnSistema = new JLabel("Elije un sistema operativo:");
		lblElijeUnSistema.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblElijeUnSistema.setBounds(30, 15, 156, 14);
		panel.add(lblElijeUnSistema);
		
		JRadioButton rdbtnWin = new JRadioButton("Windows");
		buttonGroup.add(rdbtnWin);
		rdbtnWin.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnWin.setBounds(192, 11, 80, 23);
		panel.add(rdbtnWin);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		buttonGroup.add(rdbtnMac);
		rdbtnMac.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnMac.setBounds(274, 11, 52, 23);
		panel.add(rdbtnMac);
		
		JRadioButton rdbtnLin = new JRadioButton("Linux");
		buttonGroup.add(rdbtnLin);
		rdbtnLin.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnLin.setBounds(328, 11, 69, 23);
		panel.add(rdbtnLin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 72, 414, 96);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad:");
		lblElijeUnaEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblElijeUnaEspecialidad.setBounds(30, 42, 136, 14);
		panel_1.add(lblElijeUnaEspecialidad);
		
		JCheckBox chckbxProg = new JCheckBox("Programaci\u00F3n");
		chckbxProg.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxProg.setBounds(225, 7, 116, 23);
		panel_1.add(chckbxProg);
		
		JCheckBox chckbxAdmin = new JCheckBox("Administraci\u00F3n");
		chckbxAdmin.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxAdmin.setBounds(225, 35, 116, 23);
		panel_1.add(chckbxAdmin);
		
		JCheckBox chckbxDG = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDG.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxDG.setBounds(225, 64, 116, 23);
		panel_1.add(chckbxDG);
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador:");
		lblCantidadDeHoras.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidadDeHoras.setBounds(40, 193, 216, 14);
		contentPane.add(lblCantidadDeHoras);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(266, 190, 86, 20);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtHoras.getText().matches("[0-9]*")) {
					txtHoras.setBackground(Color.WHITE);
					hs = txtHoras.getText() + " Hs";
					
					if(rdbtnWin.isSelected()) {
						SO = rdbtnWin.getText();
					}else if (rdbtnMac.isSelected()) {
						SO = rdbtnMac.getText();
					}else
						SO = rdbtnLin.getText();
					
					if(chckbxProg.isSelected()){
						Esp = " - " + chckbxProg.getText();
					} if(chckbxAdmin.isSelected()) {
						Esp = Esp + " - " + chckbxAdmin.getText();
					} if(chckbxDG.isSelected()) {
						Esp = Esp + " - " + chckbxDG.getText();
					}
					
					JOptionPane.showMessageDialog(null, SO + Esp + " - " + hs);
					Esp = "";
					hs = "";
					txtHoras.setText("");
					
					rdbtnWin.setSelected(false);
					rdbtnMac.setSelected(false);
					rdbtnLin.setSelected(false);
					
					chckbxProg.setSelected(false);
					chckbxAdmin.setSelected(false);
					chckbxDG.setSelected(false);
				}else {
					txtHoras.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "Solo valores numéricos");
					Esp = "";
					hs = "";
				}
			}		
		});
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAceptar.setBounds(306, 227, 89, 23);
		contentPane.add(btnAceptar);
	}
}
