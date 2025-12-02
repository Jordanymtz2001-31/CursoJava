package Bebidas;

public interface IMetodos {
	
	public void agregar(Bebidas bebida);
	public void eliminar(int indice);
	public void modificar(int indice, Bebidas bebida);
	public void mostrar();
	public void buscar(int indice, Bebidas bebida);

}
