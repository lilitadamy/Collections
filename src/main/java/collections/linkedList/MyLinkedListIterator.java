package collections.linkedList;

import java.util.Iterator;


public class MyLinkedListIterator<E> implements Iterator<E> {

    Node<E> node;

    public MyLinkedListIterator(MyLinkedList<E> linkedList) {
        node = linkedList.getFirst();
    }

    @Override
    public boolean hasNext() {
        return node != null;
    }

    @Override
    public E next() {
        E item = node.item;
        node = node.next;
        return item;
    }

    @Override
    public void remove() {

    }
}

