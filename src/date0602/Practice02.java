package date0602;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        function01();
    }
    public static void function01(){
        Scanner scanner = new Scanner(System.in);
        int[][] users = new int[3][2];
        System.out.println("+++++注册+++++");
        for (int i = 0; i < users.length; i++){
            System.out.print("请输入第" + (i + 1) + "个用户的账号：");
            users[i][0] = scanner.nextInt();
            System.out.print("请输入第" + (i + 1) + "个用户的密码：");
            users[i][1] = scanner.nextInt();
            System.out.println();
        }
        boolean flag = true;
        int operation;
        while (flag){
            System.out.println("请选择您要进行的操作：1、登录；2、注册；3、退出系统");
            operation = scanner.nextInt();
            switch (operation){
                case 1:
                    System.out.print("请输入账号：");
                    int account = scanner.nextInt();
                    System.out.print("请输入密码：");
                    int password = scanner.nextInt();
                    boolean flagL = false;
                    for (int i = 0; i < users.length; i++){
                        if (users[i][0] == account && users[i][1] == password)
                            flagL = true;
                    }
                    if (flagL) System.out.println("登录成功");
                    else System.out.println("登录失败");
                    break;
                case 2:
                    System.out.println("注册人数已满");
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("您输入的指令有误");
            }
        }
        System.out.println("欢迎下次使用");
    }
}
