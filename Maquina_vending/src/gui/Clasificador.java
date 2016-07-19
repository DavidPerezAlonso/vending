package gui;

public class Clasificador {
	double saldo;
	
	public double insertarMoneda(double Moneda){
		
		this.saldo += Moneda;
		System.out.println(this.saldo);
		return (this.saldo);
	}
	
	public void retornarMonedas(){
		
		this.saldo = 0;
		
	}
	
	public void seleccionarProducto(){
		
	}
	
	public String saldotoString(){
		Double varSaldo = new Double(this.saldo);
				
		return (varSaldo.toString());
		
	}
}
