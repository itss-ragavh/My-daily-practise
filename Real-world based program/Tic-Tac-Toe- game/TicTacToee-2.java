import java.util.Scanner;

 class TicTacToee {

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe!");
        printBoard();

        while (true) {
            // Player's move
            System.out.println("Enter your move (row and column: 1 1 for top-left):");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (isValidMove(row, col)) {
                board[row][col] = 'X';
                printBoard();

                if (checkWin('X')) {
                    System.out.println("Congratulations! You win!");
                    break;
                }

                if (isBoardFull()) {
                    System.out.println("It's a tie!");
                    break;
                }

                // Computer's move
                System.out.println("Computer's turn:");
                int[] computerMove = getComputerMove();
                int compRow = computerMove[0];
                int compCol = computerMove[1];

                board[compRow][compCol] = 'O';
                printBoard();

                if (checkWin('O')) {
                    System.out.println("Computer wins! Better luck next time.");
                    break;
                }

                if (isBoardFull()) {
                    System.out.println("It's a tie!");
                    break;
                }

            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        scanner.close();
    }

    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static boolean checkWin(char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    static int[] getComputerMove() {
        // Simple strategy: find the first available cell (row-major order)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // This should never happen if the method is called correctly
    }
}
