package GUI_3.zadanie_6;

public class Prostokat extends Figura implements Obliczenie{

    private int szerokosc;
    private int wysokosc;




    @Override
    public String toString() {
        return "{" + getX() + " ; " + getY() + " szerokością = " + this.szerokosc + " wysokość = " + this.wysokosc + "}";
    }

    @Override
    public void pozycja(int x2, int y2) {
        if(x2 >= getX() && x2 <= getX() + szerokosc)
            if(y2 <= getY() && y2 >= getY() - wysokosc)
                System.out.println("punkt leży na prostokącie");
            else System.out.println("punkt nie leży na prostokącie");
    }

    @Override
    public String name() {
        return "Prostokat";
    }

    public Prostokat(int x, int y, int szerokosc, int wysokosc) {
        super(x, y);
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    // interfejs oblicznie

    @Override
    public double pole() {
        return szerokosc * wysokosc;
    }

    @Override
    public int obwod() {
        return 2 * szerokosc + 2 * wysokosc;
    }
}
