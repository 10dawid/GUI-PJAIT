package LECTURE.No5.sc05.ex03;

import java.util.HashMap;

public
    class Main {

    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();

        map.put( 10, new Student("Jan", 1701));
        map.put( 5, new Student("Ola", 867));
        map.put( 15, new Student("tomaszew", 534));

        System.out.println(
            map.get(5)
        );

        for(Integer key : map.keySet())
            System.out.print(map.get(key) + ", ");

        System.out.println();

    }
}
