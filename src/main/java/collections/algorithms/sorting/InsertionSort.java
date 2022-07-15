package collections.algorithms.sorting;

public class InsertionSort {
    int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        int j;
        for (int i = 1; i < array.length; i++) {
            j = i-1;
            int key = array[i];
            if(array[j] > key) {
                while (j >= 0 && array[j] > key) {
                    array[j+1] = array[j];
                    j = j-1;
                }
                array[j+1] = key;
            }
        }
    }
    public void print() {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
