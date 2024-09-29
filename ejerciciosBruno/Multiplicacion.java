import java.util.Scanner;
public class Multiplicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        
        int resultado = multiplicacion(num1, num2);
        
        System.out.println("El resultado es: "+ resultado);
    }

    public static int multiplicacion(int a, int b) {

        if (b == 0) {
            return 0;
        }

        if (b < 0) {
            return -multiplicacion(a, -b);
        }

        return a + multiplicacion(a, b - 1);
    }
}
