import java.util.Scanner;
    class Ejercicio11{
        public static void main(String[] args) {
            Scanner op = new Scanner(System.in);
            System.out.println("Ingresa un numero:");
            int a = op.nextInt();
            int b = 0;
            while (b <= a){
                System.out.println(b);
                b++;
            }
        }
    }