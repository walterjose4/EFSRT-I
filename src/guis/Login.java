package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtUser;
	private JLabel lblIconoUser;
	private JLabel lblIconPassword;
	private JPasswordField passwordField;
	private JButton btnIngresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocation(null);
		setBounds(100, 100, 361, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Icono de user
		ImageIcon user = new ImageIcon(Login.class.getResource("/sources/User2.png"));
		Image userRedimensionada = user.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		ImageIcon userRedimensionado = new ImageIcon(userRedimensionada);
		lblIconoUser = new JLabel("");
		lblIconoUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconoUser.setBounds(142, 72, 63, 47);
		lblIconoUser.setIcon(userRedimensionado);
		contentPane.add(lblIconoUser);
		
		lblNewLabel = new JLabel("  Usuario");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(97, 113, 148, 28);
		contentPane.add(lblNewLabel);
		
		//Icono de password
		ImageIcon password = new ImageIcon(Login.class.getResource("/sources/Password.png "));
		Image passwordRedimencionar = password.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		ImageIcon passwordRedimensionado = new ImageIcon(passwordRedimencionar);
		
		lblIconPassword = new JLabel("");
		lblIconPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconPassword.setBounds(139, 183, 63, 47);
		lblIconPassword.setIcon(passwordRedimensionado);
		contentPane.add(lblIconPassword);
		
		lblNewLabel_1 = new JLabel("  Contraseña");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(96, 223, 149, 28);
		contentPane.add(lblNewLabel_1);
		
		txtUser = new JTextField();
		txtUser.setBounds(97, 145, 148, 28);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(97, 251, 148, 28);
		contentPane.add(passwordField);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(118, 310, 110, 34);
		contentPane.add(btnIngresar);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(e);
		}
	}
	int contador = 3;
	protected void do_btnIngresar_actionPerformed(ActionEvent e) {
		validacionContrasenia();
	}
	
	//Validacion de credenciales
	public void validacionContrasenia() {
		String user =obtenerUsuario();
		char[] password = obtenerContraseña();
		String userOriginal = "admin";
		String passwordOriginal = "123";
		
		String converString = String.valueOf(password);
		if (user.equals(userOriginal) && converString.equals(passwordOriginal)) {
			JOptionPane.showMessageDialog(null, "Usurario y contraseña validados");
			Principal p = new Principal();
			p.setVisible(true);
			dispose();
		} else { 
				if (contador >= 0) {
					JOptionPane.showMessageDialog(null,"Contraseña incorrecta te quedan " + contador + " intentos");
					contador--;
				} if (contador < 0) {
					JOptionPane.showMessageDialog(null,"Usuario y contraseña bloqueados, contacte a soporte");
				}		
		}
	}
	
	//metodos
	public String obtenerUsuario() {
		String user = txtUser.getText();
		return user;
	}
	
	public char[] obtenerContraseña() {
		char[] password = passwordField.getPassword();
		return password;
	}
}
