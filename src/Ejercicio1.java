public class Ejercicio1 {
    public static int buscar(int[] v, int x){
        for(int i = 0; i < v.length; i++){
            if(v[i] == x){
            return i;
            }
        }
        return -1;
    }

    public static void resultadobusqueda(int[] v, int x){
        int resultado = buscar(v,x); // esto se hace para hacer el recorrido una sola vez.
        if(resultado >= 0){
            System.out.printf("El elemento %d se encuentra en la posicion %d.%n", x, resultado);
        }else{
            System.out.printf("El elemento %d no fue encontrado. Codigo de error: %d%n", x, resultado);
        }
    }

    public static void main (String[] args){
        int[] vector = {4, 8, 15, 16};

        final int x1 = 15;
        final int x2 = 9;

        resultadobusqueda(vector,x1);
        resultadobusqueda(vector,x2);

    }
}