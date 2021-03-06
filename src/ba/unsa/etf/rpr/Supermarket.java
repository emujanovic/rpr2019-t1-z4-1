package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];

    public void dodajArtikl(Artikl a) {
        for (int i = 0; i < 1000; i++) {
            if (artikli[i] == null) {
                artikli[i] = a;
                return;
            }
        }

    }

    public Artikl[] getArtikli() {
        return this.artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl temp = new Artikl();
        for (int i = 0; i < 1000; i++) {
            if (artikli[i] != null) {
                if ((artikli[i].getKod()).equals(kod)) {
                    temp = artikli[i];
                    artikli[i] = null;
                }

            }
        }
        return temp;
    }

    public boolean provjeraKoda(String kod) {
        Artikl[] spisakArtikala = artikli;
        Boolean ima = false;

        for (int i = 0; i < spisakArtikala.length; i++) {
            if (spisakArtikala[i] != null) {
                if (spisakArtikala[i].getKod().equals(kod)) ima = true;
            }
        }
        return ima;
    }
}
