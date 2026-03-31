package NguyenNhatQuan.Bai4;

import java.io.IOException;

public class BankAccount {
    private String accountNumber;
    public double balance;

    BankAccount(String accountNumber, double balance) {
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    BankAccount() {
        setAccountNumber("000000");
        setBalance(0);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) throws Exception {
        if(amount > 0) {
            this.balance += amount;
        }
        else {
            throw new Exception("Amount must be greater than 0");
        }
    }

    public void withdraw(double amount) throws Exception{
        if(amount > 0) {
            if(this.balance >= amount) {
                this.balance -= amount;
            }
            else {
                throw new Exception("Not enough balance");
            }
        }
        else {
            throw new Exception("Amount must be greater than 0");
        }
    }

     public static void transfer(BankAccount from, BankAccount to, double amount) {
        try {
            from.withdraw(amount);
            to.deposit(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }
}
