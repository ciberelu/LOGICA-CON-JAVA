package EJERCICIO_POO.ejercicio_7.pokemones;

import EJERCICIO_POO.ejercicio_7.Pokemon;
import EJERCICIO_POO.ejercicio_7.interfaces.IElectrico;

public class Pikachu extends Pokemon implements IElectrico{
    public Pikachu (){

    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Pikachu  y estoy atacando con Placaje");
    }

    @Override
    public void atacarArañazo() {
                System.out.println("Hola soy Pikachu  y estoy atacando con Arañazo");

    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Pikachu  y estoy atacando con Mordisco");

    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu  y estoy atacando con Impact Trueno");

    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu  y estoy atacando con puño Trueno");

    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola soy Pikachu  y estoy atacando con Rayo");

    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola soy Pikachu  y estoy atacando con Rayo carga");

    }


}
