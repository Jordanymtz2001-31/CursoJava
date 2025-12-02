package com.mx.Flores;

import java.util.HashMap;

public class Implementacion implements IMetodos {

	// Mapa para almacenar los libros
	HashMap<Integer, Flores> floresMap = new HashMap<>();


	@Override
	public void agregar(Flores flor) {
		floresMap.put(flor.getClave(), flor);
	}

	@Override
	public void mostrar() {
			System.out.println(floresMap);
	}

	@Override
	public void modificar(Flores flor) {
		floresMap.put(flor.getClave(), flor);
	}

	@Override
	public void eliminar(Flores flor) {
		floresMap.remove(flor.getClave());
	}

	@Override
	public Flores buscar(Flores flor) {
		return floresMap.get(flor.getClave());
	}
	
	//Clave Personalizada
	public int contarFlores() {
		return floresMap.size();
	}

}
