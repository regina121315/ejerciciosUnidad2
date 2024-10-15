import java.util.Scanner;

public class ejercicio8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario la base del cuadrado
        System.out.print("Ingresa la base del cuadrado: ");
        double base = sc.nextDouble();
        
        // Llamar a la función calcularArea y almacenar el resultado
        double area = calcularArea(base);
        
        // Mostrar el resultado del área
        System.out.println("El área del cuadrado con base " + base + " es: " + area);
    }
    // Función para calcular el área del cuadrado
    public static double calcularArea(double base) {
        return base * base;
    }
}
