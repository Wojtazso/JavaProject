package sklep;

public abstract class Produkt {


    private String nazwa;
    private String kategoria;
    private int ilosc;
    private double cena;
    private int id;

    public Produkt(String nazwa, String kategoria, int ilosc, double cena, int id) {
        setNazwa(nazwa);
        setKategoria(kategoria);
        setIlosc(ilosc);
        setCena(cena);
        setId(id);
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
    public int getIlosc() {
        return ilosc;
    }
    public int getId() {return id;}
    public double getCena() {return cena;}

    public void setCena(double cena) {
        if(cena>0)
        this.cena = cena;
        else {throw new IllegalArgumentException("Cena musi być wieksza od zera");}
    }
    public void setNazwa(String nazwa) {
        if (nazwa != null && !nazwa.trim().isEmpty()) {
            this.nazwa = nazwa;
        } else {
            throw new IllegalArgumentException("Nazwa nie może być pusta.");
        }
    }

    public void setKategoria(String kategoria) {
        if (kategoria != null && !kategoria.trim().isEmpty()) {
            this.kategoria = kategoria;
        } else {
            throw new IllegalArgumentException("Kategoria nie może być pusta.");
        }
    }

    public void setIlosc(int ilosc) {
        if (ilosc >= 0) {
            this.ilosc = ilosc;
        } else {
            throw new IllegalArgumentException("Ilość nie może być ujemna.");
        }
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID musi być większe od 0.");
        }
    }
    @Override
    public String toString() {
        return "id produktu = " + id +", Nazwa produktu = "+nazwa +", Kategoria = "+kategoria+", Ilosc = " +ilosc+ ", Cena = " +cena+" PLN, Cena z Vatem = "+obliczCeneZVat()+" PLN";
    }
    public abstract double obliczCeneZVat();
}
