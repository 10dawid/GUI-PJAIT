package GUI_7.zadanie_16;


import java.util.Map;

public class Test {

    public static void main(String[] args) {

        String file = "/Users/dawidleczycki/IdeaProjects/GUI 2 sem/src/GUI_7/zadanie_16/Slowa.java";
        for (Map.Entry<String, Integer> e : new Slowa(file))
            System.out.println(
                    e.getKey() + " -> " + e.getValue());

    }

}
