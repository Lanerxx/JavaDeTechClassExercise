package date0621;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Person4Information {
    private List<Person4> persons = new ArrayList<>();

    Person4Information(){
        Person4 p1 = new Person4(001);
        Person4 p2 = new Person4(003);
        Person4 p3 = new Person4(001);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
    }

    public List<Person4> getPersons(){
        return this.persons;
    }

    public TreeSet<Person4> sortPersonsByNumber(){
        TreeSet<Person4> person4TreeSet = new TreeSet<>(this.persons);
        return person4TreeSet;
    }
}
