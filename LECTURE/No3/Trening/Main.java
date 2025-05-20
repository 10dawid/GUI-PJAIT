package LECTURE.No3.Trening;

import java.util.Arrays;

import static LECTURE.No3.Trening.SortBoxBy.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("TYPY GENERYCZNE");
        KeyValuePair<String, Integer> pairA = new KeyValuePair<>("AAAA", 1111);
        KeyValuePair<String, Integer> pairB = new KeyValuePair<>("BBBB", 2222);
        KeyValuePair<String, Integer> pairC = new KeyValuePair<>("CCCC", 3333);
        KeyValuePair<Boolean, Character> oddPair = new KeyValuePair<>(false, '§');
        KeyValuePair[] pairs = {pairA, pairB, pairC, oddPair};
        KeyValuePair.printArrayOfKeys(pairs);
        System.out.println("==============================");


        System.out.println("PRZYKŁAD WYKORZYSTANIA INTERFEJSU COMPARABLE");
        Dog dog1 = new Dog("one", 1);
        Dog dog2 = dog1;
        System.out.println("(dog1 == dog2) -> " + (dog1 == dog2));
        System.out.print("klasy bez zaimpementowanego interfejsu comparable przy porównywaniu siebie biorą pod uwagę adres w pamięci");
        System.out.println();

        System.out.println("sortowanie tabeli z psami ze względu na wiek");
        
        ComparableDog compDog1 = new ComparableDog("mid", 5);
        ComparableDog compDog2 = new ComparableDog("old", 16);
        ComparableDog compDog3 = new ComparableDog("yung", 2);
        ComparableDog[] comparableDogs = {compDog1, compDog2, compDog3};
        
        System.out.println(Arrays.toString(comparableDogs));
        Arrays.sort(comparableDogs);
        System.out.println(Arrays.toString(comparableDogs));

        System.out.println("==============================");

        System.out.println("TYPY WYLICZNIKOWE ENUM");
        Box[] boxes = {
                new Box(3,'a',8),
                new Box(1,'z', -23.5),
                new Box(2,'g', 2.2),
                new Box(6,'p', 3.14)
        };
        System.out.println(Arrays.toString(boxes));
        Box.sortBoxes(boxes, NUM_A);
        System.out.println(Arrays.toString(boxes));
        Box.sortBoxes(boxes, DNUM_D);
        System.out.println(Arrays.toString(boxes));
        Box.sortBoxes(boxes, SUM_A);
        System.out.println(Arrays.toString(boxes));
    }
}
