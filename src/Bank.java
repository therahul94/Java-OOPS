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

    /*
    * We have not created the getCustomerList getter function, Why? because of encapsulation.
    * Question : How not creating getCustomerList getter function protecting the encapsulation principle.
    * Answer : because if we create this function getCustomerList(), it will be used in the main, and in main
    * we can do bankObj.getCustomerList().clear(), which will clear all the customers. which restrict the encapsulation principle.
    */
}
