public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        if(accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        if(balance < amount) {
            throw new IllegalArgumentException("Insufficient balance.");
        }
        balance -= amount;
    }
}
