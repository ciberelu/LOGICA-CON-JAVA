package EJERCICIO_POO.ejercicio_6;

public class Seis {
    public static void main(String[]args){
        Arbol arbol = new Arbol("arbolito", 20.0, true, "verano", "unica", "no se", 25.20, "Verde", "redondas");
        Flor flor = new Flor("florecita", 20.20, true, "verano", "blanquitos", 100, "verde", "nose", "invierno");
        arbol.decirQueSoy();
        flor.decirQueSoy();
    }
}
