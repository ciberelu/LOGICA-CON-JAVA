package ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public class Diez {
    public static void main(String[]args){
        List<String> nombres = new ArrayList();

        nombres.add("Alejandra");
        nombres.add("Leonardo");
        nombres.add("Rosa");
        nombres.add("Guillermo");
        nombres.add("Gabriel");
        nombres.add("Daniel");
        nombres.add("Luisa");
        nombres.add("Ludmilla");

        for(String nombre: nombres ){
            System.out.println(nombre);
        }

    }
}
