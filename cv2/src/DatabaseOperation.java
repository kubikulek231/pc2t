
import java.util.Scanner;
public class DatabaseOperation {
    public static void main(String[] args)
    {
    Database[] array = new Database[3];
    for(int i = 0; i < array.length; i++)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Index: " + i + "\nEnter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter birthdate: ");
        int year = scanner.nextInt();
        array[i] = new Database(name, year);
    }
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter max employment type: ");
    Database.setMax(scanner.nextDouble());

        while (true) {
            System.out.print("Enter index: ");
            int index = scanner.nextInt();

            if (index < array.length && index >= 0) {
                System.out.println("Name: " + array[index].getName() + ", Year of birth: " + array[index].getYear() + ", Employment type: " + array[index].getEmploymentType() + " ");
                System.out.print("Enter new employment type: ");
                double tempEmploymentType = scanner.nextDouble();
                if (array[index].employmentTypeCheck(tempEmploymentType)) {
                    System.out.println("New employment type is: " + array[index].getEmploymentType());
                } else
                    System.out.println("Employment type has not changed.");
            }
        }
    }
}



