package date0607;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"系统分析", "需求分析", "Java开发"};
        int[] prices = {65, 34, 130};
        String[] authors = {"张三", "李四", "王五"};
        int[] repertory = {100, 50, 34, 60};

        BookAction bookAction = new BookAction();
        bookAction.initBooks(3);
        Book[] books = bookAction.getBooks();
        for (int i = 0; i < books.length; i++){
            books[i].name = names[i];
            books[i].price = prices[i];
            books[i].author = authors[i];
            books[i].repertory = repertory[i];
        }
        System.out.println("初始化书籍列表：");
        bookAction.showBooks();
        System.out.println();

        boolean flag = true;
        while (flag){
            int index = -1;
            int count = 0;
            System.out.println();
            System.out.print("1、卖书  2、进货  3、退出\n" +
                    "请输入操作：");
            switch (scanner.nextInt()){
                case 1:
                    System.out.print("请输入书籍索引：");
                    index = scanner.nextInt();
                    if (index < books.length){
                        System.out.print("请输入数量：");
                        count = scanner.nextInt();
                        if (bookAction.checkRepertory(index, count)){
                            bookAction.saleBooks(index, count);
                            System.out.println("卖书成功");
                            System.out.println("当前书籍列表：");
                            bookAction.showBooks();
                        }else {
                            System.out.println("库存不足，请进货");
                        }
                    }else {
                        System.out.println("书籍索引错误");
                    }
                    break;
                case 2:
                    System.out.print("请输入书籍索引：");
                    index = scanner.nextInt();
                    if (index < books.length) {
                        System.out.print("请输入数量：");
                        count = scanner.nextInt();
                        bookAction.replenishBooks(index, count);
                        System.out.println("进货成功");
                        System.out.println("当前书籍列表：");
                        bookAction.showBooks();
                    }else {
                        System.out.println("书籍索引错误");
                    }
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("请输入正确的指令");
            }
        }
        System.out.println("欢迎下次使用");
    }
}
