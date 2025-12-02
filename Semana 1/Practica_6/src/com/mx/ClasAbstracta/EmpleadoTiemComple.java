package com.mx.ClasAbstracta;

// Hacemos que la clase EmpleadoTiemComple herede de la clase abstracta Empleado
public class EmpleadoTiemComple extends Empleado {
	
	
	// Constructor vacio
	public EmpleadoTiemComple() {
		
	}
	
	// Constructor con parametros
	public EmpleadoTiemComple(String nombre, int edad, double salario) {
		super(nombre, edad, salario);
	}

	
	// Implementacion del metodo abstracto calcularBonificacion
	@Override
	public double calcularBonificacion() { //No se pasa parametro porque es un metodo de la misma clase
		// Ejemplo: Bonificacion por tiempo completo
		return getSalario() * 0.20; // 20% del salario
	}
	
	// Metodo toString	
	@Override
	public String toString() {
		return "EmpleadoTiemComple [nombre=" + getNombre() + ", edad=" + getEdad() + ", salario=" + getSalario() + "]";
	}

}
