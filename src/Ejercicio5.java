import java.util.Arrays;
public class Ejercicio5 {

    public static void ordenarConSort(int[] v){
        Arrays.sort(v);
    }

    public static void main(String[] args) {
        int[] v = {5, 2, 8, 1};
        ordenarConSort(v);
        System.out.println(Arrays.toString(v));
    }

}
