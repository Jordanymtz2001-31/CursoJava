package Principal;

import Entidad.Serie;
import Entidad.VideoJuegos;

public class Principal {

	public static void main(String[] args) {
		
		// Creamos dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno
		Serie[] series = new Serie[5];
		VideoJuegos[] videojuegos = new VideoJuegos[5];
		
		// Creamos objetos Series con valores distintos usando diferentes constructores
		series[0] = new Serie("Breaking Bad", "Vince Gilligan");
		series[1] = new Serie("Game of Thrones", "Drama/Fantasía", "David Benioff y D. B. Weiss", 8);
		series[2] = new Serie("Stranger Things", "Ciencia ficción/Terror", "The Duffer Brothers", 4);
		series[3] = new Serie(); // Constructor por defecto
		series[4] = new Serie("The Crown", "Drama Histórico", "Peter Morgan", 5);

		// Creamos objetos VideoJuegos con valores distintos usando diferentes constructores
		videojuegos[0] = new VideoJuegos("The Last of Us", 50);
		videojuegos[1] = new VideoJuegos("God of War", "Acción/Aventura", "Santa Monica Studio", 45);
		videojuegos[2] = new VideoJuegos("Minecraft", "Supervivencia", "Mojang Studios", 999);
		videojuegos[3] = new VideoJuegos(); // Constructor por defecto
		videojuegos[4] = new VideoJuegos("The Legend of Zelda", 60);
		
		// Mostramos todos los objetos creados
		System.out.println("======== SERIES CREADAS ========\n");
		for(int i = 0; i < series.length; i++) {
			System.out.println((i+1) + ". " + series[i]);
		}
		
		System.out.println("\n======== VIDEOJUEGOS CREADOS ========\n");
		for(int i = 0; i < videojuegos.length; i++) {
			System.out.println((i+1) + ". " + videojuegos[i]);
		}
		
		// Entrega algunos Videojuegos y Series con el método entregar()
		System.out.println("\n======== ENTREGANDO ALGUNOS ELEMENTOS ========\n");
		series[1].entregar();
		System.out.println("✓ Serie '" + series[1].getTitulo() + "' entregada");
		
		series[3].entregar();
		System.out.println("✓ Serie '" + series[3].getTitulo() + "' entregada");
		
		videojuegos[0].entregar();
		System.out.println("✓ Videojuego '" + videojuegos[0].getTitulo() + "' entregado");
		
		videojuegos[2].entregar();
		System.out.println("✓ Videojuego '" + videojuegos[2].getTitulo() + "' entregado");
		
		videojuegos[4].entregar();
		System.out.println("✓ Videojuego '" + videojuegos[4].getTitulo() + "' entregado");
		
		// Contamos cuantas Series y Videojuegos hay entregados
		System.out.println("\n======== CONTANDO ENTREGADOS ========\n");
		// Declaramos contadores para cada tipo
		int seriesEntregadas = 0;
		int videojuegosEntregados = 0;
		
		for(Serie s : series) {
			if(s.isEntregado()) {
				seriesEntregadas++;
			}
		}
		
		for(VideoJuegos v : videojuegos) {
			if(v.isEntregado()) {
				videojuegosEntregados++;
			}
		}
		// Imprimimos la cantidad de entregados
		System.out.println("Series entregadas: " + seriesEntregadas);
		System.out.println("Videojuegos entregados: " + videojuegosEntregados);
		
		// Al contarlos, los devolvemos
		System.out.println("\n======== DEVOLVIENDO LOS ENTREGADOS ========\n");
		for(Serie s : series) {
			// Recorremos la lista y si esta entregado entonces lo devolvemos
			if(s.isEntregado()) {
				s.devolver();
				System.out.println("✓ Serie '" + s.getTitulo() + "' devuelta");
			}
		}
		
		for(VideoJuegos v : videojuegos) {
			if(v.isEntregado()) {
				v.devolver();
				System.out.println("✓ Videojuego '" + v.getTitulo() + "' devuelto");
			}
		}
		
		// Por último, indicamos el Videojuego con más horas estimadas y la serie con más temporadas
		System.out.println("\n======== COMPARATIVAS ========\n");
		
		// Encontrar el videojuego con más horas estimadas
		VideoJuegos videojuegoMasHoras = videojuegos[0];
		for(VideoJuegos v : videojuegos) {
			if(v.compareTo(videojuegoMasHoras) > 0) {
				videojuegoMasHoras = v;
			}
		}
		
		// Encontrar la serie con más temporadas
		Serie serieMaxTemporadas = series[0];
		for(Serie s : series) {
			if(s.compareTo(serieMaxTemporadas) > 0) {
				serieMaxTemporadas = s;
			}
		}
		
		System.out.println("Videojuego con más horas estimadas:");
		System.out.println(videojuegoMasHoras);
		System.out.println("\nSerie con más temporadas:");
		System.out.println(serieMaxTemporadas);
	}

}
