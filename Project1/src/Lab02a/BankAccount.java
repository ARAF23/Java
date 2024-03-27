package Lab02a;

/*@author Wasi */

// BankAccount.java
public class BankAccount {

    // Properties
    private double balanceCdn;
    private String accountNumber;
    private String memberLastName;

    // Constructor
    public BankAccount(double balanceCdn, String accountNumber, String memberLastName) {
        this.balanceCdn = balanceCdn;
        this.accountNumber = accountNumber;
        this.memberLastName = memberLastName;
    }

    // Method : Withdraw
    public void withdraw(double amountCdn) {
        balanceCdn = balanceCdn - amountCdn;
    }

    // Method : Deposit
    public void deposit(double amountCdn) {
        balanceCdn = balanceCdn + amountCdn;
    }

    // Method : Transfer
    public void transfer(double amountCdn, BankAccount recipientAccount) {
        recipientAccount.deposit(amountCdn);
        this.withdraw(amountCdn);
    }

    // Getter method : balanceCdn
    public double getBalanceCdn() {
        return balanceCdn;
    }

    // Getter method : accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method : memberLastName
    public String getMemberLastName() {
        return memberLastName;
    }
}
