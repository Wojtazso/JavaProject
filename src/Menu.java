
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import sklep.*;

public class Menu {
    Scanner scan = new Scanner(System.in);

    public void menu() {

        Magazyn magazyn = new Magazyn();
        magazyn.magazyny();
        List<Produkt> oryginalnyStanMagazynu = magazyn.getKopiaProduktow();

        Zamowienie zamowienie = new Zamowienie();


        int wybor=0;
        do {
            try {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Dodaj produkt.");
                System.out.println("2. Usun produkt.");
                System.out.println("3. Wyświetl produkty.");
                System.out.println("4. Złożenie zamówienia, wybor platnosci oraz wyjscie.");
                System.out.println("5. Aktualnie zamowienie.");
                System.out.println("6. Reset zamowienia");
                System.out.println("7. Wyjście.");
                System.out.println("8. Dodanie nowego przedmiotu do sklepu.");
                System.out.println("9. Usuniecie przedmiotu ze sklepu");
                System.out.print("Wybierz opcję: ");
                wybor = scan.nextInt();


                switch (wybor) {
                    case 1 -> {
                        System.out.println("Podaj id produktu do dodania: ");
                        int d = scan.nextInt();

                        if (d >= 0 && d < magazyn.rozmiar()) {
                            Produkt p = magazyn.getProdukty(d);

                            System.out.println("Podaj ilość do dodania: ");
                            int iloscDoDodania = scan.nextInt();

                            if (iloscDoDodania > 0 && iloscDoDodania <= p.getIlosc()) {
                                zamowienie.dodajProdukt(p, iloscDoDodania);
                                // zmniejsz stan magazynu
                                p.setIlosc(p.getIlosc() - iloscDoDodania);
                                System.out.println("Produkt dodany do zamówienia.");
                            } else {
                                System.out.println("Nieprawidłowa ilość. Dostępna ilość: " + p.getIlosc());
                            }
                        } else {
                            System.out.println("Nieprawidłowy indeks produktu.");
                        }
                    }

                    case 2 -> {
                        System.out.println("Podaj id produktu do usunięcia: ");
                        int d = scan.nextInt();

                        if (d >= 0 && d < magazyn.rozmiar()) {
                            Produkt produktDoUsuniecia = magazyn.getProdukty(d);
                            if (zamowienie.contains(produktDoUsuniecia)) {
                                // Przywróć ilość do magazynu
                                for (PozycjaZamowienia poz : zamowienie.getPozycje()) {
                                    if (poz.getProdukt().getId() == produktDoUsuniecia.getId()) {
                                        int iloscZWZamowienia = poz.getIlosc();
                                        produktDoUsuniecia.setIlosc(produktDoUsuniecia.getIlosc() + iloscZWZamowienia);
                                        break;
                                    }
                                }
                                zamowienie.usunProdukt(produktDoUsuniecia);
                                System.out.println("Produkt usunięty z zamówienia.");
                            } else {
                                System.out.println("Tego produktu nie ma w zamówieniu.");
                            }
                        } else {
                            System.out.println("Nieprawidłowy indeks produktu.");
                        }
                    }
                    case 3 -> magazyn.wyswietlProdukty();
                    case 4 -> {
                        System.out.println("Złożone zamowienie ");
                        if (!zamowienie.getPozycje().isEmpty()){
                                zamowienie.wyswietlZamowienie();
                            System.out.println("Wybierz forme platnosci");
                            String wyborplatnosci;
                            do {
                                System.out.println("Napisz karta lub gotowka");

                                wyborplatnosci = scan.next().toLowerCase();

                                if (wyborplatnosci.contains("karta")) {
                                    System.out.println("Wybrales platnosc kartą.");
                                } else if (wyborplatnosci.contains("gotowka")) {
                                    System.out.println("Wybrales platnosc gotowka");
                                } else {
                                    System.out.println("Wybierz platnosc jeszcze raz");
                                }
                            } while (!wyborplatnosci.contains("karta") || wyborplatnosci.contains("gotowka"));
                        } else {
                            System.out.print("jest puste")  ;
                        }
                    }

                    case 5 -> {
                        System.out.println("Aktualne zamówienie (niezłożone):");
                        zamowienie.wyswietlZamowienie();
                    }

                    case 6 -> {
                        zamowienie = new Zamowienie();
                        magazyn.getProdukty().clear(); // wyczyść aktualny magazyn
                        for (Produkt p : oryginalnyStanMagazynu) {
                            magazyn.dodajProdukt(p);
                        }
                        System.out.println("Aktualne zamówienie zostało zresetowane, magazyn przywrócony do stanu początkowego.");
                    }
                    case 7 -> System.out.println("Zakończono program.");
                    case 8 -> magazyn.stworzNowyObiekt();
                    case 9 -> {
                        System.out.println("Podaj ID produktu, z którego chcesz odjąć ilość:");
                        int id = scan.nextInt();
                        System.out.println("Ile sztuk chcesz odjąć?");
                        int ile = scan.nextInt();
                        scan.nextLine(); // czyści bufor
                        magazyn.odejmijIloscProduktu(id, ile);}
                    default -> System.out.println("Nieprawidłowa opcja.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Złe dane, podana liczba musi byc całkowita lub być liczbą");
                scan.nextLine();
            }
        } while (wybor != 7 && wybor != 4);
    }
}






