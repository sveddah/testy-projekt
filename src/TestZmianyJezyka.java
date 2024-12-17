import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import biblioteka.wsiz.StronaBiblioteki;

public class TestZmianyJezyka {

    @ParameterizedTest
    @CsvSource({
            "polski, true",
            "angielski, true",
            "ukraiński, true",
            "francuski, false"
    })
    void testZmianyJezyka(String jezyk, boolean oczekiwanyWynik) {
        StronaBiblioteki stronaBiblioteki = new StronaBiblioteki();
        boolean wynikRzeczywisty = stronaBiblioteki.czyZmianaJezykaDziala(jezyk);
        assertEquals(oczekiwanyWynik, wynikRzeczywisty, "Błąd zmiany języka na: " + jezyk);
    }
}
