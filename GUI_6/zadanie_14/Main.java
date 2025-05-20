package GUI_6.zadanie_14;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Samochod>> salonySamochodowe = new HashMap<>();

        String[] arr = {
                "salon A", "Mercedes", "130000",
                "salon B", "Mercedes", "120000",
                "salon C", "Ford", "110000",
                "salon B", "Opel", "90000",
                "salon C", "Honda", "95000",
                "salon A", "Ford", "105000",
                "salon A", "Renault", "75000"
        };

        String key = "";
        String marka = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                key = arr[i];
            } else if (i % 3 == 1) {
                marka = arr[i];
            } else if (i % 3 == 2) {
                int cena = Integer.parseInt(arr[i]);
                Samochod samochod = new Samochod(marka, cena);

                if (!salonySamochodowe.containsKey(key)) {
                    ArrayList<Samochod> samochody = new ArrayList<>();
                    samochody.add(samochod);
                    salonySamochodowe.put(key, samochody);
                }
                else{
                    List<Samochod> samochody = salonySamochodowe.get(key);
                    ArrayList<Samochod> nowaLista = new ArrayList<>(samochody);
                    nowaLista.add(samochod);
                    salonySamochodowe.put(key, nowaLista);
                }
            }
        }


        salonySamochodowe.forEach((k,v) -> System.out.println(k + " -> " + v));

        ArrayList<Samochod> najtansze = new ArrayList<>();

        var klucze = salonySamochodowe.keySet();

        for (var klucz : klucze){
            najtansze.add(Collections.min(salonySamochodowe.get(klucz)));
        }

        System.out.println(Collections.min(najtansze));
    }
}
