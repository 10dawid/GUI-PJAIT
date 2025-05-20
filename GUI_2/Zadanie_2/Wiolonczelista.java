package GUI_2.Zadanie_2;

public class Wiolonczelista extends Muzyk{
    private int stawka = 250;

    public Wiolonczelista(String imie, double czas){
        super(imie, czas);
    }

    @Override
    public String instrument(){
        return "wiolonczela";
    }
    @Override
    public int stawka(){
        return stawka;
    }
}
