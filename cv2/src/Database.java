public class Database {
    private final String name;
    private final int year;
    private double employmentType;
    public static double max = 1;
    Database(String name, int year){
        this.name = name;
        this.year = year;
    }
    public String getName() {
        return this.name;
    }
    public int getYear() {
        return this.year;
    }
    public double getEmploymentType() {
        return this.employmentType;
    }

    public static void setMax(double NewMax) {
        max = NewMax;
    }
    public boolean employmentTypeCheck(double newEmploymentType) {
        if ((newEmploymentType + this.employmentType) > max)
            return false;
        else {
            this.employmentType = this.employmentType + newEmploymentType;
            return true;
        }
    }
}