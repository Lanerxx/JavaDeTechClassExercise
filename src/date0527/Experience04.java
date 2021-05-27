package date0527;

import java.util.Scanner;

public class Experience04 {
    public static void main(String[] args){
        function01();
        function02();
        function03();
        function04();
        function05();
        function06();
        function07();
        function08();
        function09();
        function10();
        function11();
        function12();
        function13();
        function14();
        function15();
        function16();
        function17();
    }
    public static void function01(){
        System.out.println("1. 做学生成绩系统，如果成绩大于80分，输出优秀，" +
                "如果成绩大于70分并且小于80分，输出良好，" +
                "如果成绩大于60分并且小于70分，输出及格，小于60分输出不及格。");
        int grade = 90;
        if (grade >= 80){
            System.out.println("优秀");
        }else if (grade >= 70 && grade < 80){
            System.out.println("良好");
        }else if (grade >= 60 && grade < 70){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        System.out.println();
    }
    public static void function02(){
        System.out.println("2、输入一个数，判断它是否能被3、5、7整除，注意考虑同时整除的情况");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
        int a = 35;
        if (a % 3 == 0) System.out.println("a可以被3整除");
        if (a % 5 == 0) System.out.println("a可以被5整除");
        if (a % 7 == 0) System.out.println("a可以被7整除");
        System.out.println();
    }
    public static void function03(){
        System.out.println("3、打印某年某月有多少天。" +
                "提示：A、闰年的计算方法：年数能被4整除，并且不能被100整除；或者能被400整除的整数年份");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入年份：");
//        int year = scanner.nextInt();
//        System.out.print("请输入月份：");
//        int month = scanner.nextInt();
        int year = 2000;
        int month = 11;
        int days;
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
            case 2:
                System.out.println(leap ? "29天" : "28天");
                break;
            default:
                System.out.println("您输入的月份错误！");
        }


        System.out.println();
    }
    public static void function04(){
        System.out.println("4、做学院评奖系统，" +
                "1）如果数学成绩大于80分并且语文成绩大于80分，获奖学金500元。" +
                "2）如果数学小于30并且语文小于30分，输出重修。");
        int math = 90;
        int chinese = 70;
        if (math > 80 && chinese > 80)
            System.out.println("奖学金500元");
        else if (math < 30 && chinese < 30)
            System.out.println("重修");
        else
            System.out.println("既没有奖学金又不用重修");

        System.out.println();
    }
    public static void function05(){
        System.out.println("5、输入三个数，如果其中有一个值大于1000，则提示，输入的数值有大于1000的");
        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入第一个数：");
//        int a = scanner.nextInt();
//        System.out.print("请输入第二个数：");
//        int b = scanner.nextInt();
//        System.out.print("请输入第三个数：");
//        int c = scanner.nextInt();
        int a = 10, b = 100, c = 1000;
        if (a > 1000 || b > 1000 || c > 1000)
            System.out.println("输入的数值有大于1000的");
        else
            System.out.println("输入的数值没有大于1000的");
        System.out.println();
    }
    public static void function06(){
        System.out.println("6、定义一个字符，判断是否为字母");
        char ch = '#';
        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            System.out.println(ch + "是字母");
        else
            System.out.println(ch + "不是字母");
        System.out.println();
    }
    public static void function07(){
        System.out.println("7、定义一个整数，计算其平方值和立方值");
        int a = 10;
        System.out.println("平方值" + Math.pow(a, 2));
        System.out.println("立方值" + Math.pow(a, 3));
        System.out.println();
    }
    public static void function08(){
        System.out.println("8、定义一个大写字母，把它转换为小写字母后显示出来");
        char upper = 'A';
        char lower = (char)(upper + 32);
        System.out.println(upper + "的小写：" + lower);
        System.out.println();
    }
    public static void function09(){
        System.out.println("9、一位学生参加了三门不同科目的考试，计算并显示所得的总分和平均分同时显示单科所得分数");
        int math = 90;
        int chinese = 80;
        int english = 70;
        int total = math + chinese + english;
        double ave = (total + 0.0) / 3;
        System.out.println("总分：" + total + "  均分：" + ave);
        System.out.println("数学：" + math + "  语文：" + chinese + "  英语：" + english);
        System.out.println();
    }
    public static void function10(){
        System.out.println("10、定义三个数a=10,b=20,c=30  a+=10;b-=4; c%=2; 输出a b c 的结果");
        int a = 10;
        int b = 20;
        int c = 30;
        a += 10;
        b -= 4;
        c %= 2;
        System.out.println("a: " + a + "  b: " + b + "  c:" + c);
        System.out.println();
    }
    public static void function11(){
        System.out.println("11、定义三个数，求出其中的最大值");
        int a = 10;
        int b = 23;
        int c = 213;
        int max = a;
        if (b > a)
            max = b;
        if (c > b)
            max = c;
        System.out.println("最大值：" + max);
        System.out.println();
    }
    public static void function12(){
        System.out.println("12、如果score值大于90，则奖励一个Iphone 6s，" +
                "当score值小于等于90时，先判断score是否大于70，" +
                "如果score是介于70--90之间，则奖励一个红米，如果成绩小于等于70，则罚做50个俯卧撑");
        int score = 67;
        if (score > 90){
            System.out.println("奖励一个Iphone 6s");
        }else if (score >70){
            System.out.println("红米");
        }else{
            System.out.println("做50个俯卧撑");
        }
        System.out.println();
    }
    public static void function13(){
        System.out.println("13、对一批货物征收税金（长整型）。" +
                "价格在1万元及以上的货物征税5%，" +
                "在5000元及以上，1万元以下的货物征税3%，" +
                "在1000元及以上，5000元以下的货物征税2%，\n" +
                "1000元以下的货物免税。" +
                "编写一程序，读入货物价格，计算并输出税金。 ");
        long price = 23912;
        double tax = 0;
        if (price >= 10000){
            tax += 0.05 * (price - 10000) + 0.03 * (10000 - 5000) + 0.02 * (5000 - 1000);
        }else if (price >= 5000){
            tax += 0.03 * (price - 5000) + 0.02 * (5000 - 1000);
        }else if (price >= 1000){
            tax += 0.02 * (price - 1000);
        }
        System.out.println(price + "价格的货物税金为：" + tax);
        System.out.println();
    }
    public static void function14(){
        System.out.println("14、输入3个整数，将其中最小的数输出");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入第一个数：");
//        int a = scanner.nextInt();
//        System.out.print("请输入第二个数：");
//        int b = scanner.nextInt();
//        System.out.print("请输入第三个数：");
//        int c = scanner.nextInt();
        int a = 10, b = 2, c = 9;
        int min;
        min = a;
        if (b < a) min = b;
        if (c < b) min = c;
        System.out.println("最小的数是: " + min);
        System.out.println();
    }
    public static void function15(){
        System.out.println("15、某超市为了促销，规定：购物不足50元的按原价付款，" +
                "超过50不足100的按九折付款，" +
                "超过100元的，超过部分按八折付款。" +
                "编一程序完成超市的自动计费的工作。");
        double price = 200;
        if (price > 100){
            price = (price - 100) * 0.8 + (100 - 50) * 0.9 + 50;
        }else if (price > 50) {
            price = (price - 50) * 0.9 + 50;
        }
        System.out.println("价格为: " + price);
        System.out.println();
    }
    public static void function16(){
        System.out.println("16、当前小学生的成绩单由以前的百分制改为优秀、良好、合格、不合格四个等级的等级制。" +
                "编一程序完成分数的自动转换工作。" +
                "转换规则如下：60分以下的为不合格；60到69分为合格；70到89分为良好；90分以上的为优秀。" +
                "（提示：可以利用除法运算来使程序更简明，结合case语句）。");
        int score = 57;
        switch (score/10){
            case 6:
                System.out.println("及格");
                break;
            case 7:
            case 8:
                System.out.println("良好");
                break;
            case 9:
                System.out.println("优秀");
                break;
            default:
                System.out.println("不及格");
        }
        System.out.println();
    }
    public static void function17(){
        System.out.println("17.应纳个人所得税税额= 应纳税所得额× 适用税率- 速算扣除数\n" +
                "扣除标准3500元/月（2011年9月1日起正式执行）（工资、薪金所得适用）\n" +
                "个税免征额3500元 　（工资薪金所得适用）\n" +
                "级数\t全月应纳税所得额（含税级距）【税率资讯网提供】\t税率(%)\t速算扣除数\n" +
                "1\t不超过1,500元\t3\t0\n" +
                "2\t超过1,500元至4,500元的部分\t10\t105\n" +
                "3\t超过4,500元至9,000元的部分\t20\t555\n" +
                "4\t超过9,000元至35,000元的部分\t25\t1,005\n" +
                "5\t超过35,000元至55,000元的部分\t30\t2,755\n" +
                "6\t超过55,000元至80,000元的部分\t35\t5,505\n" +
                "7\t超过80,000元的部分\t45\t13,505\n" +
                "输入一个工资，根据公式，计算出个人所得税，以及税后工资？");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的工资：");
        int salary = scanner.nextInt();
        double tax = 0;
        if (salary >= 80000){
            tax += ((salary - 80000) * 0.45 - 13505) + ((80000 - 55000) * 0.35 - 5505) +
                    ((55000 - 35000) * 0.3 - 2755) + ((35000 - 9000) * 0.25 - 1005) +
                    ((9000 - 4500) * 0.2 - 555) + ((4500 - 1500) * 0.1 - 105) +
                    1500 * 0.03;
        }else if (salary >= 55000){
            tax += ((salary - 55000) * 0.35 - 5505) +
                    ((55000 - 35000) * 0.3 - 2755) + ((35000 - 9000) * 0.25 - 1005) +
                    ((9000 - 4500) * 0.2 - 555) + ((4500 - 1500) * 0.1 - 105) +
                    1500 * 0.03;
        }else if (salary >= 35000){
            tax += ((salary - 35000) * 0.3 - 2755) + ((35000 - 9000) * 0.25 - 1005) +
                    ((9000 - 4500) * 0.2 - 555) + ((4500 - 1500) * 0.1 - 105) +
                    1500 * 0.03;
        }else if (salary >= 9000){
            tax += ((salary - 9000) * 0.25 - 1005) +
                    ((9000 - 4500) * 0.2 - 555) + ((4500 - 1500) * 0.1 - 105) +
                    1500 * 0.03;
        }else if (salary >= 4500){
            tax += ((salary - 4500) * 0.2 - 555) + ((4500 - 1500) * 0.1 - 105) +
                    1500 * 0.03;
        }else if (salary >= 1500){
            tax += ((salary - 1500) * 0.1 - 105) +
                    1500 * 0.03;
        }else {
            tax = salary * 0.03;
        }
        System.out.println("您的税是：" + tax);
        System.out.println();
    }
}
