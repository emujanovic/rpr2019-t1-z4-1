package ba.unsa.etf.rpr;

public class Korpa {
    public Artikl[] artikli_korpa = new Artikl[50];

    public boolean dodajArtikl(Artikl a) {
        for (int i = 0; i < 50; i++) {
            if (artikli_korpa[i] == null) {
                artikli_korpa[i] = a;
                return true;
            }
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return this.artikli_korpa;

    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl temp = new Artikl();
        for (int i = 0; i < 50; i++) {
            if(artikli_korpa[i]!=null){
                if (((artikli_korpa[i]).getKod()).equals(kod)) {
                    temp = artikli_korpa[i];
                    artikli_korpa[i]=null;
                }
            }
        }
        return temp;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (int i = 0; i < 50; i++) {
            if(artikli_korpa[i]!=null)
            suma = suma + artikli_korpa[i].getCijena();
        }
        return suma;
    }
}
