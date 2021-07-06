package date0610;

public class Practice02 {
    public static void main(String[] args) {
        Student s1 = new Student("dsa","asda");
    }
}

class Person{
    private String name;
    private int age;

    private static int var;

    static {
        System.out.println("父类静态块");
    }

    {
        System.out.println("父类游离块");
    }

    Person(){
        System.out.println("父类Person()构造器");
    }

    Person(String name){
        this(name,18);
        System.out.println("父类Person(String name)构造器");
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("父类Person(String name, int age)构造器");
    }

}

class Student extends Person{
    private String school;
    private int clazz;

    private static int var;

    static {
        System.out.println("子类静态块");
    }

    {
        System.out.println("子类游离块");
    }

    Student(){
        System.out.println("子类Student()构造器");
    }

    Student(String school){
        this.school = school;
        System.out.println("子类Student(String school)构造器");
    }

    Student(String school, String name){
        super(name);
        this.school = school;
        System.out.println("子类Student(String school, String name)构造器");
    }

}
