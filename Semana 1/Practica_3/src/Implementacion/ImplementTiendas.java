package Implementacion;

// Extendemos la clase ImplementGeneral para crear la clase ImplementTiendas 
// Es decir que hereda todos los metodos de la clase padre
public class ImplementTiendas extends ImplementGeneral {

	// Aqui podemos agregar metodos especificos para tiendas si es necesario
	
	//Metodo para contar tiendas
	public void contarTiendas() {
		System.out.println("Contando tiendas...");
		System.out.println("Total de tiendas: " + listaObjetos.size());
	}

}
