package date0604;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args){
        studentManagementSystem();

    }
    public static void studentManagementSystem(){
        Student[] students = initStudents();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("——————欢迎使用学生管理系统——————");
        while (flag){
            System.out.print("\n1、查询  2、操作  3、退出系统\n" +
                    "请输入操作：");
            switch (scanner.nextInt()){
                case 1:
                    boolean query = true;
                    while (query){
                        System.out.print("\n1、学号  2、年龄  3、性别  4、班级  5、返回上一级\n" +
                                "请输入查询条件：");
                        switch (scanner.nextInt()){
                            case 1:
                                System.out.print("请输入学号：");
                                boolean numberFlag = false;
                                int number = scanner.nextInt();
                                for (int i = 0; i < students.length; i++){
                                    if (number == students[i].number){
                                        System.out.println(students[i]);
                                        numberFlag = true;
                                    }
                                }
                                if (!numberFlag){
                                    System.out.println("查无此人");
                                }
                                break;
                            case 2:
                                System.out.print("请输入年龄：");
                                boolean ageFlag = false;
                                int age = scanner.nextInt();
                                for (int i = 0; i < students.length; i++){
                                    if (students[i].age == age){
                                        System.out.println(students[i]);
                                        ageFlag = true;
                                    }
                                }
                                if (!ageFlag){
                                    System.out.println("没有这个年龄的学生");
                                }
                                break;
                            case 3:
                                System.out.print("请输入性别：");
                                boolean genderFlag = false;
                                char gender = scanner.next().charAt(0);
                                for (int i = 0; i < students.length; i++){
                                    if (students[i].gender == gender){
                                        System.out.println(students[i]);
                                        genderFlag = true;
                                    }
                                }
                                if (!genderFlag){
                                    System.out.println("没有此性别的学生");
                                }
                                break;
                            case 4:
                                System.out.print("请输入班级：");
                                boolean clazzFlag = false;
                                int clazz = scanner.nextInt();
                                for (int i = 0; i < students.length; i++){
                                    if (students[i].clazz == clazz){
                                        System.out.println(students[i]);
                                        clazzFlag = true;
                                    }
                                }
                                if (!clazzFlag){
                                    System.out.println("没有学生属于此班级");
                                }
                                break;
                            case 5:
                                query = false;
                                break;
                            default:
                                System.out.println("请输入正确的操作");
                        }
                    }

                    break;
                case 2:
                    boolean action = true;
                    while (action){
                        System.out.print("\n1、班级均分  2、所有学生均分  3、不及格学生  " +
                                "4、男女比例  5、男女均分  6、返回上一级\n" +
                                "请查询条件：");
                        switch (scanner.nextInt()){
                            case 1:
                                System.out.print("请输入班级：");
                                boolean clazzFlag = false;
                                int clazz = scanner.nextInt();
                                int clazzCount = 0;
                                double mathClazzGrade = 0;
                                double ChineseClazzGrade = 0;
                                double EnglishClazzGrade = 0;
                                for (int i = 0; i < students.length; i++){
                                    if (students[i].clazz == clazz){
                                        clazzCount++;
                                        mathClazzGrade += students[i].math;
                                        ChineseClazzGrade += students[i].Chinese;
                                        EnglishClazzGrade += students[i].English;
                                        clazzFlag = true;
                                    }
                                }
                                if (clazzFlag){
                                    System.out.println("语文均分："  + ChineseClazzGrade/clazzCount +
                                            "\t数学均分：" + mathClazzGrade/clazzCount +
                                            "\t英语均分：" + EnglishClazzGrade/clazzCount);
                                }else {
                                    System.out.println("此班级没有成绩");
                                }
                                break;
                            case 2:
                                double mathTotalGrade = 0;
                                double ChineseTotalGrade = 0;
                                double EnglishTotalGrade = 0;
                                for (int i = 0; i < students.length; i++){
                                    mathTotalGrade += students[i].math;
                                    ChineseTotalGrade += students[i].Chinese;
                                    EnglishTotalGrade += students[i].English;
                                }
                                System.out.println("语文均分："  + ChineseTotalGrade/students.length +
                                        "\t数学均分：" + mathTotalGrade/students.length +
                                        "\t英语均分：" + EnglishTotalGrade/students.length);
                                break;
                            case 3:
                                System.out.print("请输入学科：1、语文  2、数学  3、英语 : ");
                                switch (scanner.nextInt()){
                                    case 1:
                                        System.out.println("语文不及格的学生有：");
                                        for (int i = 0; i < students.length; i++){
                                            if (students[i].Chinese < 60){
                                                System.out.println(students[i]);
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("数学不及格的学生有：");
                                        for (int i = 0; i < students.length; i++){
                                            if (students[i].math < 60){
                                                System.out.println(students[i]);
                                            }
                                        }
                                        break;
                                    case 3:
                                        System.out.println("英语不及格的学生有：");
                                        for (int i = 0; i < students.length; i++){
                                            if (students[i].English < 60){
                                                System.out.println(students[i]);
                                            }
                                        }
                                        break;
                                    default:
                                        System.out.println("请输入正确的学科");
                                }
                                break;
                            case 4:
                                double maleCount = 0;
                                double femaleCount = 0;
                                for (int i = 0; i < students.length; i++){
                                    if (students[i].gender == '男'){
                                        maleCount++;
                                    }else{
                                        femaleCount++;
                                    }
                                }
                                System.out.println("男生占比：" + maleCount/students.length +
                                        "；女生占比：" +  femaleCount/students.length);
                                break;
                            case 5:
                                int mCount = 0;
                                int fCount = 0;
                                int maleMath = 0;
                                int maleChinese = 0;
                                int maleEnglish = 0;
                                int femaleMath = 0;
                                int femaleChinese = 0;
                                int femaleEnglish = 0;
                                for (int i = 0; i < students.length; i++){
                                    if (students[i].gender == '男'){
                                        mCount++;
                                        maleChinese += students[i].Chinese;
                                        maleEnglish += students[i].English;
                                        maleMath += students[i].math;
                                    }else{
                                        fCount++;
                                        femaleChinese += students[i].Chinese;
                                        femaleEnglish += students[i].English;
                                        femaleMath += students[i].math;
                                    }
                                }
                                System.out.println("男生均分  语文：" + maleChinese/mCount +
                                        "\t数学：" + maleMath/mCount +
                                        "\t英语：" + maleEnglish/mCount);
                                System.out.println("女生均分  语文：" + femaleChinese/fCount +
                                        "\t数学：" + femaleMath/fCount +
                                        "\t英语：" + femaleEnglish/fCount);
                                break;
                            case 6:
                                action = false;
                                break;
                            default:
                                System.out.println("请输入正确的操作");
                        }
                    }
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("请输入正确的操作");

            }

        }
        System.out.println("——————欢迎下次使用——————");
    }
    public static Student[] initStudents(){
        int n = 10;
        int[] numbers = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        int[] ages = {18, 19, 17, 20, 24, 18, 19, 20, 19, 18};
        char[] genders = {'男', '男', '女', '男', '女','男', '男', '女', '女', '男'};
        int[] clazzes = {1, 2, 3, 1, 3, 3, 2, 1, 3, 1};
        int[] math = {89, 70, 67, 59, 90, 45, 32, 89, 99, 76};
        int[] English = {69, 90, 67, 49, 97, 75, 82, 69, 59, 76};
        int[] Chinese = {80, 70, 47, 99, 70, 65, 92, 69, 89, 66};
        Student[] students = new Student[n];
        for (int i = 0; i < students.length; i++){
            students[i] = new Student();
            students[i].number = numbers[i];
            students[i].age = ages[i];
            students[i].gender = genders[i];
            students[i].clazz = clazzes[i];
            students[i].math = math[i];
            students[i].English = English[i];
            students[i].Chinese = Chinese[i];
        }
        return students;
    }
}
