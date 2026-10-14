import java.util.Arrays;

public class Ejercicio7 {
    public static int[] mezclar(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        int i = 0; int j = 0; int k = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {//acá, si sobraron, los pegamos.
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {//si sobraron, los pegamos.
            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4};
        int[] b = {2, 6, 8, 9};
        System.out.println("Los vectores dados son: " + Arrays.toString(a) + " Y " + Arrays.toString(b));
        int[] c = mezclar(a,b);
        System.out.println("Los vectores mezclados son: " + Arrays.toString(c));
    }
}