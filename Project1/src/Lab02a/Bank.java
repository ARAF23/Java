package Lab02a;

import java.util.HashMap;

/*@author Wasi */

//bank class starts from here
public class Bank {

    // Instance Varibales
    private String name;
    private HashMap<String, BankAccount> accounts;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.accounts = new HashMap<>();
    }

    // Method : Add account
    public void addAccount(BankAccount account) {
        this.accounts.put(account.getAccountNumber(), account);
    }

    // Method : Get account
    public BankAccount getAccount(String accountNumber) {
        return this.accounts.get(accountNumber);
    }

    // Method : Remove account
    public void removeAccount(String accountNumber) {
        this.accounts.remove(accountNumber);
    }

    // Method : Get number of accounts
    public int getNumberOfAccounts() {
        return this.accounts.size();
    }

    // Method : Get total accounts balance
    public double getTotalAccountsBalance() {
        double totalCdn = 0.00;
        for (BankAccount account : this.accounts.values()) {
            totalCdn = totalCdn + account.getBalanceCdn();
        }
        return totalCdn;
    }

    // Method : Deposit to account
    public void depositTo(double amountCdn, String accountNum) {
        this.accounts.get(accountNum).deposit(amountCdn);
    }

    // Method : Print all customer data
    public void printAllCustomerData() {
        for (BankAccount account : this.accounts.values()) {
            System.out.println(
                    "Customer " + account.getMemberLastName().substring(0, 1).toUpperCase()
                            + account.getMemberLastName().substring(1) + " has $"
                            + account.getBalanceCdn()
                            + " in account " + account.getAccountNumber() + "."

            );
        }
        System.out.println("Total bank balance in all accounts for " + this.name + " is " +
                this.getTotalAccountsBalance());
    }
}
