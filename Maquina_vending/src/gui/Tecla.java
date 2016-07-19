package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.concurrent.*;



public class Tecla implements ActionListener {
	
	Vista ventana = null;
	Clasificador Clasif = null;
	
	
	public Tecla(Vista objVista, Clasificador parClasif){
		
		this.ventana = objVista;
		this.Clasif = parClasif;
					
		actionListener(this); // Escuchador para el botón
	}
		
		
	public void actionListener(ActionListener escuchador){
		ventana.btn20cts.addActionListener(escuchador);
		ventana.btn50cts.addActionListener(escuchador);
		ventana.btn1eur.addActionListener(escuchador);
		ventana.btn2eur.addActionListener(escuchador);
		ventana.btnDevolver.addActionListener(escuchador);
		ventana.rdbtnCocacola.addActionListener(escuchador);
		ventana.rdbtnFanta.addActionListener(escuchador);
		
	}
	
	


	public void actionPerformed(ActionEvent e) {
		/*String tamano = this.objVista.comboBox.getSelectedItem().toString();
		String caracter = this.objVista.comboBox_1.getSelectedItem().toString();
		
		int parint = Integer.parseInt(tamano);
		char parchar = caracter.charAt(0);
				
		if(this.objVista.rdbtnNewRadioButton.isSelected() == false){
			Rectangulo rectangle = new Rectangulo(parint, parint, parchar);
			rectangle.Dibujar();
		}
		else{
			Triangulo triangle = new Triangulo(parint, 'a', parchar);
			triangle.Dibujar();
		}*/
		
		
		Object fuente = e.getSource();
		
		// Teclas de moneda -> InsertarMoneda -> Incrementa saldo
		if (fuente==ventana.btn20cts){
			this.Clasif.insertarMoneda(0.2);
		}
		else if (fuente==ventana.btn50cts){
			this.Clasif.insertarMoneda(0.5);
		}			
		else if (fuente==ventana.btn1eur)
			this.Clasif.insertarMoneda(1);
		else if (fuente==ventana.btn2eur)
			this.Clasif.insertarMoneda(2);
		// Botón devolver pone saldo a 0
		else if (fuente==ventana.btnDevolver){
			this.Clasif.retornarMonedas();			
		}
		else if (ventana.rdbtnFanta.isSelected() == true || ventana.rdbtnCocacola.isSelected() == true){
			System.out.println("Fanta o cocacola");
			
			if(this.Clasif.saldo >= 1.2	){
				//System.out.println("> 1.2");
				ventana.txtBienvenidoInserteMonedas.setText("Su refresco! GRACIAS!");
				this.Clasif.saldo -= 1.2;
				
				
			}
			else{
				//System.out.println("No hay saldo suficiente");
				
				ventana.txtBienvenidoInserteMonedas.setText("Error! No hay saldo suficiente");
				
			}
			
			
			
			try {
				TimeUnit.SECONDS.sleep(5);
			    
			} catch (InterruptedException ex) {
			    //Handle exception
			}
			ventana.buttonGroup.clearSelection();
		}
		
		if(this.Clasif.saldo == 0)
		{
			ventana.txtBienvenidoInserteMonedas.setText("Wellcome!!! Insert Coins!!");
			ventana.rdbtnCocacola.setEnabled(false);
			ventana.rdbtnFanta.setEnabled(false);
		}
		else{
			ventana.rdbtnCocacola.setEnabled(true);
			ventana.rdbtnFanta.setEnabled(true);
			//pantalla.mostrarSaldo();
			ventana.txtBienvenidoInserteMonedas.setText(this.Clasif.saldotoString());
		}
	
	}
		
}

	
		

