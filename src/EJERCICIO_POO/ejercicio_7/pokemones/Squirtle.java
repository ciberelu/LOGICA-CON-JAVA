package EJERCICIO_POO.ejercicio_7.pokemones;

import EJERCICIO_POO.ejercicio_7.Pokemon;
import EJERCICIO_POO.ejercicio_7.interfaces.IAgua;

public class Squirtle extends Pokemon implements IAgua{
    public Squirtle(){

    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Squirtle  y estoy atacando con Placaje");

    }

    @Override
    public void atacarArañazo() {
        System.out.println("Hola soy Squirtle  y estoy atacando con Arañazo");


    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Squirtle  y estoy atacando con Mordisco");

    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle  y estoy atacando con Hidrobomba");

    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle  y estoy atacando con Pistola de agua");

    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle  y estoy atacando con Burbuja");

    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Hola soy Squirtle  y estoy atacando con Hidropulso");

    }
}
