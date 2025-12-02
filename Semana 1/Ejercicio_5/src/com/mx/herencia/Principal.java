package com.mx.herencia;

public class Principal {

	public static void main(String[] args) {
		// Instanciamos la clase hija
		
		Hijo hijo1 = new Hijo("Rau", "Martinez", 12, 1.50, "Mexicana", "Futbol", "Delgado", "Cafes");
		System.out.println(hijo1);
		hijo1.setHobbie("Videojuegos");
		hijo1.setComplexion("Delgado");
		System.out.println(hijo1);
		hijo1.trabajar();

	}

}
