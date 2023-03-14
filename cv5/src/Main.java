public class Main {
    public static void main(String[] args) {

        Zbozi[] poleZbozi = new Zbozi[4];
        poleZbozi[0] = new Potravina("Rohlik", 1.5, 1);
        poleZbozi[1] = new Naradi("Kleste", 278.0, 24);
        poleZbozi[2] = new Potravina("Chleba", 20.8, 6);
        poleZbozi[3] = new Potravina("Jablko", 51.0, 20);
        for (Zbozi zbozi : poleZbozi) {
            if (zbozi instanceof Naradi) {
                System.out.println(zbozi.getNazev() + ", cena: " + zbozi.getCenaSDPH() + ", zaruka: " + ((Naradi) zbozi).getZaruka() + " " + zbozi.getJednotka());
            } else {
                System.out.println(zbozi.getNazev() + ", cena: " + zbozi.getCenaSDPH() + ", trvanlivost: " + ((Potravina) zbozi).getTrvanlivost() + " " + zbozi.getJednotka());
            }
        }
    }
}