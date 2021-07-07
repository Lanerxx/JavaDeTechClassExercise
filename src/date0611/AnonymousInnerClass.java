package date0611;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AIC aic = new AIC() {
            @Override
            public void fun() {
                System.out.println("aic1");
            }
        };
        aic.fun();

        new AIC(){
            @Override
            public void fun(){
                System.out.println("aic2");
            }
        }.fun();

    }
}

abstract class AIC{
    public abstract void fun();
}