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

    @Override
    public boolean equals(Object obj) {
        Artikl a =(Artikl) obj;
        if(naziv.equals(((Artikl) obj).getNaziv()) && kod.equals(((Artikl) obj).getKod()) && cijena == ((Artikl) obj).getCijena())
        return  true;
        return false;
    }
}
