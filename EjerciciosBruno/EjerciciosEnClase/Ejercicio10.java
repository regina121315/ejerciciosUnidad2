import java.util.Scanner;
class Ejercicio10{
    public static void main(String[] args) {
        
        //Creacion del objeto Scanner
        Scanner sc = new Scanner (System.in);

        //Pedir datos al usuario
        System.out.println("Ingresa un numero hasta el cual imprimir: ");
        //Crear variable y almacenar datos
        int a = sc.nextInt();

        //Creacion del bucle for para iterar hasta el numero ingresado
        for(int i=0; i<=a; i++){
            //Imprimir el ciclo
            System.out.println(i);
        }
    }
}