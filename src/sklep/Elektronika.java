package sklep;

public class Elektronika extends Produkt {
    private int gwarancja;

    public Elektronika(String nazwa, String kategoria, int ilosc, double cena, int id, int gwarancja) {
        super(nazwa, kategoria, ilosc, cena, id);
        setGwarancja(gwarancja);
    }

    public Elektronika(int gwarancja) {
      super();
      setGwarancja(gwarancja);
    }


        public void setGwarancja (int gwarancja) {
            if (gwarancja >= 0) {
                this.gwarancja = gwarancja;
            } else {
                throw new IllegalArgumentException("Gwarancja nie może być ujemna.");
            }
        }

    public int getGwarancja() {
        return gwarancja;
    }

    @Override
        public double obliczCeneZVat () {
            return getCena() * 1.23;
        }

    @Override
    public String toString() {
        return super.toString()+", Gwarancja = "+gwarancja+" tyg.";
    }
}

