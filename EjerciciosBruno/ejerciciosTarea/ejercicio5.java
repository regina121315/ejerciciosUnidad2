import java.util.Scanner;

public class ejercicio5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el primer número
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        
        // Pedir al usuario el segundo número
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();
        
        // Llamar a la función modulo y almacenar el resultado
        int resultado = modulo(num1, num2);
        
        // Mostrar el resultado del modulo
        System.out.println("El modulo de " + num1 + " y " + num2 + " es: " + resultado);
    }
    
    // Función para multilpicar dos números
    public static int modulo(int a, int b) {
        return a % b;
    }
}
