import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Process
        int vowelCount = countVowels(input);

        // Output
        System.out.println("Number of vowels: " + vowelCount);
    }

    // Method to count vowels in the input string
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert to lowercase for easy comparison

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }

        return count;
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
