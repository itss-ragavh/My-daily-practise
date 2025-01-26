/**
 * Library Management System
 * Author: [Your Name]
 * Description: This program allows users to manage library operations such as adding books, 
 * issuing books, returning books, and displaying available books.
 */

import java.util.*;

class Book {

    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issue() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    @Override
    public String toString() {
        return "Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Issued: " + isIssued;
    }
}

public class LibraryManagementSystem {

    private Map<Integer, Book> books = new HashMap<>();

    public void addBook(int id, String title, String author) {
        try {
            if (books.containsKey(id)) {
                throw new IllegalArgumentException("\t\t----------------------Book with this ID already exists.----------------------\n");
            } else {
                books.put(id, new Book(id, title, author));
                System.out.println("\n\tBook added successfully.\n");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void issueBook(int id) {
        try {
            if (!books.containsKey(id)) {
                throw new NoSuchElementException("\t----------------------Book not found.----------------------");
            }
            Book book = books.get(id);
            if (book.isIssued()) {
                throw new IllegalStateException("\n\t----------------------Book is already issued.----------------------\n");
            }
            book.issue();
            System.out.println("\n\tBook issued successfully.");
        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    public void returnBook(int id) {
        try {
            if (!books.containsKey(id)) {
                throw new NoSuchElementException("\t----------------------Book not found !.----------------------\n");
            }
            Book book = books.get(id);
            if (!book.isIssued()) {
                throw new IllegalStateException("\t----------------------Book is not issued.----------------------\n");
            }
            book.returnBook();
            System.out.println("\tBook returned successfully.\n");
        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayBooks() {
        try {
            if (books.isEmpty()) {
                throw new NoSuchElementException("\t\t----------------------No books in the library.----------------------\n");
            }
            System.out.println("\tBooks in the library:");
            for (Book book : books.values()) {
                System.out.println(book);
            }
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit\n");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("\n\tEnter Book ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("\tEnter Book Title: ");
                        String title = scanner.nextLine();
                        System.out.print("\tEnter Book Author: ");
                        String author = scanner.nextLine();
                        library.addBook(id, title, author);
                        break;

                    case 2:
                        System.out.print("\tEnter Book ID to issue: ");
                        id = scanner.nextInt();
                        library.issueBook(id);
                        break;

                    case 3:
                        System.out.print("\tEnter Book ID to return: ");
                        id = scanner.nextInt();
                        library.returnBook(id);
                        break;

                    case 4:
                        library.displayBooks();
                        break;

                    case 5:
                        System.out.println("\t\tExiting... Goodbye!");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("\t\t\t----------------------Invalid choice. Please try again.----------------------");
                }
            } catch (InputMismatchException e) {
                System.out.println("\t\t\t----------------------Invalid input. Please enter a valid number.----------------------");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }
}