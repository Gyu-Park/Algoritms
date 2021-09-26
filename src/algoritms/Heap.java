package algoritms;

import java.util.ArrayList;

public class Heap<E extends Comparable<E>> {
    private ArrayList<E> list = new ArrayList<>();
    int currentIndex;
    E temp;

    // a default heap constructor
    public Heap() {
    }

    // a contructor that accepts an array of objects as an argument
    public Heap(E[] obj) {
        for (int i = 0; i < obj.length; i++) {
            add(obj[i]);
        }
    }

    // add a new object into the heap with building Max heap
    public void add(E newObj) {
        list.add(newObj);
        currentIndex = list.size() - 1;

        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            // if the current object is greater than its parent object, swap
            if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) {
                temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
            } else {
                break;
            }
            currentIndex = parentIndex;
        }
    }

    // remove the root from the heap and do heapify to build Max heap again
    public E remove() {
        if (list.size() == 0) return null;

        E removedObj = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        currentIndex = 0;
        // heapify
        while (currentIndex < list.size()) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

            if (leftChildIndex >= list.size()) break;
            int maxIndex = leftChildIndex;
            if (rightChildIndex < list.size()) {
                if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) {
                    maxIndex = rightChildIndex;
                }
            }
            // if currentIndex is smaller than maxIndex(greater one between the leftChild and rightChild), swap
            if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) {
                temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
                currentIndex = maxIndex;
            } else {
                break;
            }
        }
        return removedObj;
    }

    public int getSize() {
        return list.size();
    }

    public static class HeapSort {
        public static <E extends Comparable<E>> void heapSort(E[] list) {

            Heap<E> heap = new Heap<>();

            for (int i = 0; i < list.length; i++) {
                heap.add(list[i]);
            }

            for (int i = list.length - 1; i >= 0; i--) {
                list[i] = heap.remove();
            }
        }
    }
}
