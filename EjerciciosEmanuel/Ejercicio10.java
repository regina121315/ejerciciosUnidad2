import java.util.Scanner;
    class Ejercicio10{
        public static void main(String[] args) {
            Scanner op = new Scanner(System.in);
            System.out.println("Ingresa un numero:");
            int a = op.nextInt();
            for (int i = 0; i <= a; i++){
                System.out.println(i);
            }
        }
    }