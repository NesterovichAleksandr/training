package sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int size = (int) (1 + (Math.random() * 100));
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(mergeSort(array)));
    }

    private static int[] mergeSort(int[] array) {
        int length = array.length;
        if (length < 2) {
            return array;
        }
        int middle = length / 2;
        return Merge.merge(mergeSort(Arrays.copyOfRange(array, 0, middle)), mergeSort(Arrays.copyOfRange(array, middle, length)));
    }
}
