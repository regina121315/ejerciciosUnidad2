import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //crear scanner 
        Scanner sc = new Scanner(System.in);
        //pedir al usuario que ingrese 2 numeros
        System.out.println("Ingresa 2 numeros: ");
        //crear variables y almacenar valores ingresados
        int a = sc.nextInt(),b = sc.nextInt();
        //crear variable que almacene el resultado de la suma de los dos numeros
        int r = a+b;
        //imprimir la suma de los dos numeros
        System.out.println("La suma de los dos numeros es: "+r);
    }
    
}