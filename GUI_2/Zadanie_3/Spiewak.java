package GUI_2.Zadanie_3;

public abstract class Spiewak {
    private static int licznik = 1;

    private String nazwisko;
    private int numerStartowy = licznik++;

    public Spiewak(String nazwisko){
        this.nazwisko = nazwisko;
    }

    abstract String spiewaj();

    @Override
    public String toString(){
        return "(" + numerStartowy + ") " + nazwisko + ": " + spiewaj();
    }

    private static int glosnosc(String s){
        int digit = 0;
        int letter = 0;
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if (x >= '0' && x <= '9' && x > digit) digit = x;
            if (x >= 'a' && x <= 'z' && x > letter) letter = x;
        }
        return digit + letter;
    }

    public static Spiewak najglosniej(Spiewak[] spiewacy){
        Spiewak max = spiewacy[0];
        for(Spiewak spiewak : spiewacy){
            if (Spiewak.glosnosc(spiewak.spiewaj()) > Spiewak.glosnosc(max.spiewaj()))
                max = spiewak;
        }
        return max;
    }


}
