package arraySortingAlgorithms;

public class ArrayPrinter {
    public static void print(SortingAlgorithm sortingAlgorithm, int[] array) {
        for (int number : sortingAlgorithm.sort(array)) {
            System.out.print(number + " ");
        }
    }
}