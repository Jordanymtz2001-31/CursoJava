package com.mx.Libro;

import java.util.HashMap;

public class Implementacion implements IMetodos {
	
	//Sintaxis del hasmap
	//HashMap<Clave, Valor> nombreDelMapa = new HashMap<Clave, Valor>();
	
	// Declaramos el hashmap
	HashMap<Integer, Libro> mapaLibros = new HashMap<Integer, Libro>();

	@Override
	public void agregar(Libro libro) {
		// Cada libro se agrega al mapa con su clave como llave
		mapaLibros.put(libro.getClave(), libro);
	}

	@Override
	public void mostrar() {
		// Mostramos todos los libros en el mapa
		System.out.println(mapaLibros);
		
	}

	@Override
	public void modificar(Libro libro) {
		// Modificamos el libro en el mapa usando su clave a la que se le asigna el nuevo libro
		// El put sirve para agregar o modificar
		mapaLibros.put(libro.getClave(), libro);
		
	}

	@Override
	public void eliminar(Libro libro) {
		// Eliminamos el libro del mapa usando su clave
		mapaLibros.remove(libro.getClave());
		
	}

	@Override
	public Libro buscar(Libro libro) {
		// Buscamos el libro en el mapa usando su clave
		return mapaLibros.get(libro.getClave());
	}
	
	// Metodo personalizado para contar
	public int contarLibros() {
		return mapaLibros.size();
	}
	
	

}
