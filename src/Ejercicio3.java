import java.util.Arrays;
public class Ejercicio3 {
    public static void ordenarSeleccion(int[]v){
        for (int i = 0; i < v.length - 1; i++){
            int pos = i;
            for (int j = i + 1; j < v.length; j++){
                if (v[j] < v[pos]) pos = j;
            }
            int t = v[pos];
            v[pos] = v[i];
            v[i] = t;
        }
    }

    public static void main(String[] args) {
        int[] v = {5, 2, 8, 1};
        ordenarSeleccion(v);
        System.out.println(Arrays.toString(v)); //Arrays to string, para mostrar el vector sin usar for.
    }
}