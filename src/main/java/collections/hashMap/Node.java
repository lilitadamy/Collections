package collections.hashMap;

import java.util.Objects;

public class Node<K, V> {
    int hash;
    K key;
    V value;
    Node<K, V> next;
    Node<K, V> prev;

    public Node(int hash, K key, V value, Node<K, V> next, Node<K, V> prev) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public String toString() {
        return this.key + "=" + this.value;
    }

    public int hashCode() {
        return Objects.hashCode(key) ^ Objects.hashCode(value);
    }

    public int getHash() {
        return hash;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Node<K, V> getNext() {
        return next;
    }
}
