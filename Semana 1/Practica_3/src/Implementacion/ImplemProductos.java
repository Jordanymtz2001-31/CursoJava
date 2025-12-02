package Implementacion;

// Aqui creamos la clase ImplemProductos que hereda de ImplementGeneral
public class ImplemProductos extends ImplementGeneral {
	
	// Aqui podemos agregar metodos especificos para productos si es necesario
	
	//Metodo para contar productos
	public void contarProductos() {
		System.out.println("Contando productos...");
		System.out.println("Total de productos: " + listaObjetos.size() + "\n");
	}

}
