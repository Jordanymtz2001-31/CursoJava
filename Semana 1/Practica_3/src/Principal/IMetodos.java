package Principal;

public interface IMetodos {
	
	//Aqui los metodos que se van a implementar en las clases hijas
	// Ya que tenemos mas de una clase
	public void agregar(Object objeto);
	public void eliminar(int  indice);
	public void modificar(int indice, Object objeto);
	public void mostrar();
		
	//Metodo para buscar un objeto por su clave
	public Object buscar(int indice);

}
