public abstract class Zbozi {
    private String Nazev;
    private double Cena;
    private static double DPH = 21.0;

    public Zbozi(String zboziNazev, double zboziCena) {
        this.Cena = zboziCena;
        this.Nazev = zboziNazev;
    }

    public String getNazev() {
        return Nazev;
    }

    public void setNazev(String zboziNazev) {
        this.Nazev = zboziNazev;
    }

    public double getCenaSDPH() {
        return Cena * (1 + DPH/100);
    }

    public double getCenaBezDph() {
        return Cena;
    }

    public void setCena(double cena) {
        this.Cena = cena;
    }

    abstract public String getJednotka();
}
