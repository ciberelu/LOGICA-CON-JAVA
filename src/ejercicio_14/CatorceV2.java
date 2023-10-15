package ejercicio_14;

public class CatorceV2 {
    public static void main(String[]args){
        System.out.println("Let's draw a Christmas tree.");

   
        int filas = 10;
        

        //ciclo para el dibujo de las hojas

        for (int i = 0; i < filas; i++){
           
            //obtiene la cantidad de espacios en blanco que se necesita
            int enBlanco = filas - i -1;
            //obitene la cantidad de asteriscos que hay que pintar
            //se suma i + i para que la asignacion de asteriscos se aumente de dos en dos y se le suma 1 para que sea impar
            //porque como i aumenta de uno en uno al sumarse a si misma va aumentar de dos en dos
            int asteriscos = i + i + 1 ;

            //imprime la cantidad de espacios en blanco nesecarios
            for (int j = 0; j < enBlanco;j++){
                dibujarEspaciosEnBlanco();
            }

            for (int j = 0; j < asteriscos; j++){
                dibujarAsterisc();
            }
           
            System.out.println("");
        }


        //ciclo para el dibujo del tronco
        int alturaTronco = (int) filas / 2;
        for (int i = 0; i < alturaTronco; i++){
            int enBlanco = filas - 1 -1;

            //dibuja los espacis para el tronco, considerando que se usaran 3 caracteres para el tronco
            for (int j = 0; j < enBlanco;j++){
                dibujarEspaciosEnBlanco();
            }

            dibujarTronco();
            System.out.println("");

        }
    }




    public static void dibujarEspaciosEnBlanco(){
        System.out.print(" ");
    }

    public static void dibujarAsterisc(){
        System.out.print("*");
        
    }

    public static void dibujarTronco(){
        System.out.print("|||");
    }
}
