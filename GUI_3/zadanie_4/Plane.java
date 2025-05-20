package GUI_3.zadanie_4;

public class Plane implements Flyable, Speakable{
    private String drive = "jet engine";
    private double distance = 1200.7;

    @Override
    public String drive() {
        return this.drive;
    }

    @Override
    public double distance() {
        return this.distance;
    }

    @Override
    public String speak() {
        return "Plane is speaking";
    }
}
