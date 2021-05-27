package date0527;

import java.text.DecimalFormat;

public class Experience03 {
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
    }
    public static void question01(){
        System.out.println("1、设int a=9; 分别求出 a+=10 , a-=5, a*=8, a/=3的结果");
        int a1 = 9;
        int a2 = 9;
        int a3 = 9;
        int a4 = 9;
        a1 += 10;
        a2 -= 5;
        a3 *= 8;
        a4 /= 3;
        System.out.println("a += 10:" + a1 + "   a -= 5:" + a2 + "   a *= 8:" + a3 +
                "   a /= 3:" + a4);
        System.out.println();
    }
    public static void question02(){
        System.out.println("2、设 int x=8,  分别求出 ++x  和 x++的结果 ");
        int x1 = 8;
        int x2 = 8;
        x1++;
        ++x2;
        System.out.println("x++:" + x1 + "   ++x:" + x2);
        System.out.println();
    }
    public static void question03(){
        System.out.println("3、设int a=9,b=9; 求出  System.out.print(a>b); 的结果");
        int a = 9, b = 9;
        System.out.println("a > b:" + (a > b));
        System.out.println();
    }
    public static void question04(){
        System.out.println("4、定义一个大写字母，把它转换为小写字母后显示出来");
        char upper = 'C';
        char lower = (char) (upper + 32);
        System.out.println(upper + "的小写字母是：" + lower);
        System.out.println();
    }
    public static void question05(){
        System.out.println("5、定义一个圆的半径，求圆的周长，圆的面积，圆球表面积，圆球的体积." +
                "输出结果时要求有文字说明，保留2位小数。" +
                "设圆的半径为R,则周长2*PI*R 面积PI*r*r 圆球表面积4*PI*r*r 圆球体积4/3*PI*r*r*r");
        double r = 10.3;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("圆的周长：" + df.format(2 * Math.PI * r) +
                "   圆的面积："  + df.format(Math.PI * r * r)
                + "   圆球的表面积：" + df.format(4 * Math.PI * r * r)
                + "   圆球的体积" + df.format(4.0 / 3 * Math.PI * r * r * r));
        System.out.println();
    }
    public static void question06(){
        System.out.println("6、定义三个数a=10,b=20,c=30， \n" +
                "1   ((a>=b == (b == c) == (c<a))的结果\n" +
                "2   ((a !=b ) == (a != c) == (c == a))\n" +
                "3   !(a>b)");
        int a = 10;
        int b = 20;
        int c = 30;
        // false == false -> true; true == false -> false
        System.out.println("((a >= b == (b == c) == (c<a)): " + (a >= b == (b == c) == (c < a)));
        //true == true -> true; true == false -> false
        System.out.println("((a !=b ) == (a != c) == (c == a)): " + ((a !=b ) == (a != c) == (c == a)));
        //false -> true
        System.out.println("!(a>b): " + !(a>b));
        System.out.println();
    }
    public static void question07(){
        System.out.println("7、设 int x=5, 计算 x*=x/=x+x 的结果");
        double x = 5;
        int x1 = 5;
        //5 * (5 / (5 + 5))
        x *= x /= x + x;
        x1 *= x1 /= x1 + x1;
        System.out.println("(double)x *= x /= x + x: " + x);
        System.out.println("(int)x *= x /= x + x: " + x1);
        System.out.println();
    }
    public static void question08(){
        System.out.println("8、设int m=9,n;分别计算n=++m 和 n=m++后,m和n的结果");
        int m = 9, n;
        n = ++m;//n = 10, m = 10
        n = m++;//n = 10, m = 11
        System.out.println("n: " + n + "   m: " + m);
        System.out.println();
    }
    public static void question09(){
        System.out.println("9、设boolean m; int a=1,b=3,c=9;" +
                "则计算m=(a>b)&&(b<c) m=((a>=b)&&(b==c)||(c<a))");
        boolean m;
        int a = 1, b = 3, c = 9;
        //false && false -> false
        m = (a > b) && (b < c);
        System.out.println("(a>b)&&(b<c): " + m);
        //false && false || false -> false
        m = ((a >= b) && (b == c) || (c < a));
        System.out.println("((a>=b)&&(b==c)||(c<a)): " + m);
        System.out.println();
    }
    public static void question10(){
        System.out.println("设int a=5,b=9计算按位与a&b的值和按位或a|b的值,以及a^b的值");
        int a = 5, b = 9;
        /*
                5:0101
                9:1001
        5 & 9 :   0001 -> 1
        5 | 9 :   1101 -> 13
        5 ^ 9 :   1100 -> 12
         */
        System.out.println("a & b: " + (a & b) +
                "   a | b: " + (a | b) +
                "   a ^ b: " + (a ^ b));
        System.out.println();
    }

}
