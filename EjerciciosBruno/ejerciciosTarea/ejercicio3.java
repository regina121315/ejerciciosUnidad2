import java.util.Scanner;

public class ejercicio3 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el primer número
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        
        // Pedir al usuario el segundo número
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();
        
        // Llamar a la función multiplicar y almacenar el resultado
        int resultado = multiplicar(num1, num2);
        
        // Mostrar el resultado de la multiplicacion
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + resultado);
    }
    
    // Función para multilpicar dos números
    public static int multiplicar(int a, int b) {
        return a * b;
    }
}
