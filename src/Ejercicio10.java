public class Ejercicio10 {
    public static void ordenarIndice(int[] datos, int[] indice){
        for(int i = 0; i < datos.length-1; i++){
            int pos = i;
            for (int j = i + 1; j < datos.length; j++){
                if (datos[indice[j]] > datos[indice[pos]]) pos = j;
            }
            int t = indice[pos];
            indice[pos] = indice[i];
            indice[i] = t;
        }
    }

    public static int[] generarIndice(int[] vector){
        int[] Indice = new int[vector.length];
        for(int i = 0; i < Indice.length; i++){
            Indice[i] = i;
        }
        return Indice;
    }

    public static void mostrarMayorAMenor(String[] meses, int[] lluvia, int[] indice){
        System.out.println("Las precipitaciones de los meses del año fueron: ");
        for(int i = 0; i < indice.length; i++){
            System.out.println(meses[indice[i]] + " con " + lluvia[indice[i]]+"% ");
        }
        System.out.println();
    }

    public static void promedio(String[] meses, int[] lluvia, int[] indice){
        int sumaTotal = 0;
        for (int i = 0; i < lluvia.length; i++) {
            sumaTotal += lluvia[i];
        }
        float promedio = (float) sumaTotal / lluvia.length;

        System.out.printf("El promedio de lluvia anual es de %.2f mm\n\n", promedio);

        System.out.println("Meses que superaron el promedio anual:");
        for (int i = 0; i < lluvia.length; i++) {
            if (lluvia[i] > promedio) {
                System.out.println("- " + meses[i] + " con " + lluvia[i] + " mm");
            }
        }
    }

    public static void main(String[] args) {
        String[] meses = {"Ene", "Feb", "Mar", "Abr", "May", "Jun",
                          "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};
        int[] lluvia = {60, 55, 70, 80, 75, 65, 60, 55, 70, 75, 80, 85};
        int[] indice = generarIndice(lluvia);
        ordenarIndice(lluvia, indice);
        mostrarMayorAMenor(meses,lluvia,indice);
        promedio(meses,lluvia,indice);
    }
}