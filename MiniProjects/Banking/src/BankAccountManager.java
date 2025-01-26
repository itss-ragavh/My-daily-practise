package com.bank;

import java.util.HashMap;
import java.util.Map;

public class BankAccountManager {
    private Map<Integer, BankAccount> accounts = new HashMap<>();

    // Method to create a new bank account with PIN
    public void createAccount(String accountHolder, int accountNumber, String pin) {
        if (!accounts.containsKey(accountNumber)) {
            BankAccount newAccount = new BankAccount(accountHolder, accountNumber, pin);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account number already exists.");
        }
    }

    // Method to retrieve an account by number
    public BankAccount getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }
}
