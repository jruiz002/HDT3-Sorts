import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    /**
     * Prueba la funcionalidad del método de ordenamiento "Merge Sort" para números enteros.
     * Se verifica que el array ordenado coincida con el array esperado.
     */
    @Test
    public void mergeSortTest() {
        // Array desordenado
        Integer[] numeros = {3, 1, 5, 4, 2};

        // Crear una instancia del algoritmo de ordenamiento "Merge Sort"
        MergeSort mergeSort = new MergeSort();

        // Array esperado después de aplicar "Merge Sort"
        Integer[] numerosOrdenados = {1, 2, 3, 4, 5};

        // Verificar que el array ordenado coincida con el array esperado
        assertArrayEquals(numerosOrdenados, (Integer[]) mergeSort.sort(numeros));
    }

}