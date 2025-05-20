package GUI_3.zadanie_6;

public class Kolo extends Figura implements Obliczenie{

    private int promien;

    @Override
    public String toString() {
        return "{" + getX() +"; " + getY() + " r = " + promien + "}";
    }

    @Override
    public void pozycja(int x2, int y2) {
        double d = Math.sqrt((x2 - getX())*(x2 - getX()) + (y2 - getY())*(y2 - getY()));
        if (d <= this.promien) System.out.println("punkt znajduje sie wewnątrz koła");
        else System.out.println("punkt znajduje się poza kołem");
    }

    @Override
    public String name() {
        return "Kolo";
    }

    public Kolo(int x, int y, int promien) {
        super(x, y);
        this.promien = promien;
    }


    //interfejs obliczanie
    @Override
    public double pole() {
        return (Math.PI * promien * promien);
    }

    @Override
    public int obwod() {
        return (int)(Math.PI * 2 * promien);
    }


}
