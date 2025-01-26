package com.bank;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccountManager manager = new BankAccountManager();

        // Create a sample account
        System.out.println("Enter account holder's name: ");
        String holderName = scanner.nextLine();
        System.out.println("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after nextInt()
        System.out.println("Set a PIN for your account (4-digit PIN): ");
        String pin = scanner.nextLine();

        manager.createAccount(holderName, accountNumber, pin);
        BankAccount account = manager.getAccount(accountNumber);

        if (account != null) {
            int choice;
            do {
                System.out.println("\nBank Account Management");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. View Account Details");
                System.out.println("4. View Balance");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character after nextInt()

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;

                    case 3:
                        System.out.print("Enter PIN to view account details: ");
                        String inputPin = scanner.nextLine();
                        if (account.validatePin(inputPin)) {
                            account.viewAccountDetails();
                        } else {
                            System.out.println("Incorrect PIN.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter PIN to view balance: ");
                        inputPin = scanner.nextLine();
                        if (account.validatePin(inputPin)) {
                            account.checkBalance();
                        } else {
                            System.out.println("Incorrect PIN.");
                        }
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 5);
        } else {
            System.out.println("Account not found.");
        }

        scanner.close();
    }
}
