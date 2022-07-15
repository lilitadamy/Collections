package collections.arrayList;

import java.util.Arrays;

public class MyArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] array;
    private int capacity;
    private int size;

    public MyArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        this.size = 0;
        array = new Object[capacity];
    }

    public MyArrayList(E[] array) {
        if(array.length < capacity) {
            this.array = Arrays.copyOf(array, capacity);
        } else this.capacity = array.length;
        this.size = array.length;
        this.array = array;
    }

    public MyArrayList(int newCapacity) {
        capacity = Math.max(capacity, newCapacity);
        array = new Object[capacity];
        this.size = 0;
    }

    public void grow() {
        this.array = Arrays.copyOf(array, 2 * capacity);
        this.capacity = 2 * capacity;

    }

    public void add(E object) {
        if(this.size >= capacity) {
            this.grow();
        }
        this.array[size] = object;
        this.size = size + 1;
    }

    public void add(E[] objects) {
        for(E object: objects) {
            this.add(object);
        }
    }

    public void deleteAtIndex(int index) {
        System.arraycopy(this.array, index + 1, this.array, index, this.size - index);
        this.array[size] = null;
        this.size = this.size - 1;
    }

    public void removeRange(int index1, int index2) {
        System.arraycopy(this.array, index2, this.array, index1, size - index2);
        for(int i = index2 + 2; i < size; i++) {
            this.array[i] = null;
            this.size = this.size - index2 + index1;
        }
    }

    public void set(int index, Object object) {
        this.array[index] = object;
    }

    public void deleteFirst(E object) {
        int index = this.indexOf(object);
        this.deleteAtIndex(index);
    }

    public void deleteLast(E obj) {
        int index = this.lastIndexOf(obj);
        this.deleteAtIndex(index);
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(E[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public Object elementAt(int index) {
        return array[index];
    }

    public int indexOf(Object obj) {
        for(int i = 0; i < size; i++) {
            if(array[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        for(int i = size-1; i >= 0; i--) {
            if(array[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        System.out.println("Elements are: ");
        for(int i = 0; i < this.size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void addElementAtIndex(int index, Object object) {
        if(this.size >= capacity) {
            this.grow();
        }
        System.arraycopy(this.array, index, this.array, index + 1, this.size - index);
        this.array[index] = object;
        this.size = this.size + 1;
    }

}
