import java.util.Scanner;

public class Ejercicio15 { 
    public static void main(String[] args) {  
        //Creacion del objeto Scanner
        Scanner sc = new Scanner(System.in);  
        //Declaracion de variable
        int a;

            // Inicio de un bucle do-while interno
            do {  
                //Pedir datos al usuario
                System.out.println("ingresa el numero");
                //Lectura de datos
                a = sc.nextInt();
                // Comprueba si el número ingresado es menor que 0
                if (a < 0) {
                    // Si 'a' es menor que 0, imprime "error"
                    System.out.println("error");  
                }

            } 
             // El bucle interno se repetirá mientras 'a' sea menor que 0
            while (a < 0); 

            for (int i = 0; i <= a; i++) {
                //Comprobacion si el numero es par
                if (i % 2 == 0) {
                    //Imprimir los numeros pares
                    System.out.println("Numeros pares: " + i);
                }
            }

            for (int x = 0; x <= a; x++) {
                //Comprobacion si el numero es impar
                if (x % 2 != 0) {  
                    //Imprimir los numeros impares
                    System.out.println("Numeros impares: " + x);
                }
            }
        } 
    }