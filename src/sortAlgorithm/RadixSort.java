package sortAlgorithm;

import java.util.Arrays;

public class RadixSort implements SortingAlgorithm {
    @Override
    public int[] sortArr(
            final int[] arrayToBeSort,
            final int... varargs
    ) {
        int[] copyArrayToBeSort = Arrays.copyOf(arrayToBeSort, arrayToBeSort.length);
        int max = Arrays.stream(copyArrayToBeSort).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(copyArrayToBeSort, exp);
        }
        return copyArrayToBeSort;
    }


    /**
     * Performs the count sort algorithm on the given array based on the specified exponent.
     *
     * @param arr The array to be sorted.
     * @param exp The exponent used for counting and sorting the digits.
     */
    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int value : arr) {
            count[(value / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }
}
