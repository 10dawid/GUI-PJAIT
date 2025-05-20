package GUI_3.zadanie_5;

abstract class Figura {
    private int x;
    private int y;

    abstract String nazwa();
    abstract void pozycja(int x1 , int y1);

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
