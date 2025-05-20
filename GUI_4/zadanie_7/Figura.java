package GUI_4.zadanie_7;

public abstract class Figura implements Obliczenie, Comparable<Figura> {
    private static int licznikFigur = 0;


    private int x;
    private int y;
    private int numer;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
        licznikFigur ++;
        this.numer = licznikFigur;
    }

    public abstract String name();

    public abstract void pozycja(int x2, int y2);

    @Override
    public String toString(){
        return "{" + x +"; " + y + "}";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getNumer() { return numer; }



    //interfejs obliczanie

    @Override
    public double pole() {
        System.out.println("punkt nie może mieć pola");
        return 0;
    }

    @Override
    public int obwod() {
        System.out.println("punkt nie może mieć obwodu");
        return 0;
    }


    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }

    @Override
    public int compareTo(Figura o) {
        if (pole() > o.pole()) return 1;
        else if (pole() == o.pole()) {
            if (obwod() > o.obwod()){
                return 1;
            } else if (obwod() == o.obwod()) {
                if (getNumer() > o.getNumer()) return 1;
                else return -1;
            }
        }
        return -1;
    }
}
