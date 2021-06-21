package date0621;

import java.util.*;

public class Person3Information {
    private List<Person3> persons = new ArrayList<>();

    Person3Information(){
        Person3 p1 = new Person3(001,"zhangsan","计算机", 100, 80);
        Person3 p2 = new Person3(003,"lisi","机电", 65, 80);
        Person3 p3 = new Person3(002,"wangwu","计算机", 89, 80);
        Person3 p4 = new Person3(004,"tianqi","经管", 65, 80);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
    }

    public List<Person3> getPersons(){
        return this.persons;
    }

    public List<Person3> getPersonsByProfession(String profession){
        List<Person3> persons = new ArrayList<>();
        for (Person3 person3 : this.persons){
            if (person3.getProfession().equals(profession)){
                persons.add(person3);
            }
        }
        return persons;
    }

    public TreeSet<Person3> sortPersonsByNumber(){
        TreeSet<Person3> treeSet = new TreeSet<>(new Comparator<Person3>(){
            @Override
            public int compare(Person3 o1, Person3 o2){
                return o1.getNumber() < o2.getNumber() ? -1 : (o1.getNumber() == o2.getNumber()) ? 0 : 1;
            }
        });
        treeSet.addAll(this.persons);
        return treeSet;
    }

    public TreeSet<Person3> sortPersonByMath(){
        TreeSet<Person3> person3TreeSet = new TreeSet<>(new Comparator<Person3>(){
            @Override
            public int compare(Person3 o1, Person3 o2){
                return o1.getMath() < o2.getMath() ? 1 : (o1.getMath() == o2.getMath() ? 0 : -1);
            }
        });
        person3TreeSet.addAll(persons);
        return person3TreeSet;
    }
}
