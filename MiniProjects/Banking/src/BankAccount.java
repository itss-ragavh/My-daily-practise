package com.bank;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private int accountNumber;
    private String pin;  // Added PIN

    // Constructor to initialize account
    public BankAccount(String accountHolder, int accountNumber, String pin) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = 0.0; // Initial balance is 0
    }

    // Method to validate PIN
    public boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    // Deposit method to add money to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Must be greater than zero.");
        }
    }

    // Withdraw method to take money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    // Method to check the balance of the account
    public void checkBalance() {
        System.out.println("Account Balance: " + balance);
    }

    // Method to view account details
    public void viewAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
