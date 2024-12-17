import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import biblioteka.wsiz.StronaBiblioteki;

public class TestLinkowMenu {

    @ParameterizedTest
    @CsvSource({
            "nowosci, true",
            "kolekcje, true",
            "rankingi, true",
            "informacje biblioteki, true",
            "aplikacja mobilna, true",
            "nieistniejacy, false"
    })
    void testLinkow(String elementMenu, boolean oczekiwanyWynik) {
        StronaBiblioteki stronaBiblioteki = new StronaBiblioteki();
        boolean wynikRzeczywisty = stronaBiblioteki.czyLinkPoprawny(elementMenu);
        assertEquals(oczekiwanyWynik, wynikRzeczywisty, "Błąd sprawdzania linku dla elementu menu: " + elementMenu);
    }
}