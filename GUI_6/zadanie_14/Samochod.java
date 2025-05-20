package GUI_6.zadanie_14;

public class Samochod implements Comparable<Samochod>{
    private String marka;
    private int cena;


    public Samochod(String marka, int cena) {
        this.marka = marka;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "<" + marka + " " + cena + ">";
    }

    public int getCena() {
        return cena;
    }

    @Override
    public int compareTo(Samochod o) {
        return this.cena - o.cena;
    }
}
