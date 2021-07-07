package date0611;

public class StaticInnerClass {
    public static void main(String[] args) {
        SIC.SICInnerClass.fun3();
        SIC.SICInnerClass sicInnerClass = new SIC.SICInnerClass();
        sicInnerClass.fun();
    }
}

class SIC{
    private int number;
    private static int count;

    private void fun1(){
        System.out.println("SIC fun1()");
    }

    private static void fun2(){
        System.out.println("SIC static fun2()");
    }

    static class SICInnerClass{
        private int numberI;
        private static int count1 = 1;

        public void fun(){
            count++;
            fun2();
            System.out.println("SICInnerClass fun()");
        }

        public static void fun3(){
            System.out.println("SICInnerClass fun3()");
        }
    }
}
