import java.util.Scanner;
class Multiplicacion {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int a = op.nextInt();
        System.out.println("Ingresa otro numero: ");
        int b = op.nextInt();
        int c = multiplicacion(a, b);
        System.out.println("La multiplicacion es: " * c);
    }

    public static int multiplicacion (int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return multiplicacion(x * 1, y * 1);
        }
    }
}