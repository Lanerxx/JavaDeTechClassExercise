package date0528;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
            模拟ATM菜单
            1、存款 2、取款 3、查询余额 4、退卡
         */
        long balance = 0;
        long count;
        int operation;
        Scanner scanner = new Scanner(System.in);
        boolean bb = true;
        while (bb){
            System.out.println("请输入您要执行的操作(1、存款 2、取款 3、查询余额 4、退卡)：");
            operation = scanner.nextInt();
            if (operation == 1){
                System.out.print("请输入您要存入的金额：");
                count = scanner.nextLong();
                balance += count;
                System.out.println("您存入" + count + "元，当前余额为" + balance);
            }else if (operation == 2){
                System.out.print("请输入您要取出的金额：");
                count = scanner.nextLong();
                if (count > balance){
                    System.out.println("余额不足，取款失败。");
                }else{
                    balance -= count;
                    System.out.println("您取出" + count + "元，当前余额为" + balance);
                }
            }else if (operation == 3){
                System.out.println("您当前的余额为：" + balance);
            }else if (operation == 4){
                bb = false;
                System.out.println("+++++++++++++++=欢迎下次存款+++++++++++++++");
            }else {
                System.out.println("请输入正确的操作！");
            }
        }
    }
}
