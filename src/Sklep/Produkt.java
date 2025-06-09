package Sklep;

public abstract class Produkt {


    private String nazwa;
    private String kategoria;
    private int ilosc;
    private double cena;
    private int id;

    public Produkt(String nazwa, String kategoria, int ilosc, double cena, int id) {
        this.nazwa = nazwa;
        this.kategoria=kategoria;
        this.ilosc = ilosc;
        this.cena = cena;
        this.id = id;
    }
    public Produkt(){
        this.nazwa="Brak";
        this.kategoria="Brak";
        this.ilosc=0;
        this.cena=0.0;
        this.id=0;

    }

    public String getNazwa() {
        return nazwa;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "id produktu = " + id +", Nazwa produktu = "+nazwa +", Kategoria = "+kategoria+", Ilosc = " +ilosc+ ", Cena = " +cena+" PLN, Cena z Vatem = "+obliczvat()+" PLN";
    }
    public abstract double obliczvat();
}
