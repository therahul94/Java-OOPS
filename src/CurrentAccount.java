public class CurrentAccount extends Account{
    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Current account withdraw");
        super.withdraw(amount);
    }
}
