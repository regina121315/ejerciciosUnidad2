import java.util.Scanner;
class Ejercicio9 {
    public static void main (String []arcs){
        
    //Creacion del objeto scanner
    Scanner sc = new Scanner(System.in);
    
    //Pedir datos al usuario
    System.out.println("Ingresa tu nombre: ");
    //Crear variable y almacenar datos
    String nombre = sc.nextLine();

    //Pedir datos al usuario
    System.out.println("Ingresa tu edad: ");
    //Crear variable y almacenar datos
    int edad = sc.nextInt();
    
    //Condicion "if"
    if (edad<18) {
        //Si el numero es menor que 18, menor de edad
        System.out.println("Tu nombre es "+nombre+ " y eres menor de edad.");
    }
    else{
        //Si el numero es mayor que 18, mayor de edad
        System.out.println("Te nombre es " +nombre+ " y eres mayor de edad.");
    }

    }
}