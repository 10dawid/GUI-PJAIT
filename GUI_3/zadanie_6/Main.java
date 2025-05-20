package GUI_3.zadanie_6;

public class Main {
    public static void main(String[] args) {
        Figura kolo = new Kolo(0,  0, 5);
        System.out.println(kolo.name() + " " + kolo);
        System.out.println("kolo.pole() = " + kolo.pole());
        System.out.println("kolo.obwod() = " + kolo.obwod());
        System.out.println();

        Figura prostokat = new Prostokat(4,4,5,3);
        System.out.println(prostokat.name() + " " + prostokat);
        System.out.println("prostokat.pole() = " + prostokat.pole());
        System.out.println("prostokat.obwod() = " + prostokat.obwod());
        System.out.println();

        Figura figura = new Figura(-2,-2) {
            @Override
            public String name() {
                return "figura";
            }

            @Override
            public void pozycja(int x2, int y2) {
                if(getX() == x2 & getY() == y2) System.out.println("to ten sam punkt");
                else System.out.println("dwa rozne punkty");
            }
        };
        System.out.println(figura.name() + " " + figura);
        System.out.println("figura.pole() = " + figura.pole());
        System.out.println("figura.obwod() = " + figura.obwod());
        System.out.println();

        Figura prostokat2 = new Prostokat2(-10, -8, 4,6,'∆');
        System.out.println(prostokat2.name() + " " + prostokat2);
        System.out.println("prostokat2.pole() = " + prostokat2.pole());
        System.out.println("prostokat2.obwod() = " + prostokat2.obwod());
        ((Prostokat2)prostokat2).rysuj();
        System.out.println();

        Kolo2 kolo2 = new Kolo2(15, 20, 5);
        kolo2.przesun(50, 40);    // przesunięcie środka koła do punktu (50, 40)
        System.out.println(kolo2.name() + " " + kolo2);
        kolo2.powrot();                    // powrót do poprzedniej pozycji (bezpośrednio przed przesunięciem) środka koła
        System.out.println(kolo2.name() + " " + kolo2);
        System.out.println();
    }
}
