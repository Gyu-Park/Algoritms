import algoritms.*;
import algoritms.Heap.HeapSort;

public class Main {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder(" ");
        int i;
        int[] intArray = { 8, 5, 2, 3, 7, 0, 1 };
        InsertionSort.insertionSort(intArray);
        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }

        System.out.println(sb);

        intArray = new int[]{8, 5, 2, 3, 7, 0, 1};
        BubbleSort.bubbleSort(intArray);
        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }

        System.out.println(sb);

        intArray = new int[]{9, 1, 3, 5, 8, 0, 2, 7};
        MergeSort.mergeSort(intArray);
        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }

        System.out.println(sb);

        intArray = new int[]{9, 1, 3, 5, 8, 0, 2, 7};
        QuickSort.quickSort(intArray);
        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }

        System.out.println(sb);
        sb.delete(0, sb.length());

        String[] strArrayList = {"Juile", "Cris", "Robin", "Robert", "Alice", "Roy", "Samantha", "Stella", "Steven", "Ben"};
        HeapSort.heapSort(strArrayList);
        for (i = 0; i < strArrayList.length; i ++) {
            sb.append(strArrayList[i]);
            sb.append(" ");
        }
        System.out.print(sb);
        sb.delete(0, sb.length());
    }
}
