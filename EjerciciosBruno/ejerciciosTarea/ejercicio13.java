import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = pedirNumeroMayorA20(scanner);
        System.out.println("Número válido ingresado: " + numero);
    }

    // Función para pedir un número mayor a 20 y validar la entrada
    public static int pedirNumeroMayorA20(Scanner scanner) {
        int numero;
        while (true) {
            System.out.print("Por favor, ingresa un número mayor a 20: ");
            numero = scanner.nextInt();
            if (numero > 20) {
                break;
            } else {
                mostrarMensajeError();
            }
        }
        return numero;
    }

    // Función para mostrar un mensaje de error
    public static void mostrarMensajeError() {
        System.out.println("Error: El número debe ser mayor a 20. Inténtalo de nuevo.");
    }
}
