package sklep;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {
    private List<Produkt> produkty;
    private int idZamowienia;
    private static int licznikZamowien = 1;

    public Zamowienie() {
        produkty = new ArrayList<>();
        this.idZamowienia = licznikZamowien++;
    }

    public int getIdZamowienia() {
        return idZamowienia;
    }

    public void dodajProdukt(Produkt p) {
        produkty.add(p);
    }

    public void usunProdukt(Produkt p) {
        produkty.remove(p);
    }

    public double obliczLacznaCene() {
        double suma = 0;
        for (Produkt p : produkty) {
            suma += p.obliczCeneZVat();
        }
        return suma;
    }

    public void wyswietlZamowienie() {
        System.out.println("Zamówienie nr: " + idZamowienia);
        if (produkty.isEmpty()) {
            System.out.println("Brak produktów w zamówieniu.");
        } else {
            for (Produkt p : produkty) {
                System.out.println(p);
            }
            System.out.printf("Łączna cena z VAT: %.2f PLN%n", obliczLacznaCene());
        }
    }
    public List<Produkt> getProdukty() {
        return produkty;
    }
}