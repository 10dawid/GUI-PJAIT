package GUI_5.zadanie_11;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class IterNap implements Iterable<Character>{

    private String text;

    private int poczatek = 0;
    private int krok = 1;

    public IterNap(String text) {
        this.text = text;
    }

    public void ustawPoczatek(int poczatek) { this.poczatek = poczatek; }

    public void ustawKrok(int krok) { this.krok = krok; }


    @Override
    public Iterator<Character> iterator() {
        return new Iterator<Character>() {
            private int index = poczatek;
            private final int onCreationLength = text.length();
            @Override
            public boolean hasNext() {
                if (onCreationLength != text.length()) throw new ConcurrentModificationException();
                else return index < text.length();
            }

            @Override
            public Character next() {
                if (!hasNext()) throw new NoSuchElementException();
                else {
                    Character result = text.charAt(index);
                    index += krok;
                    return result;
                }
            }
        };
    }


}

