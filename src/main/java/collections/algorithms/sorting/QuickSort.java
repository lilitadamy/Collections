package collections.algorithms.sorting;

public class QuickSort {


    public void sort(int[] array, int start, int end) {
        if(start < end) {
            int pIndex = partition(array, start, end);
            sort(array, start, pIndex-1);
            sort(array, pIndex+1, end);
        }
        return;
    }

    public int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int pIndex = start;
        for(int i = start; i < end-1; i++) {
            if(array[i] <= pivot) {
                int temp = array[i];
                array[i] = array[pIndex];
                array[pIndex] = temp;
                pIndex++;
            }
        }
        array[end] = array[pIndex];
        array[pIndex] = pivot;

        return pIndex;
    }

}
