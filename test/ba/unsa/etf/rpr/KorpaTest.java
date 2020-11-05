package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
        static Korpa korpa;

   @BeforeAll
    static void setUp() {
        korpa = new Korpa();
       Artikl a = new Artikl("Biciklo", 1000, "1");
       Artikl b= new Artikl("Biciklo", 1000, "2");
       Artikl c= new Artikl("Biciklo", 1000, "3");
       korpa.artikli_korpa[0]=a;
       korpa.artikli_korpa[1]=b;
       korpa.artikli_korpa[2]=c;

    }

    @Test
    void dodajArtikl() {
        assertTrue(korpa.dodajArtikl(new Artikl("Biciklo", 1000, "4")));
        assertTrue(korpa.dodajArtikl(new Artikl("Biciklo", 1000, "5")));
        assertTrue(korpa.dodajArtikl(new Artikl("Biciklo", 1000, "6")));

    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl c= new Artikl("Biciklo", 1000, "3");
       korpa.dodajArtikl(c);
          assertEquals(c,korpa.izbaciArtiklSaKodom("3"),"Isti");
    }

    @Test
    void dajUkupnuCijenuArtikala() {
       assertEquals(3000,korpa.dajUkupnuCijenuArtikala());
    }
}