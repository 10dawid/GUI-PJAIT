package GUI_5.zadanie_10;

public class Osoba implements Comparable<Osoba>{
    private String imie;
    private int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                 imie + '\'' +
                 wiek +
                '}';
    }

    @Override
    public int compareTo(Osoba o) {
        if (!this.imie.equals(o.imie)) return this.imie.compareTo(o.imie);
        else return this.wiek - o.wiek;
    }

}
