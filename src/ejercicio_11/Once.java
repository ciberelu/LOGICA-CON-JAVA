package ejercicio_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Once {
    public static void main (String []args){

        Scanner teclado = new Scanner(System.in);
        
        List<String> ciudades = new ArrayList<>();
        List<Integer> temperaturasBajas = new ArrayList<>();
        List<Integer> temperaturasAltas = new ArrayList<>();

        for (int i = 0; i< 3; i++){
            System.out.println("Ingrese el nombre de la ciudad");

            ciudades.add(teclado.nextLine());

            System.out.println("Ingrese temperatura baja");

            //control de error si el usuario ingresa un String
            boolean flagTemperaturaBaja = true;
            boolean flagTemperaturaAlta = true;


            temperaturasBajas.add(obtenerTemperaturaValida(teclado))  ;
            
            System.out.println("Ingrese temperatura alta");

            //bucle que maneja el error en caso el usuario no ingrese un numero al solicitarle la temperatura alta
            temperaturasAltas.add(obtenerTemperaturaValida(teclado));
            
            
            teclado.nextLine();

        }

        int temperaturaMasBaja = temperaturasBajas.get(0);
        int temperaturaMasAlta = temperaturasAltas.get(0);
        int indiceCiudadTemperaturaMasAlta = -1;
        int indiceCiudadTemperaturaMasBaja = -1;


        for (int i = 0; i < ciudades.size(); i++){
            if(temperaturaMasBaja > temperaturasBajas.get(i)){
                temperaturaMasBaja = temperaturasBajas.get(i);
                indiceCiudadTemperaturaMasBaja = i;
            }

            if(temperaturaMasAlta < temperaturasAltas.get(i)){
                temperaturaMasAlta = temperaturasAltas.get(i);
                indiceCiudadTemperaturaMasAlta = i;
            }
        }
        System.out.println("La ciudad " + ciudades.get(indiceCiudadTemperaturaMasBaja) + " tuvo la temperatura mas baja " + temperaturaMasBaja);
        System.out.println("La ciudad " + ciudades.get(indiceCiudadTemperaturaMasAlta) + " tuvo la temperatura mas alta " + temperaturaMasAlta);

    }

    private static int obtenerTemperaturaValida(Scanner teclado) {
        //bucle que maneja el error en caso el usuario no ingrese un numero al solicitarle la temperatura baja
        while(true){

            try {
                int temperatura = teclado.nextInt();
                return temperatura;
            } catch (Exception e) {
                System.out.println("Por favor ingrese un numero valido");
                //para borrar el ultimo ingreso del usuario, sino se borra crea un bucle infinito porque sigue comparando con lo ultimo ingresado

                teclado.nextLine();

            }
        }
    }



}