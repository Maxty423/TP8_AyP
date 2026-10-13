import java.util.Arrays;
public class Ejercicio4 {
    public static void ordenarDesc(int[] v){
        for (int i = 0; i < v.length-2; i++){
            int pos = i;
            for (int j = i+1; j < v.length; j++){
                if (v[j] > v[pos]) pos = j;
            }
            int t = v[i];
            v[i] = v[pos];
            v[pos] = t;
        }
    }
    public static void main (String[] args){
        int[] v = {5, 2, 8, 1};
        ordenarDesc(v);
        System.out.println(Arrays.toString(v));
    }
}
