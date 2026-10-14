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

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese valores aleatorios, para ver si se encuentran en el vector generado: ");
        int eleccion = scanner.nextInt();
        do{
            System.out.println("Incorrecto, intente otro numero");
            eleccion = scanner.nextInt();
        }while (!estaEnElVector(eleccion, vector)); // se le agrega el "!" para que se repita mientras NO esta en el vector.
        System.out.println("Correcto, el número " + eleccion + " se encuentra en el vector.");
        scanner.close();
    }
}