package date0621;

import java.util.Comparator;
import java.util.TreeSet;

public class Practice03 {
    public static void main(String[] args) {
        Person2 person1 = new Person2("zhangsan", 18);
        Person2 person2 = new Person2("lisi", 20);
        Person2 person3 = new Person2("wangwu", 16);

        TreeSet<Person2> personTreeSet = new TreeSet<>(new Comparator<Person2>(){
            @Override
            public int compare(Person2 o1, Person2 o2){
                return o1.getAge() < o2.getAge() ? -1 : (o1.getAge() == o2.getAge()) ? 0 : 1;
            }
        });

        personTreeSet.add(person1);
        personTreeSet.add(person2);
        personTreeSet.add(person3);

        for (Person2 person : personTreeSet){
            System.out.println(person.getAge());
        }
    }
}
