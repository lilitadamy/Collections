package collections.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

    public void sort(int[] array) {
        int n = array.length;
        if(n < 2) return;
        int mid = n/2;
        int[] left = Arrays.copyOf(array, mid);
        int[] right = Arrays.copyOfRange(array, mid, n);
        sort(left);
        sort(right);
        merge(left, right, array);
        return;

    }

    public int[] merge(int[] left, int[] right, int[] array) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            array[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            array[k] = right[j];
            k++;
            j++;
        }
        return array;
    }

}
