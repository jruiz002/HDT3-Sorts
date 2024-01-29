/**
 * Interfaz que define un contrato para implementar algoritmos de ordenamiento
 * para arrays de elementos comparables.
 *
 * @param <T> el tipo de elementos en el array, debe implementar la interfaz Comparable.
 */
public interface ISort<T extends Comparable<T>> {
    /**
     * Método que realiza el ordenamiento de un array utilizando un algoritmo específico.
     *
     * @param arr el array a ser ordenado.
     * @return el array ordenado.
     */
    public T[] sort(T[] arr);
}
