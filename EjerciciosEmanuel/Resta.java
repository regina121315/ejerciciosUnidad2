import java.util.Scanner;
class Resta {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int a = op.nextInt();
        System.out.println("Ingresa otro numero: ");
        int b = op.nextInt();
        int c = resta(a, b);
        System.out.println("La resta es: " + c);
    }

    public static int resta(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return resta(x - 1, y - 1);
        }
    }
}