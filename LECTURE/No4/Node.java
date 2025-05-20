package LECTURE.No4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Node <V extends Number > implements Comparable <Node<V>>, Iterable <Node<V>>{
    private V value;
    private Node<V> next;

    public Node(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

    @Override
    public int compareTo(Node o) {
        return (int) this.value - (int) o.value;
    }
    @Override
    public Iterator<Node<V>> iterator() {
        return new Iterator<Node<V>>() {
            private Node<V> currentNode = Node.this;

            @Override
            public boolean hasNext() {
                return currentNode != null && currentNode.getNext() != null;
            }

            @Override
            public Node<V> next() {
                if (hasNext()) {
                    currentNode = currentNode.getNext();
                    return currentNode;
                } else {
                    throw new IllegalStateException("No more elements.");
                }
            }
        };
    }
}
