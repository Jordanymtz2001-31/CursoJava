package com.mx.ClasAbstracta;

// Heredamos de la clase abstracta Empleado 
public class EmpleadoxHora extends Empleado {
	
	// Contrusctor vacio
	public EmpleadoxHora() {
	}
	
	// Constructor con parametros
	public EmpleadoxHora(String nombre, int edad, double salario) {
		super(nombre, edad, salario);
	}
	
	
	// Implementacion del metodo abstracto calcularBonificacion
	@Override
	public double calcularBonificacion() {
		if(getEdad() > 25) {
			return getSalario() + 100 ; // Bonifiacion del 100 pesos extras
		} else {
			return getSalario() ; // Sin bonificacion
		}
	}
	
	

}
