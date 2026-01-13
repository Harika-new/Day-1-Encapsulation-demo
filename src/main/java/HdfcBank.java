package main.java;

public class HdfcBank {

    private Integer balance;

    public Integer getBalance() {//customer read
        return balance;
    }

    public void setBalance(Integer balance) {//validation
        if (balance >= 100) {
            this.balance = balance;
        } else {
            System.out.println("Amount should be greater than 100");
        }
    }
}

//What You Can Say in Interview
//
//“I implemented encapsulation using a bank example.
//Balance is private and accessed only through getter and setter.
//I added validation inside setter to control wrong data.
//I tested it using a main class and pushed it to GitHub.”
