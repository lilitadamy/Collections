package collections.stack;

import java.util.Arrays;

public class MyStack<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private E array[];
    private int size;
    private int top;
    private int capacity;

    public MyStack(){
        capacity = DEFAULT_CAPACITY;
        array = (E[]) new Object[capacity];
        size = 0;
    }

    public MyStack(int capacity) {
        this.capacity = capacity;
        array = (E[]) new Object[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void grow () {
        if(capacity <= size) {
            capacity = 2 * capacity;
            array = Arrays.copyOf(array, capacity);
        }
    }

    public E push(E item) {
        grow();
        array[size] = item;
        size++;
        return item;
    }

    public E pop() {
        E item = array[size-1];
        array[size-1] = null;
        size--;
        return item;
    }

    public E peek() {
        return array[size-1];
    }

    public E removeAt(int index) {
        E temp = array[index];
        System.arraycopy(array,index+1 ,array , index, size-index+1);
        size--;
        return temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
