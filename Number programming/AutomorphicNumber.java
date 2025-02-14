import java.util.*;;
public class AutomorphicNumber {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number :");
        int num =sc.nextInt();
        int numSquare=num*num;
        while (numSquare>9) {
            numSquare%=10;
        }
        if (numSquare==num) {
            System.out.println("The given number is Auto Morphic number");
        }
        else{
            System.out.println("The given number is not Auto Morphic Number.");
        }

    }
}
