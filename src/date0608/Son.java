package date0608;

public class Son extends Father {
    String school;

    Son(String school){
        super("兰二", 21, '女');
        this.school = school;
        System.out.println("The constructor of Son class with parameters(String)");
    }

    Son(String name, int age, char gender, String school){
        super(name, age, gender);
        this.school = school;
        System.out.println("The constructor of Son class with arguments(String, int, char, String)");
    }
}
