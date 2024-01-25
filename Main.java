public class Main {
    public static void main(String[] args) {

        //Generar archivo
        DataManager.numerosRandom("datos.txt", 3000);

        // Se almacenar los números en el array
        Integer [] numeros = DataManager.saveNumbers(10, "datos.txt");

        // Se ordena el array con los algoritmo de ordenamiento
        GnomeSort gnomeSort = new GnomeSort();
        //sort.sort(DataManager.saveNumbers(10, "datos.txt"));
        InsertionSort insertionsort = new InsertionSort();
        //insertionsort.sort(DataManager.saveNumbers(10, "datos.txt"));
        QuickSort quickSort = new QuickSort();
        RadixSort radixSort = new RadixSort();

        System.out.println("no ordenado");
        imprimirArray(numeros);
        radixSort.sort(numeros);
        System.out.println("ordenado");
        imprimirArray(numeros);




    }

    private static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
