import java.util.Scanner;
    class Ejercicio7{
        public static void main(String[] args) {
            Scanner op = new Scanner(System.in);
            System.out.println("Ingresa un numero:");
            int a = op.nextInt();
            System.out.println("Ingresa el siguiente numero:");
            int b = op.nextInt();
            int c = a / b;
            System.out.println("La divicion de los dos numeros es: " + c);
        }
    }