package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
      Supermarket supermarket;

    @BeforeEach
     void setUp() {
        supermarket= new Supermarket();
        Artikl a = new Artikl("Biciklo", 1000, "1");
        Artikl b= new Artikl("Biciklo", 1000, "2");
        supermarket.dodajArtikl(a);
        supermarket.dodajArtikl(b);
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "5"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "6"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "7"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "8"));
    }

    @Test
    void dodajArtikl() {
        Artikl c= new Artikl("Biciklo", 1000, "5");
        supermarket.dodajArtikl(c);
        Artikl[] nizArtikala =  supermarket.getArtikli();
        assertEquals(nizArtikala[2],c);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl[] nizArtikala =  supermarket.getArtikli();
        assertEquals(nizArtikala[1],supermarket.izbaciArtiklSaKodom("2"));
    }

    @Test
    void provjeraKoda() {
        assertTrue(supermarket.provjeraKoda("5"));
    }
}