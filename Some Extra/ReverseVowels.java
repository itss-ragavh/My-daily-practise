import java.util.*;

class ReverseVowels {
    public String reverseVowels(String s) {
        // Convert the string to a character array to easily modify it
        char[] ch = s.toCharArray();
        
        // List to store the positions of vowels in the string
        List<Integer> vowelIndices = new ArrayList<>();
        
        // Identify vowel positions in the string and store them in vowelIndices
        for (int i = 0; i < ch.length; i++) {
            if (isVowel(ch[i])) {
                vowelIndices.add(i);
            }
        }
        
        // Reverse the vowel indices in the list
        Collections.reverse(vowelIndices);
        
        // Two-pointer approach to swap the vowels
        int i = 0, j = 0;
        while (i < ch.length && j < vowelIndices.size()) {
            if (isVowel(ch[i])) {
                // Swap vowels at indices i and vowelIndices.get(j)
                char temp = ch[i];
                ch[i] = ch[vowelIndices.get(j)];
                ch[vowelIndices.get(j)] = temp;
                
                // Move to the next vowel in the list
                j++;
            }
            // Move to the next character in the string
            i++;
        }
        
        // Return the modified string
        return new String(ch);
    }

    // Helper function to check if a character is a vowel
    private boolean isVowel(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }
}
