package Principal;

public interface IMetodos {
	
	//Aqui los metodos que se van a implementar en las clases hijas
	// Ya que tenemos mas de una clase
	public void agregar(Object key, Object  value);
	public void eliminar(Object  key);
	public void modificar(Object  key, Object  value);
	public void mostrar();
	
	//Metodo para buscar un objeto por su clave
	public Object buscarPorClave(Object  key);

}
