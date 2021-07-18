package date0629;

import java.util.Random;

public class Practice01 {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Thread thread1 = new MyThread("中国医生.mp4",random.nextInt(100));
        Thread thread2 = new MyThread("爱情公寓.wvm",random.nextInt(200));
        Thread thread3 = new MyThread("《Java基础》.pdf",random.nextInt(40));

        thread1.start();
        thread2.start();
        thread1.join();
        thread3.start();

    }
}

class MyThread extends Thread{
    private int progress = 0;

    private int time;

    public MyThread(String name, int time){
        super(name);
        this.time = time;
    }

    public void run(){
        while (progress < 100 && progress >= 0){
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "当前进度:" + progress++ + "%");
        }
        if (progress >= 100) System.out.println(Thread.currentThread().getName() + "下载完毕...");
    }
}
