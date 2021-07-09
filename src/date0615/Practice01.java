package date0615;

public class Practice01 {
    public static void main(String[] args) {
        new MyException().fun1();
        try {
            new MyException2().fun1();
        }catch (ArithmeticException e){
            System.err.println("0 cannot be the divisor");
        }

    }
}

class MyException{
    private int a = 10;
    private int b = 0;
    private int[] c = new int[1];
    private String s = null;

    public void fun1(){
        try {
            int d = a/b;
            int e = c[1];
            s.toCharArray();
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }

    }

    public void fun2(){
        System.out.println("1sadasd");
    }

}

class MyException2{
    private int a = 10;
    private int b = 0;
    public void fun1(){
        if (b == 0){
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }
}
