package LECTURE.No6.src.CollectorsTraining;

import java.util.*;
import java.util.stream.Collectors;

public class CSAMM {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Xi", 46, 175.2),
                new Person("Mike", 31, 198),
                new Person("John", 22, 152),
                new Person("Donald", 78, 172),
                new Person("Joe", 98, 135),
                new Person("Jack", 15, 123.2)
        );


        Long countedPersons = personList.stream()
                .collect(Collectors.counting());

        System.out.println(countedPersons);

        Integer totalAge = personList.stream()
                .collect(Collectors.summingInt(Person::getAge));

        System.out.println(totalAge);


        Double avgAge = personList.stream()
                .collect(Collectors.averagingDouble(Person::getAge));

        System.out.println(avgAge);

        Optional<Person> oldest = personList.stream()
                .collect(Collectors.maxBy((p1, p2) -> p1.getAge() - p2.getAge()));

        Optional<Person> highest = personList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Person::getHeight)));


        System.out.println(oldest);
        System.out.println(highest);


        System.out.println();


        IntSummaryStatistics summaryStatistics = personList.stream()
                .collect(Collectors.summarizingInt(Person::getAge));

        System.out.println(summaryStatistics);


        DoubleSummaryStatistics doubleSummaryStatistics = personList.stream()
                .collect(Collectors.summarizingDouble(Person::getHeight));
        System.out.println(doubleSummaryStatistics);


        System.out.println();


        Map<String, List<Person>> stringListMap = personList.stream()
                .collect(Collectors.groupingBy(Person::getName));

        System.out.println(stringListMap);


        Map<Boolean, List<Person>> booleanListMap = personList.stream()
                .collect(Collectors.partitioningBy((p1) -> p1.getName().contains("o")));

        System.out.println(booleanListMap);
    }
}
