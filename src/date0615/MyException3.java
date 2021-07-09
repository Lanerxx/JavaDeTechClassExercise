package date0615;

public class MyException3 extends Exception{
    private int data;
    public MyException3(String message, int data){
        super(message);
        this.data = data;
    }

    public int getData(){
        return this.data;
    }
}
