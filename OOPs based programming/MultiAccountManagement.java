import java.util.Scanner;
// Main class
public class MultiAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating multiple BankAccount objects
        BankAccount account1 = new BankAccount("1001", "Harish", 5000.0);
        BankAccount account2 = new BankAccount("1002", "Ravi", 3000.0);
        BankAccount account3 = new BankAccount("1003", "Sita", 7000.0);

        // Storing accounts in an array for easier management
        BankAccount[] accounts = {account1, account2, account3};

        int choice;
        do {
            // Displaying menu
            System.out.println("\n--- Bank Account Menu ---");
            System.out.println("1. View Account Details");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // View account details
                    System.out.print("Enter account number: ");
                    String accountNumberView = scanner.next();
                    boolean accountFoundView = false;
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber().equals(accountNumberView)) {
                            account.displayAccountDetails();
                            accountFoundView = true;
                            break;
                        }
                    }
                    if (!accountFoundView) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter account number: ");
                    String accountNumberDeposit = scanner.next();
                    boolean accountFoundDeposit = false;
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber().equals(accountNumberDeposit)) {
                            System.out.print("Enter amount to deposit: ");
                            double amount = scanner.nextDouble();
                            account.deposit(amount);
                            accountFoundDeposit = true;
                            break;
                        }
                    }
                    if (!accountFoundDeposit) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    // Withdraw money
                    System.out.print("Enter account number: ");
                    String accountNumberWithdraw = scanner.next();
                    boolean accountFoundWithdraw = false;
                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber().equals(accountNumberWithdraw)) {
                            System.out.print("Enter amount to withdraw: ");
                            double amount = scanner.nextDouble();
                            account.withdraw(amount);
                            accountFoundWithdraw = true;
                            break;
                        }
                    }
                    if (!accountFoundWithdraw) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}