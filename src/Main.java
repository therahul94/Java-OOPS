public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Rahul", 26);
        Customer c2 = new Customer("Amit", 30);
        Customer c3 = new Customer("Priya", 28);
        Customer c4 = new Customer("Asha", 27);
        Customer c5 = new Customer("Sheetal", 24);

        /*
        * Cannot access or modify directly because of access modifiers. like private.
        * c2.name = "";
        * c2.age = -39;
        */

        c2.setName("Jiya");
        c2.setAge(25);

        System.out.println("c1: " + "name: " + c1.getName() + ", age: " + c1.getAge());
        System.out.println("c2: " + "name: " + c2.getName() + ", age: " + c2.getAge());
        System.out.println("c3: " + "name: " + c3.getName() + ", age: " + c3.getAge());
        System.out.println("c4: " + "name: " + c4.getName() + ", age: " + c4.getAge());
        System.out.println("c5: " + "name: " + c5.getName() + ", age: " + c5.getAge());

        Account acc1 = new Account("AA083C");
        Account acc2 = new Account("AA029M");
        c1.addAccount(acc1);
        c1.addAccount(acc2);
        acc1.deposit(2000);
        acc2.deposit(200);

        System.out.println("Account no: " + acc1.getAccountNumber() + " Balance: " + acc1.getBalance());
        System.out.println("Account no: " + acc2.getAccountNumber() + " Balance: " + acc2.getBalance());

        Bank bank = new Bank("ACC Bank");
        bank.addCustomer(c1);
        bank.addCustomer(c2);
        bank.addCustomer(c3);
        bank.addCustomer(c4);

        System.out.println("Bank: " + bank.getBankName() + ", Customer count: " + bank.getCustomerCount());
    }
}