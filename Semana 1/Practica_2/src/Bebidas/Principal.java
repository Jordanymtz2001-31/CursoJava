package Bebidas;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		// Crear instancia de Implementacion
		Implementacion metod = new Implementacion();
				
				
		// Intanciamos para crear bebidas
		Bebidas bebida1 = new Bebidas("Coca-Cola", 30, "Refresco", "Coca-Cola");
		Bebidas bebida2 = new Bebidas("Pepsi", 28, "Refresco", "Pepsi");
		Bebidas bebida3 = new Bebidas("Fanta", 25, "Refresco", "Naranja");
		Bebidas bebida4 = new Bebidas("Sprite", 27, "Refresco", "Limon");
		
		// Creamos un auxiliar para buscar
		Bebidas aux = null;
		
		// Agregar bebidas a la lista
		metod.agregar(bebida1);
		metod.agregar(bebida2);
		metod.agregar(bebida3);
		metod.agregar(bebida4);
		
		/*
		 * // Mostrar bebidas System.out.println("Lista de bebidas: "); imple.mostrar();
		 * 
		 * // Buscar bebida auxiliar = imple.bebidas.get(2);
		 * System.out.println("\nBebida encontrada: " + auxiliar + "\n");
		 * 
		 * // Editar bebida Bebidas bebidaEditada = new Bebidas("7Up", 26, "Refresco",
		 * "Limon"); imple.modificar(0, bebidaEditada);
		 * System.out.println("Bebida editada. Lista actualizada:"); imple.mostrar();
		 * 
		 * // Eliminar bebida imple.eliminar(1);
		 * System.out.println("\nBebida eliminada. Lista actualizada:");
		 * imple.mostrar();
		 */
		
		// Colocamos el Scanner para la entrada de datos
		Scanner sca = new Scanner(System.in);
		
		int menuPrincipal = 0,subMenu = 0, indice = 0;
		
		// Variables locales
		String marca, tipo, sabor;
		double precio;
		
		do {
			
			System.out.println("\n----MENU PRINCIPAL----");
			System.out.println("1.-AGREGAR BEBIDA");
			System.out.println("2.-MOSTRAR LISTA DE BEBIDAS");
			System.out.println("3.-EDITAR BEBIDA POR INDICE");
			System.out.println("4.-ELIMINAR BEBIDA POR INDICE");
			System.out.println("5.-BUSCAR BEBIDA POR INDICE");
			System.out.println("6.-CONTAR BEBIDAS");
			System.out.println("7.-ELIMINAR TODAS LAS BEBIDAS");
			System.out.println("8.-SALIR");
			
			System.out.print("Seleccione una opcion: ");
			
			try {
			
				menuPrincipal = sca.nextInt();
				sca.nextLine(); // Limpiar el buffer
				
				switch(menuPrincipal) {
				case 1:
					// Agregar bebida
					System.out.print("Ingrese la marca de la bebida: ");
					marca = sca.nextLine();
					
					System.out.print("Ingrese el precio de la bebida: ");
					precio = sca.nextDouble();
					sca.nextLine(); // Limpiar el buffer
					
					System.out.print("Ingrese el tipo de bebida: ");
					tipo = sca.nextLine();
					
					System.out.print("Ingrese el sabor de la bebida: ");
					sabor = sca.nextLine();
					
					// Instantiar nueva bebida
					aux = new Bebidas(marca, precio, tipo, sabor);
					
					// El contains es para validar si el objeto ya existe en la lista
                    if (metod.bebidas.contains(aux)) {
                        System.out.println("\nLa bebida ya existe y no se agregará.");
                    } else {
                    	// Agregamos la bebida
                        metod.agregar(aux);
                        System.out.println("BEBIDA AGREGADA CON EXITO.\n");
                    }
                    break;
				
				case 2:
					// Mostrar lista de bebidas
					System.out.println("Lista de bebidas: ");
					metod.mostrar();
					break;
				
				case 3:
					// Editar bebida por indice
					imprimirDatos(metod);
					
					//Verificar si la lista no esta vacia
					if(metod.bebidas.size() > 0) {
						System.out.print("Ingrese el indice de la bebida a editar:");
						indice = sca.nextInt();
						sca.nextLine(); // Limpiar el buffer
						
						//Verificar si el indice esta entre el rango de 
						if(indice > 0 && indice < metod.bebidas.size()) {
							
							aux = metod.bebidas.get(indice);
							
							do {
	
								System.out.println("\n---EDITAR BEBIDA---");
								System.out.println("1.-EDITAR MARCA");
								System.out.println("2.-EDITAR PRECIO");
								System.out.println("3.-EDITAR TIPO");
								System.out.println("4.-EDITAR SABOR");
								System.out.println("5.-SALIR");
								
								System.out.print("Seleccione una opcion: ");
								subMenu = sca.nextInt();
								sca.nextLine(); // Limpiar el buffer
								
								
								switch(subMenu) {
								case 1:
									// Editar nombre
									System.out.print("Ingrese la nueva Marca: ");
									marca = sca.nextLine();
									aux.setMarca(marca);
									System.out.println("Nombre actualizado exitosamente.");
									break;
								case 2:
									// Editar precio
									System.out.print("Ingrese el nuevo precio: ");
									precio = sca.nextDouble();
									aux.setPrecio(precio);
									sca.nextLine(); // Limpiar el buffer
									System.out.println("Precio actualizado exitosamente.");
									break;
								case 3:
									// Editar tipo
									System.out.print("Ingrese el nuevo tipo: ");
									tipo = sca.nextLine();
									aux.setTipo(tipo);
									System.out.println("Tipo actualizado exitosamente.");
									break;
								case 4:
									// Editar sabor
									System.out.print("Ingrese el nuevo sabor: ");
									sabor = sca.nextLine();
									aux.setSabor(sabor);
									System.out.println("Sabor actualizado exitosamente.");
									break;
								case 5:
									System.out.println("Saliendo del menu de edicion.");
									break;
								default:
									System.out.println("Opcion no valida. Intente de nuevo.");
									break;
								}
								
								
								
							}while (subMenu != 5);
							// Salimos del menu de edicion
							break;
						}else {
							System.out.println("Indice fuera de rango.");
						}
					}else {
						System.out.println("La lista de bebidas esta vacia.");
					}
					break;
				case 4:
					// Eliminar bebida por indice
					imprimirDatos(metod);
					
					//Verificar si la lista no esta vacia
					if(metod.bebidas.size() > 0) {
						System.out.print("Ingrese el indice de la bebida a eliminar:");
						indice = sca.nextInt();
						sca.nextLine(); // Limpiar el buffer
						
						//Verificar si el indice esta entre el rango de 
						if(indice > 0 && indice < metod.bebidas.size()) {
							metod.eliminar(indice);
							System.out.println("Bebida eliminada exitosamente.");
						}else {
							System.out.println("Indice fuera de rango.");
						}
					}else {
						System.out.println("La lista de bebidas esta vacia.");
					}
					break;
					
				case 5:
					System.out.print("---BUSCAR BEBIDA POR INDICE---");
					imprimirDatos(metod);
					
					//Verificar si la lista no esta vacia
					if(metod.bebidas.size() > 0) {
						System.out.print("Ingrese el indice de la bebida a buscar: ");
						indice = sca.nextInt();
						sca.nextLine(); // Limpiar el buffer
						
						//Verificar si el indice esta entre el rango
						if(indice > 0 && indice < metod.bebidas.size()) {
							aux = metod.bebidas.get(indice);
							System.out.println("Bebida encontrada: " + aux);
						}else {
							System.out.println("Indice fuera de rango.");
						}
					}else {
						System.out.println("La lista de bebidas esta vacia.");
					}
					break;
					
				case 6: 
					// Contar bebidas
					metod.contarBebidas();
					break;
				
				case 7:
					// Eliminar todas las bebidas
					metod.bebidas.clear();
					System.out.println("Todas las bebidas han sido eliminadas.");
					break;
				
				case 8:
					System.out.println("Saliendo del programa. ¡Hasta luego!");
					break;
					
				default:
					System.out.println("Opcion fuera del rango. Intente de nuevo.");
					break;
				}
				
			}catch (InputMismatchException ime) {
				System.out.println("Error: Tipo de dato incorrecto. Por favor, ingrese un numero entero.");
				sca.nextLine(); // Limpiar el buffer	
			
			}catch (Exception e) {
				System.out.println("Error: Entrada invalida. Por favor, ingrese un numero valido.");
				sca.nextLine(); // Limpiar el buffer
				
			}

		}while(menuPrincipal != 8);


	}
	
	// Metodo asociado a la clase sin necesidad de crear un objeto o instancia
	private static void imprimirDatos(Implementacion metod) {
		// Mostrar todos los empleados
		System.out.println("Lista de Bebidas:");
		// Si la lista no esta vacia, es decir si hay mas de 0 empleados
		if (metod.bebidas.size() > 0) {
			// Por cada bebida en la lista, imprimimos su nombre con su indice
			// La bebida empieza en 0 hasta el tamaño de la lista
			for (int bebida = 0; bebida < metod.bebidas.size(); bebida++) {
				// Imprimimos la bebida de metod.bebidas en la posicion bebida
				System.out.println("La Marca [" + bebida + "] es: " + metod.bebidas.get(bebida).getMarca());
			}
		} else {
			System.out.println("No hay bebidas en la lista.");
		}
	}

}
