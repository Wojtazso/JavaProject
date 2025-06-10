package sklep;

public class CzesciSamochodowe extends Produkt {

        private String marka;

        public CzesciSamochodowe(String nazwa, String kategoria, int ilosc, double cena, int id, String marka) {
            super(nazwa, kategoria, ilosc, cena, id);
            setMarka(marka);
        }

        public CzesciSamochodowe() {
            super();
            setMarka("Brak");
        }

//trim usuwa spacje
        public void setMarka (String marka) {
            if(marka != null && !marka.trim().isEmpty()) {
                this.marka = marka;
            } else {
                throw new IllegalArgumentException("Marka nie moze być pusta.");
            }
        }

        public String getMarka() {
            return marka;
        }

        @Override
        public double obliczCeneZVat () {
            return getCena() * 1.23;
        }

        @Override
        public String toString() {
            return super.toString()+", Firma = "+marka+".";
        }
    }

