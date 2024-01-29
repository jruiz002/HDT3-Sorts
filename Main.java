import java.util.Scanner;

/**
 * @author José Ruiz, Gerardo Fernández y Alexander de la Cruz
 * @version 1.0
 * Fecha creación: 24/01/2024
 *
 */

 // REFERENCIAS DE CÓDIGO
 // Sorting Algorithms. (2024, January 24). GeeksforGeeks;
 // GeeksforGeeks. https://www.geeksforgeeks.org/sorting-algorithms/

 // Es importante mencionar que se tomo como referencia el código de esta página pero se acoplo el código según para que
 // trabajara con datos abstractos.

/**
 * Clase principal que contiene el método main para ejecutar el programa de sorts.
 */

public class Main {
    public static void main(String[] args) {

        //Generar archivo
        DataManager.numerosRandom("datos.txt", 3000);

        // Variables de clase
        boolean continueProgram = true;
        Scanner sc = new Scanner(System.in);
        String option = "";

        // Si desea cambiar la cantidad de números para ordenar puede modificar el primer parametro (Amount).
        Integer [] numeros = DataManager.saveNumbers(10, "datos.txt");
        Integer [] arrCopy = numeros.clone();

        // Loop que controla el flujo del programa
        while (continueProgram){
            Menu();
            option = sc.nextLine().toLowerCase();

            switch (option){
                case "1":
                    System.out.println("---------GNOME SORT---------");
                    GnomeSort gnomeSort = new GnomeSort();
                    gnomeSort.sort(numeros);
                    System.out.println("Arreglo no ordenado: ");
                    imprimirArray(arrCopy);

                    System.out.println();
                    System.out.println("Arreglo ordenado: ");
                    imprimirArray(numeros);
                    break;

                case "2":
                    System.out.println("---------MERGE SORT---------");
                    MergeSort mergesort = new MergeSort();
                    mergesort.sort(numeros);
                    System.out.println("Arreglo no ordenado: ");
                    imprimirArray(arrCopy);

                    System.out.println();
                    System.out.println("Arreglo ordenado: ");
                    imprimirArray(numeros);
                    break;

                case "3":
                    System.out.println("---------QUICK SORT---------");
                    QuickSort quickSort = new QuickSort();
                    quickSort.sort(numeros);
                    System.out.println("Arreglo no ordenado: ");
                    imprimirArray(arrCopy);

                    System.out.println();
                    System.out.println("Arreglo ordenado: ");
                    imprimirArray(numeros);
                    break;

                case "4":
                    System.out.println("---------RADIX SORT---------");
                    RadixSort radixSort = new RadixSort();
                    radixSort.sort(numeros);
                    System.out.println("Arreglo no ordenado: ");
                    imprimirArray(arrCopy);

                    System.out.println();
                    System.out.println("Arreglo ordenado: ");
                    imprimirArray(numeros);
                    break;

                case "5":
                    System.out.println("---------INSERTION SORT---------");
                    InsertionSort insertionsort = new InsertionSort();
                    insertionsort.sort(numeros);
                    System.out.println("Arreglo no ordenado: ");
                    imprimirArray(arrCopy);

                    System.out.println();
                    System.out.println("Arreglo ordenado: ");
                    imprimirArray(numeros);
                    break;

                default:
                    continueProgram = false;
            }
        }

    }

    /**
     * Imprime los elementos de un array en la consola.
     *
     * @param array el array a imprimir.
     * @param <T> el tipo de elementos en el array.
     */
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    /**
     * Se muestra el menú de opciones del programa.
     */
    public static void Menu(){
        System.out.println();
        System.out.println("---------BIENVENIDO---------");
        System.out.println("1. Gnome Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Radix Sort");
        System.out.println("5. Insertion Sort");
        System.out.println("6. Salir");
    }
}
