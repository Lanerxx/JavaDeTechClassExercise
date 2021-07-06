package date0624;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        initUsers();
        while (flag){
            System.out.println("1、注册  2、登录  3、退出");
            int operation = scanner.nextInt();
            switch (operation){
                case 1:
                    System.out.println("请输入账号：");
                    String accountS = scanner.next();
                    System.out.println("请输入密码：");
                    String pswS = scanner.next();
                    users.add(new User(accountS, pswS));
                    System.out.println("注册成功");
                    break;
                case 2:
                    boolean login = false;
                    System.out.println("请输入账号：");
                    String accountL = scanner.next();
                    System.out.println("请输入密码：");
                    String pswL = scanner.next();
                    for (User user : users) {
                        if (user.username.equals(accountL) && user.password.equals(pswL)){
                            login = true;
                        }
                    }
                    if (login){
                        System.out.println("登录成功");
                    }else {
                        System.out.println("登录失败");
                    }
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("指令错误");
            }
        }
        updateUsers();
    }

    public static String filePath = "src/date0624/users.txt";

    public static List<User> users = new ArrayList<>();

    public static void initUsers() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ByteArrayOutputStream byteArrayInputStream = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len = -1;
        while ((len = fileInputStream.read(bytes)) != -1){
            byteArrayInputStream.write(bytes,0 , len);
        }
        byte[] usersBytes = byteArrayInputStream.toByteArray();
        String usersString = new String(usersBytes);

        String[] usersArrayString = usersString.split("\n");

        for (String user : usersArrayString) {
            User u = new User(user.split("=")[0],user.split("=")[1]);
            users.add(u);
        }
        fileInputStream.close();
    }

    public static void updateUsers() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        for (User user : users) {
            byte[] bytes = (user.username + "=" + user.password + "\n").getBytes();
            fileOutputStream.write(bytes);
        }
        fileOutputStream.close();
    }
}

class User{
    String username;
    String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
