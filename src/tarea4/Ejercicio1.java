package tarea4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textTelefono;
	private JTextField textFNac;
			
	public Ejercicio1() {
		setFont(new Font("Tahoma", Font.PLAIN, 12));
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setBounds(86, 27, 62, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblApellido.setBounds(86, 67, 62, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelfono.setBounds(86, 107, 62, 14);
		contentPane.add(lblTelfono);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac:");
		lblFechaNac.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFechaNac.setBounds(86, 147, 80, 14);
		contentPane.add(lblFechaNac);
		
		textNombre = new JTextField();
		textNombre.setForeground(new Color(0, 0, 0));
		textNombre.setBounds(206, 25, 120, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(206, 65, 120, 20);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(206, 105, 120, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		textFNac = new JTextField();
		textFNac.setBounds(206, 145, 120, 20);
		contentPane.add(textFNac);
		textFNac.setColumns(10);
		
		JLabel lblDatos = new JLabel("Los datos ingresados fueron:");
		lblDatos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDatos.setBounds(10, 236, 414, 14);
		contentPane.add(lblDatos);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(textNombre.getText().isEmpty() || textApellido.getText().isEmpty() || textTelefono.getText().isEmpty() || textFNac.getText().isEmpty()) {	
				
				if (textNombre.getText().isEmpty())
					textNombre.setBackground(Color.RED);
				else
					textNombre.setBackground(Color.WHITE);
				
				if(textApellido.getText().isEmpty()) 
					textApellido.setBackground(Color.RED);	
				else
					textApellido.setBackground(Color.WHITE);
				
				if (textTelefono.getText().isEmpty())
					textTelefono.setBackground(Color.RED);
				else
					textTelefono.setBackground(Color.WHITE);
				
				if (textFNac.getText().isEmpty())
					textFNac.setBackground(Color.RED);
				else
					textFNac.setBackground(Color.WHITE);
			}
				else {
				String datos;
				datos = textNombre.getText() + " " + textApellido.getText() + " - " + textTelefono.getText() + " - " + textFNac.getText();
				textNombre.setText("");
				textNombre.setBackground(Color.WHITE);
				textApellido.setText("");
				textApellido.setBackground(Color.WHITE);
				textTelefono.setText("");
				textTelefono.setBackground(Color.WHITE);
				textFNac.setText("");
				textFNac.setBackground(Color.WHITE);
				
				lblDatos.setText("Los datos ingresados fueron: " + datos);
				}
			}
		});
		btnMostrar.setBackground(Color.LIGHT_GRAY);
		btnMostrar.setForeground(Color.BLACK);
		btnMostrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMostrar.setBounds(237, 187, 89, 23);
		contentPane.add(btnMostrar);
		
		
	}
}
