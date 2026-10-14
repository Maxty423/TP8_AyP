import java.util.Arrays;

public class Ejercicio8 {

    public static void ordenarIndice(int[] datos, int[] indice){
        for(int i = 0; i < datos.length-1; i++){
            int pos = i;
            for (int j = i + 1; j < datos.length; j++){
                if (datos[indice[j]] < datos[indice[pos]]) pos = j;
            }
            int t = indice[pos];
            indice[pos] = indice[i];
            indice[i] = t;
        }
    }

    public static void main(String[] args) {
        int[] datos = {50, 20, 40, 10};
        int[] indice = {0, 1, 2, 3};

        System.out.println("El vector dado es:  " + Arrays.toString(datos));

        ordenarIndice(datos, indice);

        System.out.print("El vector ordenado es: [");
        for(int i = 0; i < datos.length; i++){
            System.out.print(datos[indice[i]]+",");
        }
        System.out.println("]");
        System.out.println("El indice reordenado es: " + Arrays.toString(indice));

    }
}