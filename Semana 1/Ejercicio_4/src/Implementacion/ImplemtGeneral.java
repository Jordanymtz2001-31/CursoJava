package Implementacion;

import java.util.HashMap;

import Principal.IMetodos;

public class ImplemtGeneral implements IMetodos {
	
	// Declaramos la declaracion de hashmap
	protected HashMap<Object, Object> hasMap = new HashMap<Object, Object>();

	@Override
	public void agregar(Object key, Object value) {
		hasMap.put(key, value); //put para agregar elementos al hashmap
		
	}

	@Override
	public void eliminar(Object key) {
		hasMap.remove(key); //remove para eliminar elementos del hashmap
		
	}

	@Override
	public void modificar(Object key, Object value) {
		hasMap.put(key, value); //put para modificar elementos del hashmap
		
	}

	@Override
	public void mostrar() {
		hasMap.forEach((key, value) -> {
			System.out.println("Clave: " + key + ", Valor: " + value);
		});
		
	}

	@Override
	public Object buscarPorClave(Object key) {
		return hasMap.get(key); //get para buscar elementos del hashmap
	}

	

	
}
