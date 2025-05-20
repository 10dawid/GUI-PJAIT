package GUI_4.zadanie_7;

public class Kolo2 extends Kolo implements Transformacja {
    Integer xBefore = null;
    Integer yBefore = null;

    @Override
    public String name() {
        return super.name();
    }

    @Override
    public void powrot() {
        if(xBefore != null & yBefore != null){
            int tempX = getX();
            int tempY = getY();
            setY(yBefore);
            setX(xBefore);
            xBefore = tempX;
            yBefore = tempY;
        }
    }

    @Override
    public void przesun(int newX, int newY) {
        if(xBefore == null & yBefore == null){
            xBefore = getX();
            yBefore = getY();
            setX(newX);
            setY(newY);
        }
        else{
            xBefore = getX();
            yBefore = getY();
            setX(newX);
            setY(newY);
        }
    }

    public Kolo2(int x, int y, int promien) {
        super(x, y, promien);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
