package GUI_3.zadanie_5;

public class Prostokat extends Figura{
    private int szerokosc;
    private int wysokosc;

    public Prostokat(int x, int y, int szerokosc, int wysokosc) {
        super(x, y);
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    @Override
    String nazwa() {
        return "prostokąt";
    }

    @Override
    void pozycja(int x1, int y1) {
        if(x1 >= getX() && x1 <= getX() + szerokosc)
            if(y1 <= getY() && y1 >= getY() - wysokosc)
                System.out.println("punkt leży na prostokącie");
        else System.out.println("punkt nie leży na prostokącie");
    }

    @Override
    public String toString() {
        return "prostokąt z lewym górnym wierzchołkiem w  " + getX() + " ; " + getY() + " szerokością równą " + this.szerokosc + " i wysokością " + this.wysokosc;
    }
}
