package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ServicioDeClientesAtendidos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lblServiciosPendientes;
	
	private int contador = 0;
	private double sumTotal =0;
	private JScrollPane scrollPane;
	private JTextArea txtSAtendidos;
	private JLabel lblClientes;
	private JTextField txtClientes;
	private JLabel lblSumTotal;
	private JTextField txtSumatotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServicioDeClientesAtendidos frame = new ServicioDeClientesAtendidos();
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
	public ServicioDeClientesAtendidos() {
		setTitle("Clientes atendidos");
		setBounds(100, 100, 800, 512);
		getContentPane().setLayout(null);
		
		lblServiciosPendientes = new JLabel("SERVICIOS ATENDIDOS");
		lblServiciosPendientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblServiciosPendientes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblServiciosPendientes.setBounds(10, 25, 764, 21);
		getContentPane().add(lblServiciosPendientes);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 89, 733, 344);
		getContentPane().add(scrollPane);
		
		txtSAtendidos = new JTextArea();
		txtSAtendidos.setFocusable(false);
		scrollPane.setViewportView(txtSAtendidos);
		
		lblClientes = new JLabel("Cant clientes");
		lblClientes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClientes.setBounds(469, 66, 88, 14);
		getContentPane().add(lblClientes);
		
		txtClientes = new JTextField();
		txtClientes.setHorizontalAlignment(SwingConstants.CENTER);
		txtClientes.setEditable(false);
		txtClientes.setFocusable(false);
		txtClientes.setBounds(560, 64, 38, 20);
		getContentPane().add(txtClientes);
		txtClientes.setColumns(10);
		
		lblSumTotal = new JLabel("Sum total");
		lblSumTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSumTotal.setBounds(629, 66, 70, 14);
		getContentPane().add(lblSumTotal);
		
		txtSumatotal = new JTextField();
		txtSumatotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtSumatotal.setEditable(false);
		txtSumatotal.setFocusable(false);
		txtSumatotal.setColumns(10);
		txtSumatotal.setBounds(701, 64, 54, 20);
		getContentPane().add(txtSumatotal);

	}
	
	public void agregarServicioAtendido(Object[] fila) {
		StringBuilder sb = new StringBuilder();
		sb.append("DNI: ").append(fila[0]).append("\n");
		sb.append("Nombre: ").append(fila[1]).append("\n");
		sb.append("Teléfono: ").append(fila[2]).append("\n");
		sb.append("Marca: ").append(fila[5]).append("\n");
		sb.append("Serie: ").append(fila[6]).append("\n");
		sb.append("Precio: S/. ").append(fila[9]).append("\n");
		sb.append("---------------------------------------");
		txtSAtendidos.append(sb.toString()+("\n"));
		double precio = Double.parseDouble(fila[9].toString());
		sumTotal+=precio;
		contador++;
		txtClientes.setText(""+contador);
		txtSumatotal.setText("S/."+sumTotal);
	}
}
