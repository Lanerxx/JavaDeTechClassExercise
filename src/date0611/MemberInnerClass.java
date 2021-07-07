package date0611;

public class MemberInnerClass {
    public static void main(String[] args) {
        MIC.MICInnerClass micInnerClass = new MIC().new MICInnerClass();
        micInnerClass.fun2();
    }

}

class MIC{
    private int number;
    private static int count;

    private void fun(){
        System.out.println("MIC fun()");
        number++;
        count++;
    }

    private static void fun1(){
        System.out.println("MIC static fun1()");
    }

    public class MICInnerClass{
        private int numberI;

        public void fun2(){
            number++;
            count++;
            fun();
            fun1();
            System.out.println("MICInnerClass fun2()");
        }
    }
}