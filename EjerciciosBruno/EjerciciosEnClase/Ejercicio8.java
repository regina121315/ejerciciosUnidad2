import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //crear scanner
        Scanner sc = new Scanner(System.in);
        //pedir al usuario que ingrese los 2 numeros
        System.out.println("Ingresa 2 numeros: ");
        //crear variables y almacenar los numeros ingresados
        int a = sc.nextInt(),b = sc.nextInt();
        //crear variable resultado y hacer la resta
        int r = a%b;
        //imprimir resultado
        System.out.println("El modulo de los dos numeros es: "+r);
    }
    
}
