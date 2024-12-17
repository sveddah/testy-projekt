package biblioteka.wsiz;

import java.util.List;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StronaBiblioteki {

// // //  TESTWYSZUKIWANIAKSIAZEK.JAVA

    private static final Map<String, List<String>> bazaDanych = new HashMap<>();

    static {
        // Przykładowe dane
        bazaDanych.put("tytul", List.of("Sąd Najwyższy", "Historia Polski", "Programowanie w Javie"));
        bazaDanych.put("autor", List.of("Adam Mickiewicz", "Henryk Sienkiewicz", "Robert C. Martin"));
        bazaDanych.put("temat", List.of("prawo", "historia", "informatyka"));
    }

    // Funkcja wyszukiwania precyzyjnego
    public boolean wyszukaj(String fraza, String indeks) {
        List<String> wyniki = bazaDanych.get(indeks.toLowerCase());
        if (wyniki == null) {
            return false;  // Indeks nie istnieje
        }

        // Sprawdzamy, czy fraza dokładnie pasuje do którejkolwiek z pozycji w indeksie
        return wyniki.stream().anyMatch(w -> w.equalsIgnoreCase(fraza));
    }
    // // //   KONIEC TESTWYSZUKIWANIAKSIAZEK.JAVA





    // // //    TESTLOGOWANIA.JAVA

    public boolean zaloguj(String login, String haslo) {
        return switch (login) {
            case "admin" -> haslo.equals("admin123");
            case "uzytkownik" -> haslo.equals("haslo123");
            default -> false;
        };
    }
    // // //   KONIEC TESTLOGOWANIA.JAVA




    // // // TESTZMIANYJEZYKA.JAVA

    // Funkcja sprawdzająca, czy zmiana języka działa
    public boolean czyZmianaJezykaDziala(String jezyk) {
        // Zakładam, że na stronie istnieje element, który wskazuje na aktualny język.
        // Można to zrealizować np. sprawdzając, czy tekst na stronie zawiera odpowiedni język.

        String aktualnyJezyk = pobierzAktualnyJezyk();

        switch (jezyk.toLowerCase()) {
            case "polski":
                return aktualnyJezyk.equals("Polski");
            case "angielski":
                return aktualnyJezyk.equals("English");
            case "ukraiński":
                return aktualnyJezyk.equals("Українська");
            default:
                return false;  // Jeśli język nie jest obsługiwany
        }
    }

    private String pobierzAktualnyJezyk() {
        // Zmienna, która przechowuje aktualny język (symulacja)
        String jezyk = "Polski"; // Możesz zmienić wartość na "Polski", "English" lub "Українська"

        // Sprawdzanie, jaki język jest aktualnie ustawiony
        return switch (jezyk) {
            case "Polski" -> "Polski";
            case "Angielski" -> "Angielski";
            case "Ukrainski" -> "Ukrainski";
            default ->
                // Jeśli język nie jest obsługiwany
                    "Język nieznany";
        };
    }


    // // // KONIEC TESTZMIANYJEZYKA.JAVA



    // // // TESTLINKOWMENU.JAVA

    // Poprawność linków
    public boolean czyLinkPoprawny(String elementMenu) {
        // Lista poprawnych elementów menu
        List<String> poprawneElementyMenu = List.of(
                "nowosci",
                "kolekcje",
                "rankingi",
                "informacje biblioteki",
                "aplikacja mobilna"
        );

        // Sprawdzenie, czy elementMenu znajduje się na liście poprawnych
        return poprawneElementyMenu.contains(elementMenu.toLowerCase());
    }
    // // //  KONIEC TESTLINKOWMENU.JAVA
}


