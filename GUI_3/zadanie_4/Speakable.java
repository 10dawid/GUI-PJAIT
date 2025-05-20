package GUI_3.zadanie_4;

public interface Speakable {
    String speak();

    public static Speakable loudest(Speakable[] speakables){
        Speakable winner = speakables[0];
        for(Speakable speakable : speakables){
            if (speakable.speak().length() > winner.speak().length()) winner = speakable;
        }
        return winner;
    }
}
