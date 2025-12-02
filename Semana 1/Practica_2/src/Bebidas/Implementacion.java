package Bebidas;

import java.util.ArrayList;
import java.util.List;

public class Implementacion implements IMetodos {
	
	
	//Creamos una lista para almacenar las bebidas
	List<Bebidas> bebidas = new ArrayList<Bebidas>();

	@Override //El @Override indica en si que estamos implementando un metodo de la interfaz
	public void agregar(Bebidas bebida) {
		bebidas.add(bebida);
	}

	@Override
	public void eliminar(int indice) {
		bebidas.remove(indice);
	}

	@Override
	public void modificar(int indice, Bebidas bebida) {
		bebidas.set(indice, bebida);
	}

	@Override
	public void mostrar() {
		for (Bebidas bebida : bebidas) {
			System.out.println(bebida);
		}
		
	}

	@Override
	public void buscar(int indice, Bebidas bebida) {
		System.out.println(bebidas.get(indice));	
	}
	
	// Metodo personalizado de contar bebidas
	public int contarBebidas() {
		int contador = bebidas.size();
		System.out.println("Total de bebidas: " + contador);
		return contador;
	}
	
	// Metodo personalizado para validar si una bebida ya existe en la lista (marca y sabor)
	public boolean bebidaExiste(Bebidas bebida) {
		for (Bebidas b : bebidas) {
			if(bebida.getMarca().equalsIgnoreCase(b.getMarca()) &&
			   bebida.getSabor().equalsIgnoreCase(b.getSabor())) {
				return true; // La bebida ya existe
			}
		}
		return false;
	}

}
