package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class eje2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtTuEleccionEs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eje2 frame = new eje2();
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
	public eje2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Caul es el mejor video-juego");
		lblNewLabel.setBounds(160, 11, 150, 33);
		contentPane.add(lblNewLabel);
		
		JRadioButton Op1 = new JRadioButton("Call of Duty");
		buttonGroup.add(Op1);
		Op1.setBounds(77, 51, 109, 23);
		contentPane.add(Op1);
		
		JRadioButton Op2 = new JRadioButton("Gears of War 2");
		buttonGroup.add(Op2);
		Op2.setBounds(77, 87, 109, 23);
		contentPane.add(Op2);
		
		JRadioButton Op3 = new JRadioButton("hallo");
		buttonGroup.add(Op3);
		Op3.setBounds(77, 119, 109, 23);
		contentPane.add(Op3);
		
		JRadioButton Op4 = new JRadioButton("Red Dead Redemption");
		buttonGroup.add(Op4);
		Op4.setBounds(77, 149, 133, 23);
		contentPane.add(Op4);
		
		txtTuEleccionEs = new JTextField();
		txtTuEleccionEs.setText("Tu eleccion es:");
		txtTuEleccionEs.setBounds(77, 194, 177, 20);
		contentPane.add(txtTuEleccionEs); 
		txtTuEleccionEs.setColumns(10);

		
		Op1.addActionListener(e -> txtTuEleccionEs.setText("Call of Duty"));
		Op2.addActionListener(e -> txtTuEleccionEs.setText("Gears of War 2"));
		Op3.addActionListener(e -> txtTuEleccionEs.setText("Hallo"));
		Op4.addActionListener(e -> txtTuEleccionEs.setText("Red Dead Redemption"));
	}
}
