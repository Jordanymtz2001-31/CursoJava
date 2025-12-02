package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Principal.IMetodos;



public class ImplementGeneral implements IMetodos {
	
	// Declaramos una lista para guardar los objetos
	List<Object> listaObjetos = new ArrayList<>();

	@Override
	public void agregar(Object objeto) {
		listaObjetos.add(objeto); //Agregar objeto a la lista
		
	}

	@Override
	public void eliminar(int indice) {
		listaObjetos.remove(indice); // Eliminar objeto de la lista
		
	}

	@Override
	public void modificar(int indice, Object objeto) {
		listaObjetos.set( indice, objeto); // Modificar objeto en la lista
	}

	@Override
	public void mostrar() {
		System.out.println(listaObjetos);
	}

	@Override
	public Object buscar(int indice) {
		return listaObjetos.get(indice); // Buscar objeto en la lista por indice
	}

	

}
