import java.util.Scanner;
class Ejercicio12{
    public static void main(String[] args) {
        
        //Creacion del objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Pedir datos al usuario
        System.out.println("Ingresa un numero: ");
        //Creacion de la variable y almacen de datos
        int numero = sc.nextInt();

        //Declaracion de una variable, con el punto de inicio para el ciclo
        int x=0;

        //Creacion del bucle do-while
        do{
            //Impresion del bucle
            System.out.println(x);
            //Sumarle +1 a la variable x
            x++;
        } while (x<numero);
    }
}