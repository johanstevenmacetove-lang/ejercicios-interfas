package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eje1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CTusuario;
	private JTextField CTpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eje1 frame = new eje1();
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
	public eje1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CTusuario = new JTextField();
		CTusuario.setBounds(134, 66, 86, 20);
		contentPane.add(CTusuario);
		CTusuario.setColumns(10);
		
		CTpassword = new JTextField();
		CTpassword.setBounds(134, 127, 86, 20);
		contentPane.add(CTpassword);
		CTpassword.setColumns(10);
		
		JLabel Tpassword = new JLabel("Password");
		Tpassword.setBounds(53, 130, 58, 14);
		contentPane.add(Tpassword);
		
		JLabel Tusuario = new JLabel("Usuario");
		Tusuario.setBounds(53, 69, 46, 14);
		contentPane.add(Tusuario);
		
		JButton Bvalidar = new JButton("validar");
		Bvalidar.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) {
				String usuario = CTusuario.getText();
				String password =CTpassword.getText();
				if(usuario.equals("admin")&&password.equals("admin")) {
					JOptionPane.showInternalMessageDialog(null ,  "Bienvenido");
				}else {
					 JOptionPane.showMessageDialog(null, "User o password desconocido");
				}
			}
		});
		Bvalidar.setBounds(131, 185, 89, 23);
		contentPane.add(Bvalidar);

	}
}
