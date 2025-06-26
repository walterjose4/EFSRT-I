package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Principal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JLabel lblNewLabel;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					//frame.setExtendedState(MAXIMIZED_BOTH);
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
	public Principal() {
		setTitle("Principal");
		setBounds(100, 100, 800, 512);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Sistema");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Cerrar");
		mntmNewMenuItem.addActionListener(this);
		mnNewMenu.add(mntmNewMenuItem);
		
		mnNewMenu_1 = new JMenu("Clientes");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_1 = new JMenuItem("Registro");
		mntmNewMenuItem_1.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		mnNewMenu_3 = new JMenu("Servicios pendientes");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_3);
		
		mntmNewMenuItem_3 = new JMenuItem("Pendientes");
		mntmNewMenuItem_3.addActionListener(this);
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		mnNewMenu_2 = new JMenu("Servicios atendidos");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_2 = new JMenuItem("Atendidos");
		mntmNewMenuItem_2.addActionListener(this);
		mnNewMenu_2.add(mntmNewMenuItem_2);
		getContentPane().setLayout(null);
		
		ImageIcon servisComputer = new ImageIcon(Principal.class.getResource("/sources/Servis.png"));
		Image servisRedimension = servisComputer.getImage().getScaledInstance(350, 300, Image.SCALE_SMOOTH);
		ImageIcon servisRedimencionado = new ImageIcon(servisRedimension);
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(servisRedimencionado);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 37, 784, 400);
		getContentPane().add(lblNewLabel);
		


	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(e);
		}
		if (e.getSource() == mntmNewMenuItem_1) {
			actionPerformedMntmNewMenuItem_1(e);
		}
		if (e.getSource() == mntmNewMenuItem_2) {
			actionPerformedMntmNewMenuItem_2(e);
		}
		if (e.getSource() == mntmNewMenuItem_3) {
			actionPerformedMntmNewMenuItem_3(e);
		}
	}
	protected void actionPerformedMntmNewMenuItem_1(ActionEvent e) {
		RegistroClientes rc = new RegistroClientes();
		rc.setVisible(true);

	}
	protected void actionPerformedMntmNewMenuItem_2(ActionEvent e) {
		ServicioDeClientesAtendidos rc = new ServicioDeClientesAtendidos();
		rc.setVisible(true);

	}
	protected void actionPerformedMntmNewMenuItem_3(ActionEvent e) {
		ServicioDeClientePendientes rc = new ServicioDeClientePendientes();
		rc.setVisible(true);

	}
	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {
		System.exit(0);
	}
}
