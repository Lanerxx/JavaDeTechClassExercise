package date0629;

public class Practice02 {
    public static void main(String[] args) {
        Thread thread1 = new MyThread2("窗口1", 35);
        Thread thread2 = new MyThread2("窗口2", 30);
        Thread thread3 = new MyThread2("窗口3", 40);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyThread2 extends Thread{
    private static int ticket = 100;

    private int count = 0;

    private int upper;

    public MyThread2(String name, int upper){
        super(name);
        this.upper = upper;
    }

    public void run(){
        while (count <= upper && ticket <= 100 && ticket > 0){
            if (Thread.currentThread().getName().equals("窗口1")) {
                System.out.println("窗口1礼让");
                Thread.yield();
            }

            System.out.println(Thread.currentThread().getName() + "卖出第" + ticket-- + "张票; 共卖了" + ++count + "张");
        }
        if(ticket == 0) System.out.println("++++++++++++++++++++++票已经售完");
        if(count >= upper) System.out.println(Thread.currentThread().getName() + "++++++++++++++++++++++处票出售达到上限");
    }
}
