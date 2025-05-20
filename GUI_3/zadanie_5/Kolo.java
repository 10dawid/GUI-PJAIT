package GUI_3.zadanie_5;

public class Kolo extends Figura{
    private int promien;

    public Kolo(int x, int y, int promien) {
        super(x, y);
        this.promien = promien;
    }

    @Override
    String nazwa() {
        return "kolo";
    }

    @Override
    void pozycja(int x1, int y1) {
        double d = Math.sqrt((x1 - getX())*(x1 - getX()) + (y1 - getY())*(y1 - getY()));
        if (d <= this.promien) System.out.println("punkt znajduje sie wewnątrz koła");
        else System.out.println("punkt znajduje się poza kołem");
    }

    @Override
    public String toString() {
        return "kolo ze srodkiem w punkcie " + getX() + " ; " + getY() + " i promieniu równym " + this.promien;
    }
}
