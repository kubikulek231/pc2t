public class Database {
    private static float max = 1;
    private final String name;
    private final int year;
    private float employmentType;

    Database(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public static float getMax() {
        return max;
    }

    public int getYear() {
        return this.year;
    }

    public float getEmploymentType() {
        return this.employmentType;
    }

    public static void setMax(float newMax) {
        max = newMax;
    }

    public boolean setEmploymentType(float employmentType) {
        if ((this.employmentType + employmentType) < max) {
            this.employmentType = employmentType;
            return true;
        } else {
            return false;
        }
    }
}

