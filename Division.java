import java.util.Scanner;
class Division {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int a = op.nextInt();
        System.out.println("Ingresa otro numero: ");
        int b = op.nextInt();
        int c = division(a, b);
        System.out.println("La division es: "/ c);
    }

    public static int division(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return division(x / 1, y / 1);
        }
    }
}