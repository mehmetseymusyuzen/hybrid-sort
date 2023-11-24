public class InsertionSort {

    /**
     * Sorts an array of integers in ascending order using the insertion sort algorithm.
     *
     * @param arr The array to be sorted.
     */
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int number = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than number, to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > number) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = number;
        }
        return arr;
    }

}
