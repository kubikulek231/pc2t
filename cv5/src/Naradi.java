public class Naradi extends Zbozi {
    private int zaruka;

    public Naradi(String zboziNazev, double zboziCena, int zaruka) {
        super(zboziNazev, zboziCena);
        this.zaruka = zaruka;
    }

    public int getZaruka() {
        return zaruka;
    }

    public void setZaruka(int zaruka) {
        this.zaruka = zaruka;
    }

    @Override
    public String getJednotka() {
        return "mesicu";
    }
}
