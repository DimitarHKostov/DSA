package arraySortingAlgorithms;

public class HeapSort implements SortingAlgorithm {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void heapify(int[] array, int index, int lastIndexOfUnsortedSubArray) {
        int leftChildIndex = index * 2 + 1;
        int rightChildIndex = index * 2 + 2;
        int indexOfLargestElement = index;

        if (leftChildIndex <= lastIndexOfUnsortedSubArray &&
                array[indexOfLargestElement] < array[leftChildIndex]) {
            indexOfLargestElement = leftChildIndex;
        }

        if (rightChildIndex <= lastIndexOfUnsortedSubArray &&
                array[indexOfLargestElement] < array[rightChildIndex]) {
            indexOfLargestElement = rightChildIndex;
        }

        if (indexOfLargestElement != index) {
            swap(array, index, indexOfLargestElement);
            heapify(array, indexOfLargestElement, lastIndexOfUnsortedSubArray);
        }
    }

    private void buildHeap(int[] array) {
        for (int i = array.length / 2; i > 0; i--) {
            heapify(array, 0, i);
        }
    }

    @Override
    public int[] sort(int[] array) {
        buildHeap(array);

        int lastIndexOfUnsortedSubArray = array.length - 1;

        for (int i = lastIndexOfUnsortedSubArray; i >= 0; i--) {
            swap(array, 0, i);
            lastIndexOfUnsortedSubArray--;
            heapify(array, 0, lastIndexOfUnsortedSubArray);
        }

        return array;
    }

    public static void main(String[] args) {
        ArrayPrinter.print(new HeapSort(), FixedArray.getArray());
    }
}
