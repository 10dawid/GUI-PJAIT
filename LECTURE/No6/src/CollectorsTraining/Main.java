package LECTURE.No6.src.CollectorsTraining;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> teams = List.of("Poland", "Sweden", "Slovakia", "Spain", "Sweden", "Portugal", "France");


        List<String> teamsStartingWithSList = teams.stream()
                .filter(team -> team.startsWith("S"))
                .collect(Collectors.toList());

        System.out.println(teamsStartingWithSList);

        Set<String> teamsStartingWithSSet = teams.stream()
                .filter(team -> team.startsWith("S"))
                .collect(Collectors.toSet());
        
        System.out.println(teamsStartingWithSSet);

        teams.stream()
                .filter(team -> team.startsWith("S"))
                .collect(Collectors.toUnmodifiableList());
    }
}
