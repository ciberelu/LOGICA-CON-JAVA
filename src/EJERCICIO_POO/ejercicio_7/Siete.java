package EJERCICIO_POO.ejercicio_7;

import EJERCICIO_POO.ejercicio_7.pokemones.Bulbasaur;
import EJERCICIO_POO.ejercicio_7.pokemones.Charmander;
import EJERCICIO_POO.ejercicio_7.pokemones.Pikachu;
import EJERCICIO_POO.ejercicio_7.pokemones.Squirtle;

public class Siete {

    public static void main(String []args){
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();


        //ataques comunes
        charmander.atacarArañazo();
        bulbasaur.atacarArañazo();
        squirtle.atacarArañazo();
        pikachu.atacarArañazo();


        //ataques especiales
        charmander.atacarLanzallamas();
        bulbasaur.atacarHojaAfilada();
        squirtle.atacarHidrobomba();
        pikachu.atacarImpactrueno();
    }
    
}
