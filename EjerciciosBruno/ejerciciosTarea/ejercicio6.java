import java.util.Scanner;

public class ejercicio6 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario la base del rectángulo
        System.out.print("Ingresa la base del rectángulo: ");
        double base = sc.nextDouble();
        
        // Pedir al usuario la altura del rectángulo
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = sc.nextDouble();
        
        // Llamar a la función calcularArea y almacenar el resultado
        double area = calcularArea(base, altura);
        
        // Mostrar el resultado del área
        System.out.println("El área del rectángulo con base " + base + " y altura " + altura + " es: " + area);

    }
    // Función para calcular el área del rectángulo
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }
}
