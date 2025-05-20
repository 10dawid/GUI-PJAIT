package GUI_6.zadanie_13;

import java.util.Collection;

public class Osoba implements Comparable<Osoba>{
    private String imie;
    private int rokUrodzenia;


    public Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public int hashCode() {
        return 31 * rokUrodzenia + 17 * (imie.hashCode());
    }

    public static boolean wKolekcji(Collection<Osoba> kol, String imie, int rokUrodzenia){
        return kol.contains(new Osoba(imie, rokUrodzenia));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        else if (obj == null || this.getClass() != obj.getClass()) return false;
        else return ((Osoba) obj).hashCode() == this.hashCode();
    }

    @Override
    public int compareTo(Osoba o) {
        return this.hashCode() - o.hashCode();
    }
}
