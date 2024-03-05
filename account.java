public class account {
    private String name;
    private double balance;


    public account(String text, double num) {
        setName(text);
        setBalance(num);
    }

    public account() {

    }

    public void setName(String text) {
        this.name = text;
    }

    public void setBalance(double num) {
        this.balance = num;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
