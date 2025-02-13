# Tic-Tac-Toe Game

This is a simple console-based implementation of the classic 3x3 Tic-Tac-Toe game, where two players take turns to place their marks (X and O) on a grid, aiming to get three marks in a row horizontally, vertically, or diagonally.

## Features:
- A 3x3 board where players can input numbers (1-9) to place their marks.
- Players alternate between 'X' and 'O', starting with 'X'.
- The game checks for a winner after each turn, or declares a draw if all slots are filled without a winner.
- Error handling for invalid inputs, such as numbers outside the range 1-9 or choosing an already occupied slot.
- Displays the game board after each turn, showing the current state of the game.

## Program Workflow:
1. **Starting the Game:**
   - The game begins by displaying a 3x3 grid with numbers 1-9 in each slot.
   - Player 'X' starts first, and players alternate turns, entering a number from 1 to 9 to place their mark in the corresponding slot.

2. **Checking for a Winner:**
   - The game checks for winning combinations (three 'X's or three 'O's in a row, column, or diagonal) after each turn.
   - If there is a winner, the game will display a congratulations message for the winner.
   - If all slots are filled and there is no winner, the game will declare a draw.

3. **Input Handling:**
   - The program handles invalid inputs (numbers outside the valid range or entering an already occupied slot).
   - If an invalid input is entered, the user is prompted to try again.

4. **Game End:**
   - The game ends when either one of the players wins or when all slots are filled and the game results in a draw.

## Instructions to Run the Program:
1. Compile the program using a Java compiler.
   - Command: `javac TicTacToe.java`
   
2. Run the compiled program.
   - Command: `java TicTacToe`
   
3. Follow the on-screen prompts:
   - Players will alternate between entering their moves as numbers (1-9).
   - The program will display the updated board after each move.
   - Once the game is over, the winner or draw message will be displayed.

## Example Output:

                Welcome to 3x3 Tic Tac Toe.
    |---|---|---|
    | 1 | 2 | 3 |
    |-----------|
    | 4 | 5 | 6 |
    |-----------|
    | 7 | 8 | 9 |
    |---|---|---|
    X will play first. Enter a slot number to place X in:
      1
    |---|---|---|
    | X | 2 | 3 |
    |-----------|
    | 4 | 5 | 6 |
    |-----------|
    | 7 | 8 | 9 |
    |---|---|---|
    O's turn; enter a slot number to place O in:
      2
    |---|---|---|
    | X | O | 3 |
    |-----------|
    | 4 | 5 | 6 |
    |-----------|
    | 7 | 8 | 9 |
    |---|---|---|
    X's turn; enter a slot number to place X in:
      3
    |---|---|---|
    | X | O | X |
    |-----------|
    | 4 | 5 | 6 |
    |-----------|
    | 7 | 8 | 9 |
    |---|---|---|
    O's turn; enter a slot number to place O in:
    4
    |---|---|---|
    | X | O | X |
    |-----------|
    | O | 5 | 6 |
    |-----------|
    | 7 | 8 | 9 |
    |---|---|---|
    X's turn; enter a slot number to place X in:
      5
    |---|---|---|
    | X | O | X |
    |-----------|
    | O | X | 6 |
    |-----------|
    | 7 | 8 | 9 |
    |---|---|---|
    O's turn; enter a slot number to place O in:
      6
    |---|---|---|
    | X | O | X |
    |-----------|
    | O | X | O |
    |-----------|
    | 7 | 8 | 9 |
    |---|---|---|
    X's turn; enter a slot number to place X in:
      7
    |---|---|---|
    | X | O | X |
    |-----------|
    | O | X | O |
    |-----------|
    | X | 8 | 9 |
    |---|---|---|
    Congratulations! X's have won! Thanks for playing.



## Contact Information:
If you have any feedback or questions, feel free to reach out to me!

- **Email**: [harishragavendra2305@gmail.com](mailto:harishragavendra2305@gmail.com)
- **LinkedIn**: [Harish Ragavendra](https://www.linkedin.com/in/harishragavendra23)

## Note:
- Make sure to enter valid slot numbers between 1 and 9.
- The game will prompt you to re-enter a number if the slot is already occupied or the input is invalid.
- The game will announce the winner once someone wins or declare a draw when all slots are filled without a winner.

Enjoy playing Tic-Tac-Toe! Happy coding!

                  
