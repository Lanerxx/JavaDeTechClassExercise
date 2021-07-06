package date0610;

public class Bank {
    private static int minimumBalance;
    private static double interestRate;
    private static int count;

    private int account;
    private int password;
    private int balance;

    static {
        minimumBalance = 100;
        interestRate = 0.01;
        count = 0;
    }

    Bank(){
        this.account = count++;
    }

    Bank(int password){
        this.account = count++;
        this.balance = 0;
        this.password = password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public int getPassword() {
        return password;
    }

    public int getBalance() {
        return balance;
    }
}
