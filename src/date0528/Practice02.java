package date0528;

public class Practice02 {
    public static void main(String[] args) {
        function01();
        function02();
        function03();
    }
    public static void function01(){
        for (int i = 0; i < 100; i++){
            if ((i + 1) % 2 == 0) System.out.println("偶数：" + (i + 1));
            else System.out.println("奇数：" + (i + 1));
        }
    }
    public static void function02(){
        for (int i = 0; i < 9 ;i++){
            for (int j = 0; j < i + 1; j++){
                System.out.print((j + 1)  + "*" + (i + 1) + "=" + (i + 1) * (j + 1) + " ");
            }
            System.out.println();
        }
    }
    public static void function03(){
        int a = 1;
        int b = 1;
        int tempt;
        int m = 12;
        for (int i = 0; i < m;i++){
            System.out.println("第" + (i + 1) +"个月的兔子数：" + a);
            a = a + b;
            tempt = a;
            a = b;
            b = tempt;
        }
        System.out.println("第" + m + "个月的兔子数：" + (b - a));
    }
}
