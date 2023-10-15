package EJERCICIO_POO.ejercicio_7.pokemones;

import EJERCICIO_POO.ejercicio_7.Pokemon;
import EJERCICIO_POO.ejercicio_7.interfaces.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta{
    
    public Bulbasaur(){

    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur  y estoy atacando con Placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Hola soy Bulbasaur  y estoy atacando con Arañazo");

    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur  y estoy atacando con Mordisco");

    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur  y estoy atacando con Paralizar");

    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur  y estoy atacando con Drenaje");

    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy Bulbasaur  y estoy atacando con Hoja Afilada");

    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy Bulbasaur  y estoy atacando con Latigo Cepa");

    }
}
