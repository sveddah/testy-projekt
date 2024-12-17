import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import biblioteka.wsiz.StronaBiblioteki;


public class TestLogowania {

    @ParameterizedTest
    @CsvSource({
            "admin, admin123, true",
            "uzytkownik, haslo123, true",
            "zly, zly123, false"
    })
    void testLogowania(String login, String haslo, boolean oczekiwanyWynik) {
        StronaBiblioteki stronaBiblioteki = new StronaBiblioteki();
        boolean wynikRzeczywisty = stronaBiblioteki.zaloguj(login, haslo);
        assertEquals(oczekiwanyWynik, wynikRzeczywisty, "Błąd logowania dla użytkownika: " + login);
    }
}


