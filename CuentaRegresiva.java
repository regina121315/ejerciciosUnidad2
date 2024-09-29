import java.util.Scanner;
class CuentaRegresiva {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Ingresa un numero para iniciar la cuenta regresiva: ");
        int a = op.nextInt();
        System.out.println("Cuenta regresiva:");
        cuentaRegresiva(a);
    }
    public static void cuentaRegresiva(int x) {
        if (x == 0) {
            System.out.println("TIEMPO");
        } else {
            System.out.println(x);
            cuentaRegresiva(x - 1);
        }
    }
}