package sklep;

public class Ubrania extends Produkt {
    private String rozmiar, kolor, material;

    public Ubrania(String nazwa, String kategoria, int ilosc, double cena, int id, String rozmiar, String kolor, String material) {
        super(nazwa, kategoria, ilosc, cena, id);
        setRozmiar(rozmiar);
        setKolor(kolor);
        setMaterial(material);
    }

    public Ubrania() {
        super();
        setRozmiar("Niepodany");
        setMaterial("Niepodany");
        setKolor("Niepodany");
    }
    public String getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(String rozmiar) {
        if(rozmiar!= null && !rozmiar.trim().isEmpty()) {
            this.rozmiar = rozmiar;
        } else {
            throw new IllegalArgumentException("Rozmiar nie moze być pusty.");
        }
    }


    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        if(kolor != null && !kolor.trim().isEmpty()) {
            this.kolor = kolor;
        } else {
            throw new IllegalArgumentException("Kolor nie moze być pusty.");
        }
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if(material != null && !material.trim().isEmpty()) {
            this.material = material;
        } else {
            throw new IllegalArgumentException("Material nie moze być pusty.");
        }
    }


    @Override
    public double obliczCeneZVat() {
        return getCena()*1.08;
    }

    @Override
    public String toString() {
        return super.toString()+", Rozmiar: "+rozmiar+", Kolor: "+kolor+", Material: "+material;
    }
}
