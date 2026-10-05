public class Ejercicio2 {
    public static int binaria(int[] v, int x){
        int inicio = 0;
        int fin = v.length - 1;
        while (inicio <= fin){
            int medio = inicio + (fin - inicio) / 2;
            if (v[medio] == x) return medio;
            if (v[medio] < x) inicio = medio + 1;
            else fin = medio - 1;
            }
        return -1;
    }

    public static void mostrarResultado(int[] v,int x){
        int resultado = binaria(v,x); // esto se hace para hacer el recorrido una sola vez.
        if(resultado >= 0){
            System.out.printf("El elemento %d se encuentra en la posicion %d.%n", x, resultado);
        }else{
            System.out.printf("El elemento %d no fue encontrado. Codigo de error: %d%n", x, resultado);
        }
    }

    public static void main (String[] args){
    final int[] vector = {3, 5, 10, 15, 17, 24, 30};

    mostrarResultado(vector, 15);
    mostrarResultado(vector, 9);

    }
}
/*
 * Para un vector de N = 1000 elementos:
 * - Búsqueda Lineal: En el peor de los casos (si el elemento está al final o no existe),
 *   hace hasta 1000 comparaciones (O(N)).
 *
 * - Búsqueda Binaria: En el peor de los casos, al dividir la búsqueda a la mitad en cada paso,
 *   hace como mucho 10 comparaciones (O(log2 N)), ya que 2^10 = 1024 >= 1000.
 */