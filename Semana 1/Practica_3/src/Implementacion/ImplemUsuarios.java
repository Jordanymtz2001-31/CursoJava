package Implementacion;

// Aqui creamos la clase ImplemUsuarios que hereda de ImplementGeneral
// Es decir que los metodos de implementGeneral se implementan en esta clase
public class ImplemUsuarios extends ImplementGeneral {

	// Aqui podemos agregar metodos especificos para usuarios si es necesario

	//Metodo para contar usuarios
	public void contarUsuarios() {
		System.out.println("Contando usuarios...");
		System.out.println("Total de usuarios: " + listaObjetos.size());
	}

}
