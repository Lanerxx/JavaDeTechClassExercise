package date0628;

public class Practice01 {
    public static void main(String[] args) {
        Thread thread1 = new MyThread("窗口1");
        Thread thread2 = new MyThread("窗口2");
        Thread thread3 = new MyThread("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
class MyThread extends Thread{
    private static int ticket = 100;

    public MyThread(String name){
        super(name);
    }

    public void run(){
        while (ticket <= 100 && ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出第" + ticket-- + "张票");
        }
        if(ticket == 0) System.out.println("票已经售完");
    }
}