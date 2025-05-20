package GUI_3.zadanie_4;

public class Virus implements Flyable{
    private String drive = "no drive";
    private double distance = 0.002;

    @Override
    public String drive() {
        return this.drive;
    }
    @Override
    public double distance() {
        return this.distance;
    }
}
