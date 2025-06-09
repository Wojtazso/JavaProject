Repozytorium pokazująca postep oraz finalą wersje projectu z programowania obiektowego w jezyku Java

Głównym celem pracy jest zaprojektowanie i zaimplementowanie prostej aplikacji sklepu internetowego w języku Java, która umożliwia realizację podstawowych funkcji związanych z zakupami online. Projekt ma charakter edukacyjny i służy jako przykład zastosowania obiektowego podejścia do programowania oraz organizacji kodu w praktycznym zastosowaniu.

Jak uruchomić projekt Java (JavaProject) w IntelliJ IDEA:
1. Otwórz IntelliJ IDEA
2. Załaduj projekt:
Kliknij File > Open...

Wybierz folder, w którym jest Twój projekt javaproject (czyli folder, który zawiera podfolder src).

Kliknij OK.

3. Ustaw strukturę projektu
W oknie projektu po lewej powinieneś widzieć folder src.
Jeśli src nie jest oznaczony jako folder źródłowy (Source Root), to:
Kliknij prawym na folder src
Wybierz Mark Directory as > Sources Root

4. Znajdź klasę z metodą main
W folderze src otwórz klasę z metodą public static void main(String[] args) — np. Main.java.

5. Uruchom program
Kliknij prawym przyciskiem myszy na plik Main.java.
Wybierz Run 'Main.main()'.
Program uruchomi się w dolnym panelu IntelliJ i wyświetli wynik w konsoli.

6. (Opcjonalnie) Stwórz konfigurację uruchomieniową
W górnym pasku wybierz Add Configuration...
Kliknij + i wybierz Application
Ustaw:
Name: np. Run javaproject
Main class: wybierz klasę Main
Module: powinno wskazać Twój moduł (np. javaproject)
Zapisz i uruchom tę konfigurację.

7. (Jeśli nie masz jeszcze projektu w IntelliJ)
Jeśli masz tylko folder src z plikami, możesz też:
File > New > Project from Existing Sources...
Wskaż folder javaproject
Wybierz typ projektu jako Java (jeśli IntelliJ zapyta)
Zakończ kreatora i wykonaj kroki z 3.

Przejdź do katalogu projektu:

bash
1. Przejdź do katalogu projektu:
cd /ścieżka/do/javaproject

2. Skompiluj pliki .java do folderu out:
javac -d out src/Sklep/*.java

3. Uruchom program (zakładając, że główna klasa to Main w pakiecie Sklep):
java -cp out Sklep.Main

Jeśli masz więcej pakietów lub podfolderów w src, możesz skompilować wszystkie pliki tak:
find src -name "*.java" > sources.txt
javac -d out @sources.txt
Następnie uruchom tak samo, podając pełną nazwę klasy z pakietem.

