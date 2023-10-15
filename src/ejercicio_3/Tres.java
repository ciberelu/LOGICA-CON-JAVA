package ejercicio_3;

import java.util.Scanner;

public class Tres {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("----ingrese el limite que desea ve de número----");
        

        //manejo de errores
        try {
            int limite = teclado.nextInt();
            for (int contador = 1; contador <= limite; contador++){
            System.out.println("Numero: " + contador);
        }
        } catch (Exception e) {
            System.out.println("Debe ingresar un numero");
            System.out.println("Saliendo del sistema :( ");

        }

        

    }
}
