import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el lado del cuadrado
        System.out.print("Ingresa el lado del cuadrado: ");
        double lado = sc.nextDouble();
        
        // Llamar a la función calcularArea y almacenar el resultado
        double area = calcularArea(lado);
        
        // Mostrar el resultado del área
        System.out.println("El área del cuadrado con lado " + lado + " es: " + area);
        
    }
    // Función para calcular el área del cuadrado
    public static double calcularArea(double lado) {
        return lado * lado;
    }
}
