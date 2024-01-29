import java.util.Arrays;

public class RadixSort <T extends Comparable<T>> implements ISort<T>{


    /**
     * Método que realiza el ordenamiento del array utilizando el algoritmo "Radix Sort".
     *
     * @param array el array a ser ordenado.
     * @return el array ordenado.
     */
    @Override
    public T[] sort(T[] array) {
        // Encontrar el número máximo para determinar la cantidad de dígitos
        T max = Arrays.stream(array).max(Comparable::compareTo).get();
        int exp = 1;

        // Aplicar el counting sort para cada dígito
        while (((Integer) max / exp) > 0) {
            countingSort(array, exp);
            exp *= 10;
        }

        // Se devuelve el array ordenado.
        return array;
    }


    /**
     * Método que realiza el ordenamiento de un array utilizando el algoritmo "Counting Sort"
     * para un dígito específico (exp).
     *
     * @param array el array a ser ordenado.
     * @param exp el dígito por el cual se ordena.
     */
    public void countingSort(T[] array, int exp) {
        int n = array.length;
        T[] output = Arrays.copyOf(array, n);

        int[] count = new int[10]; // Hay 10 dígitos posibles

        // Contar la frecuencia de cada dígito
        for (int i = 0; i < n; i++) {
            count[((Integer) array[i] / exp) % 10]++;
        }

        // Ajustar count[i] para obtener la posición real del dígito en output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Construir el array de salida
        for (int i = n - 1; i >= 0; i--) {
            output[count[((Integer) array[i] / exp) % 10] - 1] = array[i];
            count[((Integer) array[i] / exp) % 10]--;
        }

        // Copiar el array de salida al array original
        System.arraycopy(output, 0, array, 0, n);
    }

}
