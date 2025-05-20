package GUI_5.zadanie_10;

import java.util.Comparator;

public class KomparatorOsob implements Comparator<Osoba> {
    Kryterium kryterium;

    public KomparatorOsob(Kryterium kryterium) {
        this.kryterium = kryterium;
    }

    @Override
    public int compare(Osoba o1, Osoba o2) {
        if (this.kryterium == Kryterium.imie){
            return o1.getImie().compareTo(o2.getImie());
        } else if (this.kryterium == Kryterium.wiek) {
            return o1.getWiek() - o2.getWiek();
        }
        return 0;
    }
}
