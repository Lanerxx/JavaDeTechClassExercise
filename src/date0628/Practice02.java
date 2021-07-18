package date0628;

public class Practice02 {
    public static void main(String[] args) {
        MyThread2 m = new MyThread2();
        Thread thread = new Thread(m, "窗口1");
        Thread thread1 = new Thread(m, "窗口2");
        Thread thread2 = new Thread(m, "窗口3");
        thread.start();
        thread1.start();
        thread2.start();
    }
}

class MyThread2 implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        synchronized (this) {
            while (ticket <= 100 && ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出第" + ticket-- + "张票");
            }
        }
        if(ticket == 0) System.out.println("票已经售完");

    }
}
