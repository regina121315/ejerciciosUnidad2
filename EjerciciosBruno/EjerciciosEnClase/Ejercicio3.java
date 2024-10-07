import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        //crear scanner
        Scanner sc = new Scanner(System.in);
        //pedirle al usuario que igrese su nombre
        System.out.println("ingresa tu nombre:");
        //crear una variable que pueda almacenar el nombre
        String variableNombre = sc.nextLine();
        //imprimir el nombre ingresado
        System.out.println("Bienvenido "+variableNombre);        
    }
    
}
