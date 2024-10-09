import java.util.Scanner;
class Ejercicio11{
    public static void main(String[] args) {
        
        //Creacion del objeto Scanner
        Scanner sc = new Scanner (System.in);

        //Pedir datos al usuario
        System.out.println("Ingresa un numero: ");
        //Crear variable y almacenar datos
        int numero = sc.nextInt();

        int x = 0;
 
        //Creacion del bucle e impresion del mismo
        while (x <= numero) {
            System.out.println(x);
            //Sumar +1 a la variable x
            x++;
            
        }

    }
}