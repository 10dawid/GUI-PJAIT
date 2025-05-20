package GUI_3.zadanie_6;

public class Prostokat2 extends Prostokat implements Rysowanie{
    private char icon;

    public Prostokat2(int x, int y, int szerokosc, int wysokosc, char icon) {
        super(x, y, szerokosc, wysokosc);
        this.icon = icon;
    }

    @Override
    public String name() {
        return "prostokat2";
    }

    //interfejs rysowanie
    @Override
    public void rysuj() {
        for(int i = 0; i < getWysokosc(); i++) {
            for (int j = 0; j < getSzerokosc(); j++)
                System.out.print(icon);
            System.out.println();
        }
    }
}
