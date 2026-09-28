public class Ejercicio1 {
    public static int buscar(int[]v, int x){
        for(int i = 0; i < v.length; i++){
            if(v[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] v = {4, 8, 15, 16};
        System.out.println(buscar(v,15));
        System.out.println(buscar(v,9));
    }
}
//codigo basico, este no tiene scanner, solo es el codigo de busqueda lineal.