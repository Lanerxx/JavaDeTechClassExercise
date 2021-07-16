package date0625;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) throws IOException {
        initUsers();
        boolean menuFlag = true;
        Scanner ss = new Scanner(System.in);
        while (menuFlag){
            System.out.println("1、注册  2、登录  3、退出");
            int operation = ss.nextInt();
            switch (operation){
                case 1:
                    System.out.println("请输入账号：");
                    String accountRegister = ss.next();
                    System.out.println("请输入密码：");
                    String pswRegister = ss.next();
                    users.add(new User(accountRegister,pswRegister,0));
                    System.out.println("注册成功");
                    break;
                case 2:
                    System.out.println("请输入账号：");
                    String accountLogin = ss.next();
                    System.out.println("请输入密码：");
                    String pswLogin = ss.next();
                    boolean loginFlag = false;
                    User thisUser = null;
                    for (User user : users) {
                        if (user.getAccount().equals(accountLogin) && user.getPassword().equals(pswLogin)){
                            loginFlag = true;
                            thisUser = user;
                        }
                    }
                    if (thisUser != null){
                        System.out.println("登录成功");
                        while (loginFlag){
                            System.out.println("1、查询  2、存款  3、取款  4、转账  5、退出登录");
                            int loginOperation = ss.nextInt();
                            switch (loginOperation){
                                case 1:
                                    System.out.println("当前余额：" + thisUser.getBalance());
                                    break;
                                case 2:
                                    System.out.println("请输入存款金额：" );
                                    thisUser.setBalance(thisUser.getBalance() + ss.nextInt());
                                    break;
                                case 3:
                                    System.out.println("请输入取款金额：" );
                                    int money = ss.nextInt();
                                    if (thisUser.getBalance() >= money){
                                        thisUser.setBalance(thisUser.getBalance() - money);
                                    }else {
                                        System.out.println("余额不足，取款失败");
                                    }
                                    break;
                                case 4:
                                    System.out.println("请输入转账账号：" );
                                    String thatAccount = ss.next();
                                    User thatUser = null;

                                    for (User user : users) {
                                        if (thatAccount.equals(user.getAccount())){
                                            thatUser = user;
                                            break;
                                        }
                                    }
                                    if (thatUser != null){
                                        System.out.println("请输入转账金额：" );
                                        int moneyT = ss.nextInt();
                                        if (thisUser.getBalance() >= moneyT){
                                            thisUser.setBalance(thisUser.getBalance() - moneyT);
                                            thatUser.setBalance(thatUser.getBalance() + moneyT);
                                        }else {
                                            System.out.println("余额不足，转账失败");
                                        }
                                    }else {
                                        System.out.println("查无此人");
                                    }

                                    break;
                                case 5:
                                    loginFlag = false;
                                    break;
                                default:
                                    System.out.println("指令错误");
                            }

                        }
                    }else {
                        System.out.println("登录失败");
                    }
                    break;
                case 3:
                    menuFlag = false;
                    break;
                default:
                    System.out.println("指令错误");
            }
        }
        updateUsers();
    }

    private static List<User> users = new ArrayList<>();

    private static final String FILE_PATH = "src/date0625/users.txt";

    public static void initUsers() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
        String str;
        while ((str = br.readLine()) != null){
            String[] strings = str.split("-");
            users.add(new User(strings[0],strings[1],Integer.parseInt(strings[2])));
        }
        br.close();
    }

    public static void updateUsers() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH));
        for (User user : users) {
            bw.write(user.getAccount() + "-" + user.getPassword() + "-" + user.getBalance());
            bw.newLine();
        }
        bw.close();
    }
}
