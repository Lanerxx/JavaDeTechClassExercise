package date0621;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Practice05 {
    public static void main(String[] args) {
        Person3Information person3Information = new Person3Information();
        List<Person3> personList =  person3Information.getPersons();
        for (Person3 person3 : personList) {
            System.out.println(person3.getName());
        }
        System.out.println("----");

        personList = person3Information.getPersonsByProfession("计算机");
        for (Person3 person3 : personList) {
            System.out.println(person3.getName());
        }
        System.out.println("----");

        TreeSet<Person3> person3TreeSet = person3Information.sortPersonsByNumber();
        for (Person3 person3 : person3TreeSet) {
            System.out.println(person3.getName());
        }
        System.out.println("----");

        TreeSet<Person3> person3TreeSet1 = person3Information.sortPersonByMath();
        for (Person3 person3 : person3TreeSet1) {
            System.out.print(person3.getName() + " ");
            System.out.println(person3.getMath());
        }

    }
}
