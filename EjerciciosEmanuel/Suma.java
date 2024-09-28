import java.util.Scanner;
class Suma {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int a = op.nextInt();
        System.out.println("Ingresa otro numero: ");
        int b = op.nextInt();
        int c = suma(a, b);
        System.out.println("La suma es: " + c);
    }

    public static int suma(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return suma(x + 1, y - 1);
        }
    }
}