package LECTURE.No5.sc05.ex04;

import java.util.HashSet;

public
    class Main {

    public static void main(String[] args) {

        HashSet<Person> personHashSet = new HashSet<>();

        personHashSet.add(new Person("Jan"));
        personHashSet.add(new Person("Jan"));

        System.out.println("size: " + personHashSet.size());

    }
}
