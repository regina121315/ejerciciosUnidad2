import java.util.Scanner;
public class Division {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numerador: ");
        int numerador = sc.nextInt();
        
        System.out.print("Ingrese el denominador: ");
        int denominador = sc.nextInt();
        
        if (denominador == 0) {
            System.out.println("No se puede dividir por cero");
        } else {

            int resultado = division(numerador, denominador);
            
            System.out.println("El resultado es: "+ resultado);
        }
    }

    public static int division(int a, int b) {

        if (a < b) {
            return 0;
        }

        return 1 + division(a - b, b);
    }
}
