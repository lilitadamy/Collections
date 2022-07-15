package collections.linkedList;

import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E>{

    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public void linkFirst(E e) {
        Node<E> temp = first;
        Node<E> newNode = new Node<E>(e, temp, null);
        first = newNode;
        if(temp == null) {
            last = newNode;
        } else temp.prev = newNode;
        size++;

    }

    public void linkLast(E e) {
        Node<E> temp = last;
        Node<E> newNode = new Node<E>(e, null, temp);
        last = newNode;
        if(temp == null) {
            first = newNode;
        } else temp.next = newNode;
        size++;
    }

    public void linkBefore(E e, Node<E> node) {
        Node<E> temp = node.prev;
        Node<E> newNode = new Node<E>(e, node, temp);
        if(temp == null) {
            first = newNode;
        } else {
            temp.next = newNode;
            node.prev = newNode;
        }
        size++;

    }

    public void unLinkFirst() {
        Node<E> temp = this.first.next;
        if(temp == null) {
            first = null;
            last = null;
            return;
        }
        temp.prev = null;
        first = temp;
        size--;

    }

    public void unLinkLast() {
        Node<E> temp = this.last.prev;
        if(temp == null) {
            first = null;
            last = null;
            return;
        }
        temp.next = null;
        last = temp;
        size--;
    }

    public E unlink(Node<E> node) {
        E item = node.item;
        Node<E> next = node.next;
        Node<E> prev = node.prev;

        if(prev == null & next == null) {
            first = null;
            last = null;
        } else if (prev == null) {
            first = next;
            next.prev = null;
        } else if (next == null) {
            last = prev;
            prev.next = null;
        } else {
            prev.next = next;
            next.prev = prev;
        }

        size--;
        return item;

    }

    public E getFirstElement() {
        if(this.first != null) {
            return this.first.item;
        } return null;
    }

    public E getLastElement() {
        if(this.last != null) {
            return this.last.item;
        } return null;
    }

    public E removeFirst() {
        if(this.first == null) {
            return null;
        }
        this.unLinkFirst();
        return this.first.item;
    }

    public E removeLast() {
        if(this.last == null) {
            return null;
        }
        this.unLinkLast();
        return this.last.item;
    }

    public void addFirst(E e) {
        this.linkFirst(e);
    }

    public void addLast(E e) {
        this.linkLast(e);
    }

    public E get(int index) {
        if(index >= size) {
            return null;
        }
        Node<E> temp = this.first;
        while (index != 0) {
            temp = temp.next;
            index--;
        }
        return temp.item;
    }

    public Node<E> getNode(int index) {
        if(size <= index) {
            return null;
        } else {
            Node<E> node = this.first;
            while (index > 0) {
                node = node.next;
                index--;
            }
            return node;
        }
    }

    public E set(int index, E value) {
        if(size <= index) {
            return null;
        }
        E oldValue = this.get(index);
        this.getNode(index).item = value;
        return oldValue;
    }

    public void print() {
        System.out.println("MyLinkedList elements are: ");
        Node<E> temp = this.first;
        while (temp!= null) {
            System.out.print(temp.item + " ");
            temp = temp.next;
        }
    }

    public int getSize() {
        return size;
    }

    public Node<E> getFirst() {
        return first;
    }

    public Node<E> getLast() {
        return last;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator<>(this);
    }
}
