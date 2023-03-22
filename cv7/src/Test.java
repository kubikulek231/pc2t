import java.util.*;

public class Test {

    public static int pouzeCelaCisla(Scanner sc) {
        int cislo = 0;
        try {
            cislo = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Nastala vyjimka typu " + e.toString());
            System.out.println("zadejte prosim cele cislo ");
            sc.nextLine();
            cislo = pouzeCelaCisla(sc);
        }
        return cislo;
    }

    public static float pouzeCisla(Scanner sc) {
        float cislo = 0;
        try {
            cislo = sc.nextFloat();
        } catch (Exception e) {
            System.out.println("Nastala vyjimka typu " + e.toString());
            System.out.println("zadejte prosim cislo ");
            sc.nextLine();
            cislo = pouzeCisla(sc);
        }
        return cislo;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Databaze mojeDatabaze = new Databaze();
        int idx;
        float prumer;
        int volba;
        boolean run = true;
        while (run) {
            System.out.println("Vyberte pozadovanou cinnost:");
            System.out.println("1 .. vlozeni noveho studenta");
            System.out.println("2 .. nastaveni prumeru studenta");
            System.out.println("3 .. vypis informace o studentovi");
            System.out.println("4 .. vypis vsech studentu");
            System.out.println("5 .. vymazani studenta");
            System.out.println("6 .. setrideni jmen podle prumeru");
            System.out.println("7 .. ukonceni aplikace");
            volba = pouzeCelaCisla(sc);
            switch (volba + 1) {
				/*
				case 1:
					System.out.println("Zadejte pocet studentu");
					mojeDatabaze=new Databaze();
					break;*/
                case 2:
                    if (!mojeDatabaze.setStudent()) {
                        System.out.println("ID uz v databazi existuje!");
                    }
                    break;
                case 3:
                    System.out.println("Zadejte index a prumer studenta");
                    idx = pouzeCelaCisla(sc);
                    prumer = pouzeCisla(sc);
                    try {
                        if (!mojeDatabaze.setPrumer(idx, prumer)) {
                            System.out.println("Student se zadanym ID neni v databazi!");
                        }
                        ;
                    } catch (prumerException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Zadejte index studenta");
                    idx = pouzeCelaCisla(sc);
                    Student info = null;
                    try {
                        info = mojeDatabaze.getStudent(idx);
                        if (info == null) {
                            System.out.println("Student se zadanym ID neni v databazi!");
                            break;
                        }
                        System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
                    } catch (prumerException e) {
                        System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer nezadan");
                    }
                    break;
                case 5:
                    for (Integer id : mojeDatabaze.prvkyDatabaze.keySet())
                        System.out.println(mojeDatabaze.getStudent(id).getJmeno());
                    break;
                case 6:
                    System.out.println("Zadejte index studenta ");
                    idx = Test.pouzeCelaCisla(sc);
                    if (mojeDatabaze.smazStudenta(idx)) {
                        System.out.println("Student se zadanym ID neni v databazi! ");
                    }
                    break;
                case 7:

                    TreeMap<Integer, Student> sorted = new TreeMap<>(mojeDatabaze.prvkyDatabaze);
                    for (Integer id : sorted.keySet()) {
                        try {
                            System.out.println(sorted.get(id).getStudijniPrumer());
                        } catch (prumerException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 8:
                    run = false;
                    break;
                case 9:
                    mojeDatabaze.prvkyDatabaze.put(1, new Student("pepa", 1999));
                    mojeDatabaze.prvkyDatabaze.put(2, new Student("roman", 2020));
                    mojeDatabaze.prvkyDatabaze.put(3, new Student("matej", 2002));
                    mojeDatabaze.prvkyDatabaze.put(4, new Student("honza", 1998));
                    try {
                        mojeDatabaze.setPrumer(1, 5);
                        mojeDatabaze.setPrumer(2, 2);
                        mojeDatabaze.setPrumer(3, 1);
                        mojeDatabaze.setPrumer(4, 3);
                    } catch (Exception e) {

                    }
                    break;
            }

        }
    }

}
