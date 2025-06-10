package sklep;

import java.util.ArrayList;
import java.util.List;

public class Magazyn {
    private List<Produkt> produkty;

    public Magazyn() {
        produkty = new ArrayList<>();
    }

    public void magazyny() {

        produkty.add(new Elektronika("Smartfon", "Elektronika", 10, 1500.0, 1, 24));
        produkty.add(new Elektronika("Laptop", "Elektronika", 5, 3000.0, 2, 12));
        produkty.add(new Elektronika("Telewizor", "Elektronika", 7, 2500.0, 3, 36));
        produkty.add(new Elektronika("Słuchawki", "Elektronika", 15, 200.0, 4, 6));
        produkty.add(new Elektronika("Powerbank", "Elektronika", 20, 120.0, 5, 12));


        produkty.add(new CzesciSamochodowe("Amortyzator", "Części samochodowe", 8, 400.0, 6, "Toyota"));
        produkty.add(new CzesciSamochodowe("Filtr powietrza", "Części samochodowe", 20, 50.0, 7, "Honda"));
        produkty.add(new CzesciSamochodowe("Klocki hamulcowe", "Części samochodowe", 15, 150.0, 8, "BMW"));
        produkty.add(new CzesciSamochodowe("Olej silnikowy", "Części samochodowe", 10, 80.0, 9, "Ford"));
        produkty.add(new CzesciSamochodowe("Świeca zapłonowa", "Części samochodowe", 25, 40.0, 10, "Volkswagen"));


        produkty.add(new Ubrania("Koszula", "Ubrania", 30, 100.0, 11, "M", "Biały", "Bawełna"));
        produkty.add(new Ubrania("Spodnie", "Ubrania", 25, 150.0, 12, "L", "Niebieski", "Jeans"));
        produkty.add(new Ubrania("Kurtka", "Ubrania", 10, 300.0, 13, "XL", "Czarny", "Poliester"));
        produkty.add(new Ubrania("T-shirt", "Ubrania", 40, 50.0, 14, "S", "Czerwony", "Bawełna"));
        produkty.add(new Ubrania("Sweter", "Ubrania", 20, 200.0, 15, "M", "Szary", "Wełna"));
    }



    public void dodajProdukt(Produkt p) {
        produkty.add(p);
    }

    public Produkt getProdukty(int i) {
        return produkty.get(i);
    }

    public void wyswietlProdukty() {
        if (produkty.isEmpty()) {
            System.out.println("Magazyn jest pusty.");
        } else {
            System.out.println("Lista Dostepnych Produktów");
            for (Produkt p : produkty) {
                System.out.println(p);
            }
        }
    }
    public int rozmiar() {
        return produkty.size();
    }
}




