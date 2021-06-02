package arraySortingAlgorithms;

public class QuickSort implements SortingAlgorithm {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int pivotIndex = low;

        for (int i = low; i < high; i++) {
            if (array[i] < pivot) {
                swap(array, i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(array, pivotIndex, high);

        return pivotIndex;
    }

    private int[] quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }

        return array;
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        ArrayPrinter.print(new QuickSort(), FixedArray.getArray());
    }
}
