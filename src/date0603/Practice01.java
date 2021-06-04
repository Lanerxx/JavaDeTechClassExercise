package date0603;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        ATM();
    }
    public static void ATM(){
        Scanner scanner = new Scanner(System.in);
        boolean system = true;
        int operation;//系统操作
        int initCount = 2;//系统初始用户数量
        int count = 0;//系统用户数量
        int[][] users = new int[initCount][3];//0:账号 1:密码 2:余额
        System.out.println("——————欢迎来到ATM系统——————");
        while (system){
            int myIndex = -1;//当前用户
            System.out.println();
            System.out.print("1、登录  2、注册  3、退卡\n" +
                    "请选择您要进行的操作：");
            operation = scanner.nextInt();
            switch (operation){
                case 1:
                    System.out.print("请输入您的账号：");
                    int accountLogin = scanner.nextInt();
                    System.out.print("请输入您的密码：");
                    int passwordLogin = scanner.nextInt();
                    myIndex = logon(accountLogin, passwordLogin, users);
                    if (myIndex != -1){
                        boolean login = true;
                        while (login){
                            System.out.println();
                            System.out.print("1、存款  2、取款  3、查询余额  4、转账 5、退出登录\n" +
                                    "请选择您要进行的操作：");
                            operation = scanner.nextInt();
                            switch (operation){
                                case 1:
                                    System.out.print("请输入存款金额：");
                                    int deposit = scanner.nextInt();
                                    users[myIndex][2] += deposit;
                                    System.out.println("存款成功，您当前的余额为：" + users[myIndex][2]);
                                    break;
                                case 2:
                                    System.out.print("请输入取款金额：");
                                    int withdrawal = scanner.nextInt();
                                    if (withdrawal <= users[myIndex][2]){
                                        users[myIndex][2] -= withdrawal;
                                        System.out.println("取款成功，您当前的余额为：" + users[myIndex][2]);
                                    }else {
                                        System.out.println("余额不足，取款失败");
                                    }
                                    System.out.println();
                                    break;
                                case 3:
                                    System.out.println("您当前的余额为：" + users[myIndex][2]);
                                    break;
                                case 4:
                                    System.out.print("请输入对方转账账号：");
                                    int otherAccount = scanner.nextInt();
                                    if (otherAccount != users[myIndex][0]){
                                        int otherIndex;
                                        otherIndex = getUserIndex(otherAccount, users);
                                        if (otherIndex != -1){
                                            System.out.println("提示：您当前的余额为：" + users[myIndex][2]);
                                            System.out.print("请输入转账金额：");
                                            int money = scanner.nextInt();
                                            if (money <= users[myIndex][2]){
                                                users[myIndex][2] -= money;
                                                users[otherIndex][2] += money;
                                                System.out.println("转账成功，您当前的余额为：" + users[myIndex][2]);
                                            }else {
                                                System.out.println("余额不足，转账失败");
                                            }
                                        }else{
                                            System.out.println("您输入的账号不存在");
                                        }
                                    }else {
                                        System.out.println("不能转账给自己");
                                    }
                                    break;
                                case 5:
                                    myIndex = -1;
                                    login = false;
                                    System.out.println("退出成功");
                                    break;
                                default:
                                    System.out.println("请输入正确的操作");
                            }

                        }

                    }else{
                        System.out.println("登录失败");
                    }
                    break;
                case 2:
                    if (count == users.length){
                        int[][] template = new int[users.length * 2][3];
                        for (int i = 0; i < users.length; i++){
                            for (int j = 0; j < users[i].length; j++){
                                template[i][j] = users[i][j];
                            }
                        }
                        System.out.println("系统由" + users.length + "扩容为" + template.length);
                        users = template;
                    }
                    System.out.print("请输入您的账号：");
                    int accountRegister = scanner.nextInt();
                    System.out.print("请输入您的密码：");
                    int passwordRegister = scanner.nextInt();
                    users[count][0] = accountRegister;
                    users[count][1] = passwordRegister;
                    count++;
                    break;
                case 3:
                    system = false;
                    break;
                default:
                    System.out.println("请输入正确的操作");
            }

        }
        System.out.println("——————欢迎下次使用——————");
    }
    public static int getUserIndex(int account, int[][] users){
        int index = -1;
        for (int i = 0; i < users.length; i++){
            if (account == users[i][0]){
                index = i;
                break;
            }
        }
        return index;
    }
    public static int logon(int account, int password, int[][] users){
        int index = -1;
        for (int i = 0; i < users.length; i++){
            if (account == users[i][0] && password == users[i][1]){
                index = i;
                break;
            }
        }
        return index;
    }
}
