public class Potravina extends Zbozi {
    private int trvanlivost;

    public Potravina(String zboziNazev, double zboziCena, int trvanlivost) {
        super(zboziNazev, zboziCena);
        this.trvanlivost = trvanlivost;
    }

    public int getTrvanlivost() {
        return trvanlivost;
    }

    public void setTrvanlivost(int trvanlivost) {
        this.trvanlivost = trvanlivost;
    }

    @Override
    public String getJednotka() {
        return "dnu";
    }
}
