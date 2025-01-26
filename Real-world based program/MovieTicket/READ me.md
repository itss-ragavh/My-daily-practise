# Movie Ticket Booking System

This is a simple Java-based Movie Ticket Booking system. Users can view available movies, book tickets, and confirm their bookings through OTP verification.

## Features:
  -View Available Movies: Displays the list of movies with available seats and ticket prices.
  -Book Tickets: Users can select a movie, specify the number of tickets they want to book, and proceed with the payment process.
  -OTP Verification: A randomly generated 4-digit OTP is used to confirm the booking, simulating a payment verification process.
  -Seat Availability Check: The system ensures there are enough available seats for the number of tickets a user wants to book.
  
## Instructions to Run the Program:
  1. Compile the Program:

  - Ensure you have the Java Development Kit (JDK) installed.
  - Open a terminal or command prompt and navigate to the directory containing the MovieTicketObjGen.java file.
  - Compile the program using the following command:
    
                javac MovieTicketObjGen.java
                
 2.Run the Program:

  - After successful compilation, run the program using:

        java MovieTicketObjGen
    
  3.User Interaction:

  - When the program starts, you will be presented with a menu of options.
  - Select 1 to book tickets or 2 to exit the program.
  - If you select 1 to book tickets, the system will display a list of movies and available seats. You can then select the movie you want to book tickets for and specify the number of tickets.
  - After entering the number of tickets, you will be given a randomly generated OTP for payment verification.
    Enter the correct OTP to confirm your booking.

  4.Exit the Program:

  - You can exit the program at any time by selecting 2 from the main menu.
    
## Example Output:
          
    
              Welcome to Ragavh's cinemas

    1.Book-Tickets
    2.exit

    Enter the choice :1

      The list of Movies for the day along with the available seats:

              1 . He is all that Available seats are 10
              2 . Good Will Hunting Available seats are 30
              3 . KGF Chapter-2 Available seats are 50

      Enter the movie ID to book tickets: 2
      You selected: Good Will Hunting
      Price: 200.0
        Available Seats: 30

          Enter number of tickets to book: 5
          Total Price: 1000.0
          A 4-digit OTP has been generated for you: 4721
          Enter OTP to confirm payment: 4721
          
          Tickets booked successfully
          Total price: 1000.0

                        Welcome to Ragavh's cinemas

    1.Book-Tickets
    2.exit

      Enter the choice :2
      Exiting...


## Important Notes:

  - OTP Verification: The system generates a random 4-digit OTP for each booking, which must be entered to complete the payment.
  -  Seat Availability Check: The program will ensure that the number of tickets booked doesn't exceed the available seats for the selected movie.
  -  Invalid Inputs: If an invalid option or incorrect movie ID is selected, the system will prompt the user to try again.
  
## Contact Information:
If you have any feedback or questions, feel free to reach out to me!

- **Email**: [harishragavendra2305@gmail.com](mailto:harishragavendra2305@gmail.com)
- **LinkedIn**: [Harish Ragavendra](https://www.linkedin.com/in/harishragavendra23)

## Note:
- This is a basic prototype for educational purposes.
- In a real-world scenario, Aadhar verification and OTP systems would involve secure, encrypted communication with official databases and services.
