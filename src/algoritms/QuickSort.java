package algoritms;

import java.util.Random;

public class QuickSort {

    // quickSort method
    public static void quickSort (int[] intArray) {
        quickSort(intArray, 0, intArray.length - 1);
    }

    // recursive call
    public static void quickSort(int[] intArray, int first, int last) {
        if(last > first) {
            int pivotIndex = partition(intArray, first, last);
            quickSort(intArray, first, pivotIndex - 1);
            quickSort(intArray, pivotIndex + 1, last);
        }
    }

    // partition the array
    public static int partition(int[] intArray, int first, int last) {
        int randomPivotIndex = new Random().nextInt(last - 1);  // choose a pivot randomly
        // send the pivot value at the first index in the intArray
        if (randomPivotIndex > first)
            intArray = swap(intArray, first, randomPivotIndex);
        int pivot = intArray[first];
        int low = first + 1;          // first index in the array for forward search
        int high = last;              // last index in the array for backward search

        while (high > low) {
            // search forward from low
            while (low <= high && intArray[low] <= pivot)
                low++;
            
            // search backward from high
            while (low <= high && intArray[high] > pivot)
                high--;

            // swap two elements
            if (high > low) {
                intArray = swap(intArray, low, high);
            }
        }

        // search backward from high
        while (high > first && intArray[high] >= pivot)
            high--;

        // swap pivot with intArray[high]
        if (pivot > intArray[high]) {
            intArray[first] = intArray[high];
            intArray[high] = pivot;
            return high;
        } else {
            return first;
        }
    }

    private static int[] swap(int[] intArray, int a, int b) {
        intArray[a] = intArray[a] + intArray[b];
        intArray[b] = intArray[a] - intArray[b];
        intArray[a] = intArray[a] - intArray[b];
        return intArray;
    }
}