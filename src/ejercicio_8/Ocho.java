package ejercicio_8;

import java.util.ArrayList;
import java.util.List;

public class Ocho {
    public static void main(String[]args){


        Videojuego fifa = new Videojuego(20, "Fifa", "pc", 2, "Deportes");

        Videojuego needForSpeed = new Videojuego(21, "Need For Speed", "Play Station", 4, "Carreras");

        Videojuego counterStrike = new Videojuego(22, "ConterStrike", "pc", 10, "Violencia");

        Videojuego tetris = new Videojuego(23, "Tetris", "Nintendo 64", 1, "Entretenimiento");

        Videojuego geometryDash = new Videojuego(24, "Geometry Dash", "celular", 1, "saltos");


        List<Videojuego> videojuegos = new ArrayList<>();
        videojuegos.add(fifa);
        videojuegos.add(needForSpeed);
        videojuegos.add(counterStrike);
        videojuegos.add(tetris);
        videojuegos.add(geometryDash);


        System.out.println("-----Datos de los videojuegos antes de realizar la actualizacion");
        for (Videojuego videojuego : videojuegos){
            System.out.println("titulo: " + videojuego.getTitulo());
            System.out.println("Consola: " + videojuego.getConsola());
            System.out.println("Cantidad de Jugadores: " + videojuego.getCantidadJugadores());
        }

        System.out.println("-----Datos de los videojuegos despues de realizar la actualizacion");
        fifa.setTitulo("Fifa 2");
        fifa.setCantidadJugadores(4);

        geometryDash.setTitulo("Geometry Dash 2");
        geometryDash.setCantidadJugadores(3);

        for (Videojuego videojuego : videojuegos){
            System.out.println("titulo: " + videojuego.getTitulo());
            System.out.println("Consola: " + videojuego.getConsola());
            System.out.println("Cantidad de Jugadores: " + videojuego.getCantidadJugadores());
        }

        for (Videojuego videojuego : videojuegos){
            if (videojuego.getConsola().equalsIgnoreCase("nintendo 64")){
                System.out.println(videojuego.toString());
            }
        }


    }
}
