package com.mx.Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		//Generear in arreglo de Automoviles
		Automovil[] automoviles = new Automovil[4];
		
		// Creamos objetos de cada clase
		automoviles[0] = new Turismo("Toyota", "Corolla", 2020, 5);
		automoviles[1] = new Deportivo("Ferrari", "488 GTB", 2019, 330);
		automoviles[2] = new Camioneta("Ford", "F-150", 2021, 1000);
		automoviles[3] = new Automovil("Honda", "Civic", 2018);
		
		// Iteramos el arreglo y mostramos la informacion de cada automovil
		for(Automovil auto : automoviles) {
			System.out.println(auto.mostrarInfo());
			System.out.println(auto);
			System.out.println("-------------------------");
		}

	}

}
