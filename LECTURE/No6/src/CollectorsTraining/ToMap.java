package LECTURE.No6.src.CollectorsTraining;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMap {

    public static void main(String[] args) {

        List<Country> countries = List.of(
                new Country("Poland", "Warsaw"),
                new Country("Spain", "Madrid")
        );

        Map<String, String> countriesMap = countries.stream()
                .collect(Collectors.toMap(Country::getName, Country::getCapital,
                        (oldValue, newValue) -> newValue));

        List<String> names = List.of(
                "John",
                "Mike",
                "Tom",
                "Joe",
                "Xi",
                "Zion"
        );

        String collectedNames = names.stream()
                .collect(Collectors.joining(" ; "));

        System.out.println(collectedNames);



    }
}
