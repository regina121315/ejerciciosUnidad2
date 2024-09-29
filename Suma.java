import java.util.Scanner;

class Suma {
  public static void main(String[] args) {
    Scanner op = new Scanner(System.in);
    System.out.println("Ingresa un numero:");
    int numero1 = op.nextInt();
    System.out.println("Ingresa otro numero:");
    int numero2 = op.nextInt();
    int r = sumaRecursiva(numero1, numero2);
    System.out.println("El resultado es: " + r + ":)");
  }

  public static int sumaRecursiva(int a, int b) {  
    if (a == 0) {
      return b;
    } 
    return sumaRecursiva(a - 1, b + 1);
  }
}