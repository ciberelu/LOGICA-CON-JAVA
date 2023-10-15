package ejercicio_14;

import java.util.ArrayList;
import java.util.List;

public class Catorce {
    public static void main(String[]args){
        System.out.println("Let's draw a Christmas tree.");

   
        int filas = 20;
        int filasManejador = filas;
        int columnas =  filas + filas -1;


        for (int i = 0; i < filas; i++){
           
            int enBlanco = columnas - filasManejador;
            filasManejador++;
           

            int asteriscos = columnas - (enBlanco *2);
            // System.out.println("asteriscos " + asteriscos);

            for(int j = 0; j < columnas; j++){
                
                if (j < enBlanco){
                    dibujarEspaciosEnBlanco();
                }else {
                    while(asteriscos > 0){
                        dibujarAsterisc();
                        asteriscos--;
                    }
                    break;
                }

            }
            System.out.println("");
        }
    }



    public static void dibujarEspaciosEnBlanco(){
        System.out.print(" ");
    }

    public static void dibujarAsterisc(){
        System.out.print("*");
        
    }
}


