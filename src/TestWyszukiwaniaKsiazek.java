import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import biblioteka.wsiz.StronaBiblioteki;

public class TestWyszukiwaniaKsiazek {

    @ParameterizedTest
    @CsvSource({
            "Sąd Najwyższy, tytul, true",
            "Sąd, tytul, false",
            "Historia Polski, tytul, true",
            "informatyka, temat, true",
            "programowanie w Javie, tytul, true",
            "Mickiewicz, autor, false",
            "informatyka, autor, false"
    })
    void testWyszukiwania(String frazaWyszukiwania, String indeks, boolean oczekiwanyWynik) {
        StronaBiblioteki stronaBiblioteki = new StronaBiblioteki();
        boolean wynikRzeczywisty = stronaBiblioteki.wyszukaj(frazaWyszukiwania, indeks);
        assertEquals(oczekiwanyWynik, wynikRzeczywisty,
                "Błąd wyszukiwania dla frazy: " + frazaWyszukiwania +
                        " w indeksie: " + indeks);
    }
}






