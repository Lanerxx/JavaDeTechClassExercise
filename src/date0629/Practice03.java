package date0629;

public class Practice03 {
    public static void main(String[] args) {
        MyThread3 m = new MyThread3();

        Thread thread1 = new Thread(m,"窗口1");
        Thread thread2 = new Thread(m,"窗口2");
        Thread thread3 = new Thread(m,"窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.interrupt();

//        for (int i = 0; i < 3; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    for (int j = 0; j < 50; j++) {
//                        m.sell();
//                    }
//                }
//            },"窗口" + (i + 1)).start();
//        }

    }
}

class MyThread3 implements Runnable{
    private static int ticket = 100;
    private int count = 0;

    public void sell(){
        while (count <= ticket) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "中断...");
                return;
            }
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + "卖出" + count++ + "张票");
            }
        }
            System.out.println("售罄");
    }

    @Override
    public void run() {
        sell();
    }
}
