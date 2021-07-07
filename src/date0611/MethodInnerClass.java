package date0611;

public class MethodInnerClass {
}

class MeIC{
    private int number;

    public void MeICFun(){
        class MeICInnerClass{
            private int number;
            private int count;
        }
        MeICInnerClass m = new MeICInnerClass();
        m.number = 10;
        m.count = 1;
    }
}