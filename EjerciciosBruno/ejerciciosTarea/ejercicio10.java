public class ejercicio10 {
    public static void main(String[] args) {
        // Declarar un arreglo de 10 palabras
        int[] numeros={1,2,3,4,5,6,7,8,9,10};
        
        // Llamar a la función para imprimir los elementos del arreglo
        imprimirArreglo(numeros);

    }
    // Función para iterar e imprimir los elementos de un arreglo de palabras
    public static void imprimirArreglo(int[] numeros) {
        for(int i=0; i<=numeros.length; i++){
            System.out.println(i);
        }
    }
}
