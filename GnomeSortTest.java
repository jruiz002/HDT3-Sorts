import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GnomeSortTest {
    /**
     * Prueba la funcionalidad del método de ordenamiento "Gnome Sort" para números enteros.
     * Se verifica que el array ordenado coincida con el array esperado.
     */
    @Test
    public void gnomeSortTest() {
        // Array desordenado
        Integer[] numeros = {3, 1, 5, 4, 2};

        // Crear una instancia del algoritmo de ordenamiento "Gnome Sort"
        GnomeSort gnomeSort = new GnomeSort();

        // Array esperado después de aplicar "Gnome Sort"
        Integer[] numerosOrdenados = {1, 2, 3, 4, 5};

        // Verificar que el array ordenado coincida con el array esperado
        assertArrayEquals(numerosOrdenados, (Integer[]) gnomeSort.sort(numeros));
    }
}