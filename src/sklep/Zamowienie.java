package sklep;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {
    private List<PozycjaZamowienia> pozycje;
    private int idZamowienia;
    private static int licznikZamowien = 1;

    public Zamowienie() {
        pozycje = new ArrayList<>();
        this.idZamowienia = licznikZamowien++;
    }

    public int getIdZamowienia() {
        return idZamowienia;
    }
    public List<PozycjaZamowienia> getPozycje(){
        return pozycje;
    }

    // Dodawanie produktu z ilością (nowa metoda)
    public void dodajProdukt(Produkt p, int ilosc) {
        for (PozycjaZamowienia poz : pozycje) {
            if (poz.getProdukt().getId() == p.getId()) {
                // Jeśli produkt już jest, dodaj ilość
                poz.setIlosc(poz.getIlosc() + ilosc);
                return;
            }
        }
        // Jeśli produktu jeszcze nie ma, dodaj nową pozycję
        pozycje.add(new PozycjaZamowienia(p, ilosc));
    }

    // Usuwanie produktu całkowicie z zamówienia
    public void usunProdukt(Produkt p) {
        pozycje.removeIf(poz -> poz.getProdukt().getId() == p.getId());
    }

    // Sprawdzanie czy produkt jest w zamówieniu
    public boolean zawiera(Produkt p) {
        return pozycje.stream().anyMatch(poz -> poz.getProdukt().getId() == p.getId());
    }

    public void wyswietlZamowienie() {
        System.out.println("Zamówienie nr: " + idZamowienia);
        if (pozycje.isEmpty()) {
            System.out.println("Brak produktów w zamówieniu.");
        } else {
            for (PozycjaZamowienia poz : pozycje) {
                System.out.println(poz);
            }
            System.out.printf("Łączna cena z VAT: %.2f PLN%n", obliczLacznaCene());
        }
    }

    public double obliczLacznaCene() {
        double suma = 0;
        for (PozycjaZamowienia poz : pozycje) {
            suma += poz.getProdukt().obliczCeneZVat() * poz.getIlosc();
        }
        return suma;
    }
}