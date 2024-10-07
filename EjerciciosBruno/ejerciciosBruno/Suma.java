import java.util.Scanner;
public class Suma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        
        int resultado = operacionSuma(num1, num2);
        
        System.out.println("El resultado es: "+resultado);
    }

    public static int operacionSuma(int a, int b) {
        if (b == 0) {
            return a;
        }
        return operacionSuma(a + 1, b - 1);
    }
}
