package sortAlgorithm;

import java.util.Arrays;

public class QuickSort implements SortingAlgorithm {
    @Override
    public int[] sortArr(
            int[] arrayToBeSort, int... varargs
    ) {
        int[] copyArrayToBeSort = Arrays.copyOf(arrayToBeSort, arrayToBeSort.length);
        quickSort(copyArrayToBeSort, varargs[0], varargs[1]);
        return copyArrayToBeSort;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int getPartition(int[] arr, int low, int high) {
        return partition(arr, low, high);
    }
}
