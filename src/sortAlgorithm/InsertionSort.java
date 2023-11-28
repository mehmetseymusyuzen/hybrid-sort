package sortAlgorithm;

import java.util.Arrays;

public class InsertionSort implements SortingAlgorithm {
    @Override
    public int[] sortArr(
            int[] arrayToBeSort,
            int... varargs
    ) {
        int[] copyArrayToBeSort = Arrays.copyOf(arrayToBeSort, arrayToBeSort.length);
        for (int i = 1; i < copyArrayToBeSort.length; i++) {
            int number = copyArrayToBeSort[i];
            int j = i - 1;

            while (j >= 0 && copyArrayToBeSort[j] > number) {
                copyArrayToBeSort[j + 1] = copyArrayToBeSort[j];
                j = j - 1;
            }
            copyArrayToBeSort[j + 1] = number;
        }
        return copyArrayToBeSort;
    }
}
