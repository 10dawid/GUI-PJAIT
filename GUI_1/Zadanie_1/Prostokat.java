package GUI_1.Zadanie_1;


import java.io.FileWriter;
import java.io.IOException;

public class Prostokat {
    int szerokosc;
    int wysokosc;

    public Prostokat(int szerokosc, int wysokosc) {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }
    public Prostokat(int szerokosc){
        this.szerokosc = szerokosc;
        this.wysokosc = szerokosc;
    }

    public void rysuj(String filename) throws NiepoprawnyProstokatException {
        String result = "\n";
        if (szerokosc < 1 || wysokosc < 1) throw new NiepoprawnyProstokatException();
        else if (wysokosc == szerokosc) result += "Zwykly kwadrat rozmiaru " + this.szerokosc + " x " + this.wysokosc;
        else result += "Zwykly prostokat rozmiaru " + this.szerokosc + " x " + this.wysokosc;
        result += "\n";
        FileWriter fw = null;
        try {
            fw = new FileWriter(filename, true);
            fw.write(result);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
