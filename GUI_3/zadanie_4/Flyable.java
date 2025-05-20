package GUI_3.zadanie_4;

public interface Flyable {
    String drive();
    double distance();


    static Flyable hybrid(Flyable first, Flyable second){
        return new Flyable() {
            @Override
            public String drive() {
                return first.drive() + second.drive();
            }

            @Override
            public double distance() {
                return first.distance() > second.distance() ? first.distance() : second.distance();
            }
        };
    }
}
