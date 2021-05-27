package date0526;

public class Demo1 {
    public static void main(String[] args){
        int a = 1;
        if (a % 2 == 0)
            System.out.println("a是偶数");
        else
            System.out.println("a是奇数");

        int b = 2;
        if (b % 2 == 0)
            System.out.println("b是偶数");
        else
            System.out.println("b是奇数");

        int c = 3;
        if ((c & 1) == 1)
            System.out.println("c是奇数");
        else
            System.out.println("c是偶数");
    }
}
