package guis;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ServicioDeClientePendientes extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTable tblServiciosPendientes;
	DefaultTableModel modelo;
	private JButton btnNewButton;
	private ServicioDeClientesAtendidos sdca = new ServicioDeClientesAtendidos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServicioDeClientePendientes frame = new ServicioDeClientePendientes();
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
	public ServicioDeClientePendientes() {
		setTitle("Servicios pendientes");
		setBounds(100, 100, 1000, 512);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("SERVICIOS PENDIENTES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 960, 21);
		getContentPane().add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 122, 960, 286);
		getContentPane().add(scrollPane);
		
		tblServiciosPendientes = new JTable();
		tblServiciosPendientes.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblServiciosPendientes);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("DNI");
		modelo.addColumn("Nombre y Apellido");
		modelo.addColumn("Telefono");
		modelo.addColumn("Correo");
		modelo.addColumn("Tipo de equipo");
		modelo.addColumn("Marca");
		modelo.addColumn("Num serie");
		modelo.addColumn("F ingreso");
		modelo.addColumn("F entrega");
		modelo.addColumn("Precio");
		modelo.addColumn("Estado");
		tblServiciosPendientes.setModel(modelo);
		
		JButton btnCambiarEstado = new JButton("Marcar como Atendido");
		btnCambiarEstado.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCambiarEstado.setBounds(10, 420, 200, 30);
		getContentPane().add(btnCambiarEstado);
		
		btnNewButton = new JButton("Eliminar");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(335, 420, 200, 30);
		getContentPane().add(btnNewButton);

		btnCambiarEstado.addActionListener(e -> {
			int filaSeleccionada = tblServiciosPendientes.getSelectedRow();
			if (filaSeleccionada != -1) {
				
				//
				Object[] fila = new Object[modelo.getColumnCount()];
				for (int i = 0; i < modelo.getColumnCount(); i++) {
					fila[i] = modelo.getValueAt(filaSeleccionada, i);
				}
				
				//
				fila[10] = "Atendio";
				sdca.agregarServicioAtendido(fila);
				sdca.setVisible(true);
				
				modelo.removeRow(filaSeleccionada);
			}
		});
	}
	
	public void agregarFila(Object[] fila) {
	    modelo.addRow(fila);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		int filaABorrar = tblServiciosPendientes.getSelectedRow();
		if (filaABorrar != -1) {
			modelo.removeRow(filaABorrar);
		}
		
	}
}
