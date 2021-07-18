package date0629;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Thread thread1 = new SaleTread(shop);
        Thread thread2 = new ProductionThread(shop);

        thread1.start();
        thread2.start();

    }
}
