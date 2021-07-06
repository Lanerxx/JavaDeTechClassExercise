package date0610;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        Bank[] banks = new Bank[3];

        for (int i = 0; i < banks.length; i++) {
            System.out.println("请输入第" + (i + 1)+ "个账号的密码：");
            banks[i] = new Bank(ss.nextInt());
        }

        for (int i = 0; i < banks.length; i++) {
            System.out.print("account：" + banks[i].getAccount() + ' ');
            System.out.print("psw：" + banks[i].getPassword() + ' ');
            System.out.println("balance：" + banks[i].getBalance());
        }
    }
}
