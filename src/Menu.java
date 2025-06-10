import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sklep.*;

public class Menu {
    public void menu() {
        Scanner scan = new Scanner(System.in);
        Magazyn magazyn = new Magazyn();
        List<Zamowienie> listaZamowien = new ArrayList<>();
        Zamowienie zamowienie = new Zamowienie();
        magazyn.magazyny();
        int wybor;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Dodaj produkt.");
            System.out.println("2. Usun produkt.");
            System.out.println("3. Wyświetl produkty.");
            System.out.println("4. Złożenie zamówienia.");
            System.out.println("5. Wyświetlanie zamowienia.");;
            System.out.println("6. Wyjście.");
            System.out.print("Wybierz opcję: ");
            wybor = scan.nextInt();

            switch (wybor) {
                case 1 -> {
                    System.out.println("Podaj id produktu do dodania: ");
                    int d = scan.nextInt();
                    if (d >= 0 && d < magazyn.rozmiar()) {
                        zamowienie.dodajProdukt(magazyn.getProdukty(d));
                        System.out.println("Produkt dodany do zamówienia.");
                    } else {
                        System.out.println("Nieprawidłowy indeks produktu.");
                    }
                }
                case 2 ->{
                    System.out.println("Podaj id produktu do usuniecia: ");

                int d = scan.nextInt();
                if (d >= 0 && d < magazyn.rozmiar()) {
                    zamowienie.usunProdukt(magazyn.getProdukty(d));
                    System.out.println("Produkt usuniety z zamówienia.");
                } else {
                    System.out.println("Nieprawidłowy indeks produktu.");
                }
              }
                case 3 -> magazyn.wyswietlProdukty();
                case 4 -> {
                    if (zamowienie.getProdukty().isEmpty()) {
                        System.out.println("Nie można złożyć pustego zamówienia.");
                    } else {
                        listaZamowien.add(zamowienie);
                        System.out.println("Złożono zamówienie nr: " + zamowienie.getIdZamowienia());
                        zamowienie = new Zamowienie();
                    }
                }
                case 5 -> {
                    if (listaZamowien.isEmpty()) {
                        System.out.println("Brak złożonych zamówień.");
                    } else {
                        for (Zamowienie z : listaZamowien) {
                            z.wyswietlZamowienie();
                        }
                    }
                }
                case 6 -> System.out.println("Zakończono program.");
                default -> System.out.println("Nieprawidłowa opcja.");
            }



    } while (wybor != 6);
    }
}


