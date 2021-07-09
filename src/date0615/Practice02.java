package date0615;

public class Practice02 {
    public static void main(String[] args) {
        try {
            System.out.println(ecmDef(10, 0));
        } catch (MyException3 myException3) {
            System.err.print(myException3.getData() + " ");
            myException3.printStackTrace();
        } catch (ArithmeticException e){
            System.out.println("不能除以0");
        }
    }

    public static int ecmDef(int figure1, int figure2) throws MyException3, ArithmeticException{
        int ans = 0;
        if (figure1 < 0 || figure2 < 0){
            throw new MyException3("数据不能小于0", figure1 < 0 ? figure1 : figure2);
        }
        ans = figure1 / figure2;
        return ans;
    }
}
