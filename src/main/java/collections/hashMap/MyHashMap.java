package collections.hashMap;

import java.util.*;

public class MyHashMap<K,V> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    int size;
    float loadFactor;
    int capacity;
    int threshold;
    Node<K,V>[] table;

    ArrayList<K> keys;
    ArrayList<V> values;


    public MyHashMap() {
        this.capacity = DEFAULT_INITIAL_CAPACITY;
        this.loadFactor = DEFAULT_LOAD_FACTOR;
        this.threshold = (int)(capacity*loadFactor);
        table = new Node[capacity];
        Arrays.fill(table, null);
        keys = new ArrayList<K>();
        values = new ArrayList<V>();
    }

    public MyHashMap(int capacity, float loadFactor) {
        table = new Node[capacity];
        if (capacity < DEFAULT_INITIAL_CAPACITY) {
            this.capacity = DEFAULT_INITIAL_CAPACITY;
        }
        this.loadFactor = loadFactor;
        this.threshold = (int)(capacity*loadFactor);
    }

    public Node<K, V>[] getTable() {
        return table;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty (){
        return size == 0;
    }

    public boolean containsKey(Object key) {
        return this.get(key) != null;
    }

    int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode());
    }

    int indexFor(int h) {
        return Math.abs(h % (capacity-1));
    }

    public void grow() {
        this.table = Arrays.copyOf(table, 2 * capacity);
        this.capacity = 2 * capacity;
    }

    public void checkCapacity() {
        if(this.threshold+1 <= size) {
            this.grow();
            this.threshold = (int) (this.capacity * this.loadFactor);
        }
        return;
    }

    public V put(K key, V value) {
        this.checkCapacity();
        Node n = new Node(this.hash(key), key, value, null, null);
        Node<K,V> node;
        if(!keys.contains(key)){
            keys.add(key);
        }
        values.add(value);
        if(key == null) {
            if(table[0] == null) {
                table[0] = n;
                size++;
            }
            Node<K,V> prev = this.table[0];
            for(node = this.table[0]; node != null; node = node.next) {
                if(prev.next.next != null) {
                    prev = prev.next;
                }
                if (node.key == null) {
                    V oldValue = node.value;
                    node.value = value;
                    return oldValue;
                }
            }
            node.next = n;
            node.prev = prev;
            size++;
            return null;
        } else {
            int hash = this.hash(key);
            int i = indexFor(hash);
            if(table[i] == null) {
                table[i] = n;
                size++;
                return null;
            }
            Node<K,V> prev = this.table[i];

            for (node = table[i]; node != null; node = node.next) {
                if(prev.next != null) {
                    if(prev.next.next != null) prev = prev.next;
                }
                if (node.hash == hash && (node.key == key || key.equals(node.key))) {
                    V oldValue = node.value;
                    node.value = value;
                    return oldValue;
                }
            }
            node = n;
            node.prev = prev;
            node.prev.next = node;
            table[i] = node;
            size++;
        }
        return value;
    }

    public V get(Object key) {
        if (key == null) {
            for(Node<K,V> node = this.table[0]; node != null; node = node.prev) {
                if(node.key == key) {
                    return node.value;
                }
            }
        }

        int h = this.hash(key);
        int index = this.indexFor(h);
        for(Node<K,V> node = table[index]; node != null; node = node.prev) {
            if(node.hash == h && (node.key == key || node.key.equals(key))) {
                return node.value;
            }
        }
        return null;
    }

    public V remove(Object key) {
        int hash = this.hash(key);
        int i = indexFor(hash);
        V value = this.get(key);
        for (Node<K,V> node = table[i]; node != null; node = node.prev) {
            if(node.hash == hash && (node.key == key || node.key.equals(key))) {

                if(node.next == null) {
                    table[i] = node.prev;
                    if (table[i] != null) { table[i].next = null;}
                }
                else if(node.prev == null) {
                    node.next.prev = null;
                }
                else {
                    Node<K,V> next = node.next;
                    Node<K,V> prev = node.prev;
                    next.prev = prev;
                    prev.next = next;
                }


                size--;
            }
        }
        return value;
    }

    public void printKeys() {
        for (K key : keys) {
            if(key == null) {
                System.out.print("null");
            }
            System.out.print(key + " ");
        }
    }

    public void printValues() {
        for (V value : values) {
            System.out.print(value + " ");
        }
    }




}
