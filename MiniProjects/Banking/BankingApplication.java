package bank;

import java.util.*;

class BankAccount {
    private String accountHolderName;
    private double balance;
    private String password;

    // Constructor to initialize bank account with account holder's name, balance, and password
    public BankAccount(String accountHolderName, double initialBalance, String password) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.password = password;
    }

    // Method to get the account balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Unable to withdraw $" + amount);
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    // Method to change the password
    public void changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Incorrect current password. Password change failed.");
        }
    }

    // Method to check if the password is correct
    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    // Method to print the account holder's details
    public void printAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }
}

public class BankingApplication {
    private static Map<String, BankAccount> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Main menu loop
        while (true) {
            System.out.println("\n*** Bank Menu ***");
            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. View Balance");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Change Password");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character
            
            switch (choice) {
                case 1:
                    createAccount();
                    break;
				case 2:{
						viewAccount();
					break;}
                case 3:
                    viewBalance();
                    break;

                case 4:
                    depositMoney();
                    break;

                case 5:
                    withdrawMoney();
                    break;

                case 6:
                    changePassword();
                    break;

                case 7:
                    System.out.println("Exiting the banking system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to create a new account
    private static void createAccount() {
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Initial Deposit: $");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine();  // Consume newline character
        System.out.print("Set your password: ");
        String password = scanner.nextLine();
        
        if (accounts.containsKey(name)) {
            System.out.println("Account already exists with this name!");
        } else {
            BankAccount account = new BankAccount(name, initialBalance, password);
            accounts.put(name, account);
            System.out.println("Account created successfully!");
        }
    }

    // Method to view balance (requires password)
    private static void viewBalance() {
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        
        BankAccount account = accounts.get(name);
        if (account != null) {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            
            if (account.verifyPassword(password)) {
                account.printAccountDetails();
            } else {
                System.out.println("Incorrect password. Access denied.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to deposit money (requires password)
    private static void depositMoney() {
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        
        BankAccount account = accounts.get(name);
        if (account != null) {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            
            if (account.verifyPassword(password)) {
                System.out.print("Enter amount to deposit: $");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else {
                System.out.println("Incorrect password. Access denied.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to withdraw money (requires password)
    private static void withdrawMoney() {
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        
        BankAccount account = accounts.get(name);
        if (account != null) {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            
            if (account.verifyPassword(password)) {
                System.out.print("Enter amount to withdraw: $");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else {
                System.out.println("Incorrect password. Access denied.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to change password (requires current password)
    private static void changePassword() {
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        
        BankAccount account = accounts.get(name);
        if (account != null) {
            System.out.print("Enter current password: ");
            String oldPassword = scanner.nextLine();
            
            System.out.print("Enter new password: ");
            String newPassword = scanner.nextLine();
			if (newPassword.equals(oldPassword))
			{
				System.out.println("Same password can't be used again!! \n Try a new password for better security");
			}
            else{
            account.changePassword(oldPassword, newPassword);
			}
        } else {
            System.out.println("Account not found.");
        }
	//	//Method to view the created Account in Bank Application
	//	private static void viewAccount();{
	//		
	//	}
	// Method to view account details (requires password)
	}
    private static void viewAccount() {
    System.out.print("Enter Account Holder Name: ");
    String name = scanner.nextLine();
   
    BankAccount account = accounts.get(name);
    if (account != null) {
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (account.verifyPassword(password)) {
            account.printAccountDetails();
        } else {
            System.out.println("Incorrect password. Access denied.");
        }
    } else {
        System.out.println("Account not found.");
    }
    }

    
}

