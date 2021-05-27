package date0527;

public class Experience02 {
    public static void main(String[] args){
        question01();
        question02();
        question03();
        question04();
        question05();
        question06();
        question07();
        question08();
        question09();
        question10();
        question11();
        question12();
    }
    public static void question01(){
        System.out.println("1、定义一个整型变量，输出该变量的值");
        int var = 2;
        System.out.println(var);
        System.out.println();
    }
    public static void question02(){
        System.out.println("2、定义一个单精度实型变量，输出该变量的值");
        float var = 1.34F;
        System.out.println(var);
        System.out.println();
    }
    public static void question03(){
        System.out.println("3、定义一个双精度实型变量，输出该变量的值");
        double var = 2.32;
        System.out.println(var);
        System.out.println();
    }
    public static void question04(){
        System.out.println("4、定义一个字符型变量，以整型的形式再做输出");
        char ch = 'A';
        System.out.println((int)ch);
        System.out.println();
    }
    public static void question05(){
        System.out.println("5、定义一个布尔类型的数据，输出其结果");
        boolean bool = true;
        System.out.println(bool);
        System.out.println();
    }
    public static void question06(){
        System.out.println("6、求两个数的和");
        int a = 10;
        int b = 20;
        System.out.println("a + b:" + (a + b));
        System.out.println();
    }
    public static void question07(){
        System.out.println("7、求圆的面积");
        int r = 10;
        System.out.println("圆的面积:" + (Math.PI*r*r));
        System.out.println();
    }
    public static void question08(){
        System.out.println("8、定义一个字符，并将这个字符输出");
        char ch = 'L';
        System.out.println("字符:" + ch);
        System.out.println();
    }
    public static void question09(){
        System.out.println("9、定义两个整型变量a、b，求a+b、a-b、a%b、a/b(要求除尽）的结果");
        int a = 10;
        int b = 5;
        System.out.println("a + b:" + (a + b));
        System.out.println("a - b:" + (a - b));
        System.out.println("a % b:" + (a % b));
        System.out.println("a / b:" + ((a + 0.0) / b));
        System.out.println();
    }
    public static void question10(){
        System.out.println("10、编写程序，已知圆柱体的底面半径R，和高H,求圆柱体的体积 V=PI*r*r*h");
        double r = 1.23;
        double h = 2;
        System.out.println("圆柱体体积:" + (Math.PI * r * r * h));
        System.out.println();
    }
    public static void question11(){
        System.out.println("11、求一个长方形的周长和面积");
        double l = 1.23;
        double w = 2;
        System.out.println("长方形周长:" + (2 * (l + w)) + "   长方形面积:" + (l * w));
        System.out.println();
    }
    public static void question12(){
        System.out.println("12、求一个三角形的面积");
        double base = 1.23;
        double height = 2;
        System.out.println("三角形面积:" + (0.5 * base * height));
        System.out.println();
    }

}
