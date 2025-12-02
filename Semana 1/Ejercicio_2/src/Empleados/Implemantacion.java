package Empleados;

import java.util.ArrayList;
import java.util.List;



public class Implemantacion implements IMetodos {
	
	// Declaracion de una lista como estructura de datos para almacenar empleados
	// Empleados viene de la clase Empleados.java
	List<Empleados> empleados = new ArrayList<Empleados>();

	// Aqui implementamos los metodos de la interfaz IMetodos
	@Override
	public void agregar(Empleados empleado) {
		// Agrega un empleado a la lista
		empleados.add(empleado);
	}

	@Override
	public void mostrar() {
		// Muestra la lista de empleados
		for (Empleados empleado : empleados) {
			System.out.println(empleado);
		}
	}

	@Override
	public void editar(int indice, Empleados empleado) {
		// Edita un empleado en la lista en la posicion indicada por el indice
		empleados.set(indice, empleado);
	}

	@Override
	public void eliminar(int indice) {
		// Elimina un empleado de la lista en la posicion indicada por el indice
		empleados.remove(indice);
		
	}

	@Override
	public void buscar(int indice, Empleados empleado) {
		// Busca un empleado en la lista en la posicion indicada por el indice
		System.out.println(empleados.get(indice));
		
	}
	
	//Metodo Personalizado para contar
	public int contarEmpleados() {
		int contador = empleados.size();
		System.out.println("Total de empleados: " + contador);
		return contador;
	}
	
	// Metodo personalizado para validar si el empleado existe
	public boolean empleadoExiste(Empleados empleado) {
		for (Empleados e : empleados) {
			if(empleado.getNombre().equalsIgnoreCase(e.getNombre()) &&
				  empleado.getaPaterno().equalsIgnoreCase(e.getaPaterno())) {
				return true; // El empleado ya existe
			}
		}
		return false;
	}	
}
