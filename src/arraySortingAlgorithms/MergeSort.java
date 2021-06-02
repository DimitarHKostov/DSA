package arraySortingAlgorithms;

public class MergeSort implements SortingAlgorithm {
    private void merge(int[] array, int low, int mid, int high) {
        int lSize = mid - low + 1;
        int rSize = high - mid;

        int[] left = new int[lSize];
        int[] right = new int[rSize];

        for (int i = 0; i < lSize; i++) {
            left[i] = array[low + i];
        }

        for (int i = 0; i < rSize; i++) {
            right[i] = array[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = low;

        while (i < lSize && j < rSize) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < lSize) {
            array[k++] = left[i++];
        }

        while (j < rSize) {
            array[k++] = right[j++];
        }
    }

    private int[] msort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            msort(array, low, mid);
            msort(array, mid + 1, high);

            merge(array, low, mid, high);
        }

        return array;
    }

    @Override
    public int[] sort(int[] array) {
        return msort(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        ArrayPrinter.print(new MergeSort(), FixedArray.getArray());
    }
}
