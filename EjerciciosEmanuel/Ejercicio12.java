import java.util.Scanner;
    class Ejercicio12{
        public static void main(String[] args) {
            Scanner op = new Scanner(System.in);
            System.out.println("Ingresa un numero:");
            int a = op.nextInt();
            int b = 0;
            do { 
                System.out.println(b);
                b++;
            } while (b <= a);        
         }
     }