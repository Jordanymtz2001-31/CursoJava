package com.mx.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		
		//Instanciamos la clase CuentaAhorro
		CuentaAhorrro cuenta1 = new CuentaAhorrro("Juan Perez", 5000.0, 3.5);
		
		//Mostramos
		// Ocupamos el metodo mostrarInfo sin instanciar 
		cuenta1.mostrarInfo();
		
		//Calcular intereses
		System.out.println("Intereses generados: " + cuenta1.calcularIntereses());
		
		

	}

}
