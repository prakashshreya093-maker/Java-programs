class Account {
    protected int accountNumber;
    protected double balance;
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
    public void checkBalance() {
    System.out.println("Account Number: " + accountNumber + ", Current Balance: " + balance);
    }
}
class Savings extends Account {
    private double interestRate;

    public Savings(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
    public void checkBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }
}
class Current extends Account {
    private double overDraftLimit;
    public Current(int accountNumber, double balance, double overDraftLimit) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }
    public void withdraw(double amount) {
        if (amount <= balance + overDraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }
    public void checkBalance() {
        System.out.println("Current Account Balance: " + balance);
    }
}
public class BankDemo {
    public static void main(String[] args) {
        Savings s = new Savings(1001, 5000, 5.0);
        s.checkBalance();
        s.deposit(1000);
        s.addInterest();
        s.withdraw(2000);
        s.checkBalance();
        System.out.println("---------------------------");
        Current c = new Current(2001, 3000, 1000);
        c.checkBalance();
        c.deposit(1500);
        c.withdraw(4000); 
        c.checkBalance();
        c.withdraw(1000); 
    }
}

