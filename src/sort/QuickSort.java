package sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int size = (int) (1 + (Math.random() * 100));
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        doSort(array, leftIndex, rightIndex);
    }

    private static void doSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int leftIndex = start;
        int rightIndex = end;
        int middle = (leftIndex + rightIndex) / 2;
        while (leftIndex < rightIndex) {
            while (array[leftIndex] <= array[middle] && leftIndex < middle) {
                leftIndex++;
            }
            while (array[rightIndex] >= array[middle] && rightIndex > middle) {
                rightIndex--;
            }
            if (leftIndex < rightIndex) {
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
                if (leftIndex == middle) {
                    middle = rightIndex;
                } else if (rightIndex == middle) {
                    middle = leftIndex;
                }
            }
        }
        doSort(array, start, middle);
        doSort(array, middle + 1, end);
    }
}
