package Interfaces;

public interface Entregable {
	
	// Cambia el atributo entregado a true
	public boolean entregar();

	// Cambia el atributo entregado a false
	public boolean devolver();
	
	// Devuelve el estado del atributo entregado
	public boolean isEntregado();
	
	// Compara las horas estimadas en los videojuegos y en las series el numero de temporadas
	public int compareTo(Object a);
}
