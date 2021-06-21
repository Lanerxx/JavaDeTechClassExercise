package date0621;

import java.util.TreeSet;

public class Practice06 {
    public static void main(String[] args) {
        Person4Information person4Information = new Person4Information();
        TreeSet<Person4> treeSet = person4Information.sortPersonsByNumber();
        for (Person4 o : treeSet) {
            System.out.println(o.getNumber());
        }
    }
}
