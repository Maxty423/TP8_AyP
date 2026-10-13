import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio6 {
    public static void ordenarAcend(int[] v){
        Arrays.sort(v);
    }
    public static void ordenarDesc (int[] v) {
        Arrays.sort(v);

        for (int i = 0; i < v.length / 2; i++) {
            int temp = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = temp;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];
        System.out.println();
        for (int i = 0; i< vector.length; i++){
            System.out.println("Ingrese el valor de la posicion " + (i+1) +":");
            vector[i] = scanner.nextInt();
        }
        System.out.println("El vector cargado es: " + Arrays.toString(vector));
        ordenarAcend(vector);
        System.out.println("El vector ordenado de menor a mayor es: " + Arrays.toString(vector));
        ordenarDesc(vector);
        System.out.println("El vector ordenado de mayor a menor es: " + Arrays.toString(vector));
    }
}
