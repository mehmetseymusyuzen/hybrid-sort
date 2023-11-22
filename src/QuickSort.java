public class QuickSort {

    void sort(int[] arr, int beginIndex, int endIndex) {
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

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
