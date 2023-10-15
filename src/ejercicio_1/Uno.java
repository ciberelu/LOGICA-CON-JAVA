package ejercicio_1;

public class Uno {
    public static void main(String[] args){
       int num1 = 20;
       int num2 = 35;

       System.out.println("-----valores anteriores------");
       System.out.println("Numero 1 = " + num1);
       System.out.println("Numero 2 = " + num2);
        System.out.println("----------------------------");

       System.out.println("-----valores intercambiados------");
       int aux = num1;
       num1 = num2;
       num2 = aux;
       System.out.println("Numero 1 = " + num1);
       System.out.println("Numero 2 = " + num2);
        System.out.println("----------------------------");



    }
}
