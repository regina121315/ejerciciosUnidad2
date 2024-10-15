public class ejercicio11 {
    public static void main(String[] args) {
        // Declarar un arreglo de 10 palabras
        String[] palabras={"Java", "Fantasma", "Hola", "Tecla", "Bladee","D&G", "Area51", "Otoño", "Adios", "Acabo"};
        
        // Llamar a la función para imprimir los elementos del arreglo
        imprimirArreglo(palabras);

    }
    // Función para iterar e imprimir los elementos de un arreglo de palabras
    public static void imprimirArreglo(String[] palabras) {
        for (int i=0; i<palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
    
}
