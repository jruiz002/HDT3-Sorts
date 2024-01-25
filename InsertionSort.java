public class InsertionSort <T extends Comparable<T>> implements ISort<T> {

    @Override
    public T[] sort(T[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            T key = arr[i];
            int j = i - 1;

            // Mover los elementos mayores a key una posición adelante
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

}

