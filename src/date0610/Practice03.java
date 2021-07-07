package date0610;

public class Practice03 {
    public static void main(String[] args) {
        A aa = new C();
        aa.fun1();
        aa.fun2();
    }
}

abstract class A{
    protected abstract void fun1();
    abstract void fun2();
}

abstract class B extends A{
    public abstract void fun1();
    public void fun2(){
        System.out.println("B fun2");
    }
}

class C extends B{
    public void fun1(){
        System.out.println("C fun1");
    }
    @Override
    public void fun2(){
        System.out.println("C fun2");
    }
}