import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //crear scanner
        Scanner sc = new Scanner(System.in);
        //pedir al usuario que ingrese los 2 numeros
        System.out.println("Ingresa 2 numeros: ");
        //crear variables y almacenar los numeros ingresados
        int a = sc.nextInt(),b = sc.nextInt();
        //crear variable resultado y hacer la resta
        int b = a-b;
        //imprimir resultado
        System.out.println("La resta de los dos numeros es: "+b);
    }
    
}