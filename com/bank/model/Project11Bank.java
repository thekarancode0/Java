package com.bank.model;
import java.util.ArrayList;
class BankAccount {
    private static long lastAccountNumber = 1000000000;
    private final long accountNumber;
    private final String accountHolderName;
    private final String email;
    private final String phoneNumber;
    private double balance;
    private final ArrayList<String> transactions = new ArrayList<>();

    //Constructor
    BankAccount(String name, String email, String phone, double initialBalance) {
        this.accountHolderName = name;
        this.accountNumber = ++lastAccountNumber;
        this.email = email;
        this.phoneNumber = phone;
        this.balance += initialBalance;
        transactions.add("Account opened with balance ₹" + initialBalance);
        System.out.println("Hello " + name);
        System.out.println("Account created Successfully...");
        System.out.println("------------------------------");
    }

    public void showBalance() {
        System.out.println("Hello " + this.accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("------------------------------");
    }

    public void displayAccountDetails() {
        System.out.println("------Account Details------");
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Balance: ₹" + balance);
        System.out.println("----------------------------");
    }

    public void showTransactionHistory() {
        System.out.println("-----Transaction History for A/C " + accountNumber + "-----");
        for (String txn : transactions) {
            System.out.println(txn);
        }
        System.out.println("---------------------------------------------------");
    }


    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        this.balance += amount;
        transactions.add("Deposited ₹" + amount);
        System.out.println("₹" + amount + " deposited successful..");
        System.out.println("-----------------------");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance..");
            return;
        }
        this.balance -= amount;
        transactions.add("Withdrew ₹" + amount);
        System.out.println("₹" + amount + " withdrawn successfully.");
        System.out.println("--------------------------------- ");
    }

    public void transfer(BankAccount receiver, double amount) {
        if (amount > this.balance) {
            System.out.println("Transfer failed!!!...Insufficient fund");
            return;
        }
        if (amount <= 0) {
            System.out.println("Transfer amount must be positive.");
            return;
        }
        this.balance -= amount;
        receiver.balance += amount;

        this.transactions.add("Transferred ₹" + amount + " to A/C " + receiver.accountNumber);
        receiver.transactions.add("Received ₹" + amount + " from A/C " + this.accountNumber);

        System.out.println("₹" + amount + " transferred successfully to " + receiver.accountHolderName);

    }
}

public class Project11Bank {
    public static void main(String[] args) {
        BankAccount karan = new BankAccount("Karan Kumar", "karan@gmail.com", "9876543210", 1200000.0);
        BankAccount ankit = new BankAccount("Ankit Singh", "ankit@gmail.com", "9123456789", 500000.0);
        karan.showBalance();
        ankit.showBalance();
        karan.transfer(ankit,5000);
        ankit.showBalance();
        karan.showBalance();
        karan.showTransactionHistory();

    }
}
