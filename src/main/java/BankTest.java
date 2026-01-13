package main.java;

public class BankTest {
    public static void main(String[] args) {
        HdfcBank bank = new HdfcBank();

        // bank.balance = 100;  // not allowed (private)

        bank.setBalance(10);
        System.out.println(bank.getBalance());
    }

}
