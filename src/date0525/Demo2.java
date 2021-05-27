package date0525;

public class Demo2 {
    public static void main(String[] args){
        System.out.println("练习1：");
        byte b = (byte) 100;
        short s = 1000;
        int i = 3000000;
        long l = 200000000;

        float f = 1.34f;
        double d = 23.111;

        System.out.println("byte:" + b);
        System.out.println("short:" + s);
        System.out.println("int:" + i);
        System.out.println("long:" + l);
        System.out.println("float:" + f);
        System.out.println("double:" + d);
        System.out.println();

        System.out.println("练习2：");
        int i1 = 10;
        int i2 = 20;
        int i3 = 20;
        int sum = i1 + i2 + i3;
        System.out.println("i1+i2+i3=" + (i1 + i2 + i3));
        System.out.println("sum=" + sum);
        int age = 18;
        System.out.println(age >= 18 ? "已成年" : "未成年");

        System.out.println();
        System.out.println("练习3：");
        int myAge = 21;
        char gender = '女';
        System.out.println("姓名：彭兰一香，年龄：" + myAge + "，性别：" + gender);
    }
}
