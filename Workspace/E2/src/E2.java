import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class E2 extends JFrame {

	private JPanel contentPane;
	private ButtonGroup botones= new ButtonGroup();

	public E2() {
		setTitle("Regalos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Genero = new JLabel("G\u00E9nero");
		Genero.setBounds(30, 24, 50, 22);
		contentPane.add(Genero);
		
		JRadioButton Femenino = new JRadioButton("Femenino");
		Femenino.setBounds(135, 24, 80, 22);
		contentPane.add(Femenino);
		
		JRadioButton Masculino = new JRadioButton("Masculino");
		Masculino.setBounds(232, 20, 89, 30);
		contentPane.add(Masculino);
		
		JRadioButton Neutro = new JRadioButton("Neutro");
		Neutro.setBounds(332, 24, 96, 23);
		contentPane.add(Neutro);
		
		botones.add(Femenino);
		botones.add(Masculino);
		botones.add(Neutro);
		
		JButton btnBuscarRegalo = new JButton("Buscar Regalo");
		btnBuscarRegalo.setBounds(60, 211, 122, 23);
		contentPane.add(btnBuscarRegalo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(282, 211, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel TipoDeRegalo = new JLabel("Tipo de Regalo");
		TipoDeRegalo.setBounds(30, 87, 80, 14);
		contentPane.add(TipoDeRegalo);
		
		JComboBox lisTipo = new JComboBox();
		lisTipo.setModel(new DefaultComboBoxModel(new String[] {"Moda", "Decoraci\u00F3n", "Jard\u00EDn", "Pr\u00E1ctico"}));
		lisTipo.setBounds(135, 84, 80, 20);
		contentPane.add(lisTipo);
		
		JLabel lblColorFavorito = new JLabel("Color Favorito");
		lblColorFavorito.setBounds(30, 142, 80, 14);
		contentPane.add(lblColorFavorito);
		
		JComboBox color = new JComboBox();
		color.setModel(new DefaultComboBoxModel(new String[] {"Rojo", "Rosa", "Violeta", "Amarillo", "Azul", "Gris", "Negro", "Blanco", "Marr\u00F3n", "Naranja", "Verde"}));
		color.setBounds(135, 139, 80, 20);
		contentPane.add(color);
		
		
	}
}
