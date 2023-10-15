package EJERCICIO_POO.ejercicio_7.pokemones;

import EJERCICIO_POO.ejercicio_7.Pokemon;
import EJERCICIO_POO.ejercicio_7.interfaces.IFuego;

public class Charmander extends Pokemon implements IFuego{

    public Charmander (){

    }



    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y estoy atacando con fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander  y estoy atacando con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander  y estoy atacando con lanza llamas");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Charmander y estoy atacando con Placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Hola soy Charmander  y estoy atacando con Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Charmander  y estoy atacando con Mordisco");
    }
    
}
