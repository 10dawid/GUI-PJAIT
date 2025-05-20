package LECTURE.No5.sc05.ex02;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public
    class Main {

    public static void main(String[] args) {
        LinkedList<Integer> integersLinkedList = new LinkedList<>();

        integersLinkedList.add(10);
        integersLinkedList.add(20);
        integersLinkedList.add(30);

        {
            List<Integer> list = integersLinkedList;

            System.out.println(
                "LinkedList size: " + list.size()
            );

            System.out.println(integersLinkedList.get(1));
        }

        {
            Queue<Integer> queue = integersLinkedList;

            System.out.print(
                queue.peek()+", "
            );
            System.out.print(
                queue.poll()+", "
            );
            System.out.println();

        }

        {
            Deque<Integer> deque = integersLinkedList;

            System.out.println(
                "getFirst(): " + deque.getFirst()
            );
            System.out.println(
                "getLast(): " + deque.getLast()
            );

        }

    }
}
