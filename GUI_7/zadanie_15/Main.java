package GUI_7.zadanie_15;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "/Users/dawidleczycki/IdeaProjects/GUI 2 sem/src/GUI_7/zadanie_15/Dane.txt";
        Stream<String> linesA = Files.lines(Path.of(path), StandardCharsets.UTF_8);
        Stream<String> linesB = Files.lines(Path.of(path), StandardCharsets.UTF_8);
        Stream<String> linesC = Files.lines(Path.of(path), StandardCharsets.UTF_8);

        Stream<Osoba> osobyA = linesA.map(line -> stworzOsobe(line));
        Stream<Osoba> osobyB = linesB.map(line -> stworzOsobe(line));
        Stream<Osoba> osobyC = linesC.map(line -> stworzOsobe(line));


        //a
        osobyA.filter(osoba -> osoba.getWynik() >= 50)
                .forEach(System.out::println);

        System.out.println("================================");

        //b
        osobyB.filter(osoba -> osoba.getWynik() >= 50)
                .sorted(new Comparator<Osoba>() {
                    @Override
                    public int compare(Osoba o1, Osoba o2) {
                        if (o1.getGrupa().equals(o2.getGrupa())){
                            return o1.getWynik() - o2.getWynik();
                        }
                        else{
                            return o1.getGrupa().compareTo(o2.getGrupa());
                        }
                    }
                })
                .forEach(System.out::println);

        System.out.println("================================");

        Map<String, List<Osoba>> grupyOsob = osobyC.collect(Collectors.groupingBy(Osoba::getGrupa));
        System.out.println(grupyOsob);


    }

    public static Osoba stworzOsobe(String linia){
        String[] dane = linia.split("\\s+");
        return new Osoba(dane[0], dane[1], Integer.parseInt(dane[2]));
    }
}
