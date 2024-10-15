import java.util.Scanner;

public class ejercicio1 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el primer número
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        
        // Pedir al usuario el segundo número
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();
        
        // Llamar a la función sumar y almacenar el resultado
        int resultado = sumar(num1, num2);
        
        // Mostrar el resultado de la suma
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
    }
    
    // Función para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }
}
