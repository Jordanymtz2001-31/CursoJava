package com.mx.ClasAbstracta;

public class Principal {

	public static void main(String[] args) {
		// Instanciamos un objeto de la clase EmpleadoTiemComple
		System.out.println("----EMPLEADOS DE TIEMPO COMPLETO----\n");
		EmpleadoTiemComple empleado1 = new EmpleadoTiemComple("Luis", 30, 1200);
		System.out.println(empleado1);
		
		// Accedemos al metodo calcularBonificacion (abstracto implementado)
		double bonificacion1 = empleado1.calcularBonificacion();
		System.out.println("La bonificacion es de: " + bonificacion1 );
		System.out.println("El total a recibir es de: " + (empleado1.getSalario() + bonificacion1));
		
		
		// Instanciamos un objeto de la clase EmpleadoxHora
		System.out.println("\n----EMPLEADOS POR AÑOS----\n");
		EmpleadoxHora empleado2 = new EmpleadoxHora("Ana", 22, 1500);
		System.out.println(empleado2);
		

		// Accedemos al metodo calcularBonificacion (abstracto implementado)
		double bonificacion2 = empleado2.calcularBonificacion();
		
		System.out.println("La bonificacion es de: " + bonificacion2);
		
		// Otro empleado 
		EmpleadoxHora empleado3 = new EmpleadoxHora("Carlos", 28, 1500);
		System.out.println(empleado3);

		// Accedemos al metodo calcularBonificacion (abstracto implementado)
		double bonificacion3 = empleado3.calcularBonificacion();
		System.out.println("La bonificacion es de: " + bonificacion3);

	}

}
