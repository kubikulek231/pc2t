import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Databaze {
    public Databaze() {
        sc = new Scanner(System.in);
    }

    public boolean setStudent() {
        System.out.println("Zadejte id, jmeno studenta, rok narozeni");
        int id = Test.pouzeCelaCisla(sc);
        String jmeno = sc.next();
        int rok = Test.pouzeCelaCisla(sc);
        if (prvkyDatabaze.containsKey(id)) {
            return false;
        }
        prvkyDatabaze.put(id, new Student(jmeno, rok));
        return true;
    }

    public Student getStudent(int idx) {
        if (!prvkyDatabaze.containsKey(idx)) {
            return null;
        }
        return prvkyDatabaze.get(idx);
    }

    public boolean setPrumer(int idx, float prumer) throws prumerException {
        if (!prvkyDatabaze.containsKey(idx)) {
            return false;
        }
        prvkyDatabaze.get(idx).setStudijniPrumer(prumer);
        return true;

    }
    public boolean smazStudenta(int idx) {
        if (prvkyDatabaze.containsKey(idx)) {
            prvkyDatabaze.remove(idx);
            return true;
        }
        return false;
    }
    private Scanner sc;

    Map<Integer, Student> prvkyDatabaze = new HashMap<Integer, Student>();
}