package ejercicio_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cuatro {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);
        List<Double> vector = new ArrayList<>();

        int flag = 5;
        int cargasNumero3= 0;

        while (flag > 0){
            System.out.println("-----Por favor, ingrese un número------");

            //manejo de errores
            try{
                Double numeroTeclado = teclado.nextDouble();
                vector.add(numeroTeclado);
            }catch(Exception e){
                System.out.println("Solo se permiten numeros");
                //esta linea es para limpiar la entrada erronea y que el programa no termine su ejecucion
                teclado.nextLine();
                //con esta linea se anula el intento en el que no se ingreso un número
                flag++;
            }
            
            flag--;
        }

        teclado.close();


        //para contar del vector la cantidad de tres que hay
        for (Double numero : vector) {
            if(numero == 3){
                cargasNumero3++;
            }
        }
        
        String singularPlural = cargasNumero3 == 1 ? " vez." : " veces"; 
        System.out.println("El Numero 3 fue cargado: " + cargasNumero3 + singularPlural);
    }
}
