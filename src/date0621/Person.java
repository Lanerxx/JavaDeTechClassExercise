package date0621;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public int compareTo(Person person) {
        return this.age < person.age ? -1 : (this.age == person.age) ? 0 : 1;
    }
}
