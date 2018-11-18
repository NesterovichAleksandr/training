package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void merge() {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 8};
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 8, 9]", Arrays.toString(Merge.merge(array1, array2)));
        int[] array3 = {1, 3, 5, 7, 9};
        int[] array4 = {2, 4, 6, 8};
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(Merge.merge(array3, array4)));
        int[] array5 = {1, 2, 3, 4, 5};
        int[] array6 = {6, 7, 8, 9, 9};
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 9]", Arrays.toString(Merge.merge(array5, array6)));
    }
}