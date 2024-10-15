import java.util.Scanner;

public class ejercicio9 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el perímetro del polígono
        System.out.print("Ingresa el perímetro del polígono: ");
        double perimetro = sc.nextDouble();
        
        // Pedir al usuario la apotema del polígono
        System.out.print("Ingresa la apotema del polígono: ");
        double apotema = sc.nextDouble();
        
        // Llamar a la función calcularArea y almacenar el resultado
        double area = calcularArea(perimetro, apotema);
        
        // Mostrar el resultado del área
        System.out.println("El área del polígono con perímetro " + perimetro + " y apotema " + apotema + " es: " + area);
    }
    // Función para calcular el área de un polígono regular
    public static double calcularArea(double perimetro, double apotema) {
        return (perimetro * apotema) / 2;
    }
}
