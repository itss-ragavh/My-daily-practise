import java.util.Scanner;
import java.util.Random;

class MovieTicket {
    private int Id;
    private String name;
    private double price;
    private int availableSeats;

    public MovieTicket(int Id, String name, double price, int availableSeats) {
        this.Id = Id;
        this.name = name;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookTickets(int count) {
        if (count <= availableSeats) {
            availableSeats -= count;
            System.out.println("Tickets booked successfully");
            System.out.println("Total price: " + (price * count));
        } else {
            System.out.println("Sorry, only " + availableSeats + " seats are available -- cannot book " + count + " seats");
        }
    }
}

class MovieTicketObjGen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MovieTicket m1 = new MovieTicket(1, "He is all that", 250.05, 10);
        MovieTicket m2 = new MovieTicket(2, "Good Will Hunting", 200, 30);
        MovieTicket m3 = new MovieTicket(3, "KGF Chapter-2", 100, 50);

        MovieTicket[] tickets = { m1, m2, m3 };
        boolean flag = true;
        do {
            System.out.println("\n\n\t\tWelcome to Ragavh's cinemas\n");
            System.out.println("\t1.Book-Tickets\n\t2.exit\n");
            System.out.print("Enter the choice :");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("\n\t\t\tThe list of Movies for the day along with the available seats:\n");
                    for (int i = 0; i < tickets.length; i++) {
                        System.out.println("\t\t\t\t"+tickets[i].getId() + " . " + tickets[i].getName() + " Available seats are " + tickets[i].getAvailableSeats());
                    }
					
                    // Ask user to select a movie
                    System.out.print("\n\t\tEnter the movie ID to book tickets: ");
                    int movieId = scanner.nextInt();

                    // Check if the movie ID is valid
                    if (movieId < 1 || movieId > tickets.length) {
                        System.out.println("\t\t\tInvalid movie selection. Try again.");
                        break;
                    }

                    MovieTicket selectedMovie = tickets[movieId - 1];
                    System.out.println("\t\tYou selected: " + selectedMovie.getName());
                    System.out.println("\t\tPrice: " + selectedMovie.getPrice());
                    System.out.println("\t\tAvailable Seats: " + selectedMovie.getAvailableSeats());

                    // Ask user for number of tickets to book
                    System.out.print("\n\t\t\t\tEnter number of tickets to book: ");
                    int ticketCount = scanner.nextInt();

                    // Try to book tickets
                    if (ticketCount <= selectedMovie.getAvailableSeats()) {
                        System.out.println("\t\t\t\tTotal Price: " + (selectedMovie.getPrice() * ticketCount));

                        // OTP Generation
                        Random rand = new Random();
                        int otp = rand.nextInt(9000) + 1000;  // Generate a random 4-digit OTP
                        System.out.println("\t\t\t\tA 4-digit OTP has been generated for you: " + otp);
                        System.out.print("\t\t\t\tEnter OTP to confirm payment: ");
                        int enteredOtp = scanner.nextInt();

                        // Check OTP
                        if (enteredOtp == otp) {
                            selectedMovie.bookTickets(ticketCount);
                        } else {
                            System.out.println("\t\t\t\t\tIncorrect OTP. Please try again.");
                        }
                    } else {
                        System.out.println("\t\t\t\t\tSorry, there are not enough seats available.");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                }
                default: {
                    System.out.println("\t\t\t\t\tInvalid choice. Please try again.\n");
                    break;
                }
            }
        } while (flag);

        scanner.close();
    }
}
