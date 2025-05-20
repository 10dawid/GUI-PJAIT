package GUI_2.Zadanie_2;

public class Flecista extends Muzyk{
    private int stawka = 300;

    public Flecista(String imie, double czas){
        super(imie, czas);
    }

    @Override
    public String instrument(){
        return "flet";
    }
    @Override
    public int stawka(){
        return stawka;
    }
}
