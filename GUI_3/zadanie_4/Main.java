package GUI_3.zadanie_4;

public class Main {
    public static void main(String[] args) {
        Flyable plane = new Plane();
        Flyable bird = new Bird();
        Flyable ufo = new UFO();
        Flyable virus = new Virus();
        Flyable planeUfo = Flyable.hybrid(plane, ufo);
        Flyable chopper = new Flyable() {
            @Override
            public String drive() {
                return "propeller";
            }

            @Override
            public double distance() {
                return 300;
            }
        };
        Flyable chopperBird = Flyable.hybrid(chopper, bird);

        Flyable [] flyables = {plane, bird, ufo, virus, planeUfo, chopper, chopperBird};

        for (Flyable obj : flyables){
            System.out.println("obj.drive() = " + obj.drive());
            System.out.println("obj.distance() = " + obj.distance());
            if (obj instanceof Speakable) System.out.println("((Speakable) obj).speak() = " + ((Speakable) obj).speak());
            System.out.println("====================");
        }

        Speakable plane1 = new Plane();
        Speakable bird1 = new Bird();
        Speakable singer = new Speakable() {
            @Override
            public String speak() {
                return "singsingsing";
            }
        };
        Speakable [] speakables = {plane1, bird1, singer};
        System.out.println(Speakable.loudest(speakables));
    }
}
