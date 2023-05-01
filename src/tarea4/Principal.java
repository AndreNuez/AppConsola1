package tarea4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final Ejercicio1 ej1 = new Ejercicio1();
		final Ejercicio2 ej2 = new Ejercicio2();
		final Ejercicio3 ej3 = new Ejercicio3();
		
		JLabel lblGrupo = new JLabel("GRUPO NRO: 5");
		lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGrupo.setBounds(10, 11, 140, 29);
		contentPane.add(lblGrupo);
		
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ej1.setVisible(true);
			}
		});
		btnEjercicio1.setBackground(Color.LIGHT_GRAY);
		btnEjercicio1.setForeground(Color.BLACK);
		btnEjercicio1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEjercicio1.setBounds(160, 70, 89, 23);
		contentPane.add(btnEjercicio1);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ej2.setVisible(true);
			}
		});
		btnEjercicio2.setBackground(Color.LIGHT_GRAY);
		btnEjercicio2.setForeground(Color.BLACK);
		btnEjercicio2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEjercicio2.setBounds(160, 110, 89, 23);
		contentPane.add(btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ej3.setVisible(true);
			}
		});
		btnEjercicio3.setForeground(Color.BLACK);
		btnEjercicio3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEjercicio3.setBackground(Color.LIGHT_GRAY);
		btnEjercicio3.setBounds(160, 150, 89, 23);
		contentPane.add(btnEjercicio3);
	}
}
