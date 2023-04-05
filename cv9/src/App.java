/**
 * Třída App slouží jako hlavní třída pro demonstraci použití abstraktních tříd, rozhraní, tříd Employee, Manager a Secretarian.
 * 
 * Abstraktní třídy jsou používány, když chceme sdílet společnou funkcionalitu mezi několika třídami a zároveň chceme zabránit
 * vytváření instancí základní třídy. Abstraktní třídy mohou obsahovat konkrétní metody, proměnné třídy i konstruktory.
 * 
 * Rozhraní jsou používány, když chceme definovat společné chování pro několik tříd, ale nechceme sdílet konkrétní implementaci.
 * Rozhraní mohou obsahovat pouze abstraktní metody (v Javě 8 a novějších také metody s defaultní implementací) a konstanty.
 * 
 * Volba mezi abstraktní třídou a rozhraním závisí na potřebách návrhu. Pokud potřebujeme sdílet konkrétní implementaci, použijeme
 * abstraktní třídu. Pokud chceme definovat pouze společné chování bez konkrétní implementace, použijeme rozhraní. V Javě 8 a
 * novějších můžeme použít rozhraní s defaultními metodami pro některé případy, kdy bychom dříve použili abstraktní třídu.
 *
 *Enumerace se používají místo řetězců (String), když chceme reprezentovat omezený počet pevně stanovených hodnot. Výhody
 * použití enumerací oproti řetězcům zahrnují:
 * 
 *   Bezpečnost typů: Enumerace zajišťují typovou kontrolu, což zabraňuje chybám způsobeným neplatnými hodnotami.</li>
 *   Snadnější údržba a čitelnost: Enumerace zpřehledňují kód a usnadňují jeho údržbu, protože je snadné identifikovat všechny možné hodnoty.</li>
 *   Optimalizace: Enumerace jsou efektivnější než řetězce, protože každá hodnota enumerace je jediná instance, zatímco řetězce mohou být duplikovány.</li>
 * 
 * Volba mezi abstraktní třídou, rozhraním a enumerací závisí na potřebách návrhu. Pokud potřebujeme sdílet konkrétní implementaci, použijeme
 * abstraktní třídu. Pokud chceme definovat pouze společné chování bez konkrétní implementace, použijeme rozhraní. Pokud chceme reprezentovat
 * omezený počet pevně stanovených hodnot, použijeme enumeraci.
 *
 *
 * @author Matěj Baranyk
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // Employee, Manager, Secretarian
    	Employee employee1 = new Employee("honza", "honza@example.com", "heslo1".toCharArray(), EmployeeType.ACTIVE);
        Employee employee2 = new Employee("petr", "petr@example.com", "heslo12".toCharArray(), EmployeeType.ACTIVE);
        Employee employee3 = new Employee("richard", "richard@example.com", "heslo123".toCharArray(), EmployeeType.INACTIVE);
        Employee employee4 = new Employee("milan", "milan@example.com", "heslo1234".toCharArray(), EmployeeType.ACTIVE);
        Employee employee5 = new Employee("ladislav", "ladislav@example.com", "heslo12345".toCharArray(), EmployeeType.DELETED);

        Secretarian secretarian1 = new Secretarian("Sara", "sara@example.com", "heslo123456".toCharArray(), EmployeeType.ACTIVE, 25);
        Secretarian secretarian2 = new Secretarian("Sam", "sam@example.com", "heslo1234567".toCharArray(), EmployeeType.ACTIVE, 30);
        
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
        List<Secretarian> relationships = Arrays.asList(secretarian1);

        Manager<Secretarian> manager = new Manager<>("Michael", "michael@example.com", "password8".toCharArray(), EmployeeType.ACTIVE, employees, relationships);

        System.out.println("Employees of Manager:");
        for (Employee emp : manager.getListOfEmployees()) {
            System.out.println(emp.getNickname() + " - " + emp.getEmail());
        }

        System.out.println("Relationships of Manager:");
        for (Secretarian sec : manager.getListOfRelationships()) {
            System.out.println(sec.getNickname() + " - " + sec.getEmail());

     // AbstractAnimal
        AbstractAnimal cat = new Cat();
        AbstractAnimal dog = new Dog();
        AbstractAnimal pig = new Pig();
        AbstractAnimal cow = new Cow();
        AbstractAnimal goat = new Goat();

        List<AbstractAnimal> abstractAnimals = Arrays.asList(cat, dog, pig, cow, goat);

        for (AbstractAnimal animal : abstractAnimals) {
            animal.sound();
       }

        // Animal (Interface) and Implementing classes
        Animal catImpl = new CatImpl();
        Animal dogImpl = new DogImpl();
        Animal pigImpl = new PigImpl();
        Animal cowImpl = new CowImpl();
        Animal goatImpl = new GoatImpl();

        List<Animal> animals = Arrays.asList(catImpl, dogImpl, pigImpl, cowImpl, goatImpl);

        // Save animal sounds to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("animal_sounds.txt"))) {
            for (Animal animal : animals) {
                animal.sound();
                writer.write(animal.toString() + ": " + getAnimalSound(animal));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }
        private static String getAnimalSound(Animal animal) {
            if (animal instanceof CatImpl) {
                return "Miao!";
            } else if (animal instanceof DogImpl) {
                return "Haf!";
            } else if (animal instanceof PigImpl) {
                return "Chrocht!";
            } else if (animal instanceof CowImpl) {
                return "Buu!";
            } else if (animal instanceof GoatImpl) {
                return "Bee!";
            } else {
                return "Neznamy zvuk";
            }
        }
}