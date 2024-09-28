import java.util.Scanner;
class SumaSucesiva {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("¿Cuantos numeros quieres sumar?");
        int a = op.nextInt();
        int b = sumaSucesiva(a, op);
        System.out.println("La suma de los numeros es: " + b);
    }
    public static int sumaSucesiva(int x, Scanner y) {
        if (x == 0) {
            return 0;
        } else {
            System.out.println("Ingresa un numero: ");
            int c = y.nextInt();
            return c + sumaSucesiva(x - 1, y);
        }
    }
}