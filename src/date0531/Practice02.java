package date0531;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生数：");
        int n = scanner.nextInt();
        int[] number = new int[n];
        double[] grade = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++){
            System.out.print("请输入第" + (i + 1) + "名同学的学号：");
            number[i] = scanner.nextInt();
            System.out.print("请输入该同学的成绩：");
            grade[i] = scanner.nextDouble();
            sum += grade[i];
        }
        System.out.println("学生的均分为：" + (sum / n));
        System.out.println("不及格学生的学号：");
        for (int i = 0; i < n; i++){
            if (grade[i] < 60){
                System.out.println(number[i]);
            }
        }

    }
}
