package date0607;

public class Practice01 {
    public static void main(String[] args) {
        Test test = new Test();
        test.test1();
        test.test2(1, 2);
        System.out.println(test.test3());
        System.out.println(test.test4(1, 2));
    }
    public static class Test{
        public void test1(){
            System.out.println("这是一个无返回无参函数");
        }
        public void test2(int a, int b){
            System.out.println(a + b);
        }
        public int test3(){
            int a = 1;
            int b = 2;
            return a + b;
        }
        public int test4(int a, int b){
            return a + b;
        }
    }
}
