package algoritms;

public class BubbleSort {

    public static void bubbleSort (final int[] intArray) {
        boolean nextPass = true;
        for (int i = 1; i < intArray.length && nextPass; i++) {
            nextPass = false;
            for (int j = 0; j < intArray.length - i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    intArray[j] = intArray[j + 1] + intArray[j];
                    intArray[j + 1] = intArray[j] - intArray[j + 1];
                    intArray[j] = intArray[j] - intArray[j + 1];
                    nextPass = true;
                }
            }
        }
    }

}
