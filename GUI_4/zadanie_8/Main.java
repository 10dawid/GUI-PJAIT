package GUI_4.zadanie_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Spiewak[] spiewacy = {
                new Spiewak("Darrey") {
                    @Override
                    String spiewaj() {
                        return "eeae";
                    }
                },
                new Spiewak("Darrey") {
                    @Override
                    String spiewaj() {
                        return "bebe";
                    }
                },
                new Spiewak("Houston") {
                    @Override
                    String spiewaj() {
                        return "aabbccdefgh";
                    }
                },
                new Spiewak("Carrey") {
                    @Override
                    String spiewaj() {
                        return "xyzt123";
                    }
                },
                new Spiewak("Madonna") {
                    @Override
                    String spiewaj() {
                        return "aAa";
                    }
                }
        };
        Arrays.sort(spiewacy);
        for(Spiewak spiewak : spiewacy)
            System.out.println(spiewak);
    }
}
