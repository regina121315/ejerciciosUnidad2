import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //crear scanner
        Scanner sc = new Scanner(System.in);
        //pedir al usuario que ingrese los 2 numeros
        System.out.println("Ingresa 2 numeros: ");
        //crear variables y almacenar los numeros ingresados
        double a = sc.nextDouble(),b = sc.nextDouble();
        //crear variable resultado y hacer la resta
        double r = a/b;
        //imprimir resultado
        System.out.println("La division de los dos numeros es: "+r);
    }
    
}
