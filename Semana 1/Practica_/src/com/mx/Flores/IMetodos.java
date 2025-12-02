package com.mx.Flores;

public interface IMetodos {
	
	// Metodos abstractos
	public void agregar(Flores flor);
	public void mostrar();
	public void modificar(Flores flor);
	public void eliminar(Flores flor);
	
	// Aqui colocamos Flores para buscar por clave
	public Flores buscar(Flores flor);

}
