public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso con un array de enteros
        Integer[] numeros = {5, 2, 8, 1, 7, 3};

        System.out.print("Array original: ");
        imprimirArray(numeros);

        GnomeSort gnomeSort = new GnomeSort();

        gnomeSort.sort(numeros);

        System.out.print("Array ordenado: ");
        imprimirArray(numeros);
    }

    private static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
