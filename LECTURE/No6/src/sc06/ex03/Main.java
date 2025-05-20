package LECTURE.No6.src.sc06.ex03;

import java.util.stream.Stream;

public
    class Main {

    public static void main(String[] args) {

        Stream.of("Ala", "ma", "kota");

        Stream.iterate(
            0, e -> {
                System.out.println("tu");
                return e + 1;
            }
        )
//            .forEach(el -> System.out.println(el));
            .forEach(System.out::println);
    }
}
