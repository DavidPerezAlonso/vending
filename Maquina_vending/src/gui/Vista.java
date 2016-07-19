package gui;
import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Vista extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Container bloqueContenedor = null;
	
	JTextField txtBienvenidoInserteMonedas = null;
	
	// Botones para insertar monedas
	JButton btn20cts = null;
	JButton btn50cts = null;
	JButton btn1eur = null;
	JButton btn2eur = null;
	
	JButton btnDevolver = null;
	
	// Radiobutton para seleccionar la bebida. 
	ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton rdbtnCocacola = null;
	JRadioButton rdbtnFanta = null;
	
	public Vista() {
	
		// Inicializa rl JFrame y el Panel
		setBounds(100, 100, 494, 334);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bloqueContenedor = getContentPane();
		
		txtBienvenidoInserteMonedas = new JTextField();
		txtBienvenidoInserteMonedas.setColumns(10);
		txtBienvenidoInserteMonedas.setText("Wellcome - Insert Coins!!" );
		txtBienvenidoInserteMonedas.setEditable(false); //sólo lectura
		
		btn20cts = new JButton("0,20\u20AC");
		btn50cts = new JButton("0,50\u20AC");
		btn1eur = new JButton("1\u20AC");
		btn2eur = new JButton("2\u20AC");
		
		
		btnDevolver = new JButton("Devolver");
		
		// Inicializa el radiobutton para seleccionar bebidas. Estarán ocultas hasta que se haya insertado alguna moneda
		rdbtnCocacola = new JRadioButton("Coca Cola - 1\u20AC");
		buttonGroup.add(rdbtnCocacola);
		
		rdbtnFanta = new JRadioButton("Naranja - 1\u20AC");
		buttonGroup.add(rdbtnFanta);
		
		// Agrega todo al panel
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnDevolver)
							.addGap(71))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(23)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnCocacola)
								.addComponent(rdbtnFanta))
							.addPreferredGap(ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btn20cts, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btn50cts, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btn1eur, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btn2eur, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
							.addGap(36))))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(107)
					.addComponent(txtBienvenidoInserteMonedas, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(166, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(txtBienvenidoInserteMonedas, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn20cts)
						.addComponent(btn50cts, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnCocacola))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn1eur)
								.addComponent(btn2eur))
							.addGap(18)
							.addComponent(btnDevolver))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnFanta)))
					.addContainerGap(107, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		setVisible(true);
	}
}
