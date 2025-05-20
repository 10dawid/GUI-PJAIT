package LECTURE.No3.Test;

public class Main {
    public static void main(String[] args) {
        Node<Integer> integerNode = new Node<>(21);
        Node<Double> doubleNode = new Node<>(3.14);
        Node<String> stringNode = new Node<>("text");

        integerNode.setNext(doubleNode);
        doubleNode.setNext(stringNode);

        Node currentNode = integerNode;
        while(currentNode != null){
            System.out.print(currentNode + " -> ");
            currentNode = currentNode.getNext();
        }
    }
}
