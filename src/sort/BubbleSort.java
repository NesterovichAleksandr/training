package sort;

import java.util.Arrays;

class BubbleSort {

    public static void main(String[] args) {
        int[] array1 = {5, 7, 8, 4, 1, 3, 7, 8, 9, 5};
        int[] array2 = {5, 7, 8, 4, 1, 3, 7, 8, 9, 5};
        int[] array3 = {5, 7, 8, 4, 1, 3, 7, 8, 9, 5};
        System.out.println(Arrays.toString(array1));
        long timeStart = System.nanoTime();
        bubbleSort1(array1);
        long timeSort1 = System.nanoTime();
        bubbleSort2(array2);
        long timeSort2 = System.nanoTime();
        bubbleSort3(array3);
        long timeSort3 = System.nanoTime();
        System.out.print("sorting time: " + (timeSort1 - timeStart) + "\t");
        System.out.println(Arrays.toString(array1));
        System.out.print("sorting time: " + (timeSort2 - timeSort1) + "\t");
        System.out.println(Arrays.toString(array2));
        System.out.print("sorting time: " + (timeSort3 - timeSort2) + "\t");
        System.out.println(Arrays.toString(array3));
    }

    private static void bubbleSort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSort2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSort3(int[] array) {
        int size = array.length;
        if (size > 1) {
            boolean swap = true;
            while (swap) {
                swap = false;
                for (int i = 0; i < size - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        swap = true;
                    }
                }
                size--;
            }
        }
    }
}
