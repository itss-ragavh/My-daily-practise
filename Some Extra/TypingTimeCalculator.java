package softsauve;


	import java.util.*;

	public class TypingTimeCalculator {
		static Scanner  scanner = new Scanner(System.in);
	    public static void main(String[] args) {

	        // Input the keyboard layout
	        System.out.print("Enter the digits of a keyboard randomly from 0-9: ");
	        String keyboard = scanner.nextLine();

	        
	        // Validate the keyboard input
	        if (keyboard.length() != 10 || !containsAllDigits(keyboard)) {
	            System.out.println("Invalid keyboard input. It must be 10 unique digits containing 0-9.");
	            return;
	        }

	        // Input the number to type
	        System.out.print("Enter a number: ");
	        String number = scanner.nextLine();

	        // Validate the number input
	        if (!number.matches("\\d+")) {
	            System.out.println("Invalid number input. It must contain only digits.");
	            return;
	        }

	        // Calculate the time to type the number
	        int time = calculateTypingTime(keyboard, number);
	        System.out.println("Time to type the number: " + time);
	    }
	    
	    	
	    
	    
	    

	    // Method to check if a string contains all digits from 0 to 9
	    private static boolean containsAllDigits(String input) {
	        boolean[] digits = new boolean[10];
	        for (char c : input.toCharArray()) {
	            if (Character.isDigit(c)) {
	                digits[c - '0'] = true;
	            }
	        }
	        for (boolean digitPresent : digits) {
	            if (!digitPresent) {
	                return false;
	            }
	        }
	        return true;
	    }

	    // Method to calculate typing time
	    private static int calculateTypingTime(String keyboard, String number) {
	        Map<Character, Integer> positionMap = new HashMap<>();

	        // Map each digit to its position on the keyboard
	        for (int i = 0; i < keyboard.length(); i++) {
	            positionMap.put(keyboard.charAt(i), i);
	        }

	        int time = 0;
	        int currentIndex = 0;

	        // Calculate the total time to type the number
	        for (char digit : number.toCharArray()) {
	            int targetIndex = positionMap.get(digit);
	            time += Math.abs(currentIndex - targetIndex);
	            currentIndex = targetIndex;
	        }

	        return time;
	    }
	}


