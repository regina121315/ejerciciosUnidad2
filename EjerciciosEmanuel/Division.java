import java.util.Scanner;

class Division {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int a = op.nextInt();
        System.out.println("Ingresa otro numero: ");
        int b = op.nextInt();
        int c = division(a, b);
        if (c == 0) {
            System.out.println("El divisor no puede ser 0.");
        } else {
            System.out.println("El resultado de la division es: " + c);
        }
    }
    public static int division(int x, int y) {
        if (x < y) {
            return 0;
        } else {
            return 1 + division(x - y, y);
        }
    }
}