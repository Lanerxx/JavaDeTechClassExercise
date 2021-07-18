package date0629;

public class SaleTread extends Thread {
    private Shop shop;

    public SaleTread(Shop shop){
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true){
            shop.sale();
        }
    }
}
