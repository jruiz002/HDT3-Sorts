import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    /**
     * Prueba la funcionalidad del método de ordenamiento "Quick Sort" para números enteros.
     * Se verifica que el array ordenado coincida con el array esperado.
     */
    @Test
    public void quickSortTest() {
        // Array desordenado
        Integer[] numeros = {3, 1, 5, 4, 2};

        // Crear una instancia del algoritmo de ordenamiento "Quick Sort"
        QuickSort quickSort = new QuickSort();

        // Array esperado después de aplicar "Quick Sort"
        Integer[] numerosOrdenados = {1, 2, 3, 4, 5};

        // Verificar que el array ordenado coincida con el array esperado
        assertArrayEquals(numerosOrdenados, (Integer[]) quickSort.sort(numeros));
    }

}