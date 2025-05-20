package LECTURE.No6.src.SAtraining;
import lombok.*;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 40, 20, 1, 6, 2, 3, 6, 9);
        List<String> strings = List.of("azc", "def", "ghi");

        integers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        System.out.println("\n\n");

        List<String> upperStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperStrings);


        System.out.println("\n\n");


        long a = upperStrings.stream()
                .filter(word -> word.startsWith("A"))
                .count();
        System.out.println(a);

        System.out.println("\n\n");

        integers.stream()
                .distinct()
                .forEach(System.out::println);


        System.out.println("\n\n");


        strings.stream()
                .sorted(Comparator.comparing(word -> word.charAt(1)))
                .forEach(System.out::println);


        System.out.println("\n\n");


        Optional<Integer> sumOfAll = integers.stream()
                .reduce(Integer::sum);
        System.out.println(sumOfAll);

        integers.stream()
                .max(Comparator.comparing(x -> x))
                .ifPresent(System.out::println);

        System.out.println("\n\n");


        Map<String, Integer> stringsAndSizes = strings.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        word -> word.length()
                ));

        System.out.println(stringsAndSizes);

        System.out.println("\n\n");


        List<String> strings2 = List.of("azc", "dessaf", "ghdasdi", "aa", "abc", "ssss", "xxx");


        strings2.stream()
                .filter(word -> word.length() > 3)
                .forEach(System.out::println);


        System.out.println("\n\n");


        Map<Integer, List<String>> words = strings2.stream()
                .collect(Collectors.groupingBy(word -> word.length()));

        System.out.println(words);
        System.out.println("\n\n");


        Map<Boolean, List<Integer>> oddAndEvenPartition = integers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println(oddAndEvenPartition);


        List<List<Integer>> listOfListsofIntegers = List.of(
                List.of(1, 2, 7),
                List.of(2, 8, 1),
                List.of(2, 9, 1),
                List.of(2, 5, 3),
                List.of(2, 1, 1)
        );

        List<Integer> integerList = listOfListsofIntegers.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(integerList);


        String collected = strings.stream()
                .collect(Collectors.joining(", "));

        System.out.println(collected);


        Optional<String> reduced = strings.stream()
                .reduce((s1, s2) -> s1 + " " + s2);

        System.out.println(reduced);


        Stream<Double> doubles = Stream.generate(Math::random);

        doubles.forEach(System.out::println);
    }
}
