package ejerF;

public class Main {

	public static void main(String[] args) {
		  // Arrays
        Serie[] series = new Serie[5];
        VideoJuego[] videojuegos = new VideoJuego[5];

        series[0] = new Serie("Breaking Bad", "Drama", "Vince Gilligan", 5);
        series[1] = new Serie("Friends", "Comedia", "David Crane", 10);
        series[2] = new Serie("Stranger Things", "Ciencia Ficción", "Hermanos Duffer", 4);
        series[3] = new Serie("The Office", "Comedia", "Greg Daniels", 9);
        series[4] = new Serie("Lupin", "George Kay");

        videojuegos[0] = new VideoJuego("The Witcher 3", 50, "RPG", "CD Projekt");
        videojuegos[1] = new VideoJuego("Minecraft", 100, "Sandbox", "Mojang");
        videojuegos[2] = new VideoJuego("God of War", 40, "Acción", "Santa Monica Studio");
        videojuegos[3] = new VideoJuego("FIFA 24", 20);
        videojuegos[4] = new VideoJuego();

        
        series[1].entregar();
        series[3].entregar();
        videojuegos[0].entregar();
        videojuegos[2].entregar();
        videojuegos[3].entregar();

       
        int seriesEntregadas = 0;
        int videojuegosEntregados = 0;

        for (Serie s : series) {
            if (s.isEntregado()) {
                seriesEntregadas++;
                s.devolver(); 
            }
        }

        for (VideoJuego v : videojuegos) {
            if (v.isEntregado()) {
                videojuegosEntregados++;
                v.devolver(); 
            }
        }

        System.out.println("Series entregadas: " + seriesEntregadas);
        System.out.println("Videojuegos entregados: " + videojuegosEntregados);

       
        Serie serieMax = series[0];
        for (int i = 1; i < series.length; i++) {
            if (series[i].compareTo(serieMax) > 0) {
                serieMax = series[i];
            }
        }

       
        VideoJuego videojuegoMax = videojuegos[0];
        for (int i = 1; i < videojuegos.length; i++) {
            if (videojuegos[i].compareTo(videojuegoMax) > 0) {
                videojuegoMax = videojuegos[i];
            }
        }

        System.out.println("\nSerie con más temporadas:");
        System.out.println(serieMax);

        System.out.println("\nVideojuego con más horas estimadas:");
        System.out.println(videojuegoMax);

	}

}
