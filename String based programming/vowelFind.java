
public class vowelFind {
    public static String toGoatLatin(String s) {
        if (s.length() < 1 || s.length() > 150) {
            return "Invalid input length"; // Check input constraints
        }

        // Check for invalid characters
        for (char c : s.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                return "Invalid character found"; // Invalid character found
            }
        }

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder modifiedWord = new StringBuilder();

            // Check if the word starts with a vowel
            char firstChar = Character.toLowerCase(word.charAt(0));
            if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                modifiedWord.append(word).append("ma");
            } else {
                // Move the first letter to the end
                modifiedWord.append(word.substring(1)).append(word.charAt(0)).append("ma");
            }

            // Add 'a' based on the word index
            for (int j = 0; j <= i; j++) {
                modifiedWord.append("a");
            }

            // Append the modified word to the result
            result.append(modifiedWord).append(" ");
        }

        // Trim the trailing space and return the result
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String a = "I speak Goat Latin";
        String b = "The quick brown fox jumped over the lazy dog";

        System.out.println(toGoatLatin(a));
        System.out.println(toGoatLatin(b));
    }
}
