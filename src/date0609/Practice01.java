package date0609;

public class Practice01 {
    public static void main(String[] args) {
        Student s = new Student("sad");
        System.out.println(s);
    }
}

class Person{
    String name;
    int age;
    Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", age=" + age + ", " ;
    }
}

class Student extends Person{
    String school;

    Student(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Student:" + super.toString() +
                "school=" + school;
    }
}
