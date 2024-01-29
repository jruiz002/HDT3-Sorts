import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {
    /**
     * Prueba la funcionalidad del método de ordenamiento "Radix Sort" para números enteros.
     * Se verifica que el array ordenado coincida con el array esperado.
     */
    @Test
    public void radixSortTest() {
        // Array desordenado
        Integer[] numeros = {3, 1, 5, 4, 2};

        // Crear una instancia del algoritmo de ordenamiento "Radix Sort"
        RadixSort radixSort = new RadixSort();

        // Array esperado después de aplicar "Radix Sort"
        Integer[] numerosOrdenados = {1, 2, 3, 4, 5};

        // Verificar que el array ordenado coincida con el array esperado
        assertArrayEquals(numerosOrdenados, (Integer[]) radixSort.sort(numeros));
    }

}