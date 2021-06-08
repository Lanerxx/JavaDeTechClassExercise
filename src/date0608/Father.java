package date0608;

public class Father {
    String name;
    int age;
    char gender;

    Father(){
        System.out.println("The no-argus constructor of Father class");
    }

    Father(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("The constructor of Father class with parameters (String, int, char)");
    }

}
