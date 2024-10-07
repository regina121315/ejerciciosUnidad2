import java.util.Scanner;
class CuentaRegresiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero para la cuenta regresiva: ");
        int a = sc.nextInt();

        System.out.println("---Cuenta regresiva---");
        cuentaRegresiva(a);

    }
    public static void cuentaRegresiva(int x) {
        if (x == 0) {
            System.out.println("Fin");
        } else {
            System.out.println(x);
            cuentaRegresiva(x - 1);
        }
    }
}