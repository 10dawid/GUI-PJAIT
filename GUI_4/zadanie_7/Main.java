package GUI_4.zadanie_7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figura[] figury = {
                new Prostokat(1,1,4,9),
                new Kolo(1,1,5),
                new Prostokat(2,2,6,6)
        };
        System.out.println(Arrays.toString(figury));
        Arrays.sort(figury);
        System.out.println(Arrays.toString(figury));

    }
}
