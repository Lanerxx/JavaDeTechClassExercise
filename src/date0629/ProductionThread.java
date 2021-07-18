package date0629;

public class ProductionThread extends Thread {
    private Shop shop;

    public ProductionThread(Shop shop){
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true){
            shop.production();
        }
    }
}
