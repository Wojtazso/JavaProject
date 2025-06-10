package sklep;

public class PozycjaZamowienia {
    private Produkt produkt;
    private int ilosc;

    public PozycjaZamowienia(Produkt produkt, int ilosc) {
        this.produkt = produkt;
        this.ilosc = ilosc;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        if (ilosc >= 0) {
            this.ilosc = ilosc;
        } else {
            throw new IllegalArgumentException("Ilość nie może być ujemna.");
        }
    }

    @Override
    public String toString() {
        return produkt.toString() + ", Ilość w zamówieniu: " + ilosc;
    }
}