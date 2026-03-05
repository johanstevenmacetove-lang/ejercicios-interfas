package Ejercicios;

import java.awt.EventQueue;
import javax.swing.*;

public class eje3 extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7314406744335179442L;
	private JPanel contentPane;
    private JTextField txtNombre;
    private JTextField txtApellido1;
    private JTextField txtApellido2;
    private JTextField txtEdad;
    private JTextField txtDocumento;
    private JTextField txtResultado;
    private JComboBox<String> comboTipo;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                eje3 frame = new eje3();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public eje3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 400);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Etiquetas y campos
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 30, 80, 25);
        contentPane.add(lblNombre);
        txtNombre = new JTextField();
        txtNombre.setBounds(120, 30, 200, 25);
        contentPane.add(txtNombre);

        JLabel lblApellido1 = new JLabel("Apellido 1:");
        lblApellido1.setBounds(30, 70, 80, 25);
        contentPane.add(lblApellido1);
        txtApellido1 = new JTextField();
        txtApellido1.setBounds(120, 70, 200, 25);
        contentPane.add(txtApellido1);

        JLabel lblApellido2 = new JLabel("Apellido 2:");
        lblApellido2.setBounds(30, 110, 80, 25);
        contentPane.add(lblApellido2);
        txtApellido2 = new JTextField();
        txtApellido2.setBounds(120, 110, 200, 25);
        contentPane.add(txtApellido2);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(30, 150, 80, 25);
        contentPane.add(lblEdad);
        txtEdad = new JTextField();
        txtEdad.setBounds(120, 150, 50, 25);
        contentPane.add(txtEdad);

        JLabel lblTipo = new JLabel("Tipo:");
        lblTipo.setBounds(30, 190, 80, 25);
        contentPane.add(lblTipo);
        comboTipo = new JComboBox<>();
        comboTipo.addItem("DNI");
        comboTipo.addItem("NIE");
        comboTipo.setBounds(120, 190, 80, 25);
        contentPane.add(comboTipo);

        JLabel lblDocumento = new JLabel("Número:");
        lblDocumento.setBounds(30, 230, 80, 25);
        contentPane.add(lblDocumento);
        txtDocumento = new JTextField();
        txtDocumento.setBounds(120, 230, 120, 25);
        contentPane.add(txtDocumento);

        // Botones
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(50, 270, 100, 30);
        contentPane.add(btnAceptar);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(200, 270, 100, 30);
        contentPane.add(btnLimpiar);

        // Campo para mostrar resultados
        txtResultado = new JTextField();
        txtResultado.setBounds(30, 320, 350, 25);
        txtResultado.setEditable(false);
        contentPane.add(txtResultado);

        // Acción del botón Aceptar
        btnAceptar.addActionListener(e -> {
            String nombre = txtNombre.getText();
            String ap1 = txtApellido1.getText();
            String ap2 = txtApellido2.getText();
            String edad = txtEdad.getText();
            String tipo = comboTipo.getSelectedItem().toString();
            String numero = txtDocumento.getText();

            // Validar DNI
            if(tipo.equals("DNI") && numero.matches("\\d{8}[A-Za-z]")) {
                JOptionPane.showMessageDialog(null, "DNI correcto. ");
                return;
            }else {
            	JOptionPane.showMessageDialog(null, "DNI inorrecto. ");
            }

          
        });

        // Acción del botón Limpiar
        btnLimpiar.addActionListener(e -> {
            txtNombre.setText("");
            txtApellido1.setText("");
            txtApellido2.setText("");
            txtEdad.setText("");
            txtDocumento.setText("");
            txtResultado.setText("");
            comboTipo.setSelectedIndex(0);
        });
    }
}