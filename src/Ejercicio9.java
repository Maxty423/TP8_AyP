import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio9 {
    public static int[] generarVector(int N){
        int[] vector = new int[N];
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * 99)+1;
        }
        Arrays.sort(vector);
        return vector;
    }

    public static boolean estaEnElVector(int entrada, int[] vector){
        for(int i = 0; i < vector.length; i++){
            if (entrada == vector[i]) return true; //no hace falta un break.
        }
        return false;
    }

    public static void main(String[] args) {
        final int N = 10;
        int[] vector = generarVector(N);
        int fallos = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese valores aleatorios, para ver si se encuentran en el vector generado: ");
        int eleccion = scanner.nextInt();
        while (!estaEnElVector(eleccion, vector)){ // se le agrega el "!", para que se repita mientras NO está en el vector.
            System.out.println("Incorrecto, intente otro numero");
            fallos++;
            eleccion = scanner.nextInt();
        }
        System.out.println("Correcto, el número " + eleccion + " se encuentra en el vector.");
        double porcentaje = (1.0 / (fallos + 1)) * 100;
        System.out.printf("Porcentaje de acierto del %.2f%%\n", porcentaje);
        scanner.close();
        System.out.println("Vector generado: " + Arrays.toString(vector));
    }
}