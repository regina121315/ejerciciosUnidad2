import java.util.Scanner;
    class Ejercicio4{
        public static void main(String[] args) {
            Scanner op = new Scanner(System.in);
            System.out.println("Ingresa un numero:");
            int a = op.nextInt();
            System.out.println("ingreda otro numero:");
            int b = op.nextInt();
            int c = a + b;
            System.out.println("La suma de los numeros es: " + c);

        }
    }