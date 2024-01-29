public class MergeSort <T extends Comparable<T>> implements ISort<T> {

    /**
     * Método que realiza el ordenamiento del array utilizando el algoritmo "Merge Sort".
     *
     * @param array el array a ser ordenado.
     * @return el array ordenado.
     */
    @Override
    public T[] sort(T[] array) {
        int n = array.length;

        // Iterar sobre los diferentes tamaños de subarrays
        for (int currSize = 1; currSize < n; currSize = 2 * currSize) {
            // Iterar sobre los subarrays y fusionarlos
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {
                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);

                merge(array, leftStart, mid, rightEnd);
            }
        }

        // Se devuelve el array ordenado.
        return array;
    }
    /**
     * Método que fusiona dos subarrays ordenados en un array principal.
     *
     * @param array el array principal que contiene los subarrays a fusionar.
     * @param left el índice de inicio del primer subarray.
     * @param mid el índice final del primer subarray y el inicio del segundo subarray.
     * @param right el índice final del segundo subarray.
     */
    private void merge(T[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Crear arrays temporales
        T[] leftArray = (T[]) new Comparable[n1];
        T[] rightArray = (T[]) new Comparable[n2];

        // Copiar datos a los arrays temporales
        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        // Fusionar los arrays temporales
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // Copiar los elementos restantes de leftArray, si los hay
        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        // Copiar los elementos restantes de rightArray, si los hay
        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }
}