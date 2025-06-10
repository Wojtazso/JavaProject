import java.util.Scanner;
import sklep.*;

public class Menu {
    public void menu() {
        Scanner scan = new Scanner(System.in);
        int wybor;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Dodaj produkt");
            System.out.println("2. Wyświetl produkty");
            System.out.println("3. Dodaj klienta");
            System.out.println("4. Wyświetl klientów");
            System.out.println("5. Złóż zamówienie");
            System.out.println("6. Wyświetl zamówienia");
            System.out.println("0. Wyjście");
            System.out.print("Wybierz opcję: ");
            wybor = scan.nextInt();

            switch (wybor) {
                case 1 -> System.out.println("1");
                case 2 -> System.out.println("1");
                case 3 -> System.out.println("1");
                case 4 -> System.out.println("1");
                case 5 -> System.out.println("1");
                case 6 -> System.out.println("1");
                case 0 -> System.out.println("Zakończono program.");
                default -> System.out.println("Nieprawidłowa opcja.");
            }



    } while (wybor != 0);
    }
}

