package GUI_2.Zadanie_2;

public abstract class Muzyk {
    private String imie;
    private double czas;

    protected Muzyk(String imie, double czas) {
        this.imie = imie;
        this.czas = czas;
    }

    protected String imie(){
        return imie;
    }

    protected double czas(){
        return czas;
    }

    abstract protected String instrument();
    abstract protected int stawka();

    @Override
    public String toString(){
        return imie + ", czas: " + czas + ", stawka:" + stawka();
    }

    public static Muzyk maxHonorarium(Muzyk[] muzycy){
        Muzyk wynik = muzycy[0];
        for(Muzyk m : muzycy){
            if ((m.stawka() * m.czas()) > (wynik.stawka() * wynik.czas()))
                wynik = m;
        }
        return wynik;
    }
}
