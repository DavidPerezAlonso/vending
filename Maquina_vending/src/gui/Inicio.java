package gui;


public class Inicio {

	
		
	public static void main(String[]args){
		//Inicia el interfaz gráfico
		Vista ventana = new Vista();
		
		// Pone el saldo a 0
		Clasificador clasificador = new Clasificador();
		clasificador.saldo = 0;
		
		//

		
		new Tecla(ventana, clasificador);
		
	}

	
}