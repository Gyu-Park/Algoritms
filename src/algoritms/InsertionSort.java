package algoritms;

public class InsertionSort {

    public static void insertionSort (final int[] intArray) {
        for (int i = 1; i < intArray.length; i++) {
            int currentInt = intArray[i];
            int j;
            for (j = i - 1; j >= 0 && intArray[j] > currentInt; j--) {
                intArray[j + 1] = intArray[j];
            }
            intArray[j + 1] = currentInt;
        }
    }

}
