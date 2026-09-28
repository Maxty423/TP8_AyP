import java.util.Arrays; // Debes importar la librería

public class Extra_UsodelArray {
    public static void main(String[] args) {
        int[] numeros = {15, 3, 8, 1, 24};

        Arrays.sort(numeros); // Ordena el arreglo directamente

        System.out.println(Arrays.toString(numeros));
        // Imprime: [1, 3, 8, 15, 24]

        String[] nombres = {"Pedro", "Ana", "Carlos", "Beatriz"};
        Arrays.sort(nombres);

        System.out.println(Arrays.toString(nombres));
        // Imprime: [Ana, Beatriz, Carlos, Pedro]

    }
}
// Arrays.sort() es un metodo ya programado e integrado en Java (dentro de la librería java.util.Arrays)
// que sirve para ordenar los elementos de un arreglo de forma rápida y sencilla, sin que tengas
// que implementar manualmente algoritmos de ordenamiento como Burbuja, Selección o Inserción.