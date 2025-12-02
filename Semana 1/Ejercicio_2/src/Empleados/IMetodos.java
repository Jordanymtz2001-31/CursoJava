package Empleados;

public interface IMetodos {

	// Metodos de la interfaz que son obligatorios de implementar (abstractos)

	public void agregar(Empleados empleado);
	public void mostrar();
	public void editar(int indice, Empleados empleado);
	public void eliminar(int indice);
	public void buscar(int indice, Empleados empleado);
}
