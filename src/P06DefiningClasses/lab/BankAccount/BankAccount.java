package P06DefiningClasses.lab.BankAccount;

public class BankAccount {
    private int id ;
    private double balance;
    private static double interestRate = 0.02;

    public static int counter = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        BankAccount.counter = counter;
    }

    public BankAccount() {
        counter++;
        this.id = counter;

    }

    public void deposit (double money){
        this.balance = this.balance + money;

    }

    public double getInterest(int years){
        return years * balance * interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
}
