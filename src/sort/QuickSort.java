package sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {5, 7, 8, 4, 1, 3, 7, 8, 9, 5};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void quickSort(int[] array) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        doSort(array, leftIndex, rightIndex);
    }

    static void doSort(int[] array, int start, int end) {
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
