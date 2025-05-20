package LECTURE.No4;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Node<Integer> a = new Node<>(5);
        Node<Double> b = new Node<>(3.14);
        Node<Number> c = new Node<>(10);
        Node<Long> d = new Node<>(20l);

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);

        for(Node item : a) System.out.println(item);
        System.out.println("\n∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑∑\n");


        Student stud1 = new Student("abc", 1);
        Student stud1copy = stud1;
        Student stud1mirror = new Student("abc", 1);
        Student stud2 = new Student("def", 2);

        System.out.println("stud1 = " + stud1);
        System.out.println("stud1copy = " + stud1copy);
        System.out.println("stud1mirror = " + stud1mirror);
        System.out.println("stud2 = " + stud2);
        System.out.println();
        System.out.println("stud1.hashCode() = " + stud1.hashCode());
        System.out.println("stud1copy.hashCode() = " + stud1copy.hashCode());
        System.out.println("stud1mirror.hashCode() = " + stud1mirror.hashCode());
        System.out.println("stud2.hashCode() = " + stud2.hashCode());
        System.out.println();
        System.out.println("stud1.equals(stud1copy) = " + stud1.equals(stud1copy));
        System.out.println("stud1.equals(stud1mirror) = " + stud1.equals(stud1mirror));
        System.out.println("stud1.equals(stud2) = " + stud1.equals(stud2));

        System.out.println("\n√√√√√√√√√√√√√√√√\n");
        MyStorage<Student> studStorage = new MyStorage<>();

        studStorage.add(stud1);
        studStorage.add(stud1copy);
        studStorage.add(stud1mirror);
        studStorage.add(stud2);


        for (Student student : studStorage) System.out.println(student);
        System.out.println();


        MyStorage<Integer> integers = new MyStorage<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        for (Integer integer : integers) System.out.print(integer + " ");
        System.out.println("\n\n");
        Iterator<Student> studentIterator = studStorage.iterator();
        System.out.println("studentIterator.next() = " + studentIterator.next());
        System.out.println("studentIterator.next() = " + studentIterator.next());
        System.out.println("studentIterator.next() = " + studentIterator.next());
        studStorage.add(new Student("xxx", 10));
        System.out.println("studentIterator.next() = " + studentIterator.next());
        System.out.println("studentIterator.next() = " + studentIterator.next());
        System.out.println("studentIterator.next() = " + studentIterator.next());






    }
}
