package Principal;

import Entidades.Productos;
import Entidades.Tiendas;
import Entidades.Usuarios;
import Implementacion.ImplemProductos;
import Implementacion.ImplemUsuarios;
import Implementacion.ImplementTiendas;

public class Principal {

	public static void main(String[] args) {
		
		//Implementamos los metodos de cada clase
		ImplementTiendas metoTiend = new ImplementTiendas();
		ImplemProductos metoProd = new ImplemProductos();
		ImplemUsuarios metoUsua = new ImplemUsuarios();
		
		//Agregamos un auxiliar para cada clase
		Tiendas tienda = new Tiendas();
		Productos producto = new Productos();
		Usuarios usuario = new Usuarios();
		
		//Instanciamos de cada clase
		
		//PRODUCTOS
		Productos prod1 = new Productos("Laptop", "Electrónica", 1200.00, 10);
		Productos prod2 = new Productos("Smartphone", "Electrónica", 800.00, 10);
		Productos prod3 = new Productos("Tablet", "Electrónica", 500.00, 25);
		
		//TIENDAS
		Tiendas tiend1 = new Tiendas("TechStore", "Calle 123", "123-456-7890");
		Tiendas tiend2 = new Tiendas("GadgetWorld", "Avenida 456", "987-654-3210");
		Tiendas tiend3 = new Tiendas("DeviceHub", "Boulevard 789", "555-123-4567");
		
		//USUARIOS
		Usuarios usua1 = new Usuarios("Juan", "Perez", "Maritez", 25);
		Usuarios usua2 = new Usuarios("Maria", "Gomez", "Martinez", 30);
		Usuarios usua3 = new Usuarios("Carlos", "Lopez", "Hernandez", 28);
		
		//Agregar productos
		metoProd.agregar(prod1);
		metoProd.agregar(prod2);
		metoProd.agregar(prod3);
		
		System.out.println("-----PRODUCTOS-----\n");
		//Mostrar
		metoProd.mostrar();
		
		//Buscar
		producto = (Productos) metoProd.buscar(1);
		System.out.println("Producto encontrado: " + producto.getNombre());
		
		//Editar
		producto = new Productos("Smartphone Pro", "Electrónica", 1000.00, 15);
		metoProd.modificar(1, producto);
		System.out.println("Se ha modificado el indice 1 " + producto.getNombre() + "\n");
		
		//Eliminar producto
		metoProd.eliminar(2);
		System.out.println("Se ha eliminado el producto en el indice 2 \n" );
		metoProd.mostrar();
		
		//Contar productos
		metoProd.contarProductos();
		
		//-----------------------------------------------------------------------
		
		System.out.println("-----TIENDAS-----\n");
		//Agregar tiendas
		metoTiend.agregar(tiend1);
		metoTiend.agregar(tiend2);
		metoTiend.agregar(tiend3);
		
		//Mostrar tiendas
		metoTiend.mostrar();
		
		//Buscar tienda
		tienda = (Tiendas) metoTiend.buscar(0);
		System.out.println("Tienda encontrada: " + tienda.getNombre());
		
		//Editar tienda
		tienda = new Tiendas("TechStore Plus", "Calle 123", "123-456-7890");
		metoTiend.modificar(0, tienda);
		System.out.println("Se ha modificado el indice 0 " + tienda.getNombre() + "\n");
		
		//Eliminar tienda
		metoTiend.eliminar(2);
		System.out.println("Se ha eliminado la tienda en el indice 2 \n" );
		metoTiend.mostrar();
		
		//Contar tiendas
		metoTiend.contarTiendas();
		
		//------------------------------------------------------------------------
		System.out.println("-----USUARIOS-----\n");
		
		//Agregar usuarios
		metoUsua.agregar(usua1);
		metoUsua.agregar(usua2);
		metoUsua.agregar(usua3);
		
		//Mostrar usuarios
		metoUsua.mostrar();
		
		//Buscar usuario
		usuario = (Usuarios) metoUsua.buscar(2);
		System.out.println("Usuario encontrado: " + usuario.getNombre());
		
		//Editar usuario
		usuario = new Usuarios("Carlos", "Lopez", "Gonzalez", 29);
		metoUsua.modificar(2, usuario);
		System.out.println("Se ha modificado el indice 2 " + usuario.getNombre() + "\n");
		
		//Eliminar usuario
		metoUsua.eliminar(1);
		System.out.println("Se ha eliminado el usuario en el indice 1 \n" );
		metoUsua.mostrar();
		
		//Contar usuarios
		metoUsua.contarUsuarios();
	}

}
