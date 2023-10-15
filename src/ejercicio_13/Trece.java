package ejercicio_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trece {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);

        List<List<Integer>> matrizAsientos = cargarAsientos(teclado);
        mostrarAsientos(matrizAsientos);

        boolean flag = true;
        

        while (flag) {
            
            //con la funcion getDatosCompra obtenemos los datos que el usuario ingreso por teclado.
            DatosCompra datosCompra = getDatosCompra(teclado);
            int destino = datosCompra.getDestino();
            int vuelo = datosCompra.getVuelo();
            int pasajesAComprar = datosCompra.getPasajesAComprar();

            if (destino >= 0 && destino <= 5) {
                if (vuelo >= 0 && vuelo <= 2) {
                    int cantidadAsientosDisponibles = matrizAsientos.get(destino).get(vuelo);

                    if (pasajesAComprar <= cantidadAsientosDisponibles) {
                        System.out.println("Su compra fue realizada con éxito");
                        int nuevaCantidadAsientosDisponibles = cantidadAsientosDisponibles - pasajesAComprar;
                        matrizAsientos.get(destino).set(vuelo, nuevaCantidadAsientosDisponibles);
                    }else {
                        System.out.println("Cantidad de asientos no disponibles");
                    }
                } else {
                    System.out.println("Vuelo invalido, debe escoger entre 0 y 2");
                }

            } else {
                System.out.println("Destino invalido, debe escoger entre 0 y 5");
            }

            
            System.out.println("Desea continuar reservando? cualquier tecla para continuar, finish para salir");
            if(teclado.nextLine().equalsIgnoreCase("finish")){
                flag = false;
            }
        }

        

        mostrarAsientos(matrizAsientos);


       

    }

















    private static DatosCompra getDatosCompra(Scanner teclado){
        
        DatosCompra datosCompra = new DatosCompra();
        boolean flag = true;
        while(flag){
            //control de errores en caso el usuario ingresa algo que no sea un número por teclado.
            try{

                if(datosCompra.getDestino() == -1){
                    System.out.println("Ingrese el numero de destino al que quiere dirigirse");
                    datosCompra.setDestino(teclado.nextInt());
                }
                
                if (datosCompra.getVuelo() == -1){
                    System.out.println("Ingrese el numero de vuelo");
                    datosCompra.setVuelo(teclado.nextInt());
                }

                if (datosCompra.getPasajesAComprar() == -1){
                    System.out.println("Ingrese la cantidad de pasajes que necesita");
                    datosCompra.setPasajesAComprar(teclado.nextInt());
                }
                flag = false;
                
            }catch(Exception e){
                System.out.println("Debe ingresar un numero valido");
                teclado.nextLine();
                continue;

                
            }
            teclado.nextLine();
        }

        return datosCompra;
            
    }

    private static void mostrarAsientos(List<List<Integer>> matrizAsientos) {
        matrizAsientos.forEach(asientos -> {
            asientos.forEach(asiento -> {
                System.out.print(asiento + "  ");
            });

            System.out.println("");
        });
    }

    private static List<List<Integer>> cargarAsientos(Scanner teclado) {
        List<List<Integer>> matrizAsientos = new ArrayList();

        int destinos = 6;
        int vuelos = 3;

        for (int i = 0; i < destinos; i++){
            List<Integer> asientos = new ArrayList<Integer>();
            for (int j = 0; j < vuelos; j++){
             System.out.println("Ingrese la cantidad de asientos disponibles para el destino "+ i + " y vuelo " + j);
                asientos.add(teclado.nextInt());

            }
            matrizAsientos.add(asientos);
            teclado.nextLine();

        }
        return matrizAsientos;
    }
}
