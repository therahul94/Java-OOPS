import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public double getCustomerCount() {
        return customers.size();
    }
}
