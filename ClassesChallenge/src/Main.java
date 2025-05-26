public class Main {
    public static void main(String[] args) {

//        BankAccount bobsAccount = new BankAccount("12345", "Bob Brown", "myemail@bob.com",
//                "(087) 123-4567", 1000.00);
        BankAccount bobsAccount = new BankAccount();

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());

//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setAccountBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmail("myemail@bob.com");
//        bobsAccount.setPhoneNumber("(087) 123-4567");

        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(300);
        bobsAccount.withdrawFunds(50);

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() + "; name " + timsAccount.getCustomerName());
    }
}
