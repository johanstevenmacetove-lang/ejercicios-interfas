package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eje0 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TXcuadro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eje0 frame = new eje0();
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
	public eje0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cambiar texto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TXcuadro.getText().equals("¡Hey!")) {
					TXcuadro.setText("hola mundo");
				} else {
					TXcuadro.setText("¡Hey!");
				}
			}
		});
		btnNewButton.setBounds(243, 116, 89, 23);
		contentPane.add(btnNewButton);
		
		TXcuadro = new JTextField();
		TXcuadro.setText("¡Hey!");
		TXcuadro.setBounds(61, 116, 172, 23);
		contentPane.add(TXcuadro);
		TXcuadro.setColumns(10);

	}
}
