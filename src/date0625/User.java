package date0625;

public class User {
    private String account;
    private String password;
    private int balance;

    public User(String account, String password, int balance) {
        this.account = account;
        this.password = password;
        this.balance = balance;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
