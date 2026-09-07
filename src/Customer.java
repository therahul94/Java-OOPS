import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private int age;
    private List<Account> accounts;

    public Customer(String name, int age) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if(age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.name = name;
        this.age = age;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }
}
