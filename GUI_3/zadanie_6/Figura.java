package GUI_3.zadanie_6;

public abstract class Figura implements Obliczenie{
    private int x;
    private int y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
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
}
