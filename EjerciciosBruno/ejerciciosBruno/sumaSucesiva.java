import java.util.Scanner;
public class sumaSucesiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número hasta el cual quieres sumar: ");
        int numero = sc.nextInt();

        int resultado = sumaRecursiva(numero);
        System.out.println("La suma de los números de 1 a " + numero + " es: " + resultado);

    }

    public static int sumaRecursiva(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + sumaRecursiva(n - 1);
        }
    }
}