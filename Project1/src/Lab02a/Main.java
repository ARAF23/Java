package Lab02a;

/*@author Wasi */

//main class starts here
public class Main {

    // main method starts here
    public static void main(String[] args) {

        // Object of Bank Class
        Bank bank = new Bank("Bank of Kanada");

        // Objects of BankAccount Class
        BankAccount account1 = new BankAccount(100.0, "abc111", "woods");
        BankAccount account2 = new BankAccount(200.0, "def222", "gates");
        BankAccount account3 = new BankAccount(300.0, "ghi333", "bezos");
        BankAccount account4 = new BankAccount(400.0, "jkl444", "zuckerberg");

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);

        bank.depositTo(22.22, "def222");

        bank.getAccount("abc111").transfer(5.00, bank.getAccount("ghi333"));

        bank.printAllCustomerData();
    }
}
