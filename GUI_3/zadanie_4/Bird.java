package GUI_3.zadanie_4;

public class Bird implements Flyable, Speakable{
    private String drive = "wings";
    private double distance = 5.5;

    @Override
    public String drive(){
        return this.drive;
    }
    @Override
    public double distance(){
        return this.distance;
    }
    @Override
    public String speak(){
        return "Bird is speaking!";
    }
}
