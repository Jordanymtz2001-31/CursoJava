package com.mx.Libro;

public interface IMetodos {
	
	// Metodos abstractos
	public void agregar(Libro libro);
	public void mostrar();
	public void modificar(Libro libro);
	public void eliminar(Libro libro);
	
	// Aqui colocamos Libro para buscar por clave
	public Libro buscar(Libro libro);

}
