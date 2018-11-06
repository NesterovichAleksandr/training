package sort;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 8};
        System.out.println(Arrays.toString(merge(array1, array2)));
    }

    private static int[] merge(int[] array1, int[] array2) {
        int[] arrayResult = new int[array1.length + array2.length];
        int indexArray1 = 0;
        int indexArray2 = 0;
        for (int i = 0; i < arrayResult.length; i++) {
            if (indexArray1 < array1.length && indexArray2 < array2.length) {
                if (array1[indexArray1] < array2[indexArray2]) {
                    arrayResult[i] = array1[indexArray1++];
                } else {
                    arrayResult[i] = array2[indexArray2++];
                }
            } else if (indexArray1 < array1.length) {
                arrayResult[i] = array1[indexArray1++];
            } else {
                arrayResult[i] = array2[indexArray2++];
            }
        }
        return arrayResult;
    }
}
