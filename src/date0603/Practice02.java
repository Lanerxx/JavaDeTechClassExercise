package date0603;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        class Student{
            int number;
            int age;
            char gender;
        }
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student();
        System.out.print("请输入第1个学生的学号：");
        student1.number = scanner.nextInt();
        System.out.print("请输入第1个学生的年龄：");
        student1.age = scanner.nextInt();
        System.out.print("请输入第1个学生的性别：");
        student1.gender = scanner.next().charAt(0);

        Student student2 = new Student();
        System.out.print("请输入第2个学生的学号：");
        student2.number = scanner.nextInt();
        System.out.print("请输入第2个学生的年龄：");
        student2.age = scanner.nextInt();
        System.out.print("请输入第2个学生的性别：");
        student2.gender = scanner.next().charAt(0);

        Student student3 = new Student();
        System.out.print("请输入第3个学生的学号：");
        student3.number = scanner.nextInt();
        System.out.print("请输入第3个学生的年龄：");
        student3.age = scanner.nextInt();
        System.out.print("请输入第3个学生的性别：");
        student3.gender = scanner.next().charAt(0);

        System.out.println("第一个同学：学号   年龄    年龄");
        System.out.println("         " + student1.number + "   " + student1.age + "    " + student1.gender);
        System.out.println("第二个同学：学号   年龄    年龄");
        System.out.println("         " + student2.number + "   " + student2.age + "    " + student2.gender);
        System.out.println("第三个同学：学号   年龄    年龄");
        System.out.println("         " + student3.number + "   " + student3.age + "    " + student3.gender);

    }
}
