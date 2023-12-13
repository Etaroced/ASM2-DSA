import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {4, 2, 7, 1, 9, 5};
        int targetElement = 7;

        int result = LinearSearchAlgorithm.linearSearch(myArray, targetElement);

        if (result != -1) {
            System.out.println("Element " + targetElement + " found at index " + result + ".");
        } else {
            System.out.println("Element " + targetElement + " not found in the array.");
        }


        int[] arrayToSort = {12, 11, 13, 5, 6, 7};

        System.out.println("Original Array: " + Arrays.toString(arrayToSort));

        MergeSortAlgorithm.mergeSort(arrayToSort, 0, arrayToSort.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arrayToSort));
    }
}