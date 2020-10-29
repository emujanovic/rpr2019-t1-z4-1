package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;
    public Artikl(String naziv,int cijena,String kod){
        this.naziv=naziv;
        this.cijena=cijena;
        this.kod=kod;
    }
    public Artikl(){

    }
    public String getNaziv() {
        return this.naziv;
    }

    public String getKod() {
        return this.kod;
    }

    public int getCijena() {
        return this.cijena;
    }
}
