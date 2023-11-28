package sortAlgorithm;

import java.util.Arrays;

public class HeapSort implements SortingAlgorithm {
    @Override
    public int[] sortArr(
            final int[] arrayToBeSort,
            final int... varargs
    ) {
        int[] copyArrayToBeSort = Arrays.copyOf(arrayToBeSort, arrayToBeSort.length);
        int n = copyArrayToBeSort.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(copyArrayToBeSort, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = copyArrayToBeSort[0];
            copyArrayToBeSort[0] = copyArrayToBeSort[i];
            copyArrayToBeSort[i] = temp;

            heapify(copyArrayToBeSort, i, 0);
        }
        return copyArrayToBeSort;
    }


    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}
