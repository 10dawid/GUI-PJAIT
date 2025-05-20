package GUI_3.zadanie_4;

public class UFO implements Flyable, Speakable{
    private String drive = "unkown engine type";
    private double distance = 50000;

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
        return "UFO is speaking";
    }
}
