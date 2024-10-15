public class ejercicio12 {

    public static void main(String[] args) {
        // Declarar un arreglo con los caracteres de tu nombre
        char[] nombre = {'B', 'r', 'u', 'n', 'o'};

        // Llamar a la función para imprimir los caracteres del arreglo
        imprimirCaracteres(nombre);
    }

    // Función para iterar e imprimir los elementos de un arreglo de caracteres
    public static void imprimirCaracteres(char[] nombre) {
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i]);
        }
    }
}
