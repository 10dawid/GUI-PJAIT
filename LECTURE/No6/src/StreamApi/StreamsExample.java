package LECTURE.No6.src.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee("Adam",  "Nowak", 20, List.of("C++", "HTML", "CSS", "BASH"));
        Employee emp2 = new Employee("Piotr",  "Kowalski", 33, List.of("C#", "JavaScript"));
        Employee emp3 = new Employee("Mariusz",  "Kowalczyk", 50, List.of("PHP", "Java"));

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);


        employees.stream()
                .forEach(employee -> System.out.println(employee));

        System.out.println();

        employees
                .forEach(System.out::println); // referencja do metody

        System.out.println();

        //map
        employees.stream()
                .map(employee -> employee.getFirstName())
                .forEach(System.out::println);

        employees.stream()
                .map(Employee::getFirstName)
                .forEach(System.out::println);

        System.out.println();

        //flatMap
        List<List<String>> allSkills = employees.stream()
                .map(Employee::getSkills)
                .collect(Collectors.toList());
        System.out.println(allSkills);

        List<String> empSkills = employees.stream()
                .map(Employee::getSkills)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(empSkills);

        System.out.println();

        employees.stream()
                .filter(employee -> employee.getFirstName().startsWith("M"))
                .forEach(System.out::println);

        System.out.println();

        employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .forEach(System.out::println);

        System.out.println();

        employees.stream()
                .limit(2)
                .forEach(System.out::println);

        System.out.println();

        employees.stream()
                .sorted(Comparator.comparing(Employee::getFirstName))
                .skip(2)
                .forEach(System.out::println);

        System.out.println();
        long employeesThatKnowPHP = employees.stream()
                .filter(employee -> employee.getSkills().contains("PHP"))
                .count();
        System.out.println(employeesThatKnowPHP);

        System.out.println();
        Optional<Employee> mostSkilledEmp = employees.stream()
                .max(Comparator.comparing(employee -> employee.getSkills().size()));
        System.out.println(mostSkilledEmp);

        employees.stream()
                .min(Comparator.comparing(employee -> employee.getFirstName().length()))
                .ifPresent(System.out::println);

        System.out.println();

        employees.stream()
                .filter(employee -> employee.getFirstName().startsWith("A"))
                .findAny()
                .ifPresent(System.out::println);

        System.out.println();
        boolean a = employees.stream()
                .allMatch(emp -> emp.getFirstName().startsWith("A"));
        System.out.println(a);

        boolean m = employees.stream()
                .anyMatch(emp -> emp.getFirstName().startsWith("M"));
        System.out.println(m);

        boolean x = employees.stream()
                .noneMatch(emp -> emp.getFirstName().startsWith("X"));
        System.out.println(x);

        System.out.println();




        Integer sumOfAllAges = employees.stream()
                .map(Employee::getAge)
                .reduce((age1, age2) -> age1 + age2)
                .get();
        System.out.println(sumOfAllAges);

        Integer sumOfAllAges2 = employees.stream()
                .map(Employee::getAge)
                .reduce(Integer::sum)
                .get();
        System.out.println(sumOfAllAges2);

        Integer sumOfALlAges3 = employees.stream()
                .map(Employee::getAge)
                .reduce(0, Integer::sum);
        System.out.println(sumOfALlAges3);

        Integer sumOfAllAges4 = employees.stream()
                .reduce(0, (age, employee) -> age + employee.getAge(), Integer::sum);
        System.out.println(sumOfAllAges4);

        String names = employees.stream()
                .reduce("", (name, emp) -> name + " " + emp.getFirstName(), String::concat);
        System.out.println(names);

        System.out.println();

        employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .takeWhile(employee -> employee.getAge() < 40)
                .forEach(System.out::println);

        System.out.println();

        employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .dropWhile(employee -> employee.getAge() < 40)
                .forEach(System.out::println);

        System.out.println();


        String sentence = "Java STREAM API training";
        sentence.chars().forEach(s -> System.out.print((char) s));
        System.out.println();
        sentence.chars().parallel().forEachOrdered(s -> System.out.print((char) s));


        System.out.println();


        List<Employee> jamals = employees.stream()
                .peek(employee -> employee.setFirstName("Jamal"))
                .collect(Collectors.toList());

        System.out.println(jamals);
    }
}
