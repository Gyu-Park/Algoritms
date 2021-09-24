import algoritms.*;

public class Main {
    public static void main(String[] args) throws Exception {

        int[] intArray = { 8, 5, 2, 3, 7, 0, 1 };
        InsertionSort.insertionSort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }

        System.out.println("");

        intArray = new int[]{8, 5, 2, 3, 7, 0, 1};
        BubbleSort.bubbleSort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }

    }
}
