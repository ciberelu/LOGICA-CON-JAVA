package ejercicio_2;

import java.util.Scanner;

public class Dos {
    public static void main(String[]args){
        double sueldoRepositores = 15890;
        double sueldoCajeros = 25630.89;
        double sueldoSupervisores = 35560.20;
                        //si no se castea maneja la division como int
        double bono = (double)10/100; 
        double descuentoJubilacion = (double) 11/100;

        Scanner teclado = new Scanner(System.in);
        
        double sueldoFinal;
        boolean flag = true;

        while (flag){
            System.out.println("---Ingrese el empleado para saber el sueldo---");
             System.out.println("----1. Repositor, 2 cajero, 3 supervisor, otra tecla = salir----");

             String empleado = teclado.nextLine();

            if (empleado.equals("1")){
                sueldoFinal = sueldoRepositores +(sueldoRepositores * bono);
                System.out.println("Sueldo de " + TiposEmpleados.REPOSITORES + ": " + sueldoFinal);
            }else  if (empleado.equals("2")){
                sueldoFinal = sueldoCajeros ;
                System.out.println("Sueldo de " + TiposEmpleados.CAJEROS + ": " + sueldoFinal);
            }else  if (empleado.equals("3")){
                sueldoFinal = sueldoSupervisores - sueldoSupervisores * descuentoJubilacion;
                System.out.println("Sueldo de " + TiposEmpleados.SUPERVISORES + ": " + sueldoFinal);
            }else {
                flag = false;
                System.out.println("----Saliendo del programa----");
            }
        }
    }
}
