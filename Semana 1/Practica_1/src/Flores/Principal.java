package Flores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// intanciamos de los objetos, usaremos el costructor con parametros
				Flores flor_1 = new Flores("Gladiola", false, 70, "Blanca");

				Flores flor_2 = new Flores("Rosa", true, 20, "Roja");
				
				Flores flor_3 = new Flores("Margarita", true, 15, "Blanca");

				Flores flor_4 = new Flores("Girasol", false, 25, "Amarillo");
				


			// Creacion de una lista para las instancia de los objetos

			List<Flores> flores = new ArrayList<Flores>();

				//objeto auxiliar para que guarde
				Flores new_flor = null;
				
				// Guardamos las intancias a la lista
				flores.add(flor_1);
				flores.add(flor_2);
				flores.add(flor_3);
				flores.add(flor_4);
				
				// CREAMOS UN CRUD PARA MANEJAR LA LISTA DE FLORES
				
				// Creamos el Scanner para la entrada de datos
				Scanner scanner = new Scanner(System.in);
				
				//Esta es otra forma de declarar el Scanner
				//Scanner scan = null; 
				
				// Creamos una variable para la opcion del menu
				int menuPrincipal = 0;
				
				// Creamos Variables Locales
				String nombre, color;
				boolean esAromatica;
				double precio;
				
				// Creamos el do-while para el menu
				do {
					System.out.println("----MENU----");
					System.out.println("1.-AGREGAR");
					System.out.println("2.-MOSTRAR LISTA");
					System.out.println("3.-EDITAR POR NOMBRE");
					System.out.println("4.-BUSCAR POR NOMBRE");
					System.out.println("5.-ELIMINAR POR NOMBRE");
					System.out.println("6.-CONTAR");
					System.out.println("7.-SALIR");
					System.out.println("ELIGUE UNA OPCION DEL MENU: ");
					
					menuPrincipal = scanner.nextInt();
					scanner.nextLine();  // Limpia el buffer después de nextInt
					
					switch(menuPrincipal) {
					case 1:
						// AGREGAR UNA FLOR
						System.out.println("Ingrese el nombre de la flor: ");
						nombre = scanner.nextLine();
						
						System.out.println("Ingrese el color de la flor: ");
						color = scanner.nextLine();
						
						System.out.println("¿Es aromática? (si/no): ");
						// Creamos una variable para la respuesta del usuario
						String respuestaAroma = scanner.nextLine();
						// Pasamos la respuesta a boolean
						esAromatica = respuestaAroma.equalsIgnoreCase("si");
						
						System.out.println("Ingrese el precio de la flor: ");
						precio = scanner.nextDouble();
						scanner.nextLine(); // Limpia el buffer después de nextDouble
						
						// Crear una nueva instancia de Flor
						new_flor = new Flores(nombre, esAromatica, precio, color);
						
						// El contains es para validar si el objeto ya existe en la lista
                        if (flores.contains(new_flor)) {
                            System.out.println("La flor ya existe y no se agregará.");
                        } else {
                        	// Agregamos la flor
                            flores.add(new_flor);
                            System.out.println("FLOR AGREGADO CON EXITO.\n");
                        }
						
						
						break;
						
					case 2:
						// MOSTRAR LISTA
						System.out.println("LISTA DE FLORES: ");
						for(Flores flor : flores) {
							System.out.println(flor + "\n");
						}
						break;
						
					case 3:
						// EDITAR UNA FLOR
						System.out.println("Ingrese el nombre de la flor a editar: ");
						nombre = scanner.nextLine();
						
						// BUSCAMOS EL NOMBRE EN LA LISTA
						boolean encontrada = false;
						
						// Para cada flor en la lista de flores
						for(Flores flor : flores) {
							// El equalsIgnoreCase es para que no distinga entre mayusculas y minusculas
							if(flor.getNombre().equalsIgnoreCase(nombre)) {
								System.out.println("Ingrese el nuevo color de la flor: ");
								color = scanner.nextLine();
								System.out.println("¿Es aromática? (si/no): ");
								// Creamos una variable para la respuesta del usuario
								String respuesta = scanner.nextLine();
								// Convertimos la respuesta a boolean
								esAromatica = respuesta.equalsIgnoreCase("si");
								System.out.println("Ingrese el nuevo precio de la flor: ");
								precio = scanner.nextDouble();
								scanner.nextLine(); // Limpia el buffer después de nextDouble
								
								// Actualizar los datos - AQUÍ USAMOS LOS SETTERS
								flor.setColor(color);
								flor.setAroma(esAromatica);
								flor.setPrecio(precio);
								
								System.out.println("FLOR ACTUALIZADA CORRECTAMENTE.\n");
								encontrada = true;
								break;
							}
						}
						if(!encontrada) {
							System.out.println("Flor no encontrada.");
						}
						break;
					case 4:
						// BUSCAR UNA FLOR
						System.out.println("Ingrese el nombre de la flor a buscar:");
						nombre = scanner.nextLine();
						
						encontrada = false;
						
						// Por cada flor en la lista de flores
						for(Flores flor : flores) {
							// Si el nombre coincide con el de la flor
							if(flor.getNombre().equalsIgnoreCase(nombre)) {
								System.out.println("FLOR ENCONTRADA: " + flor);
								encontrada = true;
								break;
							}
						}
						if(!encontrada) {
							System.out.println("Flor no encontrada.");
						}
						break;
					
					case 5:
						// ELIMINAR UNA FLOR
						System.out.println("Ingrese el nombre de la flor a eliminar: ");
						nombre = scanner.nextLine();
						
						encontrada = false;
						
						// Buscamos por cada flor en la lista de flores
						for(Flores flor : flores) {
							if(flor.getNombre().equalsIgnoreCase(nombre)) {
								flores.remove(flor);
								System.out.println("FLOR ELIMINADA.\n");
								encontrada = true;
								break;
							}
						}
						if(!encontrada) {
							System.out.println("Flor no encontrada.");
						}
						break;
						
					case 6:
						// CONTAR FLORES
						System.out.println("\nNúmero total de flores registradas: " + flores.size() + "\n");
						break;
						
					case 7:
						System.out.println("\nSaliendo del programa...");
						break;
						default:
							System.out.println("Opción no válida, intenta de nuevo.");
					}
					
				}while(menuPrincipal != 7);
				
				scanner.close();

	}

}
