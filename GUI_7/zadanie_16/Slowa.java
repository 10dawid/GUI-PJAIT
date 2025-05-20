package GUI_7.zadanie_16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Slowa implements Iterable<Map.Entry<String, Integer>> {

    private Map<String, Integer> slowaLiczby;

    @Override
    public Iterator<Map.Entry<String, Integer>> iterator() {
        return slowaLiczby.entrySet().iterator();
    }

    public Slowa(String filePath) {
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            slowaLiczby = lines.flatMap(line -> Arrays.stream(line.split("[^\\\\p{L}\\\\p{Nd}]+")))
                    .filter(line -> line.isEmpty())
                    .filter(s -> s.matches("\\p{L}+"))
                    .map(s -> s.toUpperCase())
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.reducing(0, e -> 1, Integer::sum)));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
