package sklep;

import java.util.ArrayList;
import java.util.List;

public class Magazyn {
    private List<Produkt> produkty;

    public Magazyn() {
        produkty = new ArrayList<>();
    }

   // public void dodajWszystkieProdukty(){
  //      produkty.addAll(List.of();//dodanie kilku obiektów do magazynu
  //}



    public void dodajProdukt(Produkt p) {
        produkty.add(p);
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
}




