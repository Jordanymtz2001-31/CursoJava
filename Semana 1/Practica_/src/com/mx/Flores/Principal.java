package com.mx.Flores;

public class Principal {

	public static void main(String[] args) {
		// Instanciamos la implementacion
		Implementacion metod = new Implementacion();
		
		//Creamos un objeto auxiliar para buscar
		Flores aux = null;
		
		// Llamamos a los metodos y agregamos flores
		metod.agregar(new Flores(1, "Rosa", true, 15.5, "Rojo"));
		metod.agregar(new Flores(2, "Margarita", false, 10.0, "Blanco"));
		metod.agregar(new Flores(3, "Tulipan", true, 12.0, "Amarillo"));
		metod.agregar(new Flores(4, "Girasol", false, 8.5, "Amarillo"));
		metod.agregar(new Flores(5, "Lirio", true, 20.0, "Morado"));
		
		//Mostrar flores
		metod.mostrar();
		
		//Buscar una flor
		aux = new Flores(3); // Creamos el objeto con la clave
		aux = metod.buscar(aux); // Lo buscamos
		System.out.println("\nFlor encontrada: " + aux);
		
		//Editar una flor 
		aux = new Flores(2);
		aux = metod.buscar(aux); // Lo buscamos para tener todos sus datos y que no se pierdan
		aux.setNombre("Margarita Grande");
		metod.modificar(aux);
		System.out.println("\nFlor modificada: " + aux);
				
		//Editamos un atributo del objeto
		aux = new Flores(5); // Creamos el objeto con la clave
		aux = metod.buscar(aux); // Lo buscamos para tener todos sus datos 
		aux.setColor("Blanco"); // Cambiamos el color de morado a blanco
		metod.modificar(aux); // Lo modificamos
		System.out.println("\nSolo se modifico el color: " + aux);

		//Eliminar una flor
		aux = new Flores(4); // Creamos el objeto con la clave, es por decir que desde consola le damos la clave
		aux = metod.buscar(aux); // Lo buscamos para tener todos sus datos
		metod.eliminar(aux); // Lo eliminamos
		System.out.println("\nFlor eliminada: " + aux);
		metod.mostrar(); // Mostramos la lista actualizada

		// Contar flores
		System.out.println("Total de flores: " + metod.contarFlores());

	}

}
