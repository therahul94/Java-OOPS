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

        SavingAccount sa1 = new SavingAccount("SA1001");
        System.out.println("Saving Account no: " + sa1.getAccountNumber() + " Current balance: " + sa1.getBalance());
        sa1.deposit(90000);
        System.out.println("Saving Account no: " + sa1.getAccountNumber() + " After deposit balance: " + sa1.getBalance());
        sa1.withdraw(7000);
        System.out.println("Saving Account no: " + sa1.getAccountNumber() + " After withdraw balance: " + sa1.getBalance());

        CurrentAccount ca1 = new CurrentAccount("CUR1001");
        System.out.println("Current Account no: " + ca1.getAccountNumber() + " Current balance: " + ca1.getBalance());
        ca1.deposit(1000000);
        System.out.println("Current Account no: " + ca1.getAccountNumber() + " After deposit balance: " + ca1.getBalance());
        ca1.withdraw(10000);
        System.out.println("Current Account no: " + ca1.getAccountNumber() + " After withdraw balance: " + ca1.getBalance());

        /*
        * Polymorphism
        * Question: Why did we create child classes if we can already create the Account?
        * Answer: Create a child object using a parent reference.
        * Account account1 = new SavingAccount(...)
             ↑                ↑
           reference type     actual object
        * The reference says:
        "I am treating this object as an Account."

        The actual object is:
        SavingAccount

        This is called upcasting.
        */

        Account account1 = new SavingAccount("SA9001");
        Account account2 = new CurrentAccount("CUR9002");

        account1.deposit(200000);
        account2.deposit(300000);
        /*Method Overloading: The parameter list must be different.*/
        account1.deposit(240000, "Salary");

        System.out.println("Account no.: " + account1.getAccountNumber() + " Balance: " + account1.getBalance());
        System.out.println("Account no.: " + account2.getAccountNumber() + " Balance: " + account2.getBalance());

        account1.withdraw(10000);
        account2.withdraw(5000);

        System.out.println("Account No.: " + account1.getAccountNumber() + " Balance: " + account1.getBalance());
        System.out.println("Account No.: " + account2.getAccountNumber() + " Balance: " + account2.getBalance());

        /*
        * Why is this useful?
        * Suppose we do: account1.withdraw(100);
        * Java looks at the actual object.
        * if account1 contains a savingAccount Object:
            Account reference
                   ↓
            SavingAccount object
                   ↓
            SavingAccount.withdraw()

         * If account2 contains a CurrentAccount object:
            Account reference
                   ↓
            CurrentAccount object
                   ↓
            CurrentAccount.withdraw()

          * This is runtime polymorphism.
          * The same method call:account.withdraw(100);can execute different implementations depending on the actual object.
        */




    }
}