package LECTURE.No6.src.sc06.ex05;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public
    class Main {

    public static void main(String[] args) {
        Stream.iterate(0, e -> e + 1)
            .limit(10)
            .filter(el -> el % 2 == 0)
            .forEach(System.out::println);

        System.out.println("=============");

        Stream.iterate(0, e -> e + 1)
            .limit(10)
            .filter(el -> el % 2 == 0)
                .map(Double::valueOf)
            .forEach(System.out::println);


        List<String> list = Stream.of(
            new String[]{ "Ala", "ma", "kota"},
            new String[]{ "Janek", "ma", "psa"},
            new String[]{ "tomaszew", "ma", "..."}
        )
            .flatMap(Arrays::stream)
            //.forEach(System.out::println);
            .collect(Collectors.toList());

        System.out.println(list);

        System.out.println("================");
        Set<String> set = Stream.of(
                    new String[]{ "Ala", "ma", "kota"},
                    new String[]{ "Janek", "ma", "psa"},
                    new String[]{ "tomaszew", "ma", "..."}
            )
            .flatMap(Arrays::stream)
            //.forEach(System.out::println);
            .collect(Collectors.toSet());

        System.out.println(set);

        for(String str : set)
            System.out.println(str +": " + str.hashCode());
    }
}
