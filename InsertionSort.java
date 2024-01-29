public class InsertionSort <T extends Comparable<T>> implements ISort<T> {


    /**
     * Método que realiza el ordenamiento del array utilizando el algoritmo "Insertion Sort".
     *
     * @param arr el array a ser ordenado.
     * @return el array ordenado.
     */
    @Override
    public T[] sort(T[] arr) {
        int n = arr.length;

        // Iterar a través del array, comenzando desde el segundo elemento.
        for (int i = 1; i < n; ++i) {
            T key = arr[i]; // Elemento actual que se va a insertar en su posición correcta.
            int j = i - 1;

            // Mover los elementos mayores a key una posición adelante
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key; // Colocar el elemento key en su posición correcta.
        }

        // Se devuelve el array ordenado.
        return arr;
    }

}

