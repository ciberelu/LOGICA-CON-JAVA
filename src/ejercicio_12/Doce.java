package ejercicio_12;

import java.util.ArrayList;
import java.util.List;

public class Doce {
    public static void main(String []args){
        System.out.println("Let's  fill a matrix with the number five.");

        
        
        List<List<Integer>> matrix = new ArrayList();


        for (int i = 0; i < 4; i++){
            
            List<Integer> filas = new ArrayList();
            for (int j = 0; j < 5; j++){
                
                filas.add(5);

            }
            matrix.add(filas);

        }

        matrix.forEach(listaNumeros -> {

            listaNumeros.forEach(numero -> {
                System.out.print(numero + "  ");
            });
            System.out.println();
        });
    
    }

}