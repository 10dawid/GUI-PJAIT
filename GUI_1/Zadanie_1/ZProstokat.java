package GUI_1.Zadanie_1;

import java.io.FileWriter;
import java.io.IOException;

public class ZProstokat extends Prostokat{

    char granica;
    char srodek;
    int numer;

    static int licznik = 0;

    public ZProstokat(int szerokosc, char granica, char srodek) {
        super(szerokosc);
        this.granica = granica;
        this.srodek = srodek;
        licznik += 1;
        this.numer = licznik;

    }
    public ZProstokat(int szerokosc, int wysokosc, char granica, char srodek) {
        super(szerokosc, wysokosc);
        this.granica = granica;
        this.srodek = srodek;
        licznik += 1;
        this.numer = licznik;
    }

    @Override
    public void rysuj(String fileName) throws NiepoprawnyProstokatException{
        String result = "\n";

        result += (super.szerokosc == super.wysokosc ? "kwadrat (" : "prostokat (") + this.numer + ") rozmiaru"
                + super.szerokosc + " x " + super.wysokosc +
                this.granica + " = " + ((szerokosc * wysokosc) - ((szerokosc - 1) * (wysokosc - 1))) + " " +
                this.srodek + " = " + ((szerokosc - 1) * (wysokosc - 1)) + "\n";

        if ((super.szerokosc < 2 || super.wysokosc < 2) && this.granica != this.srodek) throw new NiepoprawnyProstokatException();
        else {
            for(int i = 0; i < wysokosc; i++){
                for(int j = 0; j < szerokosc; j++){
                    if(i == 0 || j == 0 || j == szerokosc - 1 || i == wysokosc - 1) result += granica;
                    else result += srodek;
                }
                result += "\n";
            }
        }
        FileWriter fw = null;
        try{
            fw = new FileWriter(fileName, true);
            fw.write(result);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
