import java.util.Scanner;

class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar la edad
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Determinar si es mayor o menor de edad
        if (edad >= 18) {
            System.out.println(nombre + ", eres mayor de edad.");
        } else {
            System.out.println(nombre + ", eres menor de edad.");
        }

        // Cerrar el scanner
        scanner.close();
    }

