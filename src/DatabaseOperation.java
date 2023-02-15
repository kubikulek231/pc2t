import java.util.Scanner;

public class DatabaseOperation {
    // main object
    public static void main(String[] args) {

        // create a scanner object so it does not have to be created each time
        Scanner scanner = new Scanner(System.in);
        // create a database of people - 3 items in it
        Database[] personDatabase = new Database[3];
        // for each item in database fill the name and year of birth of each person
        for (int i = 0; i < personDatabase.length; i++) {
            // first enter the person's name
            System.out.println("Current person's index: " + i + "\nEnter name: ");
            String name = scanner.next();
            System.out.println("Entered name is: " + name);
            // now enter birth year
            System.out.println("Enter a birth year: ");
            // makes sure user entered int
            while (!scanner.hasNextInt()) {

                System.out.println("Enter a number!: ");
                scanner.next();
            }
            int year = scanner.nextInt();
            System.out.println("Entered birth year is: " + year);

        }
        // now enter the max employment type number
        System.out.println("Enter maximal employment type number: ");
        // makes sure user entered int
        while (!scanner.hasNextInt()) {
            System.out.println("Enter a number!: ");
            scanner.next();
        }
        int employmentType = scanner.nextInt();
        System.out.println("Entered maximal employment type number is: " + employmentType);
        // now user can view each person's entry by entering index
        while (true) {
            System.out.println("Enter index to view the name and birth name: ");
            // makes sure user entered int
            while (!scanner.hasNextInt()) {
                System.out.println("Enter a number!: ");
                scanner.next();
            }
            int index = scanner.nextInt();
            System.out.println("Person with index: "+ index +" has name: " +
                    personDatabase[index].getName() + "\nhas birth date: " +
                    personDatabase[index].getYear() + "\nhas employment type of: " +
                    personDatabase[index].getEmploymentType());
            }
        }


    }

