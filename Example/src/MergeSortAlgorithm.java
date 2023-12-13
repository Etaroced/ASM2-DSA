import java.util.Arrays;
public class MergeSortAlgorithm {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            // Recursive calls for the two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            // Merge the two halves
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;
        // Create temporary arrays
        int[] leftArray = Arrays.copyOfRange(arr, left, left + n1);
        int[] rightArray = Arrays.copyOfRange(arr, mid + 1, mid + 1 + n2);
        // Merge the two arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements from leftArray, if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        // Copy remaining elements from rightArray, if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
