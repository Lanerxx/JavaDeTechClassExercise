package date0608;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i++){
            System.out.print("请输入第" + (i + 1) + "个名字：");
            String name = scanner.next();
            System.out.print("请输入第" + (i + 1) + "个年龄：");
            int age = scanner.nextInt();
            System.out.print("请输入第" + (i + 1) + "个性别：");
            char gender = scanner.next().charAt(0);
            System.out.println();
            persons[i] = new Person(name, age, gender);
        }
        for (int i = 0; i < 3; i++){
            System.out.println("姓名：" + persons[i].name + "\t年龄：" + persons[i].age + "\t性别：" + persons[i].gender);
        }
    }
}

class Person{
    String name;
    int age;
    char gender;

    Person(){
        System.out.println("default constructor");
    }

    Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


}
