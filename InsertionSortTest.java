import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    /**
     * Prueba la funcionalidad del método de ordenamiento "Insertion Sort" para números enteros.
     * Se verifica que el array ordenado coincida con el array esperado.
     */
    @Test
    public void insertionSortTest() {
        // Array desordenado
        Integer[] numeros = {3, 1, 5, 4, 2};

        // Crear una instancia del algoritmo de ordenamiento "Insertion Sort"
        InsertionSort insertionSort = new InsertionSort();

        // Array esperado después de aplicar "Insertion Sort"
        Integer[] numerosOrdenados = {1, 2, 3, 4, 5};

        // Verificar que el array ordenado coincida con el array esperado
        assertArrayEquals(numerosOrdenados, (Integer[]) insertionSort.sort(numeros));
    }
}