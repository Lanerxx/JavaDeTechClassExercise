package date0629;

import java.util.Random;

public class Shop {
    private int sum = 0;

    private Random random = new Random();

    public synchronized void sale(){
        if (sum != 0){
            int count = random.nextInt(sum) + 1;
            sum -= count;
            System.out.println("消费：" + count + "，剩余：" + sum);
        }else {
            this.notify();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void production(){
        if (sum == 0){
            sum = random.nextInt(20);
            System.out.println("+++++++++++=生产了：" + sum);
        }else {
            this.notify();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
