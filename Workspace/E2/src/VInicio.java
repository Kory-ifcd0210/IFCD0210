import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class VInicio extends JFrame {

	private JPanel contentPane;
	public static JTextField txtusuario;
	public static JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VInicio frame = new VInicio();
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
	public VInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(106, 58, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(84, 108, 68, 14);
		contentPane.add(lblContrasea);
		
		txtusuario = new JTextField();
		txtusuario.setBounds(159, 55, 86, 20);
		contentPane.add(txtusuario);
		txtusuario.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(162, 105, 83, 20);
		contentPane.add(pass);
		
		final DatosUsuario data=new DatosUsuario();
		final E2 window2=new E2();
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(data.probarPass()==1) {
					JOptionPane.showMessageDialog(null, "Bienvenido al buscador de regalos");
					window2.setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
				}
			}
		});
		btnEntrar.setBounds(79, 184, 89, 23);
		contentPane.add(btnEntrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(250, 184, 89, 23);
		contentPane.add(btnSalir);
	}
}
