package guis;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;


import arreglo.ArregloClientes;
import clases.ClaseRegistro;

//import clases.ClaseRegistro;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class RegistroClientes extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private static final String String = null;
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
	private JTextField txtNombreCompleto;
	private JTextField txtDni;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtNumSerie;
	private JTextField txtFechaIngreso;
	private JTextField txtFechaEntrega;
	private JComboBox<String> cmbTipoDeEquipo;
	private JComboBox<String> cmbMarca;
	private JButton btnRegistrar;
	private JLabel lblNewLabel_11;
	private JTextField txtPrecio;
	private ServicioDeClientePendientes scp = new ServicioDeClientePendientes();
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
		setBounds(100, 100, 800, 527);
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
		
		txtNombreCompleto = new JTextField();
		txtNombreCompleto.setBounds(175, 162, 175, 26);
		getContentPane().add(txtNombreCompleto);
		txtNombreCompleto.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setBounds(175, 127, 175, 26);
		getContentPane().add(txtDni);
		txtDni.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(515, 127, 175, 26);
		getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(515, 165, 175, 26);
		getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtNumSerie = new JTextField();
		txtNumSerie.setBounds(175, 373, 175, 26);
		getContentPane().add(txtNumSerie);
		txtNumSerie.setColumns(10);
		
		txtFechaIngreso = new JTextField();
		txtFechaIngreso.setEditable(false);
		txtFechaIngreso.setBounds(515, 286, 175, 26);
		txtFechaIngreso.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		getContentPane().add(txtFechaIngreso);
		txtFechaIngreso.setColumns(10);
		
		txtFechaEntrega = new JTextField();
		txtFechaEntrega.setBounds(515, 330, 175, 26);
		getContentPane().add(txtFechaEntrega);
		txtFechaEntrega.setColumns(10);
		
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
		btnRegistrar.addActionListener(this);
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrar.setBounds(515, 422, 175, 36);
		getContentPane().add(btnRegistrar);	
		
		lblNewLabel_11 = new JLabel("Precio de servicio");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11.setBounds(385, 380, 120, 14);
		getContentPane().add(lblNewLabel_11);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(515, 375, 86, 26);
		getContentPane().add(txtPrecio);

	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrar) {
			actionPerformedBtnRegistrar(e);
		}
	}
	protected void actionPerformedBtnRegistrar(ActionEvent e) {
	    // 1. Validate DNI
	    String dniStr = txtDni.getText().trim();
	    if (dniStr.isEmpty() || !dniStr.matches("\\d{8}")) {
	        JOptionPane.showMessageDialog(this, "Ingrese un DNI válido de 8 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
	        txtDni.requestFocus();
	        return;
	    }
	    // 2. Validate Nombre
	    if (txtNombreCompleto.getText().trim().isEmpty()) {
	        JOptionPane.showMessageDialog(this, "Ingrese el nombre completo.", "Error", JOptionPane.ERROR_MESSAGE);
	        txtNombreCompleto.requestFocus();
	        return;
	    }
	    // 3. Validate Teléfono
	    String telefonoStr = txtTelefono.getText().trim();
	    if (telefonoStr.isEmpty() || !telefonoStr.matches("\\d{9}")) {
	        JOptionPane.showMessageDialog(this, "Ingrese un número de teléfono válido (9 dígitos).", "Error", JOptionPane.ERROR_MESSAGE);
	        txtTelefono.requestFocus();
	        return;
	    }
	    // 4. Validate Correo
	    String correo = txtCorreo.getText().trim();
	    if (correo.isEmpty() || !correo.matches("^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$")) {
	        JOptionPane.showMessageDialog(this, "Ingrese un correo electrónico válido.", "Error", JOptionPane.ERROR_MESSAGE);
	        txtCorreo.requestFocus();
	        return;
	    }
	    // 5. Validate Número de serie
	    if (txtNumSerie.getText().trim().isEmpty()) {
	        JOptionPane.showMessageDialog(this, "Ingrese el número de serie.", "Error", JOptionPane.ERROR_MESSAGE);
	        txtNumSerie.requestFocus();
	        return;
	    }
	    // 6. Validate Fecha de entrega
	    if (txtFechaEntrega.getText().trim().isEmpty()) {
	        JOptionPane.showMessageDialog(this, "Ingrese la fecha de entrega.", "Error", JOptionPane.ERROR_MESSAGE);
	        txtFechaEntrega.requestFocus();
	        return;
	    }
	    // 7. Validate Precio
	    String precioStr = txtPrecio.getText().trim();
	    double precio = 0;
	    try {
	        precio = Double.parseDouble(precioStr);
	        if (precio <= 0) throw new Exception();
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(this, "Ingrese un precio válido (mayor a cero).", "Error", JOptionPane.ERROR_MESSAGE);
	        txtPrecio.requestFocus();
	        return;
	    }

	    // If all validations pass, proceed to register
	    ClaseRegistro clr = new ClaseRegistro(
	        Integer.parseInt(dniStr),
	        txtNombreCompleto.getText().trim(),
	        Integer.parseInt(telefonoStr),
	        correo,
	        leerTipDeEquipo(),
	        leerMarcaElegida(),
	        txtNumSerie.getText().trim(),
	        leerFechaDeIngreso(),
	        txtFechaEntrega.getText().trim(),
	        precio
	    );
	    arl.adicionar(clr);
	    listar();
	    limpieza();
	    scp.setVisible(true);
	}

	
	ArregloClientes arl = new ArregloClientes();
	void listar() {
		scp.modelo.setRowCount(0);
   		for (int i = 0; i < arl.tamanio(); i++) {
			Object[] fila= {arl.obtener(i).getDni(),
							arl.obtener(i).getNombre(),
							arl.obtener(i).getTelefono(),
							arl.obtener(i).getCorreo(),
							arl.obtener(i).equipoelegido(i),
							arl.obtener(i).marcaElegida(i),
							arl.obtener(i).getNumeroDeSerie(),
							arl.obtener(i).getFechaDeIngreso(),
							arl.obtener(i).getFechaDeEntrega(),
							arl.obtener(i).getPrecio(),
							"Pendiente"
			};
			scp.modelo.addRow(fila);
		}
	}
	
	//limpiar cajas de texto
	void limpieza() {
		txtDni.setText("");
		txtNombreCompleto.setText("");
		txtTelefono.setText("");
		txtCorreo.setText("");
		txtNumSerie.setText("");
		txtFechaEntrega.setText("");
		txtPrecio.setText("");
		
	}
	

	int leerDNI() {
		return Integer.parseInt(txtDni.getText().trim());
	}
	
	String leerNombre() {
		return txtNombreCompleto.getText().trim();
	}
	
	int leerTelefono() {
		return Integer.parseInt(txtTelefono.getText().trim());
	}
	
	int leerTipDeEquipo() {
		return cmbTipoDeEquipo.getSelectedIndex();
	}
	
	int leerMarcaElegida() {
		return cmbMarca.getSelectedIndex();
		
	}
	
	String leerCorreo() {
		return txtCorreo.getText().trim();
	}
	
	String leerNSerie() {
		return txtNumSerie.getText();
	}
	
	String leerFechaDeIngreso() {
		String fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		txtFechaIngreso.setText(fecha);
		return fecha;
	}
	
	String leerFechaDeEntrega() {
		return txtFechaEntrega.getText();
	}
	double leerPrecio() {
		return Double.parseDouble(txtPrecio.getText());
	}
}
