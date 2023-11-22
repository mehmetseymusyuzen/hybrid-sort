public class QuickSort {

    /**
     * Sorts the given array in ascending order using the quicksort algorithm.
     *
     * @param arr The array to be sorted.
     * @param beginIndex The starting index of the range to be sorted.
     * @param endIndex The ending index of the range to be sorted.
     */
    void sort(int[] arr, int beginIndex, int endIndex) {
        // Base case: If the range is empty or contains only one element, it is already sorted.
        if (beginIndex >= endIndex) {
            return;
        }
        int pivot = arr[beginIndex];
        int j = beginIndex - 1;
        for (int i = beginIndex; i < endIndex; i++) {
            if (arr[i] <= pivot) {
                j++;
                swap(arr, i, j);
            }
        }
        j++;
        swap(arr, endIndex, j);

        sort(arr, beginIndex, j - 1);
        sort (arr, j + 1, endIndex);
    }

    /**
     * Swaps the elements at the given indices in the array.
     *
     * @param arr The array containing the elements.
     * @param i The index of the first element to be swapped.
     * @param j The index of the second element to be swapped.
     */
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
