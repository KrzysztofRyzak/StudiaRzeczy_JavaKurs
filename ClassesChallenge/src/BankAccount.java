public class BankAccount {

    private String accountNumber;
    private String customerName;
    private String email;
    private double accountBalance;
    private String phoneNumber;

    public BankAccount() {
        this("56789", "Default Name", "Default email", "Default phone numbet", 2.50);
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, String customerName, String email, String phoneNumber, double accountBalance) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", customerName, email, phoneNumber, 100.55);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit $" + depositAmount + " made. New balance is $" + accountBalance);
    }

    public void withdrawFunds(double withdrawalAmount) {

        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + accountBalance + " in your account");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + accountBalance);
        }
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
