package guis;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class RegistroClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lblTituloForm;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_10;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JComboBox<String> cmbTipoDeEquipo;
	private JComboBox<String> cmbMarca;
	private JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroClientes frame = new RegistroClientes();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistroClientes() {
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		setTitle("Registro");
		setBounds(100, 100, 800, 512);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		//Icono formulario
		ImageIcon iconRegistro = new ImageIcon(RegistroClientes.class.getResource("/sources/IconRegistro.png"));
		Image iconRedimension = iconRegistro.getImage().getScaledInstance(50,50 , Image.SCALE_SMOOTH);
		ImageIcon iconoRedimencionado = new ImageIcon(iconRedimension);
		lblTituloForm = new JLabel("  FORMULARIO DE REGISTRO");
		lblTituloForm.setIcon(iconoRedimencionado);
		lblTituloForm.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTituloForm.setBounds(45, 11, 406, 51);
		getContentPane().add(lblTituloForm);
		
		lblNewLabel = new JLabel("Nombre completo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(45, 167, 120, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("DNI");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(44, 129, 91, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Teléfono");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(385, 129, 120, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Correo electrónico");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(385, 167, 120, 14);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Tipo de equipo");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(45, 291, 120, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Marca");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(45, 335, 120, 14);
		getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Numero de serie");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(45, 378, 120, 14);
		getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_8 = new JLabel("Fecha de ingreso");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(385, 291, 120, 14);
		getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Fecha de entrega");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_9.setBounds(385, 335, 120, 14);
		getContentPane().add(lblNewLabel_9);
		
		lblNewLabel_7 = new JLabel("DATOS DEL CLIENTE");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(45, 90, 175, 14);
		getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_10 = new JLabel("DATOS DEL CLIENTE");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(45, 251, 175, 14);
		getContentPane().add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setBounds(175, 162, 175, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(175, 127, 175, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(515, 127, 175, 26);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(515, 165, 175, 26);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(175, 373, 175, 26);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(515, 286, 175, 26);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(515, 330, 175, 26);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		cmbTipoDeEquipo = new JComboBox<String>();
		cmbTipoDeEquipo.setModel(new DefaultComboBoxModel<String>(new String[] {"Laptop", "Computadora de escritorio"}));
		cmbTipoDeEquipo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cmbTipoDeEquipo.setBounds(175, 286, 175, 26);
		getContentPane().add(cmbTipoDeEquipo);
		
		cmbMarca = new JComboBox<String>();
		cmbMarca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cmbMarca.setModel(new DefaultComboBoxModel<String>(new String[] {"HP", "Lenovo", "Asus", "Acer", "MSI", "Huawei"}));
		cmbMarca.setBounds(175, 330, 175, 26);
		getContentPane().add(cmbMarca);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegistrar.setBounds(515, 371, 110, 32);
		getContentPane().add(btnRegistrar);
		


	}


}
