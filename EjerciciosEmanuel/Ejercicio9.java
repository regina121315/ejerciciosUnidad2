import java.util.Scanner;
    class Ejercicio9{
        public static void main(String[] args) {
            Scanner op = new Scanner(System.in);
            System.out.println("Ingresa tu Nombre:");
            String a = op.nextLine();
            System.out.println("Ingresa tu edad:");
            int b = op.nextInt();
            if (b>=18){
                System.out.println("Nombre: " + a);
                System.out.println("Eres mayor de edad");
                }else{
                System.out.println("Eres menor de edad");    
                }
        }
    }