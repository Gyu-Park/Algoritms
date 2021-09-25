package algoritms;

public class MergeSort {
    
    // Merge Sort method
    public static void mergeSort(int[] intArray) {
        if (intArray.length > 1) {

            int halfLength = intArray.length / 2;
            // Do merge sort the firsthalf array (recursive)
            int[] firstHalf = new int[halfLength];
            System.arraycopy(intArray, 0, firstHalf, 0, halfLength);
            mergeSort(firstHalf);

            // Do merge sort the secondHalf array (recursive)
            int secondHalfLength = intArray.length - halfLength;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(intArray, halfLength, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // Merge firstHlaf with secondHalf
            merge(firstHalf, secondHalf, intArray);
        }
    }

    // Merge method
    public static void merge(int[] firstHalf, int[] secondHalf, int[] tempArray) {
        // current index in each array
        int currentFirstHalf = 0;
        int currentSecondHalf = 0;
        int currentTempArray = 0;

        while (currentFirstHalf < firstHalf.length && currentSecondHalf < secondHalf.length) {
            if (firstHalf[currentFirstHalf] < secondHalf[currentSecondHalf])
                tempArray[currentTempArray++] = firstHalf[currentFirstHalf++];
            else
                tempArray[currentTempArray++] = secondHalf[currentSecondHalf++];
        }

        while (currentFirstHalf < firstHalf.length)
            tempArray[currentTempArray++] = firstHalf[currentFirstHalf++];
        
        while (currentSecondHalf < secondHalf.length)
            tempArray[currentTempArray++] = secondHalf[currentSecondHalf++];
    }

}
