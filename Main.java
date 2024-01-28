import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Generar archivo
        DataManager.numerosRandom("datos.txt", 3000);

        boolean continueProgram = true;
        Scanner sc = new Scanner(System.in);
        String option = "";

        // Se almacenar los números en el array
        Integer [] numeros = DataManager.saveNumbers(1000, "datos.txt");

        System.out.println();
        System.out.println("---------BIENVENIDO---------");
        System.out.println("1. Gnome Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Radix Sort");
        System.out.println("5. Insertion Sort");
        System.out.println("6. Salir");
        System.out.println();

        Integer [] arrCopy = numeros.clone();

        while (continueProgram){
            option = sc.nextLine().toLowerCase();

            switch (option){
                case "1":
                    System.out.println("---------GNOME SORT---------");
                    GnomeSort gnomeSort = new GnomeSort();
                    gnomeSort.sort(numeros);

                    break;

                case "2":
                    System.out.println("---------MERGE SORT---------");
                    MergeSort mergesort = new MergeSort();
                    mergesort.sort(numeros);

                    break;

                case "3":
                    System.out.println("---------QUICK SORT---------");
                    QuickSort quickSort = new QuickSort();
                    quickSort.sort(numeros);

                    break;

                case "4":
                    System.out.println("---------RADIX SORT---------");
                    RadixSort radixSort = new RadixSort();
                    radixSort.sort(numeros);

                    break;

                case "5":
                    System.out.println("---------INSERTION SORT---------");
                    InsertionSort insertionsort = new InsertionSort();
                    insertionsort.sort(numeros);

                    break;

                default:
                    continueProgram = false;

            }
            System.out.println("Arreglo no ordenado: ");
            imprimirArray(arrCopy);

            System.out.println();
            System.out.println("Arreglo ordenado: ");
            imprimirArray(numeros);


        }




    }

    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
