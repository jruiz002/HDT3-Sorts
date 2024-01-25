import java.util.Stack;

public class QuickSort <T extends Comparable<T>> implements ISort<T>{

    @Override
    public T[] sort(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(array.length - 1);

        while (!stack.isEmpty()) {
            int end = stack.pop();
            int start = stack.pop();

            int pivotIndex = partition(array, start, end);

            if (pivotIndex - 1 > start) {
                stack.push(start);
                stack.push(pivotIndex - 1);
            }

            if (pivotIndex + 1 < end) {
                stack.push(pivotIndex + 1);
                stack.push(end);
            }
        }
        return array;
    }

    private int partition(T[] array, int start, int end) {
        T pivotValue = array[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (array[j].compareTo(pivotValue) <= 0) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, end);

        return i + 1;
    }

    private static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
