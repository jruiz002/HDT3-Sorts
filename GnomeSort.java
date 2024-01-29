public class GnomeSort <T extends Comparable<T>> implements ISort<T> {

    /**
     * Método que realiza el ordenamiento del array utilizando el algoritmo "Bubble Sort".
     *
     * @param array el array a ser ordenado.
     * @return el array ordenado.
     */
    @Override
    public T[] sort(T[] array) {
        int index = 0;

        // Se itera a través del array
        while (index < array.length) {
            // Si es el primer elemento o el elemento actual es mayor o igual al anterior,
            // se avanza al siguiente índice.
            if (index == 0 || array[index].compareTo(array[index - 1]) >= 0) {
                index++;
            } else {
                // Si el elemento actual es menor que el anterior, se intercambian los elementos.
                T temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }

        // Se devuelve el array ordenado.
        return array;
    }
}
