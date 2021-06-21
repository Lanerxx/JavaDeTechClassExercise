package date0621;

import java.util.TreeSet;

public class Practice02 {
    public static void main(String[] args) {
        TreeSet<Person> personTreeSet = new TreeSet<>();
        Person p1 = new Person("李四", 18);
        Person p2 = new Person("张三", 17);
        Person p3 = new Person("王五", 20);
        personTreeSet.add(p1);
        personTreeSet.add(p2);
        personTreeSet.add(p3);

        for (Person person : personTreeSet){
            System.out.println(person.getAge());
        }
    }
}
