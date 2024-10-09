import java.util.Scanner;
class Ejercicio13{
    public static void main(String[] args) {
        
        //Creacion del objeto Scanner
        Scanner sc = new Scanner(System.in);
        //Pedir datos al usuario
        System.out.println("Ingresa un numero: ");
        //Creacion de variable y almacen de datos
        int a = sc.nextInt();

        //Creacion del bucle
        for(int i=0; i<=a; i++){
            //Verificamos si el numero es par a traves del modulo
            if (i % 2 == 0) {
                //Imprimimos el bucle
                System.out.println(i);
            }
        }
    }
}