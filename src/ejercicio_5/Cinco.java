package ejercicio_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cinco {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);


        
        List<List<Double>> alumnos = new ArrayList();
        

        

        for (int i = 0; i < 4; i++){
            double sumatoriaNotas = 0.0;
            List<Double> notas = new ArrayList<>();
            System.out.println(" Por favor ingrese las notas del alumno " + (i+1));
            for (int j = 1; j < 4; j++ ) {
                
                System.out.println("Por favor, ingrese la nota " + j);

                //manejo de errores

                try {
                    double nota = teclado.nextDouble();
                    sumatoriaNotas += nota;
                    notas.add(nota);
                } catch (Exception e) {
                    System.out.println("solo se aceptan numeros entre 0 y 100");

                    teclado.nextLine();
                    //para anular el intento en el que no ingreso un numero
                    j--;
                    

                }

                


            }

            

            notas.add(sumatoriaNotas/notas.size());
            
            alumnos.add(notas);
        }
        
        System.out.print("         ");
        System.out.print("Nota 1 ");
        System.out.print("Nota 2 ");
        System.out.print("Nota 3 ");
        System.out.println("Promedio ");

        for (int i = 0; i< alumnos.size(); i++){
            System.out.print("Alumno "+ (i +1)+ " ");

            for (int j = 0; j < alumnos.get(i).size(); j++){
                System.out.print(alumnos.get(i).get(j)+ "   ");
            }
            System.out.println("");
        }




        
    }
}
