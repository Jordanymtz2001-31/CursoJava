package com.mx.Libro;

public class Principal {

	public static void main(String[] args) {
		// Intanciar la implementacion
		Implementacion metod = new Implementacion();
		
		// Instanciamos objetos Libro
		Libro libro1 = new Libro(101, "Cien Años de Soledad", "Gabriel García Márquez", "Sudamericana", 250.0);
		Libro libro2 = new Libro(102, "Don Quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", 300.0);
		Libro libro3 = new Libro(103, "IT", "Stephen King", "penguin", 800.50);
		Libro libro4 = new Libro(104, "La Niebla", "Stephen King", "penguin", 503.80);
		Libro libro5 = new Libro(105, "Harry Potter y el Caliz de Fuego","J.K Rowling", "Ingles", 450.20);
		Libro libro6 = new Libro(106, "Las Battalas en el Desierto", "José Emilio Pacheco", "Mexicanas", 100);
		
		// Creamos el objeto auxiliar, esto nos ayudara a realizar las operaciones
		Libro aux = null;
		
		// Agregar libros al mapa
		metod.agregar(libro1);
		metod.agregar(libro2);
		metod.agregar(libro3);
		metod.agregar(libro4);
		metod.agregar(libro5);
		metod.agregar(libro6);
		
		//Mostrar
		metod.mostrar();
		
		// Buscar, pero necesitamos crear un constructor que solo reciba la clave por que asi lo buscamos
		aux = new Libro(102);
		aux = metod.buscar(aux);
		System.out.println("\nLibro encontrado: " + aux );
		
		// Modificar un libro completo
		aux = new Libro(103, "IT 2", "Stephen King", "penguin", 900.75);
		metod.modificar(aux);
		System.out.println("\nLibro modificado: " + aux);
		
		//Modificar otro libro pero podemos cambiar varios datos
		aux = new Libro(104); // Ocupamos el constructor que solo recibe la clave
		aux = metod.buscar(aux); // De ahi lo buscamos para tener todos sus datos
		aux.setPrecio(600.40); // Y poder cambiar lo que queramos
		metod.modificar(aux); // Finalmente lo modificamos con el metodo modificar y le pasamos el objeto aux
		System.out.println("\nSolo se modifico el precio: " + aux);
		
		// Eliminar un libro
		aux = new Libro(106); // Creamos el objeto con la clave del libro a eliminar
		aux = metod.buscar(aux); // Lo buscamos para tener todos sus datos
		metod.eliminar(aux); // Lo eliminamos con el metodo eliminar
		System.out.println("\nLibro eliminado: " + aux);
		metod.mostrar(); // Mostramos la lista actualizada
		
		//Contar libros
		metod.contarLibros();
		System.out.println("\nTotal de libros en el mapa: " + metod.contarLibros());
		
	}

}
