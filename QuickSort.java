import java.util.Stack;

public class QuickSort <T extends Comparable<T>> implements ISort<T>{

    /**
     * Método que realiza el ordenamiento del array utilizando el algoritmo "Quick Sort".
     *
     * @param array el array a ser ordenado.
     * @return el array ordenado.
     */
    @Override
    public T[] sort(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        // Utilizar una pila para realizar la implementación iterativa de Quick Sort
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(array.length - 1);

        while (!stack.isEmpty()) {
            // Extraer los índices de inicio y fin de la pila
            int end = stack.pop();
            int start = stack.pop();

            // Obtener el índice del pivote después de realizar la partición
            int pivotIndex = partition(array, start, end);

            // Si hay elementos a la izquierda del pivote, agregar sus índices a la pila
            if (pivotIndex - 1 > start) {
                stack.push(start);
                stack.push(pivotIndex - 1);
            }

            // Si hay elementos a la derecha del pivote, agregar sus índices a la pila
            if (pivotIndex + 1 < end) {
                stack.push(pivotIndex + 1);
                stack.push(end);
            }
        }

        // Se devuelve el array ordenado.
        return array;
    }

    /**
     * Método que realiza la partición del array utilizando un pivote.
     *
     * @param array el array a ser particionado.
     * @param start el índice de inicio de la partición.
     * @param end el índice de fin de la partición.
     * @return el índice del pivote después de la partición.
     */
    private int partition(T[] array, int start, int end) {
        T pivotValue = array[end];
        int i = start - 1;

        // Iterar sobre la partición y colocar elementos menores o iguales al pivote a la izquierda
        for (int j = start; j < end; j++) {
            if (array[j].compareTo(pivotValue) <= 0) {
                i++;
                swap(array, i, j);
            }
        }

        // Colocar el pivote en su posición correcta
        swap(array, i + 1, end);

        return i + 1; // Devolver el índice del pivote después de la partición
    }

    /**
     * Método que intercambia dos elementos en un array.
     *
     * @param array el array en el que se realizará el intercambio.
     * @param i la posición del primer elemento.
     * @param j la posición del segundo elemento.
     */
    private static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
