package ejercicio_9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nueve {
    public static void main(String []args){
       

        Scanner teclado = new Scanner(System.in);

        String dni;
        String nombre;
        int edad = 0;

        boolean flag = true;

        while (flag){
            System.out.println("Inscripciones para el maraton");
            System.out.println("********************************");

            System.out.println("Ingrese el dni del competidor");
            dni = teclado.nextLine();

            System.out.println("Ingrese el nombre del competidor");
            nombre = teclado.nextLine();

            System.out.println("Ingrese la edad del competidor");
            
            try {
                edad = teclado.nextInt();
            } catch (InputMismatchException   e) {
               
               System.out.println("Valor no valido, debes ingresar un numero");
                teclado.nextLine();
                continue;

            }
            
             

            //controlar bucle de ingreso de datos
            if (dni.equals("0") || nombre.equalsIgnoreCase("fin")){
                flag = false;
                System.out.println("Saliendo del programa");
                break;
            }


            //evalua condiciones
            if (edad < 6) {
                System.out.println("El competidor no puede competir solo se aceptan edades de 6 años en adelante");
            } else if (edad >= 6 && edad <= 10 ){
                System.out.println("Inscribirlo en categoria menores A");
            }else if (edad >= 11 && edad <= 17 ){
                System.out.println("Inscribirlo en categoria menores B");
            }else if (edad >= 18 && edad <= 30 ){
                System.out.println("Inscribirlo en categoria Juveniles");
            }else if (edad >= 31 && edad <= 50 ){
                System.out.println("Inscribirlo en categoria Adultos");
            }else if (edad >= 50 ){
                System.out.println("Inscribirlo en categoria Adultos mayores");
            }

            teclado.nextLine();
            System.out.println("********************************");


        }

    }
}