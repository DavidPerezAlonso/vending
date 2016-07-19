package gui;

public class Deposito20 {
	double valor = 0.2;
	
	double cantidad;
	
	public void anadir(){
		cantidad++;
	}
	
	public void restar(){
		cantidad--;
	}
	
	// Método que carga o inicaliza las monedas
	public void Iniciar(int NumMonedas){
		this.cantidad = NumMonedas;
	}
	
}
