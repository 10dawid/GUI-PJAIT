package GUI_2.Zadanie_2;

public class Skrzypek extends Muzyk{
    private int stawka = 200;

    public Skrzypek(String imie, double czas){
        super(imie, czas);
    }

    @Override
    public String instrument(){
        return "skrzypce";
    }
    @Override
    public int stawka(){
        return stawka;
    }
}
